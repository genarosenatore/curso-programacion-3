# Soluciones 13.05 · COUNT, SUM, AVG, GROUP BY y HAVING

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

select f.estado,count(f),avg(f.importeTotal) from FacturaVenta f group by f.estado. En el DTO, el conteo es Long y promedio Double. Probá más de una factura por estado para detectar una agrupación incorrecta.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Produce una fila por punto de venta con más facturas que minimo. No pregunta si una factura individual tiene gran importe. Agrupar también por id evita mezclar puntos distintos con misma descripción. El tipo del total debe coincidir con el atributo de entidad.

## 3. Qué conviene corregir

La confusión a evitar es: Usar WHERE count(f)>5 en lugar de HAVING para filtrar un agregado.

COUNT, SUM y AVG resumen resultados. GROUP BY agrupa y HAVING filtra grupos después del resumen.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
