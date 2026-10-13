# Clase 04.02 · Tipos básicos, inferencia, arrays y funciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_01.md) · [Clase siguiente](../04_TypeScript/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **tipos básicos, inferencia, arrays y funciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

TypeScript puede inferir tipos a partir de un valor. No siempre hace falta anotarlo. number, string y boolean cubren valores básicos; un array puede expresarse como number[]; los parámetros y el retorno de una función también tienen tipos.

Definir un retorno permite comprobar que la función cumple su contrato. void expresa que no entrega un resultado útil. No confundas number con Number: para datos ordinarios usamos el tipo primitivo. El tipado no reemplaza reglas del negocio, como que una cantidad sea positiva.

## Ejemplo

```typescript
function subtotal(precio: number, cantidad: number): number {
  return precio * cantidad;
}
const precios: number[] = [100, 200];
console.log(subtotal(precios[0], 3));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

La función recibe dos números y devuelve otro. precios solo admite números. En configuraciones que comprueban acceso por índice, podría requerirse comprobar que precios[0] existe. Un array vacío demuestra por qué una suposición sobre sus elementos puede fallar aunque sus elementos sean numéricos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Escribí una función que reciba nombre:string y devuelva un saludo:string.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Agregar tipos a todo mecánicamente y no comprender lo que se está garantizando.

## Resumen para repasar

TypeScript puede inferir tipos a partir de un valor. No siempre hace falta anotarlo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_01.md) · [Clase siguiente](../04_TypeScript/CLASE_03.md)
