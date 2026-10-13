# Soluciones 07.06 · Comparable y Comparator

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()). Con Ana, Eva y Luis queda Luis, Ana, Eva. Si aplicás reversed después de todos los criterios, también invertís el desempate.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El primer orden es Ana, Eva, Luis. El segundo ordena por longitud y desempata alfabéticamente. String::length es una referencia a método que se desarrolla en programación funcional. No hace falta cambiar la clase String para tener un criterio distinto.

## 3. Qué conviene corregir

La confusión a evitar es: Asumir que orden natural significa siempre orden de inserción.

Comparable define un orden natural desde la propia clase. Comparator define un criterio externo y permite varios órdenes.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
