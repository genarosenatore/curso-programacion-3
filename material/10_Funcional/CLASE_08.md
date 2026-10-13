# Clase 10.08 · Práctica: consultas sobre productos y facturas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_07.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: consultas sobre productos y facturas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Las consultas sobre colecciones combinan filtros, proyecciones y agrupaciones. Para practicar, necesitamos datos que hagan visible cada caso: productos disponibles y agotados, categorías repetidas y una lista vacía. Comprobá la salida a mano antes de mirar el resultado.

La práctica funcional prepara formas de pensar que retomaremos en consultas SQL y JPQL, aunque allí se ejecutan en otro sistema y tienen otras reglas. Un stream sobre objetos cargados no evita traer datos desde la base si la consulta inicial ya los cargó todos.

## Ejemplo

```java
record Venta(String categoria, int importeCentavos) {}
var ventas = java.util.List.of(new Venta("Útiles",10000),new Venta("Útiles",20000),new Venta("Libros",50000));
var totales = ventas.stream().collect(java.util.stream.Collectors.groupingBy(
    Venta::categoria, java.util.stream.Collectors.summingInt(Venta::importeCentavos)));
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

Útiles acumula 30000 y Libros 50000. groupingBy define grupos y summingInt reduce importes dentro de cada uno. Para muchas ventas usarías summingLong u otra representación para evitar desborde. El resultado es un resumen, no la lista completa de cada categoría.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agregá una venta y obtené solo categorías con total superior a 40000.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Filtrar ventas individuales por importe cuando la pregunta pide filtrar el total por categoría.

## Resumen para repasar

Las consultas sobre colecciones combinan filtros, proyecciones y agrupaciones. Para practicar, necesitamos datos que hagan visible cada caso: productos disponibles y agotados, categorías repetidas y una lista vacía.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_07.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_01.md)
