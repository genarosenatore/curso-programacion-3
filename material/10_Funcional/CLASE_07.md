# Clase 10.07 · Agrupaciones y Optional

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **agrupaciones y optional**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

groupingBy agrupa elementos según una clave. Puede devolver Map<Clave,List<Elemento>> o usar otro collector para resumir cada grupo. counting cuenta y summingInt suma. Optional representa explícitamente la posible ausencia de un resultado, como findFirst.

Optional no debería usarse solo para terminar llamando get sin comprobar. map transforma si hay contenido, orElse aporta una alternativa y orElseGet calcula esa alternativa cuando hace falta. La ausencia de una coincidencia en una búsqueda puede ser normal.

## Ejemplo

```java
var nombres = java.util.List.of("Ana", "Eva", "Luis");
var conteos = nombres.stream().collect(java.util.stream.Collectors.groupingBy(
    String::length, java.util.stream.Collectors.counting()));
String elegido = nombres.stream().filter(n -> n.startsWith("Z")).findFirst().orElse("Sin coincidencia");
System.out.println(conteos);
System.out.println(elegido);
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

El mapa contiene longitud 3 con conteo 2 y longitud 4 con conteo 1; su orden no está garantizado. elegido es Sin coincidencia. La clave length agrupa por longitud, no por inicial. Leé cada criterio antes de interpretar un mapa.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agrupá nombres por primera letra y contá. Decidí cómo tratar nombres vacíos.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Hacer Optional.get() sobre una búsqueda que puede no tener resultado.

## Resumen para repasar

groupingBy agrupa elementos según una clave. Puede devolver Map<Clave,List<Elemento>> o usar otro collector para resumir cada grupo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_08.md)
