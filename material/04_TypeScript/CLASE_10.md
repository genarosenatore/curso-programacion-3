# Clase 04.10 · Preparación del frontend de Food Store

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **preparación del frontend de food store**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Food Store pide más que mostrar productos: incluye categorías, carrito, pedidos y administración. Vamos a descomponerla en modelos y funciones antes de construir pantallas completas. Un ítem del carrito relaciona un producto con una cantidad; su subtotal se calcula, no se introduce como un valor arbitrario.

La preparación de esta unidad construye tipos y lógica local. El backend se integrará después de aprender Java y Spring. Esto permite avanzar con datos de prueba sin simular que ya existe una API terminada.

## Ejemplo

```typescript
interface Producto { id: number; nombre: string; precio: number; stock: number; }
interface ItemCarrito { producto: Producto; cantidad: number; }
function total(items: ItemCarrito[]): number {
  return items.reduce((suma, item) => suma + item.producto.precio * item.cantidad, 0);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_10.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

reduce comienza en cero y acumula cada subtotal. Un carrito vacío da cero porque hay un valor inicial. Las cantidades y los precios de este ejemplo deben validarse antes de entrar a la función. Para dinero real usaremos centavos enteros en los ejemplos integrados y BigDecimal en Java para evitar errores de precisión.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agregá dos ítems al carrito y calculá el total. Explicá dónde validarías stock.

Abrí [los ejercicios y las pistas](EJERCICIOS_10.md). Las [soluciones explicadas](SOLUCIONES_10.md) están preparadas para consultar después de intentarlo.

## Error común

Confiar en precios y stock enviados por el frontend como si no pudieran cambiar.

## Resumen para repasar

Food Store pide más que mostrar productos: incluye categorías, carrito, pedidos y administración. Vamos a descomponerla en modelos y funciones antes de construir pantallas completas.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.10** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_01.md)
