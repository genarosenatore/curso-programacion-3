@org.springframework.web.bind.annotation.PostMapping
org.springframework.http.ResponseEntity<ProductoDTO> crear(
    @jakarta.validation.Valid @org.springframework.web.bind.annotation.RequestBody ProductoRequest entrada) {
    ProductoDTO creado = servicio.crear(entrada);
    return org.springframework.http.ResponseEntity.created(
        java.net.URI.create("/api/productos/" + creado.id())).body(creado);
}
