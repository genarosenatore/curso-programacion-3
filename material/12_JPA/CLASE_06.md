# Clase 12.06 · Persistencia, consulta, modificación y eliminación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_05.md) · [Clase siguiente](../12_JPA/CLASE_07.md)

## Dar a cada operación una intención

persist incorpora una entidad nueva al contexto; remove marca una gestionada para eliminar. merge copia estado desde un objeto hacia una instancia gestionada y **devuelve esa instancia**. No vuelve necesariamente gestionado el objeto original recibido. Su parecido con «guardar cualquier cosa» puede esconder la diferencia.

Si separado representa el dato leído en un contexto cerrado, `Producto gestionado=em.merge(separado)` permite trabajar con gestionado. Escribir más cambios solo en separado después no garantiza que se sigan. En ausencia de otra instancia gestionada, el proveedor puede obtenerla o crearla según identidad y estado; no uses merge como una verificación de existencia de una operación de actualización.

## Actualizar lo permitido

Para actualizar nombre: validá texto presente y no vacío; inicia transacción; find por id; si falta, define rechazo; luego cambia el campo aceptado; commit confirma. No cambies id por el enviado en el cuerpo ni copies relaciones sin resolver sus referencias. Un DTO parcial con null en campos omitidos puede sobrescribir datos si se mezcla indiscriminadamente.

El fragmento inferior compara APIs y no es una operación que necesariamente cree, mezcle y borre seguida. `productoSeparado` debe existir y pertenecer al mismo modelo configurado. Usá [PersistenciaDemo.java](../Ejemplos/persistencia/src/main/java/curso/PersistenciaDemo.java), con secciones de creación, actualización, rollback y eliminación que enseñan estados completos.

Las escrituras requieren transacción adecuada. Un id inexistente al borrar necesita una política: no encontrado o ausencia ya satisfecha, según contrato. Una clave foránea puede impedir remove si otros objetos lo referencian y no hay política válida. No arregles eso aplicando cascadas a todo: enseñaremos sus efectos en la próxima clase.

## Ejemplo de la clase

```java
// En un contexto transaccional:
Producto nuevo = new Producto("Cuaderno");
em.persist(nuevo);
Producto gestionado = em.merge(productoSeparado);
em.remove(gestionado);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Los objetos del ejemplo deben pertenecer al modelo configurado. persist registra nuevo; merge devuelve la copia gestionada; remove marca la gestionada para borrado. No es una receta para crear y borrar en una misma operación, sino una comparación de APIs.

## Cambiar una decisión y explorar un límite

Ignorar el resultado de merge y continuar con la referencia separada deja cambios fuera del seguimiento. Actualizar un nombre vacío puede pasar hasta la base si no hay validación suficiente. find ausente y getNombre posterior produce otro error, que debe evitarse antes.

## Confusión que conviene evitar

Ignorar el objeto devuelto por merge y seguir modificando el objeto separado.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_05.md) · [Clase siguiente](../12_JPA/CLASE_07.md)
