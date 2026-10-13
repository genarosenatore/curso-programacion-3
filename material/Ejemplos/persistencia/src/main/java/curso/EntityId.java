package curso;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class EntityId {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    public Long getId() { return id; }
}
