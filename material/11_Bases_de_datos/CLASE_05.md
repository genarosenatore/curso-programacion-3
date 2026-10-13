# Clase 11.05 · INSERT, UPDATE y DELETE

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_04.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_06.md)

## Cambiar un conjunto definido de filas

INSERT crea; UPDATE cambia datos existentes; DELETE elimina filas. El filtro de una modificación determina su alcance. Antes de escribir UPDATE o DELETE, ejecutá SELECT con la misma condición para verificar qué conjunto representa. Usa una base de práctica reconstruible.

En INSERT conviene nombrar columnas: mantiene la correspondencia aunque el esquema agregue otra. VALUES aporta valores en ese orden. UPDATE usa SET para declarar cambios y WHERE para seleccionar. DELETE no elimina columnas ni borra la definición de tabla, sino las filas seleccionadas.

## Seguir una creación y su eliminación

El ejemplo corregido utiliza id 10 porque tienda ya tiene id 3 para Libro. Primero inserta Mochila con categoría 1 existente, luego cambia solo su precio, consulta el valor 480000 y finalmente elimina esa fila. Repetir el primer INSERT sin reconstruir o borrar puede fallar por id duplicado; eso no significa que la sentencia de creación sea inválida.

Ejecutá con `python ejecutar.py ../../11_Bases_de_datos/fragmentos/clase_05.sql --tienda`. Las restricciones siguen activas durante cambios. Si el producto está referenciado en detalles, borrar puede rechazarse por integridad: una factura histórica necesita conservar el significado de su artículo. Anular o marcar inactivo es una política diferente de eliminar físicamente.

UPDATE sin WHERE cambia todas las filas y DELETE sin WHERE elimina todas. Son operaciones posibles, pero no cumplen «modificar producto 1». Un filtro id único permite un objetivo; uno por nombre podría afectar varios. Para operaciones relacionadas que deben confirmarse juntas necesitaremos transacciones en 11.07.

## Ejemplo de la clase

```sql
INSERT INTO producto (id,nombre,precio_centavos,categoria_id) VALUES (10,'Mochila',500000,1);
UPDATE producto SET precio_centavos=480000 WHERE id=10;
SELECT * FROM producto WHERE id=10;
DELETE FROM producto WHERE id=10;
```

[Abrir el fragmento como archivo](fragmentos/clase_05.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La categoría 1 debe existir. El UPDATE cambia solo el producto 10 y el SELECT permite observarlo antes del DELETE. Si el producto ya está referenciado por detalles, la política de claves foráneas puede rechazar su borrado. Ese rechazo indica una relación que hay que respetar.

## Cambiar una decisión y explorar un límite

Quitá WHERE solo en una copia descartable y observá que todos los precios cambian. Conservá id10 para no colisionar con Libro. Borrar el producto1 de tienda falla si sus detalles lo referencian: la relación protege el histórico.

## Confusión que conviene evitar

Olvidar WHERE al editar un registro individual.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_04.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_06.md)
