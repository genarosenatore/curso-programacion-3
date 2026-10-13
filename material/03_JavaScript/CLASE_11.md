# Clase 03.11 · Timers, callbacks y promesas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_12.md)

## Qué vas a aprender

Vamos a trabajar **timers, callbacks y promesas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un callback es una función que pasamos para que otra operación la invoque. setTimeout programa un callback tras un tiempo mínimo aproximado; no detiene el resto del programa. setInterval programa repeticiones y devuelve un identificador que puede cancelarse.

Una promesa representa un resultado que puede llegar después: pendiente, cumplida o rechazada. then procesa el éxito y catch el rechazo. El orden del código escrito no garantiza el orden de resultados asíncronos. No necesitamos memorizar todos los mecanismos internos para empezar, pero sí distinguir programar una acción de ejecutarla inmediatamente.

## Ejemplo

```javascript
console.log("A");
setTimeout(() => console.log("C"), 0);
console.log("B");
Promise.resolve(5).then(valor => console.log(valor * 2));
```

[Abrir el fragmento como archivo](fragmentos/clase_11.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

El bloque síncrono muestra A y B; la promesa muestra 10 antes del callback del temporizador que muestra C. Un plazo cero no significa ejecutar dentro de la línea actual. Si usás interval para un contador, conservá su id y llamá clearInterval cuando termine o deje de ser necesario.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá una promesa que se cumpla con "Listo" y mostrala con then. Explicá por qué then recibe una función.

Abrí [los ejercicios y las pistas](EJERCICIOS_11.md). Las [soluciones explicadas](SOLUCIONES_11.md) están preparadas para consultar después de intentarlo.

## Error común

Pensar que setTimeout pausa el programa o usar una espera fija para suponer que una descarga terminó.

## Resumen para repasar

Un callback es una función que pasamos para que otra operación la invoque. setTimeout programa un callback tras un tiempo mínimo aproximado; no detiene el resto del programa.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.11** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_12.md)
