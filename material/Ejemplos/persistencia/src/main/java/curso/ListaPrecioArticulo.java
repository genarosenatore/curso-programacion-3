package curso;
import jakarta.persistence.*;
@Entity
public class ListaPrecioArticulo extends EntityId {
    @ManyToOne(fetch=FetchType.LAZY,optional=false) private Articulo articulo;
    private double precioVenta;
    protected ListaPrecioArticulo() {}
    public ListaPrecioArticulo(Articulo articulo,double precioVenta){this.articulo=articulo;this.precioVenta=precioVenta;}
}
