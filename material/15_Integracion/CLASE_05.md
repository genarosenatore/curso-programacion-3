# Clase 15.05 · Food Store: catálogo, filtros y detalle

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_04.md) · [Clase siguiente](../15_Integracion/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **food store: catálogo, filtros y detalle**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Food Store comienza por un catálogo con categorías, búsqueda, orden y detalle. Separaremos datos, filtrado y representación. Un filtro combinado debería aplicar todas las condiciones activas; cambiar un filtro no debe reiniciar accidentalmente otro.

El detalle se obtiene por id y debe manejar producto ausente o no disponible. La página necesita navegación comprensible para volver al catálogo. Construir primero con datos locales permite probar interacciones antes de conectar backend. Después adaptamos al contrato real de la consigna.

## Ejemplo

```typescript
interface Producto { id:number; nombre:string; categoriaId:number; precioCentavos:number; stock:number; }
function seleccionar(productos:Producto[], texto:string, categoriaId:number|null) {
  const busqueda=texto.trim().toLowerCase();
  return productos.filter(p => p.nombre.toLowerCase().includes(busqueda)
    && (categoriaId===null || p.categoriaId===categoriaId));
}
```

[Abrir el fragmento como archivo](fragmentos/clase_05.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

null significa todas las categorías, no cero. La búsqueda vacía coincide con todos los nombres. La función devuelve otra lista sin modificar la original; después podemos copiar y ordenar. El stock se muestra y se vuelve a validar cuando se intenta comprar.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agregá orden por precio ascendente conservando la lista original.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Aplicar filtros a una lista ya filtrada y no poder recuperar resultados al borrar búsqueda.

## Resumen para repasar

Food Store comienza por un catálogo con categorías, búsqueda, orden y detalle. Separaremos datos, filtrado y representación.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_04.md) · [Clase siguiente](../15_Integracion/CLASE_06.md)
