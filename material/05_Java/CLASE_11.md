# Clase 05.11 · Práctica: productos y clientes

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_10.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: productos y clientes**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una práctica orientada a objetos empieza por las responsabilidades. Producto conoce su precio y stock; Cliente su identificación; un cálculo puede recibir productos y cantidades sin modificar indebidamente ambos objetos. Definí invariantes: nombre no vacío, precio no negativo y stock entero no negativo.

Construiremos primero un modelo de consola. No necesitamos base de datos ni API todavía. Es más fácil comprobar el dominio con llamadas directas y recién después ponerle otra forma de entrada. Un caso de error debe conservar el estado anterior.

## Ejemplo

```java
// Idea de uso dentro de main, con las clases del ejemplo de la unidad:
Producto producto = new Producto("Cuaderno", 200000, 5);
producto.descontarStock(2);
System.out.println(producto.getStock());
System.out.println(producto.subtotalCentavos(2));
```

[Abrir el fragmento como archivo](fragmentos/clase_11.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

El resultado esperado es stock 3 y subtotal 400000 centavos. La clase de ejemplo completa incluye constructor y métodos. Cada regla se aplica antes de modificar. Una clase pequeña puede evolucionar después a DTO y entidad, pero no hacemos esa mezcla en la primera práctica.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Implementá el modelo y probá compra válida, stock insuficiente y cantidad cero.

Abrí [los ejercicios y las pistas](EJERCICIOS_11.md). Las [soluciones explicadas](SOLUCIONES_11.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir un objeto de dominio con una fila de base de datos antes de estudiar persistencia.

## Resumen para repasar

Una práctica orientada a objetos empieza por las responsabilidades. Producto conoce su precio y stock; Cliente su identificación; un cálculo puede recibir productos y cantidades sin modificar indebidamente ambos objetos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.11** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_10.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_01.md)
