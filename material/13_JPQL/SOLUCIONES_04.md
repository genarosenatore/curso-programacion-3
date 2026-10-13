# Soluciones 13.04 · Navegación de relaciones, INNER JOIN y LEFT JOIN

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

select distinct f from FacturaVenta f join f.detalles d where d.listaPrecioArticulo.articulo.marca.id = :marcaId. Una factura con dos renglones de esa marca sigue apareciendo una sola vez. Verificá nombres y mapeos del modelo.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Incluye artículos sin marca y devuelve null como denominación de marca en esas filas. join a.marca usa una relación mapeada. Para facturas con un artículo de cierta marca, el camino del campus es factura.detalles → listaPrecioArticulo → articulo → marca.

## 3. Qué conviene corregir

La confusión a evitar es: Inventar d.articulo cuando la relación real pasa por listaPrecioArticulo.

JPQL navega relaciones de entidades y permite joins explícitos. INNER JOIN exige coincidencia; LEFT JOIN conserva el lado izquierdo aunque falte el derecho.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
