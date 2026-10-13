package curso;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class FacturaVenta extends EntityId {
    @Column(nullable=false,unique=true) private Long numero;
    @Temporal(TemporalType.TIMESTAMP) private Date fechaEmision;
    @Temporal(TemporalType.TIMESTAMP) private Date fechaAnulacion;
    private String estado;
    private double importeTotal;
    @ManyToOne(fetch=FetchType.LAZY,optional=false) private Cliente cliente;
    @ManyToOne(fetch=FetchType.LAZY,optional=false) private PuntoVenta puntoVenta;
    @ManyToOne(fetch=FetchType.LAZY,optional=false) private CondicionIva condicionIva;
    @OneToMany(mappedBy="factura",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<FacturaVentaDetalle> detalles=new ArrayList<>();
    protected FacturaVenta() {}
    public FacturaVenta(Long numero,Date fecha,Cliente cliente,PuntoVenta punto,CondicionIva iva){
        this.numero=numero;this.fechaEmision=fecha;this.cliente=cliente;this.puntoVenta=punto;this.condicionIva=iva;this.estado="EMITIDA";
    }
    public void agregar(ListaPrecioArticulo articulo,double cantidad,double precio){
        if(!Double.isFinite(cantidad)||cantidad<=0||!Double.isFinite(precio)||precio<0)
            throw new IllegalArgumentException("Detalle inválido");
        FacturaVentaDetalle detalle=new FacturaVentaDetalle(this,articulo,cantidad,precio);
        detalles.add(detalle);
        importeTotal+=detalle.getImporteSubtotal();
    }
    public Long getNumero(){return numero;}
    public double getImporteTotal(){return importeTotal;}
    public List<FacturaVentaDetalle> getDetalles(){return Collections.unmodifiableList(detalles);}
    public void quitarPrimero(){
        if(detalles.isEmpty())return;
        FacturaVentaDetalle retirado=detalles.remove(0);
        importeTotal-=retirado.getImporteSubtotal();
        retirado.separar();
    }
}
