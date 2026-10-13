# Clase 12.07 · Cascadas, orphanRemoval y carga de relaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_06.md) · [Clase siguiente](../12_JPA/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **cascadas, orphanremoval y carga de relaciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una cascada propaga operaciones como persist o remove a objetos relacionados. No equivale a todas las reglas de clave foránea del motor. orphanRemoval puede eliminar un hijo que deja una asociación de propiedad adecuada. Elegimos según ciclo de vida: un detalle puede pertenecer exclusivamente a una factura; un cliente puede compartirse entre muchas.

LAZY difiere carga y EAGER pide disponibilidad anticipada, pero no define por sí solo una única consulta SQL. Acceder fuera del contexto a una relación no cargada puede fallar. Los ciclos bidireccionales tampoco deberían serializarse directamente sin una política.

## Ejemplo

```java
// En Factura, si los detalles son de su propiedad:
@jakarta.persistence.OneToMany(mappedBy="factura", cascade=jakarta.persistence.CascadeType.ALL, orphanRemoval=true)
private java.util.List<Detalle> detalles = new java.util.ArrayList<>();

// En Detalle:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
private Factura factura;
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

ALL puede tener sentido en detalles con vida ligada a factura, pero no se copia a cliente compartido. Para quitar un detalle, actualizá coherentemente ambos lados y su política. El mapeo del JoinColumn se define en el propietario. Comprender qué se borra evita perder datos compartidos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué no aplicarías REMOVE de factura hacia cliente automáticamente.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Aplicar CascadeType.ALL a todas las relaciones para resolver errores sin analizar sus efectos.

## Resumen para repasar

Una cascada propaga operaciones como persist o remove a objetos relacionados. No equivale a todas las reglas de clave foránea del motor.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_06.md) · [Clase siguiente](../12_JPA/CLASE_08.md)
