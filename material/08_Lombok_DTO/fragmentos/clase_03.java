record ProductoDTO(long id, String nombre, int precioCentavos) {}
record CrearPedidoDTO(long productoId, int cantidad) {}
// El request no incluye un total calculado por el usuario.
