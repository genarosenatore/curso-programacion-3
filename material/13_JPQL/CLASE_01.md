# Clase 13.01 · JPQL frente a SQL y parámetros nombrados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_09.md) · [Clase siguiente](../13_JPQL/CLASE_02.md)

## Consultar el modelo de objetos persistentes

SQL conoce tablas y columnas; JPQL conoce **entidades mapeadas y atributos Java**. El proveedor traduce la consulta al motor. Si FacturaVenta tiene atributo numero y tabla factura_venta, JPQL usa FacturaVenta y numero; la columna física puede tener otro nombre. El parámetro HTTP numeroFactura o un DTO del mismo nombre no cambia el atributo de entidad.

Un **alias** como f es un nombre corto para cada origen de la consulta. `select f from FacturaVenta f` selecciona entidades completas. `where f.estado=:estado` compara su atributo con un valor pasado por separado. Los dos puntos señalan un parámetro nombrado, no una columna ni una variable Java insertada automáticamente.

## Preparar y ejecutar

Necesitás lo aprendido en [JPA 12.05](../12_JPA/CLASE_05.md): entorno, entidades y EntityManager. En [el laboratorio](../Ejemplos/persistencia/README.md) todo está definido y su demostración contiene las consultas de esta unidad con datos pequeños. Los fragmentos de facturas del campus requieren completar sus mapeos; no se ejecutan en SQLite ni como un .sql directo.

createQuery(texto,FacturaVenta.class) construye una consulta tipada. setParameter("estado","EMITIDA") da el valor sin el : en su nombre. getResultList realiza la consulta y devuelve lista; si no hay coincidencias, []. getSingleResult, en cambio, exige un único resultado y puede fallar por cero o varios. Elegí la API según cardinalidad esperada.

La parametrización evita tratar datos externos como parte de la sintaxis de consulta. Concatenar una denominación con comillas puede romper el texto o alterar su significado; pasala siempre como dato. Los parámetros no permiten sustituir libremente nombres de entidades o atributos: para un orden elegido, utilizá una lista controlada de criterios permitidos.

Seleccionar f permite resultado FacturaVenta.class. Seleccionar f.numero retorna otro tipo y debe declararse en consecuencia. La forma de salida es parte del contrato, que se desarrolla en la siguiente clase.

## Ejemplo de la clase

```java
var consulta = em.createQuery(
    "select f from FacturaVenta f where f.estado = :estado", FacturaVenta.class);
consulta.setParameter("estado", "EMITIDA");
var facturas = consulta.getResultList();
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

f representa una FacturaVenta. :estado es un valor proporcionado aparte; no es una columna. getResultList devuelve una lista, vacía si no hay coincidencias. El tipo FacturaVenta.class coincide con la selección completa f.

## Cambiar una decisión y explorar un límite

Estado SIN_ESTADO produce [] en el laboratorio. Omitir setParameter deja un dato requerido sin vincular. Escribir f.numeroFactura falla porque el atributo inspeccionado es numero; corregir solo el DTO no corrige esa consulta.

## Confusión que conviene evitar

Escribir factura_venta o cliente_id porque son nombres de la tabla y columna.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_09.md) · [Clase siguiente](../13_JPQL/CLASE_02.md)
