# Soluciones 03.11 · Timers, callbacks y promesas

[Clase](CLASE_11.md) · [Ejercicios](EJERCICIOS_11.md)

## 1. Una solución explicada

Promise.resolve("Listo").then(mensaje=>console.log(mensaje));. La función se ejecuta al procesar el resultado, no al escribir el argumento de then. Un rechazo se maneja con .catch(error=>console.error(error)).

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El bloque síncrono muestra A y B; la promesa muestra 10 antes del callback del temporizador que muestra C. Un plazo cero no significa ejecutar dentro de la línea actual. Si usás interval para un contador, conservá su id y llamá clearInterval cuando termine o deje de ser necesario.

## 3. Qué conviene corregir

La confusión a evitar es: Pensar que setTimeout pausa el programa o usar una espera fija para suponer que una descarga terminó.

Un callback es una función que pasamos para que otra operación la invoque. setTimeout programa un callback tras un tiempo mínimo aproximado; no detiene el resto del programa.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
