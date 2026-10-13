# Clase 13.04 · Navegación de relaciones, INNER JOIN y LEFT JOIN

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_03.md) · [Clase siguiente](../13_JPQL/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **navegación de relaciones, inner join y left join**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

JPQL navega relaciones de entidades y permite joins explícitos. INNER JOIN exige coincidencia; LEFT JOIN conserva el lado izquierdo aunque falte el derecho. Al unir colecciones, la entidad del lado uno puede aparecer repetida y select distinct puede ser necesario según el resultado pedido.

Un filtro en WHERE sobre el lado opcional de un LEFT JOIN puede volver a descartar las filas que pretendíamos conservar. Pensá si la condición pertenece a la unión o al resultado final. El camino debe existir en el modelo de objetos, no solo en la base.

## Ejemplo

```sql
select a.denominacion, m.denominacion
from Articulo a left join a.marca m
order by a.denominacion
```

[Abrir el fragmento como archivo](fragmentos/clase_04.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

Incluye artículos sin marca y devuelve null como denominación de marca en esas filas. join a.marca usa una relación mapeada. Para facturas con un artículo de cierta marca, el camino del campus es factura.detalles → listaPrecioArticulo → articulo → marca.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Escribí una consulta de facturas que contengan un artículo de una marca por id sin duplicar facturas.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Inventar d.articulo cuando la relación real pasa por listaPrecioArticulo.

## Resumen para repasar

JPQL navega relaciones de entidades y permite joins explícitos. INNER JOIN exige coincidencia; LEFT JOIN conserva el lado izquierdo aunque falte el derecho.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_03.md) · [Clase siguiente](../13_JPQL/CLASE_05.md)
