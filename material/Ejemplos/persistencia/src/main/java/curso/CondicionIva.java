package curso;
import jakarta.persistence.*;
@Entity
public class CondicionIva extends EntityId {
    @Column(nullable=false) private String denominacion;
    protected CondicionIva() {}
    public CondicionIva(String denominacion){this.denominacion=denominacion;}
}
