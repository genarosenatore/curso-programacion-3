# Clase 10.04 · Streams: origen, operaciones intermedias y terminales

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_03.md) · [Clase siguiente](../10_Funcional/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **streams: origen, operaciones intermedias y terminales**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un stream representa un recorrido de datos para procesarlos. Se construye desde una fuente, encadena operaciones intermedias y termina con una operación terminal. Las intermedias son perezosas: no recorren la fuente por sí solas hasta que se necesita el resultado terminal.

Un stream no es una colección nueva para guardar y reusar. Después de consumirlo no se vuelve a recorrer; construí otro desde la fuente. La cadena normalmente no modifica la lista original. Empezamos con streams secuenciales, sin paralelismo ni efectos secundarios.

## Ejemplo

```java
var nombres = java.util.List.of("Ana", "Luis", "Eva");
var cortos = nombres.stream()
    .filter(nombre -> nombre.length() <= 3)
    .toList();
System.out.println(cortos);
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

stream crea el origen; filter es intermedia; toList es terminal y obtiene [Ana,Eva]. La lista original conserva los tres nombres. toList de Stream produce una lista no modificable; si necesitás editarla, elegí otra construcción explícita.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Identificá origen, operación intermedia y terminal en una cadena que cuenta números positivos.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Guardar un Stream consumido y llamar a otra terminal sobre la misma instancia.

## Resumen para repasar

Un stream representa un recorrido de datos para procesarlos. Se construye desde una fuente, encadena operaciones intermedias y termina con una operación terminal.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_03.md) · [Clase siguiente](../10_Funcional/CLASE_05.md)
