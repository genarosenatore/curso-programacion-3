# Clase 12.03 · Relaciones, JoinColumn y lado propietario

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_02.md) · [Clase siguiente](../12_JPA/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **relaciones, joincolumn y lado propietario**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Las relaciones se mapean desde objetos. @ManyToOne en Producto.categoria indica muchos productos para una categoría; @JoinColumn define la clave foránea. Si agregamos @OneToMany en Categoria.productos, mappedBy apunta al nombre del atributo propietario en Producto.

El lado propietario determina la actualización de la relación en la base. En una relación bidireccional, el programa debe mantener coherentes ambos lados en memoria. El nombre de mappedBy es un atributo Java, no una columna SQL. La opcionalidad y nulabilidad deben reflejar reglas del negocio.

## Ejemplo

```java
// En Producto:
@jakarta.persistence.ManyToOne(fetch=jakarta.persistence.FetchType.LAZY)
@jakarta.persistence.JoinColumn(name="categoria_id")
private Categoria categoria;

// En Categoria:
@jakarta.persistence.OneToMany(mappedBy="categoria")
private java.util.List<Producto> productos = new java.util.ArrayList<>();
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

Producto tiene la columna categoria_id y es propietario en este modelo. Categoria.productos describe el otro lado usando mappedBy="categoria". Si añadís un producto solo a la lista pero no asignás su categoria, podrías no persistir la relación como esperás.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí un método agregarProducto que actualice ambos lados.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir mappedBy="categoria_id" cuando el atributo de Producto se llama categoria.

## Resumen para repasar

Las relaciones se mapean desde objetos. @ManyToOne en Producto.categoria indica muchos productos para una categoría; @JoinColumn define la clave foránea.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_02.md) · [Clase siguiente](../12_JPA/CLASE_04.md)
