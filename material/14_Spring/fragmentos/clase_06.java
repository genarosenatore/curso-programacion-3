@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/productos")
class ProductoController {
    private final ProductoService servicio;
    ProductoController(ProductoService servicio) { this.servicio = servicio; }
    @org.springframework.web.bind.annotation.GetMapping
    java.util.List<ProductoDTO> listar() { return servicio.listar(null); }
}
