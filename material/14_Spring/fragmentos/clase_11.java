interface ProductoRepository extends org.springframework.data.jpa.repository.JpaRepository<Producto, Long> {
    java.util.List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
// En un servicio @Transactional: repositorio.save(producto);
