// En Producto:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
@jakarta.persistence.JoinColumn(name="categoria_id")
private Categoria categoria;

// En Categoria:
@jakarta.persistence.OneToMany(mappedBy="categoria")
private java.util.List<Producto> productos = new java.util.ArrayList<>();
