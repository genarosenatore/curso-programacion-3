# Clase 11.04 · SELECT, WHERE y ORDER BY

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_03.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_05.md)

## Preguntar qué filas y qué columnas queremos

SELECT elige los datos de salida; FROM indica tabla; WHERE decide qué filas pasan; ORDER BY define orden. Aunque SELECT aparece primero en la escritura, para razonar podés empezar por el origen, filtrar y después proyectar columnas. `*` selecciona todas, pero nombrar columnas hace explícito el contrato.

El ejemplo selecciona precio>=100000 centavos y ordena descendente por precio; id ascendente desempata. Sin ORDER BY no hay un orden prometido. En los datos de tienda devuelve Libro, Cuaderno y Producto sin categoría; Lapicera de 80000 queda fuera.

## Operadores sobre datos presentes y ausentes

BETWEEN incluye ambos extremos. IN(1,2) comprueba pertenencia a una lista de valores. AND exige ambas condiciones y OR al menos una; usá paréntesis para dejar claro agrupar OR dentro de otras reglas. LIKE admite `%` como secuencia y `_` como un carácter, según las reglas de comparación del motor.

NULL representa ausencia. `categoria_id = NULL` no responde true para ausentes: la comparación produce **desconocido**, un tercer estado de la lógica SQL. WHERE conserva solo true. Usá IS NULL o IS NOT NULL. Esto explica por qué una comparación común puede eliminar filas opcionales en un JOIN.

Ejecutá el fragmento con `python ejecutar.py ../../11_Bases_de_datos/fragmentos/clase_04.sql --tienda` desde la carpeta SQL. Para datos externos se usan parámetros de la biblioteca, por ejemplo `?` en SQLite Python y una secuencia de valores por separado; no se concatena texto al SQL. Es un mecanismo de ejecución, no una comilla que vuelva seguro cualquier texto construido.

## Ejemplo de la clase

```sql
SELECT id, nombre, precio_centavos
FROM producto
WHERE precio_centavos >= 100000
ORDER BY precio_centavos DESC, id ASC;
```

[Abrir el fragmento como archivo](fragmentos/clase_04.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El filtro conserva productos cuyo precio sea al menos 1000 unidades, porque almacenamos centavos. El orden principal es precio descendente y el id desempata. El resultado no incluye productos por debajo del límite, aunque estén disponibles.

## Cambiar una decisión y explorar un límite

Cambiá >= por >: un precio exactamente 100000 queda excluido. Cambiá ORDER BY a nombre,id: cambia presentación, no qué filas cumplen. Para productos sin categoría, IS NULL encuentra el cuarto producto; = NULL no expresa esa ausencia.

## Confusión que conviene evitar

Esperar que WHERE columna=NULL encuentre filas sin valor.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_03.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_05.md)
