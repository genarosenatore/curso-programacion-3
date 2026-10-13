@org.springframework.stereotype.Service
class ProductoService {
    private final ProductoRepository repositorio;
    ProductoService(ProductoRepository repositorio) {
        this.repositorio = repositorio;
    }
}
