# Clase 11.03 · Relaciones uno a uno, uno a muchos y muchos a muchos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_02.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_04.md)

## Cuántas filas pueden relacionarse

La **cardinalidad** describe cuántas asociaciones se permiten. Uno a muchos: una categoría puede tener varios productos y cada producto una categoría. La clave foránea queda en producto porque cada fila de ese lado necesita una referencia. No se crea una columna por cada posible producto.

Uno a uno utiliza una clave foránea con UNIQUE para evitar que varias filas apunten al mismo registro. La **opcionalidad** pregunta si se permite cero asociaciones: NOT NULL exige una para esa columna. «Uno a muchos» por sí solo no declara si una categoría vacía se admite.

## Resolver muchos a muchos con otra tabla

Si un libro tiene varios autores y un autor varios libros, una única clave en libro no alcanza. autor_libro tiene una fila por asociación y dos claves foráneas. PRIMARY KEY(autor_id,libro_id) es una clave compuesta: el par no se repite, aunque cada id por separado sí aparezca muchas veces. Si la asociación tiene un dato propio, como orden de autoría, esa tabla también puede conservarlo.

Factura y detalle siguen otro patrón: cada detalle pertenece a una factura y una factura tiene varios. La fila del detalle conserva cantidad y precio de esa operación; repetir factura_id en renglones distintos no duplica la factura, describe hijos diferentes.

El fragmento inferior es ilustrativo y presupone factura y producto creadas. Para ejecutarlo aisladamente, prepará ambas tablas en un archivo nuevo antes del CREATE detalle. Para consultas sobre el modelo completo, cargá [tienda.sql](../Ejemplos/sql/tienda.sql) con --tienda y no repitas CREATE detalle, porque ya existe. Un diagrama de cajas y enlaces es una práctica válida antes del SQL.

## Ejemplo de la clase

```sql
CREATE TABLE detalle (
 id INTEGER PRIMARY KEY,
 factura_id INTEGER NOT NULL REFERENCES factura(id),
 producto_id INTEGER NOT NULL REFERENCES producto(id),
 cantidad INTEGER NOT NULL CHECK(cantidad > 0)
);
```

[Abrir el fragmento como archivo](fragmentos/clase_03.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Cada detalle referencia una factura y un producto. Varias filas pueden compartir factura_id, representando varios renglones de una factura. Las tablas factura y producto deben existir; este fragmento complementa el esquema de la unidad. No hay una columna lista_de_detalles en factura.

## Cambiar una decisión y explorar un límite

Agregar UNIQUE a detalle.factura_id convertiría el vínculo en máximo un detalle por factura y rompería el modelo esperado. Agregar una fila autor_libro idéntica falla por el par primario; otra con el mismo autor y distinto libro es válida.

## Confusión que conviene evitar

Poner una clave foránea de libro en autor y perder la posibilidad de varios libros.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_02.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_04.md)
