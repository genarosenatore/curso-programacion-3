# Clase 13.01 · JPQL frente a SQL y parámetros nombrados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_09.md) · [Clase siguiente](../13_JPQL/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **jpql frente a sql y parámetros nombrados**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

JPQL usa nombres de entidades y atributos Java, no tablas y columnas SQL. Un alias identifica cada origen. createQuery puede tipar el resultado cuando seleccionamos una entidad. Los parámetros nombrados separan consulta y datos, evitando concatenaciones que cambien su significado.

En esta unidad el modelo de referencia es FacturaVenta del campus. Las consultas necesitan que sus relaciones estén mapeadas, como exige el TP JPA. Los fragmentos no ejecutan sobre SQLite ni sobre una clase sin anotaciones. Adaptá nombres si trabajás con otro modelo.

## Ejemplo

```java
var consulta = em.createQuery(
    "select f from FacturaVenta f where f.estado = :estado", FacturaVenta.class);
consulta.setParameter("estado", "EMITIDA");
var facturas = consulta.getResultList();
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

f representa una FacturaVenta. :estado es un valor proporcionado aparte; no es una columna. getResultList devuelve una lista, vacía si no hay coincidencias. El tipo FacturaVenta.class coincide con la selección completa f.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Consultá todas las facturas de un cliente por su id usando parámetro.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir factura_venta o cliente_id porque son nombres de la tabla y columna.

## Resumen para repasar

JPQL usa nombres de entidades y atributos Java, no tablas y columnas SQL. Un alias identifica cada origen.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_09.md) · [Clase siguiente](../13_JPQL/CLASE_02.md)
