# Soluciones 11.04 · SELECT, WHERE y ORDER BY

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

SELECT id,nombre,precio_centavos FROM producto WHERE precio_centavos BETWEEN 80000 AND 200000 ORDER BY nombre,id;. Añadir id hace estable el desempate de nombres iguales. Si querés límites exclusivos, usá > y <.

## 2 y 3. Resolver y justificar las decisiones

`SELECT id,nombre,precio_centavos FROM producto WHERE precio_centavos BETWEEN 80000 AND 200000 ORDER BY nombre,id;` devuelve Cuaderno,Lapicera y Producto sin categoría con sus valores. Para ausencia: `WHERE categoria_id IS NULL AND precio_centavos>=100000`. =NULL produce desconocido y WHERE no lo conserva. ORDER BY organiza las filas devueltas sin actualizar la tabla.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
