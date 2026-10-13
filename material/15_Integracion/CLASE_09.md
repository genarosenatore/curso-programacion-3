# Clase 15.09 · Verificación de requisitos y explicación del proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **verificación de requisitos y explicación del proyecto**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Cerrar un proyecto significa demostrar los requisitos y explicar sus decisiones. Armá una matriz de requisito, implementación y prueba. Incluí el camino normal y errores: lista vacía, dato inválido, recurso ausente, red fallida, stock insuficiente y respuesta sin cuerpo.

Un README útil explica cómo instalar, arrancar y probar, además de supuestos y límites. La defensa del proyecto consiste en seguir un flujo y justificar modelos y reglas. Podés consultar el chat con un archivo o fragmento concreto y lo revisamos; las clases ya quedan listas para estudiar a tu ritmo.

## Ejemplo

```text
Requisito: agregar al carrito
Implementación: función de carrito + evento del botón
Prueba: mismo producto dos veces, stock insuficiente y persistencia tras recargar
Resultado esperado: cantidades coherentes y error visible sin perder el carrito
```

[Abrir el fragmento como archivo](fragmentos/clase_09.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

La prueba se diseña a partir del requisito y no de lo que casualmente hizo el código. El inventario de clase y los ejercicios permiten completar un registro de avance. Los ejemplos de apoyo comprueban conceptos; la matriz final se compara con toda la consigna Food Store o facturación, no solo con sus capturas.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Escribí cinco requisitos de un proyecto, con caso normal, caso de error y evidencia de resultado para cada uno.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Declarar completado un requisito solo porque existe un archivo o un botón con ese nombre.

## Resumen para repasar

Cerrar un proyecto significa demostrar los requisitos y explicar sus decisiones. Armá una matriz de requisito, implementación y prueba.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_08.md)
