# Soluciones 13.01 · JPQL frente a SQL y parámetros nombrados

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

select f from FacturaVenta f where f.cliente.id = :clienteId. createQuery(...,FacturaVenta.class).setParameter("clienteId",id).getResultList(). El parámetro debe tener tipo compatible con el id. Una asociación ausente no coincide en esta navegación.

## 2 y 3. Resolver y justificar las decisiones

`select f from FacturaVenta f where f.estado=:estado` con EMITIDA devuelve las correspondientes y con SIN_ESTADO ninguna. Por cliente: `where f.cliente.id=:clienteId`, usando Long de la identidad y createQuery de FacturaVenta. cliente_id es una columna del mapeo y no una propiedad Java. [] representa una ejecución válida sin coincidencias; un nombre de atributo incorrecto produce un error que no debe tratarse como ausencia normal.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
