# Clase 11.02 · Claves primarias, foráneas y restricciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_01.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_03.md)

## Identificar y relacionar sin ambigüedad

Una **clave primaria** identifica una fila de manera única; un nombre visible puede repetirse o cambiar. Una **clave de negocio** puede ser código o documento y tener una restricción UNIQUE además del id técnico. No son necesariamente el mismo dato.

Una **clave foránea** exige que un valor corresponda a una clave referenciada. En producto.categoria_id=1, la base comprueba que exista categoria.id=1. No copia el nombre de esa categoría en cada producto: si consultamos la relación podremos recuperarlo. La **integridad referencial** impide guardar referencias rotas.

## Preparar y comprobar las restricciones

SQLite requiere `PRAGMA foreign_keys=ON` por conexión para activar esa comprobación. El lanzador [ejecutar.py](../Ejemplos/sql/ejecutar.py) la activa y el ejemplo también la muestra. Ejecutá el fragmento sin --tienda porque crea tablas nuevas. Después agregá categoría antes de un producto que la referencia.

NOT NULL exige presencia; UNIQUE evita repetición del valor; CHECK aplica una condición. Si la relación es opcional, categoria_id puede ser NULL y eso representa producto sin categoría. Si es obligatoria, añadí NOT NULL. UNIQUE por sí sola no siempre impide múltiples NULL según motor; combinación y semántica importan.

Al borrar una categoría referenciada hay que elegir política: rechazar, reasignar, dejar ausencia permitida o borrar hijos con una cascada deliberada. No desactives la restricción para «hacer funcionar» la carga: dejás datos incoherentes que luego complican consultas. INTEGER PRIMARY KEY de SQLite tiene comportamiento especial de rowid y generación de valores; no generalices esa particularidad a toda definición de clave en todos los motores.

## Ejemplo de la clase

```sql
PRAGMA foreign_keys = ON;
CREATE TABLE categoria (id INTEGER PRIMARY KEY, nombre TEXT NOT NULL UNIQUE);
CREATE TABLE producto (
 id INTEGER PRIMARY KEY,
 nombre TEXT NOT NULL,
 categoria_id INTEGER REFERENCES categoria(id)
);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

producto.categoria_id debe apuntar a una categoría existente cuando no es null. Si permitimos null, un producto puede no tener categoría. La base comprueba la integridad de la referencia, no que el nombre tenga sentido para nuestro negocio. Para hacer obligatoria la relación añadí NOT NULL.

## Cambiar una decisión y explorar un límite

Insertar categoria_id=99 sin categoría 99 se rechaza. Usar NULL pasa si la columna admite ausencia. Repetir un id conocido falla por identidad; repetir un nombre con UNIQUE falla por otra regla. Cada rechazo tiene una causa que conviene distinguir.

## Confusión que conviene evitar

Desactivar restricciones para que una carga inválida "funcione".

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_01.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_03.md)
