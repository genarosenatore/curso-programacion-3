package curso;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
public class Producto {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String nombre;
 @Column(nullable=false,precision=12,scale=2) private BigDecimal precio;
 @Column(nullable=false) private int stock;
 @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="categoria_id") private Categoria categoria;
 protected Producto(){}
 public Producto(String nombre,BigDecimal precio,int stock,Categoria categoria){this.nombre=nombre;this.precio=precio;this.stock=stock;this.categoria=categoria;}
 public Long getId(){return id;}
 public String getNombre(){return nombre;}
 public BigDecimal getPrecio(){return precio;}
 public int getStock(){return stock;}
 public Categoria getCategoria(){return categoria;}
 public void actualizar(String nombre,BigDecimal precio,int stock){this.nombre=nombre;this.precio=precio;this.stock=stock;}
}
