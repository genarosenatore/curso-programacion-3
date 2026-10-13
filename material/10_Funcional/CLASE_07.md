# Clase 10.07 · Agrupaciones y Optional

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_08.md)

## Agrupar antes de resumir

groupingBy calcula una clave por elemento y reúne los que la comparten. Con nombres de longitud 3 y 4, la clave es esa longitud. Un collector posterior como counting cuenta elementos de cada grupo; sin él se obtendría una lista por clave. `Map<Integer,Long>` describe las claves numéricas y los conteos long.

En el ejemplo, Ana y Eva forman longitud 3 y Luis longitud 4. La salida tiene 3→2 y 4→1; el orden del mapa no es la pregunta. Los nombres originales no cambian. Colocá operaciones dentro de main con Collectors o sus nombres completos.

## Representar una búsqueda que puede faltar

Optional<T> es un contenedor que expresa presente o ausente. findFirst de una búsqueda produce esa posibilidad; orElse ofrece un valor alternativo. Buscar inicial Z en esos nombres no encuentra y usa Sin coincidencia. No llames get sin comprobar, porque vacío lanza.

map sobre Optional transforma solo cuando hay dato; orElseGet recibe un Supplier y calcula la alternativa cuando falta. orElse evalúa su argumento antes de la llamada, aunque luego no se necesite; si crear la alternativa es costoso o tiene efecto, esa diferencia importa. Optional no es una colección de muchos resultados ni una excusa para esconder todas las reglas de ausencia.

Para agrupar por primera letra, texto vacío no tiene posición cero ni substring(0,1). Decidí excluirlo, rechazarlo o asignarlo a una clave especial. La política de datos debe preceder a la agrupación. Un filtro !n.isEmpty() asume que n no es null; si null es posible, descartalo primero.

## Ejemplo de la clase

```java
var nombres = java.util.List.of("Ana", "Eva", "Luis");
var conteos = nombres.stream().collect(java.util.stream.Collectors.groupingBy(
    String::length, java.util.stream.Collectors.counting()));
String elegido = nombres.stream().filter(n -> n.startsWith("Z")).findFirst().orElse("Sin coincidencia");
System.out.println(conteos);
System.out.println(elegido);
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El mapa contiene longitud 3 con conteo 2 y longitud 4 con conteo 1; su orden no está garantizado. elegido es Sin coincidencia. La clave length agrupa por longitud, no por inicial. Leé cada criterio antes de interpretar un mapa.

## Cambiar una decisión y explorar un límite

Agregá "" y agrupá por substring sin comprobar: falla. Por longitud, vacío sí tiene clave 0. La misma entrada puede ser válida para una consulta e inválida para otra. Un Optional vacío no es un error necesariamente: puede expresar una búsqueda sin coincidencias.

## Confusión que conviene evitar

Hacer Optional.get() sobre una búsqueda que puede no tener resultado.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_08.md)
