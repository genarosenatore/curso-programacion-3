# Clase 11.05 · INSERT, UPDATE y DELETE

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_04.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **insert, update y delete**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

INSERT añade registros; UPDATE modifica los que cumplen una condición; DELETE elimina. Antes de una modificación, escribí un SELECT con el mismo filtro para comprobar el conjunto objetivo. En una práctica usa una base de prueba que puedas reconstruir.

UPDATE y DELETE sin WHERE afectan todas las filas. Eso puede ser correcto en alguna operación explícita, pero no sirve para cambiar un solo producto. Las restricciones siguen activas en estas operaciones. Mantener historial o anular lógicamente requiere un modelo distinto a borrar físicamente.

## Ejemplo

```sql
INSERT INTO producto (id,nombre,precio_centavos,categoria_id) VALUES (3,'Mochila',500000,1);
UPDATE producto SET precio_centavos=480000 WHERE id=3;
SELECT * FROM producto WHERE id=3;
DELETE FROM producto WHERE id=3;
```

[Abrir el fragmento como archivo](fragmentos/clase_05.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

La categoría 1 debe existir. El UPDATE cambia solo el producto 3 y el SELECT permite observarlo antes del DELETE. Si el producto ya está referenciado por detalles, la política de claves foráneas puede rechazar su borrado. Ese rechazo indica una relación que hay que respetar.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Actualizá el nombre de producto 1 en una copia de la base y comprobá que el 2 no cambió.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Olvidar WHERE al editar un registro individual.

## Resumen para repasar

INSERT añade registros; UPDATE modifica los que cumplen una condición; DELETE elimina. Antes de una modificación, escribí un SELECT con el mismo filtro para comprobar el conjunto objetivo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_04.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_06.md)
