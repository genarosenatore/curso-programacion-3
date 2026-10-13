# Soluciones 03.11 · Timers, callbacks y promesas

[Clase](CLASE_11.md) · [Práctica](EJERCICIOS_11.md)

## 1. Razonamiento de la actividad guiada

Promise.resolve("Listo").then(mensaje=>console.log(mensaje));. La función se ejecuta al procesar el resultado, no al escribir el argumento de then. Un rechazo se maneja con .catch(error=>console.error(error)).

## 2 y 3. Resolver y justificar las decisiones

`Promise.resolve(4).then(n => n * 2).then(n => console.log(n));` muestra 8 porque el primer callback devuelve ese valor. esperarMensaje puede retornar `new Promise(resolver => { setTimeout(() => resolver("Listo"),1000); });`.

Al llamar, `esperarMensaje().then(m => console.log(m)).catch(e => console.error(e)); console.log("Inicio");` muestra Inicio antes de Listo. Para probar rechazo, usá Promise.reject(new Error("Falló")) como resultado en otra llamada. Un plazo no sabe si llegó la red ni si su respuesta es válida; la promesa de esa operación expresa su resultado y debe observarse directamente.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
