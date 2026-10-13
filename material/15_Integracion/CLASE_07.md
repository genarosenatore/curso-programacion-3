# Clase 15.07 · Pedidos y administración

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_06.md) · [Clase siguiente](../15_Integracion/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **pedidos y administración**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un pedido registra una operación aceptada con cabecera, detalles y estado. Administración puede listar y actualizar recursos de acuerdo con reglas. Los estados no son cadenas intercambiables sin restricciones: pasar de pendiente a preparación puede ser válido y reabrir cancelado quizá no.

La UI puede filtrar pedidos, pero el backend define qué datos puede obtener quien llama y qué transiciones acepta. Los detalles deben conservar precios de la operación y el total se calcula allí. El checkout de la práctica no realiza pagos reales.

## Ejemplo

```typescript
type EstadoPedido = "pending" | "processing" | "completed" | "cancelled";
const permitidos:Record<EstadoPedido,EstadoPedido[]> = {
  pending:["processing","cancelled"],
  processing:["completed","cancelled"],
  completed:[],
  cancelled:[]
};
```

[Abrir el fragmento como archivo](fragmentos/clase_07.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

La tabla es una política didáctica explícita, no un dato automáticamente deducido de la consigna. El backend debe confirmar la política acordada y los permisos. La pantalla puede usarla para presentar opciones, pero un usuario puede enviar una petición manual y debe rechazarse si viola la regla.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Probá pending→processing, processing→completed y completed→pending bajo esta política.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir quitar un botón en la interfaz con impedir la operación en el backend.

## Resumen para repasar

Un pedido registra una operación aceptada con cabecera, detalles y estado. Administración puede listar y actualizar recursos de acuerdo con reglas.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_06.md) · [Clase siguiente](../15_Integracion/CLASE_08.md)
