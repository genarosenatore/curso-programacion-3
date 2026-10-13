# Soluciones 13.01 · JPQL frente a SQL y parámetros nombrados

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

select f from FacturaVenta f where f.cliente.id = :clienteId. createQuery(...,FacturaVenta.class).setParameter("clienteId",id).getResultList(). El parámetro debe tener tipo compatible con el id. Una asociación ausente no coincide en esta navegación.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

f representa una FacturaVenta. :estado es un valor proporcionado aparte; no es una columna. getResultList devuelve una lista, vacía si no hay coincidencias. El tipo FacturaVenta.class coincide con la selección completa f.

## 3. Qué conviene corregir

La confusión a evitar es: Escribir factura_venta o cliente_id porque son nombres de la tabla y columna.

JPQL usa nombres de entidades y atributos Java, no tablas y columnas SQL. Un alias identifica cada origen.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
