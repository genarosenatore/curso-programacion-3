# Clase 04.05 · Genéricos básicos y diferencias entre any y unknown

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_04.md) · [Clase siguiente](../04_TypeScript/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **genéricos básicos y diferencias entre any y unknown**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un genérico relaciona tipos entre la entrada y la salida. En una función que devuelve el primer elemento, T permite conservar su tipo concreto. any elimina comprobaciones; unknown exige comprobar antes de operar. Para datos externos, unknown obliga a reconocer que todavía no sabemos su forma.

Un genérico no hace que una función sepa validar cualquier objeto. Expresa una relación que el compilador comprueba. Un retorno que puede faltar debe incluir undefined en lugar de prometer un valor inexistente.

## Ejemplo

```typescript
function primero<T>(valores: T[]): T | undefined {
  return valores[0];
}
const nombre = primero(["Ana", "Luis"]);
function esTexto(valor: unknown): valor is string {
  return typeof valor === "string";
}
```

[Abrir el fragmento como archivo](fragmentos/clase_05.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

En primero de strings, T se infiere como string. Un array vacío devuelve undefined. esTexto comprueba durante la ejecución y comunica al compilador la reducción a string en el camino verdadero. La comprobación real debe ser correcta: el tipo de retorno declarado no la inventa.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá ultimo<T> que devuelva el último elemento o undefined.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar todos los tipos problemáticos a any y perder las comprobaciones que queríamos obtener.

## Resumen para repasar

Un genérico relaciona tipos entre la entrada y la salida. En una función que devuelve el primer elemento, T permite conservar su tipo concreto.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_04.md) · [Clase siguiente](../04_TypeScript/CLASE_06.md)
