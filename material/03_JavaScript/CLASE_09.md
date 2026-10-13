# Clase 03.09 · Eventos y formularios

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_08.md) · [Clase siguiente](../03_JavaScript/CLASE_10.md)

## Qué vas a aprender

Vamos a trabajar **eventos y formularios**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un evento indica que ocurrió una acción, como click, input o submit. addEventListener asocia una función que se ejecutará cuando ocurra. Pasamos la función, no el resultado de llamarla. En un formulario, escuchar submit cubre tanto el botón como otras formas de envío, como Enter.

event.preventDefault evita la acción predeterminada, por ejemplo una navegación de envío. Leer un control devuelve texto; validamos y convertimos antes de calcular. El mensaje de resultado debe existir en el HTML y ser comprensible cuando faltan datos.

## Ejemplo

```javascript
// HTML: <form id="compra"><input name="cantidad" type="number" min="1" required><button>Calcular</button></form><p id="resultado"></p>
const formulario = document.querySelector("#compra");
const resultado = document.querySelector("#resultado");
formulario?.addEventListener("submit", event => {
  event.preventDefault();
  const campo = formulario.querySelector("[name=cantidad]");
  const cantidad = Number(campo.value);
  resultado.textContent = `Total: ${cantidad * 800}`;
});
```

[Abrir el fragmento como archivo](fragmentos/clase_09.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

El ejemplo asume que el HTML indicado contiene campo y resultado. El navegador realiza su validación nativa antes de submit normal. Aun así, añadiremos validación propia para cantidades enteras y finitas. El signo ?. evita agregar un listener si no existe formulario. Los textos entre backticks permiten insertar valores con ${...}.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Añadí una comprobación para rechazar cantidades no enteras o menores que 1.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Agregar un listener dentro de otro render y duplicar la respuesta al mismo evento.

## Resumen para repasar

Un evento indica que ocurrió una acción, como click, input o submit. addEventListener asocia una función que se ejecutará cuando ocurra.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_08.md) · [Clase siguiente](../03_JavaScript/CLASE_10.md)
