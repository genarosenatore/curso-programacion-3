# Clase 10.02 · Predicate, Function, Consumer y Supplier

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_01.md) · [Clase siguiente](../10_Funcional/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **predicate, function, consumer y supplier**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Predicate<T> responde booleano; Function<T,R> transforma; Consumer<T> consume sin retorno útil; Supplier<T> produce un valor sin entrada. Son contratos estándar del paquete java.util.function. Sus nombres permiten expresar intención sin crear interfaces nuevas para cada caso.

Podemos componer predicados con and, or y negate; funciones con andThen o compose. El orden importa: aplicar impuesto y después redondear puede no equivaler a invertir pasos. Comenzaremos con operaciones que permitan verificar el resultado a mano.

## Ejemplo

```java
java.util.function.Predicate<Integer> positivo = n -> n > 0;
java.util.function.Function<Integer, String> etiqueta = n -> "Stock: " + n;
java.util.function.Consumer<String> mostrar = System.out::println;
java.util.function.Supplier<Integer> inicial = () -> 0;
mostrar.accept(etiqueta.apply(inicial.get()));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

El supplier devuelve 0, la función genera Stock: 0 y el consumer lo imprime. positivo.test(3) devuelve true. Cada método del contrato tiene nombre propio: test, apply, accept y get. Esa diferencia ayuda a leer cómo se usa cada función.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá un Predicate<Integer> que acepte entre 1 y 5 inclusive.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Invocar apply sobre un Predicate o esperar retorno de Consumer.

## Resumen para repasar

Predicate<T> responde booleano; Function<T,R> transforma; Consumer<T> consume sin retorno útil; Supplier<T> produce un valor sin entrada. Son contratos estándar del paquete java.util.function.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_01.md) · [Clase siguiente](../10_Funcional/CLASE_03.md)
