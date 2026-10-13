# Clase 12.05 · EntityManager y ciclo de vida

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_04.md) · [Clase siguiente](../12_JPA/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **entitymanager y ciclo de vida**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

EntityManager gestiona un contexto de persistencia. Una entidad puede ser nueva, gestionada, separada o eliminada. find recupera por clave y puede devolver null. persist incorpora una nueva. Una gestionada puede detectar cambios sin llamar a un UPDATE manual.

El contexto mantiene identidad y seguimiento durante su vida. Los objetos fuera de él no siguen siendo gestionados solo porque tengan id. flush sincroniza cambios con la base y no equivale a commit; la transacción aún puede revertirse.

## Ejemplo

```java
// Dentro de un método transaccional que dispone de EntityManager em:
Producto producto = em.find(Producto.class, id);
if (producto == null) throw new IllegalArgumentException("Producto inexistente");
producto.setNombre("Cuaderno grande");
em.flush();
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

find obtiene una entidad gestionada. Cambiarla se detecta en el contexto y flush puede emitir SQL. Si la transacción se revierte, ese SQL no queda confirmado. El setter debe existir en la clase del proyecto; el fragmento no es un programa de consola independiente.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué cambia si modificás el objeto después de cerrar el contexto.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir id presente con entidad actualmente gestionada.

## Resumen para repasar

EntityManager gestiona un contexto de persistencia. Una entidad puede ser nueva, gestionada, separada o eliminada.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_04.md) · [Clase siguiente](../12_JPA/CLASE_06.md)
