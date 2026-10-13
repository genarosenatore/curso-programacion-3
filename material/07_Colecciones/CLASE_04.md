# Clase 07.04 · HashMap: claves y valores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_03.md) · [Clase siguiente](../07_Colecciones/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **hashmap: claves y valores**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

HashMap relaciona claves únicas con valores. put asocia y puede reemplazar; get consulta; containsKey diferencia una clave ausente de una cuyo valor es null. getOrDefault da un valor alternativo cuando no existe la clave. entrySet permite recorrer pares.

Las claves necesitan igualdad y hash coherentes. Map<K,V> expresa tipos de claves y valores. No uses el mapa como si fuera una lista y no asumas orden de inserción en HashMap. LinkedHashMap puede conservarlo.

## Ejemplo

```java
java.util.Map<String, Integer> stock = new java.util.HashMap<>();
stock.put("P01", 5);
stock.put("P01", 3);
System.out.println(stock.get("P01"));
System.out.println(stock.getOrDefault("P02", 0));
for (var entrada : stock.entrySet()) {
    System.out.println(entrada.getKey() + "=" + entrada.getValue());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

El valor de P01 queda 3. P02 no existe y obtiene cero mediante getOrDefault. var permite inferir el tipo de una variable local; no vuelve dinámico el lenguaje. entrySet evita buscar el valor nuevamente para cada clave.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Contá apariciones de A, B y A en un mapa.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Reemplazar siempre por 1 y perder el conteo acumulado.

## Resumen para repasar

HashMap relaciona claves únicas con valores. put asocia y puede reemplazar; get consulta; containsKey diferencia una clave ausente de una cuyo valor es null.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_03.md) · [Clase siguiente](../07_Colecciones/CLASE_05.md)
