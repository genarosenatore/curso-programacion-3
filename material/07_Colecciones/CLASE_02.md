# Clase 07.02 · ArrayList y recorrido de listas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_01.md) · [Clase siguiente](../07_Colecciones/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **arraylist y recorrido de listas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

ArrayList crece a medida que agregamos elementos y permite acceso por índice. add añade, get consulta, set reemplaza y size cuenta. El índice debe estar entre cero y size-1. Un for mejorado sirve para leer todos los elementos sin usar índices.

List.of crea una lista no modificable. Para editarla podés construir new ArrayList<>(List.of(...)). Con Integer, remove(1) elimina por índice y remove(Integer.valueOf(1)) por valor: la sobrecarga importa.

## Ejemplo

```java
java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Ana", "Luis"));
nombres.add("Eva");
nombres.set(0, "Anita");
for (String nombre : nombres) System.out.println(nombre);
System.out.println(nombres.get(2));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

La lista queda Anita, Luis, Eva y get(2) devuelve Eva. set no agrega al final: necesita una posición existente. size es un método en List, distinto de length de un array. El orden de la lista corresponde a la secuencia de inserción y cambios.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Quitá Luis y agregá Omar. Predecí tamaño y orden.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Intentar agregar a List.of y no comprender UnsupportedOperationException.

## Resumen para repasar

ArrayList crece a medida que agregamos elementos y permite acceso por índice. add añade, get consulta, set reemplaza y size cuenta.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_01.md) · [Clase siguiente](../07_Colecciones/CLASE_03.md)
