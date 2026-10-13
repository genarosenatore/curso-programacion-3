# Soluciones 11.06 · JOIN, agregaciones y agrupamiento

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

SELECT p.nombre,c.nombre AS categoria FROM producto p LEFT JOIN categoria c ON c.id=p.categoria_id ORDER BY p.id;. Una categoría ausente se observa como null; no se descarta el producto.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La consulta incluye categorías sin productos. COUNT(p.id) ignora null y da cero en esos casos. COUNT(*) contaría la fila conservada por el LEFT JOIN y podría dar uno; no expresa la misma pregunta. Agrupamos por id y nombre para identificar claramente la categoría.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar LEFT JOIN por INNER JOIN sin reconocer qué filas se pierden.

JOIN combina filas relacionadas. INNER JOIN conserva coincidencias; LEFT JOIN conserva las filas del lado izquierdo aunque no haya relación y devuelve null para columnas del lado derecho.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
