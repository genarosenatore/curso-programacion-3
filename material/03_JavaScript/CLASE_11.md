# Clase 03.11 · Timers, callbacks y promesas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_12.md)

## Continuar mientras una operación espera

Una tarea **síncrona** completa sus pasos antes de seguir con el siguiente. Una operación **asíncrona** puede producir el resultado después, mientras el programa continúa. Un temporizador no pausa el navegador. Un callback, ya visto en arrays y eventos, describe qué hacer cuando esa operación esté lista.

`setTimeout(funcion,milisegundos)` programa una ejecución, devuelve un identificador y espera al menos aproximadamente ese plazo; 1000 milisegundos equivalen a un segundo. Si el programa está ocupado, puede demorarse más. `clearTimeout(id)` cancela una ejecución pendiente. setInterval programa repeticiones y clearInterval las cancela. Ninguno prueba que una descarga terminó.

## Una promesa representa el resultado pendiente

Una **promesa** empieza pendiente y puede quedar cumplida con un valor o rechazada con un motivo. Una vez resuelta, no vuelve a pendiente. `then` recibe una función para procesar el éxito y devuelve otra promesa; `catch` recibe una función para tratar rechazos. Crear la promesa y recibir el resultado son momentos distintos.

```javascript
const promesa = new Promise((resolver, rechazar) => {
  setTimeout(() => resolver("Listo"), 1000);
});
console.log("Sigo trabajando");
promesa.then(mensaje => console.log(mensaje)).catch(error => console.error(error));
```

Programa completo para consola o Node. Promise recibe una función que se ejecuta al construirla; recibe las funciones resolver y rechazar. Dentro se programa un callback que llamará resolver después del plazo. Primero se muestra Sigo trabajando; después Listo. Resolver no detiene ni retorna toda la ejecución exterior.

## Seguir el orden sin asumir pausas

En el ejemplo inferior A y B salen en el tramo síncrono. El callback de Promise.resolve se coloca para procesarse como una **microtarea** al terminar ese tramo; por eso muestra 10 antes del callback del temporizador, que se procesa como otra tarea. No es necesario estudiar todo el mecanismo interno para usarlo, pero sí entender que plazo cero no es ejecución inmediata.

En una cadena, el valor retornado por un then llega al siguiente. Si el callback lanza un error o devuelve una promesa rechazada, el rechazo continúa hacia catch. Si catch trata el error y retorna un valor normal, la cadena puede continuar cumplida con ese valor. Una promesa sirve para un resultado futuro, no para un flujo permanente de muchos eventos; para cada click ya tenemos listeners.

## Ejemplo de la clase

```javascript
console.log("A");
setTimeout(() => console.log("C"), 0);
console.log("B");
Promise.resolve(5).then(valor => console.log(valor * 2));
```

[Abrir el fragmento como archivo](fragmentos/clase_11.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El bloque síncrono muestra A y B; la promesa muestra 10 antes del callback del temporizador que muestra C. Un plazo cero no significa ejecutar dentro de la línea actual. Si usás interval para un contador, conservá su id y llamá clearInterval cuando termine o deje de ser necesario.

## Cambiar una decisión y explorar un límite

En la promesa completa, cambiá resolver("Listo") por rechazar(new Error("Falló")): se procesa catch y no el callback de éxito. Cambiar el plazo a cero sigue sin ejecutar el callback del temporizador dentro de su línea. Guardar el resultado en una variable externa y leerla inmediatamente suele dar su estado anterior.

## Confusión que conviene evitar

Pensar que setTimeout pausa el programa o usar una espera fija para suponer que una descarga terminó.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_11.md). Las [soluciones razonadas](SOLUCIONES_11.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_12.md)
