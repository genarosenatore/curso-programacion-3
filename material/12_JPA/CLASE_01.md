# Clase 12.01 · ORM, JPA y proveedor de persistencia

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_08.md) · [Clase siguiente](../12_JPA/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **orm, jpa y proveedor de persistencia**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

ORM relaciona un modelo de objetos con almacenamiento relacional. JPA, hoy Jakarta Persistence, es una especificación; Hibernate es un proveedor que la implementa. Spring Data JPA agrega repositorios sobre esa base. Son responsabilidades distintas aunque se usen juntas.

En ejemplos de Spring Boot 3.x usamos jakarta.persistence. Material antiguo con javax.persistence corresponde a otra generación; no mezclamos imports ni versiones de XML. Para ejecutar las clases se entrega un proyecto de Spring con dependencias y H2; los fragmentos de esta unidad se leen dentro de ese contexto.

## Ejemplo

```java
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
class Producto {
    @Id private Long id;
    protected Producto() {}
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

Entity marca una clase persistente y Id identifica su clave. El constructor sin argumentos es requerido para entidades ordinarias y puede ser protected. Una anotación no crea por sí sola la conexión: hacen falta proveedor y configuración, incluidos en el proyecto de práctica.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Distinguí qué hace JPA, qué hace Hibernate y qué aporta Spring Data JPA.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Tratar JPA, Hibernate y Spring Data como tres nombres idénticos para la misma capa.

## Resumen para repasar

ORM relaciona un modelo de objetos con almacenamiento relacional. JPA, hoy Jakarta Persistence, es una especificación; Hibernate es un proveedor que la implementa.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_08.md) · [Clase siguiente](../12_JPA/CLASE_02.md)
