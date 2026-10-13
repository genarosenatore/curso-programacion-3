# Clase 07.03 · HashSet y duplicados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_02.md) · [Clase siguiente](../07_Colecciones/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **hashset y duplicados**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

HashSet permite consultar pertenencia sin mantener una secuencia de índices. add devuelve si el conjunto cambió. contains y remove usan la regla de igualdad; con objetos propios, equals y hashCode deben ser coherentes.

El orden de un HashSet no está garantizado aunque un ejemplo parezca estable. TreeSet organiza mediante Comparable o Comparator y considera duplicados según comparación igual a cero; conviene que esa comparación sea coherente con equals. No cambies atributos usados para localizar elementos mientras estén dentro de esas estructuras.

## Ejemplo

```java
java.util.Set<String> codigos = new java.util.HashSet<>();
System.out.println(codigos.add("P01"));
System.out.println(codigos.add("P01"));
System.out.println(codigos.contains("P01"));
System.out.println(codigos.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

Muestra true, false, true y 1. La segunda inserción no crea otro elemento igual. No hay get(0), porque Set no expresa acceso por índice. Si necesitás una lista ordenada para la pantalla, convertí o seleccioná una implementación apropiada.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Registrá inscripciones sin duplicados y avisá cuando un código ya existía.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Ordenar visualmente según el recorrido accidental de HashSet.

## Resumen para repasar

HashSet permite consultar pertenencia sin mantener una secuencia de índices. add devuelve si el conjunto cambió.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_02.md) · [Clase siguiente](../07_Colecciones/CLASE_04.md)
