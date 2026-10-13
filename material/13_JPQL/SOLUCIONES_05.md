# Soluciones 13.05 · COUNT, SUM, AVG, GROUP BY y HAVING

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

select f.estado,count(f),avg(f.importeTotal) from FacturaVenta f group by f.estado. En el DTO, el conteo es Long y promedio Double. Probá más de una factura por estado para detectar una agrupación incorrecta.

## 2 y 3. Resolver y justificar las decisiones

`select f.estado,count(f),avg(f.importeTotal) from FacturaVenta f group by f.estado`. Para puntos, el ejemplo con :minimo=1 conserva el de dos facturas. Agrupá id y descripcion para separar aunque el texto coincida. Unir detalles puede multiplicar cabeceras; si la pregunta es importe total por factura, consulta ese origen sin expandir sus hijos o diseña otra agregación que no cuente de más.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
