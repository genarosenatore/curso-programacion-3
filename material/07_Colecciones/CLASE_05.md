# Clase 07.05 · Iteradores, búsqueda y eliminación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **iteradores, búsqueda y eliminación**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Modificar una colección mientras un for mejorado la recorre puede invalidar su iterador. Para eliminar según una regla, removeIf expresa la intención. Si necesitás control manual, Iterator permite avanzar y usar su propio remove después de next.

Un resultado ausente necesita una política: booleano, null u Optional según la operación. No conviertas toda ausencia en un error. Una búsqueda sin coincidencia puede ser un resultado normal en un filtro.

## Ejemplo

```java
java.util.List<Integer> stock = new java.util.ArrayList<>(java.util.List.of(0, 3, 0, 5));
stock.removeIf(valor -> valor == 0);
System.out.println(stock);
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

Queda [3,5]. La lambda recibe cada valor y decide qué eliminar. En el ejemplo usa Integer con autounboxing para compararlo numéricamente. Si se admitieran null, habría que manejarlos antes. removeIf modifica la lista, distinto de filter de un stream que produce otro resultado.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Eliminá números negativos de una lista sin tocarla directamente dentro de un for mejorado.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Usar lista.remove dentro del for mejorado y provocar ConcurrentModificationException.

## Resumen para repasar

Modificar una colección mientras un for mejorado la recorre puede invalidar su iterador. Para eliminar según una regla, removeIf expresa la intención.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_06.md)
