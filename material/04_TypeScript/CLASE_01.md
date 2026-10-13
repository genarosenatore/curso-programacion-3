# Clase 04.01 · JavaScript y TypeScript: compilación y tipos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_13.md) · [Clase siguiente](../04_TypeScript/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **javascript y typescript: compilación y tipos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

TypeScript extiende JavaScript con información de tipos que se comprueba antes de ejecutar. El compilador produce JavaScript; las anotaciones de tipo no validan por sí solas los datos recibidos en tiempo de ejecución. Es una ayuda para escribir y mantener código, no una sustitución de las comprobaciones de entrada.

Un archivo .ts no se usa como script clásico directo en el navegador. Podemos compilar con tsc o usar una herramienta de desarrollo como Vite. Empezamos con un ejemplo que se entiende con las variables ya aprendidas.

## Ejemplo

```typescript
const precio: number = 800;
const nombre: string = "Lapicera";
console.log(nombre, precio * 2);
// precio = "ochocientos"; // No es un number y además precio es const.
```

[Abrir el fragmento como archivo](fragmentos/clase_01.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

Las anotaciones :number y :string indican tipos. El JavaScript generado conserva los valores y el console.log, pero elimina las anotaciones. Un error del compilador describe una incompatibilidad; corregirlo debería mejorar el modelo y no silenciarlo con cualquier conversión.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué una API puede devolver un precio inválido aunque el programa compile.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Usar una anotación o as para afirmar que los datos externos ya fueron comprobados.

## Resumen para repasar

TypeScript extiende JavaScript con información de tipos que se comprueba antes de ejecutar. El compilador produce JavaScript; las anotaciones de tipo no validan por sí solas los datos recibidos en tiempo de ejecución.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_13.md) · [Clase siguiente](../04_TypeScript/CLASE_02.md)
