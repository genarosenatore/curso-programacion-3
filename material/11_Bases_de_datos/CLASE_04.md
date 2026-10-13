# Clase 11.04 · SELECT, WHERE y ORDER BY

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_03.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **select, where y order by**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

SELECT elige columnas, FROM el origen, WHERE filtra filas y ORDER BY ordena. No existe orden garantizado sin ORDER BY. Los parámetros se pasan por el mecanismo de la librería y no concatenando texto del usuario a la consulta.

NULL representa ausencia y se comprueba con IS NULL o IS NOT NULL, no con = NULL. Las condiciones usan lógica SQL con un tercer estado desconocido. Para intervalos de fechas y nombres, necesitamos conocer cómo almacena esos datos el motor.

## Ejemplo

```sql
SELECT id, nombre, precio_centavos
FROM producto
WHERE precio_centavos >= 100000
ORDER BY precio_centavos DESC, id ASC;
```

[Abrir el fragmento como archivo](fragmentos/clase_04.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

El filtro conserva productos cuyo precio sea al menos 1000 unidades, porque almacenamos centavos. El orden principal es precio descendente y el id desempata. El resultado no incluye productos por debajo del límite, aunque estén disponibles.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Consultá productos entre 80000 y 200000 centavos, ordenados por nombre.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Esperar que WHERE columna=NULL encuentre filas sin valor.

## Resumen para repasar

SELECT elige columnas, FROM el origen, WHERE filtra filas y ORDER BY ordena. No existe orden garantizado sin ORDER BY.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_03.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_05.md)
