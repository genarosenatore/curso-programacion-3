record ProductoDTO(String nombre, int precioCentavos) {
    ProductoDTO {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        if (precioCentavos < 0) throw new IllegalArgumentException("Precio negativo");
    }
}
// new ProductoDTO("Cuaderno", 200000).nombre();
