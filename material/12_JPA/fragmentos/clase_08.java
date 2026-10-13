@org.springframework.transaction.annotation.Transactional
public void cambiarNombre(Long id, String nombre) {
    Producto p = em.find(Producto.class, id);
    if (p == null) throw new IllegalArgumentException("No existe");
    p.setNombre(nombre);
}
