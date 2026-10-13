record Producto(String codigo, String nombre, int precioCentavos, int stock) {}
record ProductoVista(String codigo, String nombre, boolean disponible) {}
static ProductoVista presentar(Producto p) {
    return new ProductoVista(p.codigo(), p.nombre(), p.stock() > 0);
}
