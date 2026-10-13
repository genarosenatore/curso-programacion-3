package curso;
import jakarta.persistence.*;
@Entity
public class Articulo extends EntityId {
    @Column(nullable=false) private String denominacion;
    @ManyToOne(fetch=FetchType.LAZY) private Marca marca;
    protected Articulo() {}
    public Articulo(String denominacion,Marca marca){this.denominacion=denominacion;this.marca=marca;}
}
