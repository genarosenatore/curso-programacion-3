# Clase 13.05 · COUNT, SUM, AVG, GROUP BY y HAVING

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_04.md) · [Clase siguiente](../13_JPQL/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **count, sum, avg, group by y having**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

COUNT, SUM y AVG resumen resultados. GROUP BY agrupa y HAVING filtra grupos después del resumen. WHERE filtra filas antes. Las expresiones seleccionadas que no son agregaciones deben corresponder al agrupamiento según las reglas aplicables.

COUNT devuelve Long; AVG normalmente Double; SUM depende del tipo de su argumento. Los agregados, excepto count, pueden devolver null cuando no hay valores. Elegí tipos de DTO compatibles y definí cómo representar ausencia de totales.

## Ejemplo

```sql
select f.puntoVenta.descripcion, count(f), sum(f.importeTotal)
from FacturaVenta f
group by f.puntoVenta.id, f.puntoVenta.descripcion
having count(f) > :minimo
```

[Abrir el fragmento como archivo](fragmentos/clase_05.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

Produce una fila por punto de venta con más facturas que minimo. No pregunta si una factura individual tiene gran importe. Agrupar también por id evita mezclar puntos distintos con misma descripción. El tipo del total debe coincidir con el atributo de entidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agrupá por estado y devolvé conteo y promedio de importe.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Usar WHERE count(f)>5 en lugar de HAVING para filtrar un agregado.

## Resumen para repasar

COUNT, SUM y AVG resumen resultados. GROUP BY agrupa y HAVING filtra grupos después del resumen.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_04.md) · [Clase siguiente](../13_JPQL/CLASE_06.md)
