# Clase 12.07 · Cascadas, orphanRemoval y carga de relaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_06.md) · [Clase siguiente](../12_JPA/CLASE_08.md)

## Propagar operaciones según propiedad y ciclo de vida

Una **cascada JPA** indica que una operación sobre una entidad se propaga a relacionadas: PERSIST, MERGE, REMOVE y otras; ALL reúne todas. No es idéntica a ON DELETE CASCADE de SQL, que el motor aplica sobre filas. Pueden coexistir, pero responden a mecanismos distintos.

Un detalle pertenece a una factura y puede tener vida exclusiva con ella. Un cliente se comparte entre muchas facturas. Borrar factura podría borrar detalles bajo una política deliberada; borrar también cliente rompería datos ajenos. La relación existente no demuestra propiedad exclusiva.

## Separar borrado de carga

orphanRemoval puede eliminar un hijo que sale de una asociación de propiedad exclusiva adecuada. Quitar un detalle de la colección gestionada y mantener ambos lados puede programar su borrado, aun sin borrar la factura. No lo uses para catálogos compartidos donde «quitar de una factura» no debe eliminar el producto del sistema.

LAZY intenta diferir la carga hasta que se necesita y en ciertos contratos es una indicación al proveedor; EAGER requiere disponibilidad anticipada. Ninguno promete un único JOIN: el proveedor puede ejecutar consultas adicionales. Obtener una lista de facturas y luego un vínculo por cada una puede producir **N+1 consultas**, una inicial y varias repetidas. Un fetch join o una proyección puede resolver una necesidad de carga concreta, no todo el modelo.

Al cerrar el contexto, una colección pendiente puede no poder cargarse y Hibernate puede lanzar LazyInitializationException. Prepará DTO dentro del contexto adecuado o consulta lo necesario deliberadamente. Convertir todo a EAGER puede cargar más datos y tampoco asegura eficiencia.

El ejemplo inferior es un fragmento de mapeo para Factura/Detalle. El [laboratorio](../Ejemplos/persistencia/README.md) usa FacturaVenta/FacturaVentaDetalle con una política explícita de hijos y mantiene ambas referencias. La clase Producto/Categoria tiene otro ciclo de vida: no copies ALL simplemente para evitar un mensaje.

## Ejemplo de la clase

```java
// En Factura, si los detalles son de su propiedad:
@jakarta.persistence.OneToMany(mappedBy="factura", cascade=jakarta.persistence.CascadeType.ALL, orphanRemoval=true)
private java.util.List<Detalle> detalles = new java.util.ArrayList<>();

// En Detalle:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
private Factura factura;
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

ALL puede tener sentido en detalles con vida ligada a factura, pero no se copia a cliente compartido. Para quitar un detalle, actualizá coherentemente ambos lados y su política. El mapeo del JoinColumn se define en el propietario. Comprender qué se borra evita perder datos compartidos.

## Cambiar una decisión y explorar un límite

Quitar un detalle con orphanRemoval puede borrarlo; quitar una relación con un cliente compartido no debería borrar al cliente. Serializar entidades bidireccionales puede recorrer factura→detalle→factura: preparar un DTO limitado evita ese ciclo de salida.

## Confusión que conviene evitar

Aplicar CascadeType.ALL a todas las relaciones para resolver errores sin analizar sus efectos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_06.md) · [Clase siguiente](../12_JPA/CLASE_08.md)
