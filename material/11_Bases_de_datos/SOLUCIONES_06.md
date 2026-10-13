# Soluciones 11.06 · JOIN, agregaciones y agrupamiento

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

SELECT p.nombre,c.nombre AS categoria FROM producto p LEFT JOIN categoria c ON c.id=p.categoria_id ORDER BY p.id;. Una categoría ausente se observa como null; no se descarta el producto.

## 2 y 3. Resolver y justificar las decisiones

`SELECT p.nombre,c.nombre FROM producto p LEFT JOIN categoria c ON c.id=p.categoria_id ORDER BY p.id;` incluye el cuarto con categoría NULL. Para conteo: `LEFT JOIN producto p ON p.categoria_id=c.id AND p.precio_centavos>100000`, GROUP BY c.id,c.nombre y COUNT(p.id). Da Útiles1,Libros1,Sin productos0. WHERE descartaría las filas sin coincidencia, contrario a conservar todas las categorías.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
