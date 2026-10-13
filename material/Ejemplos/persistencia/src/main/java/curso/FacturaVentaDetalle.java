package curso;
import jakarta.persistence.*;
@Entity
public class FacturaVentaDetalle extends EntityId {
    @ManyToOne(fetch=FetchType.LAZY,optional=false) @JoinColumn(name="factura_id",nullable=false)
    private FacturaVenta factura;
    @ManyToOne(fetch=FetchType.LAZY,optional=false) private ListaPrecioArticulo listaPrecioArticulo;
    private double cantidad;
    private double precioUnitario;
    private double importeSubtotal;
    protected FacturaVentaDetalle() {}
    FacturaVentaDetalle(FacturaVenta factura,ListaPrecioArticulo articulo,double cantidad,double precio){
        this.factura=factura;this.listaPrecioArticulo=articulo;this.cantidad=cantidad;this.precioUnitario=precio;this.importeSubtotal=cantidad*precio;
    }
    public double getImporteSubtotal(){return importeSubtotal;}
    void separar(){factura=null;}
}
