# Clase 04.03 · Interfaces y tipos para objetos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_02.md) · [Clase siguiente](../04_TypeScript/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **interfaces y tipos para objetos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una interface describe la forma de un objeto: nombres de propiedades y sus tipos. type permite expresar alias, incluyendo uniones. TypeScript usa compatibilidad estructural: importa la forma del valor, no que haya sido creado por una clase con un nombre específico.

Una interface no crea objetos ni existe como entidad del backend. Sirve para modelar el contrato que el código usa. Marcar una propiedad readonly evita reasignarla a través de ese tipo, pero no convierte todo el objeto en inmutable en ejecución.

## Ejemplo

```typescript
interface Producto {
  readonly id: number;
  nombre: string;
  precio: number;
}
const producto: Producto = { id: 1, nombre: "Cuaderno", precio: 2000 };
console.log(producto.nombre);
```

[Abrir el fragmento como archivo](fragmentos/clase_03.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

El objeto debe incluir id, nombre y precio con tipos compatibles. readonly impide escribir producto.id=2 desde esta referencia. Cambiar precio sigue permitido. Al conectar la API, los nombres deben coincidir con el JSON; llamar costo a precio en la interface no renombra automáticamente la respuesta.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Modelá Cliente con id numérico, nombre y correo de texto.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que una interface genera un constructor o valida automáticamente un JSON.

## Resumen para repasar

Una interface describe la forma de un objeto: nombres de propiedades y sus tipos. type permite expresar alias, incluyendo uniones.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_02.md) · [Clase siguiente](../04_TypeScript/CLASE_04.md)
