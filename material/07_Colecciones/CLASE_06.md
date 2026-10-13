# Clase 07.06 · Comparable y Comparator

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **comparable y comparator**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Comparable define un orden natural desde la propia clase. Comparator define un criterio externo y permite varios órdenes. comparar devuelve un valor negativo, cero o positivo, no necesariamente -1 o 1. comparing y thenComparing componen criterios de forma legible.

Ordenar cambia el orden de la lista si llamás sort sobre una lista modificable. Para preservar el original, primero creá una copia. Restar enteros como comparador puede desbordar; usá Integer.compare o comparingInt.

## Ejemplo

```java
java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Eva", "Ana", "Luis"));
nombres.sort(java.util.Comparator.naturalOrder());
System.out.println(nombres);
nombres.sort(java.util.Comparator.comparingInt(String::length).thenComparing(java.util.Comparator.naturalOrder()));
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

El primer orden es Ana, Eva, Luis. El segundo ordena por longitud y desempata alfabéticamente. String::length es una referencia a método que se desarrolla en programación funcional. No hace falta cambiar la clase String para tener un criterio distinto.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Ordená nombres por longitud descendente y explicá el desempate.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Asumir que orden natural significa siempre orden de inserción.

## Resumen para repasar

Comparable define un orden natural desde la propia clase. Comparator define un criterio externo y permite varios órdenes.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_07.md)
