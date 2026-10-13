// En Factura, si los detalles son de su propiedad:
@jakarta.persistence.OneToMany(mappedBy="factura", cascade=jakarta.persistence.CascadeType.ALL, orphanRemoval=true)
private java.util.List<Detalle> detalles = new java.util.ArrayList<>();

// En Detalle:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
private Factura factura;
