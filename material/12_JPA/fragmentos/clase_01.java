import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
class Producto {
    @Id private Long id;
    protected Producto() {}
}
