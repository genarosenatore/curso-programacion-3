# Clase 12.04 · Herencia y clases base persistentes

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_03.md) · [Clase siguiente](../12_JPA/CLASE_05.md)

## Compartir mapeos o crear una jerarquía consultable

La herencia Java no decide automáticamente cómo guardar tablas. @MappedSuperclass comparte campos mapeados con entidades hijas sin ser una entidad independiente. Una consulta JPQL no selecciona EntityId solo por tener esa anotación; consulta las entidades concretas que heredaron id.

Una jerarquía de entidades con @Inheritance es otra decisión. SINGLE_TABLE usa una tabla y un discriminador para diferenciar subtipos: simple para consultas, con columnas de subtipos que pueden no aplicar a todos. JOINED usa tabla base y tablas de subtipos relacionadas por clave: conserva separación pero necesita joins. TABLE_PER_CLASS almacena cada tipo concreto con columnas heredadas: ciertas consultas polimórficas requieren reunir varios orígenes. No hay una opción universalmente mejor.

## Identidad y auditoría comunes

El ejemplo inferior declara EntityId como base de mapeo. Cliente extiende esa clase y hereda Id/GeneratedValue; su tabla conserva id y nombre. Las entidades ordinarias siguen necesitando constructor compatible. El [laboratorio](../Ejemplos/persistencia/README.md) utiliza una base identificada para evitar repetir ese campo en las entidades de facturas.

Una auditoría puede agregar fechaCreacion y usuario, pero declarar el atributo no asigna datos. Un constructor, servicio o callback @PrePersist puede establecerlos. Un **callback de ciclo de vida** es un método que el proveedor invoca en un momento, como antes de persistir. No todas las fuentes del campus traen ese mecanismo configurado.

Elegí @MappedSuperclass si solo necesitás compartir mapeos. Elegí herencia de entidades cuando el dominio requiere consultar o tratar una jerarquía persistente de subtipos. No conviertas cliente, factura y producto en subtipos de una entidad universal solo por compartir id; compartir un campo no demuestra la relación de dominio.

## Ejemplo de la clase

```java
@jakarta.persistence.MappedSuperclass
abstract class EntityId {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    protected Long id;
}
@jakarta.persistence.Entity
class Cliente extends EntityId {
    private String nombre;
    protected Cliente() {}
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Cliente hereda el mapeo del id. EntityId no se consulta como una entidad independiente en JPQL solo por ser MappedSuperclass. Las restricciones de constructor se cumplen en la subclase. Si dos clases comparten auditoría, esa base puede resultar útil sin forzar que todo el dominio sea una única jerarquía consultable.

## Cambiar una decisión y explorar un límite

Consultar una MappedSuperclass como entidad falla porque no tiene ese origen consultable. Declarar fechaCreacion sin asignarla puede conservar null. SINGLE_TABLE no elimina necesidad de distinguir qué subtipo representa una fila.

## Confusión que conviene evitar

Creer que heredar una propiedad de auditoría activa automáticamente todo el seguimiento.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_03.md) · [Clase siguiente](../12_JPA/CLASE_05.md)
