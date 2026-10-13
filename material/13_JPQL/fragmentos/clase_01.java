var consulta = em.createQuery(
    "select f from FacturaVenta f where f.estado = :estado", FacturaVenta.class);
consulta.setParameter("estado", "EMITIDA");
var facturas = consulta.getResultList();
