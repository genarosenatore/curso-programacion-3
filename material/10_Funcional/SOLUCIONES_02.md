# Soluciones 10.02 · Predicate, Function, Consumer y Supplier

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

Predicate<Integer> valido=n->n>=1&&n<=5;. Con 0 false, 1 true, 5 true y 6 false. Si el contrato admite null, primero hay que descartarlo; aquí asumimos enteros presentes.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El supplier devuelve 0, la función genera Stock: 0 y el consumer lo imprime. positivo.test(3) devuelve true. Cada método del contrato tiene nombre propio: test, apply, accept y get. Esa diferencia ayuda a leer cómo se usa cada función.

## 3. Qué conviene corregir

La confusión a evitar es: Invocar apply sobre un Predicate o esperar retorno de Consumer.

Predicate<T> responde booleano; Function<T,R> transforma; Consumer<T> consume sin retorno útil; Supplier<T> produce un valor sin entrada. Son contratos estándar del paquete java.util.function.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
