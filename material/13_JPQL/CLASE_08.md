# Clase 13.08 · Práctica escalonada: los cinco niveles del TP grupal

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica escalonada: los cinco niveles del tp grupal**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El TP grupal organiza consultas en cinco niveles: selección y filtros, condiciones y agregados, relaciones y subconsultas, agrupamiento y consultas correlacionadas. Para estudiar por tu cuenta, hacé una consulta por vez y comprobala con datos cuyo resultado conozcas.

Anotá por cada ejercicio: entidades de origen, relaciones, parámetro, forma del resultado y casos límite. Una consulta que compila puede contar duplicados o excluir filas por un JOIN incorrecto. La validación incluye significado, no solo sintaxis.

## Ejemplo

```text
Ficha de consulta
Pregunta: total por condición de IVA
Origen: FacturaVenta
Agrupación: condicionIva.id y condicionIva.denominacion
Salida: denominación y suma de importeTotal
Caso de prueba: dos facturas de la misma condición y una de otra
```

[Abrir el fragmento como archivo](fragmentos/clase_08.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

Con totales 100 y 200 en condición A, y 50 en B, esperamos A=300 y B=50. La consulta es select f.condicionIva.denominacion,sum(f.importeTotal) ... group by id y denominación. Si antes unimos detalles y no compensamos duplicados, podemos sumar más de una vez cada cabecera.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Resolvé una consulta de cada nivel y escribí un resultado esperado con tres o cuatro filas de prueba.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Evaluar una consulta sin datos que distingan sus casos correctos de los incorrectos.

## Resumen para repasar

El TP grupal organiza consultas en cinco niveles: selección y filtros, condiciones y agregados, relaciones y subconsultas, agrupamiento y consultas correlacionadas. Para estudiar por tu cuenta, hacé una consulta por vez y comprobala con datos cuyo resultado conozcas.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_01.md)
