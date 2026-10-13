# Soluciones 10.08 · Práctica: consultas sobre productos y facturas

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

totales.entrySet().stream().filter(e->e.getValue()>40000).map(Map.Entry::getKey).toList(). Con los datos originales devuelve Libros. Si añadís Útiles por 20000, su total será 50000 y también aparecerá.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Útiles acumula 30000 y Libros 50000. groupingBy define grupos y summingInt reduce importes dentro de cada uno. Para muchas ventas usarías summingLong u otra representación para evitar desborde. El resultado es un resumen, no la lista completa de cada categoría.

## 3. Qué conviene corregir

La confusión a evitar es: Filtrar ventas individuales por importe cuando la pregunta pide filtrar el total por categoría.

Las consultas sobre colecciones combinan filtros, proyecciones y agrupaciones. Para practicar, necesitamos datos que hagan visible cada caso: productos disponibles y agotados, categorías repetidas y una lista vacía.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
