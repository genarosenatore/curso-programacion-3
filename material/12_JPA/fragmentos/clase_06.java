// En un contexto transaccional:
Producto nuevo = new Producto("Cuaderno");
em.persist(nuevo);
Producto gestionado = em.merge(productoSeparado);
em.remove(gestionado);
