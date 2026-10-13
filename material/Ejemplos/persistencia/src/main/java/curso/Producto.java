package curso;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity @Table(name = "producto")
public class Producto extends EntityId {
    @Column(nullable = false) private String nombre;
    @Column(nullable = false, precision = 12, scale = 2) private BigDecimal precio;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "categoria_id") private Categoria categoria;
    protected Producto() {}
    public Producto(String nombre) { this(nombre, new BigDecimal("2000.00")); }
    public Producto(String nombre, BigDecimal precio) {
        setNombre(nombre);
        if (precio == null || precio.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Precio requerido no negativo");
        this.precio = precio;
    }
    public String getNombre() { return nombre; }
    public BigDecimal getPrecio() { return precio; }
    public Categoria getCategoria() { return categoria; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido");
        this.nombre = nombre.trim();
    }
    void asignar(Categoria categoria) { this.categoria = categoria; }
}
