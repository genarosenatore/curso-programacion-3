# Clase 11.06 · JOIN, agregaciones y agrupamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_05.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_07.md)

## Relacionar filas antes de resumir

JOIN construye filas de resultado que combinan datos relacionados. `ON p.categoria_id=c.id` especifica cómo corresponden. INNER JOIN conserva solo coincidencias; LEFT JOIN conserva cada fila izquierda, aunque ninguna derecha coincida, usando NULL en los datos derechos.

Una categoría con dos productos genera dos filas intermedias: sus datos aparecen repetidos junto a cada producto. No se duplicó la tabla categoria; es la forma del resultado. Contar filas o sumar un dato de cabecera en ese punto puede contar varias veces lo mismo.

## De filas relacionadas a grupos

GROUP BY reúne filas con las mismas claves elegidas. COUNT(p.id) cuenta ids no nulos; COUNT(*) cuenta filas incluso la que LEFT JOIN conserva para categoría sin productos. En el ejemplo, Útiles tiene2, Libros1 y Sin productos0. Con COUNT(*) esa última daría1 y respondería otra pregunta.

SUM acumula valores no nulos y AVG promedia. Sin valores, SUM o AVG pueden ser NULL; COUNT devuelve cero. COALESCE(valor,0) elige el primer argumento no nulo y permite presentar cero si el contrato lo requiere. HAVING filtra grupos después de agregarlos; WHERE filtra filas antes de agrupar, una diferencia similar a la de [streams 10.08](../10_Funcional/CLASE_08.md).

Ejecutá la consulta con --tienda. Para productos con su categoría, poné producto a la izquierda y LEFT JOIN categoria; el producto sin categoría debe aparecer. Un WHERE sobre c.nombre después puede descartar su NULL y volver a perderlo. Decidí qué resultado querés antes de cambiar el tipo de unión.

## Ejemplo de la clase

```sql
SELECT c.nombre, COUNT(p.id) AS productos
FROM categoria c
LEFT JOIN producto p ON p.categoria_id=c.id
GROUP BY c.id,c.nombre
ORDER BY c.nombre;
```

[Abrir el fragmento como archivo](fragmentos/clase_06.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La consulta incluye categorías sin productos. COUNT(p.id) ignora null y da cero en esos casos. COUNT(*) contaría la fila conservada por el LEFT JOIN y podría dar uno; no expresa la misma pregunta. Agrupamos por id y nombre para identificar claramente la categoría.

## Cambiar una decisión y explorar un límite

Cambiar LEFT por INNER en el conteo pierde Sin productos. Usar WHERE p.precio_centavos>100000 también elimina su fila nula. Si querés contar solo ciertos productos conservando todas las categorías, poné ese criterio en ON de la unión y luego contá p.id.

## Confusión que conviene evitar

Cambiar LEFT JOIN por INNER JOIN sin reconocer qué filas se pierden.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_05.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_07.md)
