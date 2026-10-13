@jakarta.persistence.MappedSuperclass
abstract class EntityId {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    protected Long id;
}
@jakarta.persistence.Entity
class Cliente extends EntityId {
    private String nombre;
    protected Cliente() {}
}
