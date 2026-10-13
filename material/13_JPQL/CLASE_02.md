# Clase 13.02 · Selección, proyecciones y filtros

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_01.md) · [Clase siguiente](../13_JPQL/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **selección, proyecciones y filtros**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una proyección selecciona datos concretos en lugar de toda la entidad. Varias expresiones pueden producir Object[]; una expresión de constructor permite crear un DTO si existe un constructor compatible. Ese DTO no tiene que ser una entidad.

La clase del constructor usa su nombre cualificado. Orden y tipos de argumentos deben coincidir. Proyectar solo lo necesario reduce datos transferidos, pero no soluciona automáticamente todas las consultas de relaciones o permisos.

## Ejemplo

```sql
select f.numeroFactura, f.fechaEmision, f.importeTotal
from FacturaVenta f
order by f.numeroFactura
```

[Abrir el fragmento como archivo](fragmentos/clase_02.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

Cada fila contiene tres valores en ese orden, no una FacturaVenta completa. Para Object[], documentá índices o preferí un DTO. Una variante sería select new curso.FacturaResumen(f.numeroFactura,f.importeTotal), con ese tipo definido y constructor compatible.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá un DTO de número y total y escribí su expresión de constructor.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Usar FacturaVenta.class como resultado cuando se seleccionan tres valores escalares.

## Resumen para repasar

Una proyección selecciona datos concretos en lugar de toda la entidad. Varias expresiones pueden producir Object[]; una expresión de constructor permite crear un DTO si existe un constructor compatible.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_01.md) · [Clase siguiente](../13_JPQL/CLASE_03.md)
