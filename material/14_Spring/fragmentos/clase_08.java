record ProductoRequest(
    @jakarta.validation.constraints.NotBlank String nombre,
    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.PositiveOrZero java.math.BigDecimal precio,
    @jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(0) Integer stock) {}

// En el controller: crear(@Valid @RequestBody ProductoRequest entrada)
