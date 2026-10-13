# Clase 12.06 · Persistencia, consulta, modificación y eliminación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_05.md) · [Clase siguiente](../12_JPA/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **persistencia, consulta, modificación y eliminación**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

persist se usa para una entidad nueva. merge copia el estado de un objeto en una instancia gestionada y devuelve esa instancia; no vuelve gestionada necesariamente la referencia que le pasamos. remove elimina una entidad gestionada. Las escrituras necesitan un límite transaccional adecuado.

En la aplicación Spring usaremos servicios y repositorios para operaciones habituales, pero entender estas APIs explica muchos comportamientos. Actualizar solo campos permitidos reduce el riesgo de sobrescribir datos con null de un objeto incompleto.

## Ejemplo

```java
// En un contexto transaccional:
Producto nuevo = new Producto("Cuaderno");
em.persist(nuevo);
Producto gestionado = em.merge(productoSeparado);
em.remove(gestionado);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

Los objetos del ejemplo deben pertenecer al modelo configurado. persist registra nuevo; merge devuelve la copia gestionada; remove marca la gestionada para borrado. No es una receta para crear y borrar en una misma operación, sino una comparación de APIs.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá una actualización de nombre usando find y explicá qué validás antes de asignar.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Ignorar el objeto devuelto por merge y seguir modificando el objeto separado.

## Resumen para repasar

persist se usa para una entidad nueva. merge copia el estado de un objeto en una instancia gestionada y devuelve esa instancia; no vuelve gestionada necesariamente la referencia que le pasamos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_05.md) · [Clase siguiente](../12_JPA/CLASE_07.md)
