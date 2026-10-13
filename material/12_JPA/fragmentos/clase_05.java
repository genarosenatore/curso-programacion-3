// Dentro de un método transaccional que dispone de EntityManager em:
Producto producto = em.find(Producto.class, id);
if (producto == null) throw new IllegalArgumentException("Producto inexistente");
producto.setNombre("Cuaderno grande");
em.flush();
