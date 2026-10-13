# Clase 07.01 · List, Set y Map: qué problema resuelve cada uno

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **list, set y map: qué problema resuelve cada uno**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

List representa una secuencia que permite duplicados; Set un grupo sin duplicados según su regla; Map relaciona claves con valores y no es un subtipo de Collection. Usamos interfaces en variables e implementaciones concretas al construir: List<String> nombres = new ArrayList<>.

No todas las implementaciones tienen el mismo orden o costo. HashSet no garantiza orden; LinkedHashSet conserva inserción; TreeSet ordena según comparación. Queue y Deque son útiles para procesamiento por turnos o extremos. Elegí primero qué operaciones necesita el problema.

## Ejemplo

```java
java.util.List<String> lista = new java.util.ArrayList<>();
lista.add("A"); lista.add("A");
java.util.Set<String> conjunto = new java.util.HashSet<>(lista);
java.util.Map<String, Integer> precios = new java.util.HashMap<>();
precios.put("A", 800);
System.out.println(lista.size() + " / " + conjunto.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

Muestra 2 / 1. La lista conserva ambos; el conjunto usa igualdad de String para deduplicar. El mapa conserva el precio bajo la clave A. Una nueva llamada put con A reemplaza su valor anterior en lugar de crear otra clave.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Elegí colección para pasos de una receta, correos únicos y precios por código.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que toda colección tiene posiciones numéricas como una lista.

## Resumen para repasar

List representa una secuencia que permite duplicados; Set un grupo sin duplicados según su regla; Map relaciona claves con valores y no es un subtipo de Collection. Usamos interfaces en variables e implementaciones concretas al construir: List<String> nombres = new ArrayList<>.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_02.md)
