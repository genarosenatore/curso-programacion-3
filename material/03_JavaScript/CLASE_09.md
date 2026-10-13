# Clase 03.09 · Eventos y formularios

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_08.md) · [Clase siguiente](../03_JavaScript/CLASE_10.md)

## Ejecutar código cuando ocurre una acción

Un **evento** comunica algo que ocurrió en la interfaz: un click, una edición input o un envío submit. Un **listener** es una función registrada para recibir esa comunicación. `elemento.addEventListener("click", manejar)` pasa la función manejar como valor; `manejar()` la ejecuta ahora y pasa su resultado, una diferencia enseñada en [03.05](CLASE_05.md).

Un formulario puede enviarse con botón o Enter, por eso escuchamos submit sobre form. El callback recibe un objeto event que describe el evento. `event.preventDefault()` evita su acción predeterminada, como enviar y navegar, pero no cancela por sí solo la ejecución de nuestro callback.

## Preparar el HTML antes del script

En el body del documento de [03.08](CLASE_08.md), antes de script, colocá:

```html
<form id="compra">
  <label for="cantidad">Cantidad</label>
  <input id="cantidad" name="cantidad" type="number" min="1" step="1" required>
  <button type="submit">Calcular</button>
</form>
<p id="resultado" aria-live="polite"></p>
```

aria-live anuncia cambios de mensaje a tecnologías de asistencia sin interrumpir bruscamente. El formulario incluye etiquetas y restricciones vistas en HTML. Luego el script inferior selecciona form y resultado y registra el callback. En una página completa comprobá que ambos existan; el fragmento inferior supone esa estructura exacta.

Al enviar normalmente, el navegador aplica validación nativa antes de producir submit. Dentro del callback leemos campo.value, que es texto, lo convertimos y comprobamos entero positivo. La **validación propia** no debe descansar exclusivamente en el HTML: una llamada o entrada programática puede tener otras condiciones. En este ejemplo el cálculo es local; no crea una compra real.

El texto con backticks es una **cadena de plantilla**: `${expresion}` incorpora un resultado. `Total: ${cantidad * 800}` incluye el cálculo sin concatenar manualmente. `formulario?.addEventListener` usa el encadenamiento opcional de 03.07; evita el acceso si falta el formulario, pero no confirma que resultado exista.

Registrá listeners una vez cuando preparás la interfaz. Si los agregás dentro de cada render con una función nueva, una acción puede provocar varios cálculos. Repetir la representación y registrar eventos son responsabilidades distintas.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

El ejemplo asume que el HTML indicado contiene campo y resultado. El navegador realiza su validación nativa antes de submit normal. Aun así, añadiremos validación propia para cantidades enteras y finitas. El signo ?. evita agregar un listener si no existe formulario. Los textos entre backticks permiten insertar valores con ${...}.

## Cambiar una decisión y explorar un límite

Sustituí addEventListener("submit",...) por una llamada inmediata al callback: perderías la relación con la acción. Quitá preventDefault: después de calcular puede navegar y desaparecer el mensaje. Cambiá cantidad a 1.5 mediante un envío programático: la validación propia debe rechazarla aunque no dependamos de la nativa.

## Confusión que conviene evitar

Agregar un listener dentro de otro render y duplicar la respuesta al mismo evento.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_08.md) · [Clase siguiente](../03_JavaScript/CLASE_10.md)
