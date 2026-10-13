# Clase 04.08 · DOM tipado y consumo de APIs

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_07.md) · [Clase siguiente](../04_TypeScript/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **dom tipado y consumo de apis**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

En TypeScript, un nodo genérico no tiene necesariamente value. HTMLInputElement sí lo tiene. querySelector puede devolver null aunque indiquemos un tipo genérico. Podemos comprobar existencia y clase real con instanceof para usar sus propiedades de forma segura.

Una API devuelve datos que conviene recibir como unknown y validar. Declarar Promise<Producto[]> o hacer as Producto[] no realiza esa validación. La función debería comprobar que existe un array y que cada objeto tiene los campos necesarios antes de renderizar.

## Ejemplo

```typescript
const campo = document.querySelector("#busqueda");
if (campo instanceof HTMLInputElement) {
  campo.addEventListener("input", () => {
    console.log(campo.value.trim());
  });
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

La comprobación descarta null y elementos de otra clase. En el callback, campo conserva el tipo de input y value es válido. Si la página usa otro id, el código no agrega el listener; esa ausencia debe detectarse al comprobar el montaje de la pantalla.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí una comprobación que acepte solo objetos con id:number y nombre:string.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Usar una afirmación de tipo como solución universal para errores del DOM.

## Resumen para repasar

En TypeScript, un nodo genérico no tiene necesariamente value. HTMLInputElement sí lo tiene.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_07.md) · [Clase siguiente](../04_TypeScript/CLASE_09.md)
