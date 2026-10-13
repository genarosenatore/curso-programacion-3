package curso;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Categoria extends EntityId {
    @Column(nullable = false) private String nombre;
    @OneToMany(mappedBy = "categoria") private List<Producto> productos = new ArrayList<>();
    protected Categoria() {}
    public Categoria(String nombre) { this.nombre = Objects.requireNonNull(nombre); }
    public String getNombre() { return nombre; }
    public List<Producto> getProductos() { return Collections.unmodifiableList(productos); }
    public void agregar(Producto producto) {
        Objects.requireNonNull(producto);
        if (producto.getCategoria() != null && producto.getCategoria() != this)
            throw new IllegalArgumentException("Este helper no implementa traslados");
        if (!productos.contains(producto)) productos.add(producto);
        producto.asignar(this);
    }
}
