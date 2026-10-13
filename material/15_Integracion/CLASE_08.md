# Clase 15.08 · Sesión didáctica y permisos: alcance del ejemplo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_07.md) · [Clase siguiente](../15_Integracion/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **sesión didáctica y permisos: alcance del ejemplo**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La consigna de Food Store describe una sesión básica con localStorage y sin módulo de seguridad. Eso sirve para practicar pantallas y flujos, pero no acredita identidad ni permisos frente a un servidor real. Una persona puede editar localStorage o llamar directamente a la API.

Separaremos el alcance: mostrar navegación según un rol es una decisión de interfaz; autorizar datos y operaciones corresponde al backend con un mecanismo de seguridad apropiado. No guardaremos contraseñas en el navegador ni presentaremos el ejemplo didáctico como autenticación de producción.

## Ejemplo

```typescript
interface SesionVista { id:number; nombre:string; role:"admin"|"cliente"; }
function muestraPanelAdmin(sesion:SesionVista|null):boolean {
  return sesion?.role === "admin";
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

La función decide si mostrar una región, no verifica permisos ante el servidor. El ejemplo integrado de apoyo trabaja sin cuentas y en datos locales. Al estudiar la consigna, anotaremos qué partes son simulación de flujo y qué haría falta para una aplicación con usuarios reales.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué pasa si alguien cambia role de cliente a admin en localStorage.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Llamar seguridad completa a una redirección basada solo en datos del navegador.

## Resumen para repasar

La consigna de Food Store describe una sesión básica con localStorage y sin módulo de seguridad. Eso sirve para practicar pantallas y flujos, pero no acredita identidad ni permisos frente a un servidor real.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_07.md) · [Clase siguiente](../15_Integracion/CLASE_09.md)
