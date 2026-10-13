package curso;
import jakarta.persistence.*;
@Entity
public class Marca extends EntityId {
    @Column(nullable=false) private String denominacion;
    protected Marca() {}
    public Marca(String denominacion){this.denominacion=denominacion;}
}
