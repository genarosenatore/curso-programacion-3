# Soluciones 13.03 · Fechas, texto, IN, DISTINCT y ordenamiento

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

select c from Cliente c where lower(c.denominacion) like :patron. Parámetro "%ana%". Si querés que el texto del usuario trate % y _ literalmente, definí una política de escape en vez de considerarlos siempre patrones.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La consulta incluye desde y excluye hastaExclusiva. Si querés todo octubre, el extremo superior puede ser el inicio de noviembre con una política de zona horaria apropiada. Los parámetros deben ser compatibles con Date o el tipo temporal elegido en la entidad.

## 3. Qué conviene corregir

La confusión a evitar es: Concatenar texto del usuario dentro de la consulta para construir el filtro.

WHERE puede combinar condiciones y comparar fechas, texto o pertenencia. BETWEEN incluye extremos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
