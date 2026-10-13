# Clase 12.02 · Entity, Table, Id, GeneratedValue y Column

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_01.md) · [Clase siguiente](../12_JPA/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **entity, table, id, generatedvalue y column**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

@Entity participa en persistencia, @Table puede especificar la tabla y @Column el mapeo o restricciones de una columna. @Id marca la clave y @GeneratedValue delega su generación según estrategia. Una entidad ordinaria necesita constructor sin argumentos y requisitos de clase compatibles con el proveedor.

La ubicación de @Id influye en acceso por campos o propiedades. No mezcles ambos sin intención. nullable=false describe una restricción del mapeo, pero una regla de entrada necesita validación apropiada y la base debe tener el esquema correcto.

## Ejemplo

```java
@jakarta.persistence.Entity
@jakarta.persistence.Table(name="producto")
class Producto {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @jakarta.persistence.Column(nullable=false)
    private String nombre;
    protected Producto() {}
    Producto(String nombre) { this.nombre=nombre; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

El id comienza null y el proveedor lo asigna al persistir según IDENTITY. La columna nombre no debería aceptar null en el esquema generado. Con acceso por campo no necesitamos getters para que el proveedor lea, aunque pueden ser útiles para el resto del código. No supongas que dos entidades nuevas con id null son iguales.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Añadí precio como BigDecimal no nulo con precisión y escala razonables.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Usar el id generado no asignado como única regla de equals para todas las entidades nuevas.

## Resumen para repasar

@Entity participa en persistencia, @Table puede especificar la tabla y @Column el mapeo o restricciones de una columna. @Id marca la clave y @GeneratedValue delega su generación según estrategia.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_01.md) · [Clase siguiente](../12_JPA/CLASE_03.md)
