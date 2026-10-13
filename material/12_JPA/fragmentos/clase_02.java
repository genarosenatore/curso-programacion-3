@jakarta.persistence.Entity
@jakarta.persistence.Table(name="producto")
class Producto {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @jakarta.persistence.Column(nullable=false)
    private String nombre;
    protected Producto() {}
    Producto(String nombre) { this.nombre=nombre; }
}
