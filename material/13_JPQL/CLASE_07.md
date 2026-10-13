# Clase 13.07 · CASE y consultas avanzadas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_06.md) · [Clase siguiente](../13_JPQL/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **case y consultas avanzadas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

CASE calcula una expresión según condiciones. Debe conservar alternativas de tipos compatibles. COALESCE puede elegir el primer valor no nulo. Estas expresiones son útiles para proyecciones, pero no cambian automáticamente el estado almacenado.

Los límites necesitan una política sin solapamientos. Si el primer WHEN usa >50000 y el segundo >=10000, un valor de 50000 cae en el segundo; un valor de 10000 también. Esos casos exactos comprueban la clasificación.

## Ejemplo

```sql
select f.numeroFactura, f.importeTotal,
case when f.importeTotal > 50000 then 'ALTO VALOR'
     when f.importeTotal >= 10000 then 'MEDIO VALOR'
     else 'BAJO VALOR' end
from FacturaVenta f
order by f.importeTotal desc
```

[Abrir el fragmento como archivo](fragmentos/clase_07.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

La salida añade una etiqueta calculada. No requiere un atributo categoria en FacturaVenta. El rango medio llega a 50000 porque el primer WHEN solo toma mayores. Los importes están en las unidades del atributo del campus; no conviertas a centavos sin cambiar el modelo y parámetros.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Clasificá 9999, 10000, 50000 y 50001.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que una columna calculada de consulta queda guardada como propiedad persistente.

## Resumen para repasar

CASE calcula una expresión según condiciones. Debe conservar alternativas de tipos compatibles.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_06.md) · [Clase siguiente](../13_JPQL/CLASE_08.md)
