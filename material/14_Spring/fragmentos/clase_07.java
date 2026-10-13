@org.springframework.web.bind.annotation.GetMapping("/{id}")
ProductoDTO obtener(@org.springframework.web.bind.annotation.PathVariable Long id) {
    return servicio.obtener(id);
}
// Consulta opcional: GET /api/productos?nombre=cuaderno
