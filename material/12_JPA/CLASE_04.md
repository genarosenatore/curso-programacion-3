# Clase 12.04 · Herencia y clases base persistentes

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_03.md) · [Clase siguiente](../12_JPA/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **herencia y clases base persistentes**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La herencia persistente puede modelarse con estrategias como SINGLE_TABLE, JOINED o TABLE_PER_CLASS, cada una con efectos en esquema y consultas. @MappedSuperclass comparte mapeos con subclases, pero no representa por sí sola una entidad consultable.

El material de facturación tiene bases como EntityId y AuditoriaApp. Antes de copiarlas, comprendé si se necesita una jerarquía de entidades o solamente atributos comunes. La auditoría no asigna automáticamente fecha o usuario si no existe código, callback o mecanismo configurado que lo haga.

## Ejemplo

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

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

Cliente hereda el mapeo del id. EntityId no se consulta como una entidad independiente en JPQL solo por ser MappedSuperclass. Las restricciones de constructor se cumplen en la subclase. Si dos clases comparten auditoría, esa base puede resultar útil sin forzar que todo el dominio sea una única jerarquía consultable.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Decidí dónde colocar fechaCreacion común a varias entidades y qué debe establecer su valor.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que heredar una propiedad de auditoría activa automáticamente todo el seguimiento.

## Resumen para repasar

La herencia persistente puede modelarse con estrategias como SINGLE_TABLE, JOINED o TABLE_PER_CLASS, cada una con efectos en esquema y consultas. @MappedSuperclass comparte mapeos con subclases, pero no representa por sí sola una entidad consultable.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_03.md) · [Clase siguiente](../12_JPA/CLASE_05.md)
