# Clase 15.01 · Seguir una petición del frontend al backend

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_12.md) · [Clase siguiente](../15_Integracion/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **seguir una petición del frontend al backend**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una operación completa empieza en la interfaz y atraviesa varias responsabilidades. Seguir ese recorrido ayuda a localizar fallos: si el botón no dispara evento, el problema está antes de HTTP; si llega 400, hay que revisar la petición; si llega 200 pero no se muestra, hay que revisar interpretación o render.

Las herramientas de red del navegador muestran método, URL, cuerpo y respuesta. No necesitas cambiar varias capas a la vez. Comprobá cada límite con datos conocidos y registrá dónde se pierde el resultado esperado.

## Ejemplo

```text
Botón → evento → función cliente HTTP → petición
→ Controller → Service → Repository → base
→ DTO → respuesta → cliente HTTP → render
```

[Abrir el fragmento como archivo](fragmentos/clase_01.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

No todas las operaciones consultan la base, pero este recorrido representa un CRUD persistente típico. Una respuesta útil incluye el id creado. Volver a consultar por ese id comprueba la persistencia mejor que solo mostrar un mensaje de éxito.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Una petición devuelve 201 con JSON correcto pero no aparece la tarjeta. ¿Qué revisarías primero?

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Resolver todo error cambiando CORS sin observar la respuesta o el evento.

## Resumen para repasar

Una operación completa empieza en la interfaz y atraviesa varias responsabilidades. Seguir ese recorrido ayuda a localizar fallos: si el botón no dispara evento, el problema está antes de HTTP; si llega 400, hay que revisar la petición; si llega 200 pero no se muestra, hay que revisar interpretación o render.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_12.md) · [Clase siguiente](../15_Integracion/CLASE_02.md)
