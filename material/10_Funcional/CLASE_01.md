# Clase 10.01 · Interfaces funcionales y lambdas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **interfaces funcionales y lambdas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una interface funcional tiene un único método abstracto relevante para su contrato y puede ser implementada con una lambda. @FunctionalInterface pide al compilador verificarlo. Una lambda expresa parámetros, flecha y resultado o bloque.

El estilo funcional favorece transformar datos y limitar cambios externos. Una función pura produce el mismo resultado para las mismas entradas y no modifica estado externo. Java permite ese estilo, pero no obliga a que toda lambda sea pura.

## Ejemplo

```java
@FunctionalInterface
interface Operacion { int aplicar(int a, int b); }
Operacion sumar = (a, b) -> a + b;
System.out.println(sumar.aplicar(2, 3));
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

La variable sumar contiene una implementación de Operacion y devuelve 5. El compilador infiere tipos desde el contrato. Para varias instrucciones, usá llaves y return si corresponde. Capturar una variable local exige que sea final o efectivamente final.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá una operación de multiplicación y otra que devuelva el mayor.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar estado compartido dentro de una lambda sin reconocer sus efectos secundarios.

## Resumen para repasar

Una interface funcional tiene un único método abstracto relevante para su contrato y puede ser implementada con una lambda. @FunctionalInterface pide al compilador verificarlo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_02.md)
