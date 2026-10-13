# Clase 11.06 · JOIN, agregaciones y agrupamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_05.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **join, agregaciones y agrupamiento**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

JOIN combina filas relacionadas. INNER JOIN conserva coincidencias; LEFT JOIN conserva las filas del lado izquierdo aunque no haya relación y devuelve null para columnas del lado derecho. COUNT cuenta, SUM suma y AVG promedia; GROUP BY crea grupos antes de agregarlos.

Una unión uno a muchos puede repetir la fila del lado uno. Si contás facturas tras unir detalles, podrías contar renglones en vez de facturas. Elegí DISTINCT o el agrupamiento según la pregunta y explicá qué representa cada fila intermedia.

## Ejemplo

```sql
SELECT c.nombre, COUNT(p.id) AS productos
FROM categoria c
LEFT JOIN producto p ON p.categoria_id=c.id
GROUP BY c.id,c.nombre
ORDER BY c.nombre;
```

[Abrir el fragmento como archivo](fragmentos/clase_06.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

La consulta incluye categorías sin productos. COUNT(p.id) ignora null y da cero en esos casos. COUNT(*) contaría la fila conservada por el LEFT JOIN y podría dar uno; no expresa la misma pregunta. Agrupamos por id y nombre para identificar claramente la categoría.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Obtené productos y nombres de categoría, incluyendo productos sin categoría.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar LEFT JOIN por INNER JOIN sin reconocer qué filas se pierden.

## Resumen para repasar

JOIN combina filas relacionadas. INNER JOIN conserva coincidencias; LEFT JOIN conserva las filas del lado izquierdo aunque no haya relación y devuelve null para columnas del lado derecho.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_05.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_07.md)
