record Producto(String codigo, String nombre, int precioCentavos) {}
record ProductoDTO(String codigo, String nombre, int precioCentavos) {}
static ProductoDTO aDTO(Producto producto) {
    return new ProductoDTO(producto.codigo(), producto.nombre(), producto.precioCentavos());
}
