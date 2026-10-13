# Clase 15.06 · Carrito, cantidades y localStorage

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_05.md) · [Clase siguiente](../15_Integracion/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **carrito, cantidades y localstorage**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El carrito debe decidir cómo combinar repetidas selecciones del mismo producto. Una estructura por productoId evita renglones duplicados. La cantidad debe ser entera positiva y su suma no superar stock. El subtotal se calcula desde precio y cantidad; el total puede agregar envío según regla.

Guardamos en localStorage datos mínimos y los validamos al recuperar. Los datos del navegador son editables y pueden quedar desactualizados. Antes de crear pedido, el backend vuelve a comprobar stock y precios y devuelve el total aceptado.

## Ejemplo

```typescript
interface Item { productoId:number; cantidad:number; }
function cantidadValida(cantidad:number,stock:number) {
  return Number.isInteger(cantidad) && cantidad>0 && cantidad<=stock;
}
// Al agregar un producto ya presente, validá cantidadActual + cantidadNueva.
```

[Abrir el fragmento como archivo](fragmentos/clase_06.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

Si hay 2 unidades en carrito y se agregan 2 sobre stock 3, la cantidad combinada 4 se rechaza. Validar solo la nueva cantidad 2 sería insuficiente. Quitar el último ítem deja un carrito vacío con total cero y un mensaje visible.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá prueba con stock 3: agregar 2, agregar otras 2, quitar 1 y recargar.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Validar stock solo al abrir la pantalla y no al modificar la cantidad.

## Resumen para repasar

El carrito debe decidir cómo combinar repetidas selecciones del mismo producto. Una estructura por productoId evita renglones duplicados.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_05.md) · [Clase siguiente](../15_Integracion/CLASE_07.md)
