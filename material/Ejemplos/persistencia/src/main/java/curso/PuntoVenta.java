package curso;
import jakarta.persistence.*;
@Entity
public class PuntoVenta extends EntityId {
    private int numero;
    @Column(nullable=false) private String descripcion;
    protected PuntoVenta() {}
    public PuntoVenta(int numero,String descripcion){this.numero=numero;this.descripcion=descripcion;}
}
