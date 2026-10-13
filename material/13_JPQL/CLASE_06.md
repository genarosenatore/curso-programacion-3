# Clase 13.06 · Subconsultas, EXISTS y NOT EXISTS

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_05.md) · [Clase siguiente](../13_JPQL/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **subconsultas, exists y not exists**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una subconsulta en WHERE o HAVING calcula o comprueba algo usado por la consulta externa. Puede ser independiente o correlacionada, cuando referencia un alias externo. EXISTS responde si hay al menos una fila y NOT EXISTS si no la hay.

En JPQL estándar trabajamos con las ubicaciones admitidas para subconsultas; no trasladamos cualquier SQL específico del motor. Una correlación debe usar la relación real entre los objetos. Probar un caso sin coincidencias es tan importante como uno con varias.

## Ejemplo

```sql
select f from FacturaVenta f
where f.importeTotal > (select avg(otra.importeTotal) from FacturaVenta otra)
```

[Abrir el fragmento como archivo](fragmentos/clase_06.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

La subconsulta calcula el promedio global y la externa selecciona facturas que lo superan. No calcula un promedio separado por cliente. Si no hay facturas, no hay resultado externo y el promedio puede ser null.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Buscá artículos que nunca aparecieron en un detalle de factura.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Olvidar la correlación y usar una subconsulta que responde lo mismo para todos los artículos.

## Resumen para repasar

Una subconsulta en WHERE o HAVING calcula o comprueba algo usado por la consulta externa. Puede ser independiente o correlacionada, cuando referencia un alias externo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_05.md) · [Clase siguiente](../13_JPQL/CLASE_07.md)
