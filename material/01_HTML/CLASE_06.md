# Clase 01.06 · Formularios, labels, tipos de campos y validación nativa

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_07.md)

## Recibir datos de una persona

Un formulario agrupa controles para recibir información y enviarla. `input` crea un campo; su atributo `type` define qué clase de entrada espera el navegador. `text` recibe texto, `email` ofrece comprobación básica de formato, `number` admite entrada numérica y `password` oculta visualmente lo escrito. Ocultar no cifra ni guarda una contraseña de forma segura.

`label` nombra el campo. `for="correo"` se asocia con el input cuyo id sea correo: al activar la etiqueta se enfoca el control y las herramientas de asistencia pueden relacionarlos. Un **placeholder** es una sugerencia dentro del campo; desaparece al escribir y no reemplaza una etiqueta. `name` identifica el dato al enviarlo; id identifica el elemento en la página. Son responsabilidades diferentes aunque puedan compartir texto.

## Validación y envío

Insertá el ejemplo en body de [01.01](CLASE_01.md). Escribí una dirección incompleta e intentá enviar; después probá una dirección válida. `required` exige contenido; `minlength` exige una longitud mínima en controles compatibles; `min` y `max` definen límites numéricos. Son atributos: no escriben una regla de negocio en el servidor.

Al enviar normalmente, el navegador verifica las restricciones y, si corresponde, realiza la acción del formulario. `action` indica destino y `method` cómo enviar; GET incorpora datos a la URL y POST los envía en el cuerpo. Si omitís action, el destino es el documento actual; un sitio estático no registra cuentas. Un botón dentro de form suele enviar por defecto: explicitá `type="submit"` para enviar y `type="button"` para una acción que no envía.

`select` ofrece opciones y cada `option` tiene un valor; `textarea` admite texto de varias líneas. Empezá con pocos campos y comprobá etiqueta, nombre y restricción de cada uno. La validación del navegador mejora la experiencia, pero puede evitarse: el backend debe volver a comprobar datos cuando exista. JavaScript aprenderá a interceptar submit más adelante.

## Elegir una o varias opciones

`radio` expresa una elección entre alternativas: todos los controles del grupo llevan el mismo name y cada uno un id propio y un value diferente. Seleccionar uno desmarca el otro. `checkbox` expresa una opción independiente, como recibir noticias; varias casillas pueden quedar marcadas. `checked` establece el estado inicial, no obliga a conservarlo. `value` es el dato enviado al seleccionar, no el texto de la etiqueta.

Este fragmento va dentro del mismo form:

```html
<p>Turno preferido</p>
<label for="manana">Mañana</label>
<input id="manana" name="turno" type="radio" value="manana" checked>
<label for="tarde">Tarde</label>
<input id="tarde" name="turno" type="radio" value="tarde">
<label for="noticias">Recibir noticias</label>
<input id="noticias" name="noticias" type="checkbox" value="si">
```

Al elegir Tarde y marcar noticias, se envían turno=tarde y noticias=si. Una casilla no marcada normalmente no envía su nombre: su ausencia no es el mismo texto que "false". `disabled` impide usar un control y normalmente lo excluye del envío; no lo uses para un dato que el receptor necesita sin definir cómo aportarlo. `fieldset` agrupa controles relacionados y `legend` les da un título común, útil para sustituir el párrafo de turno por un grupo nombrado. La navegación natural de controles suele alcanzar; `tabindex="0"` añade foco en el orden natural a un elemento que no lo tiene y `-1` permite foco programático sin incluirlo en Tab. Valores positivos pueden desordenar el recorrido, por lo que no se agregan para «hacer accesible» todo automáticamente.

## Ejemplo de la clase

```html
<form>
  <label for="correo">Correo electrónico</label>
  <input id="correo" name="correo" type="email" required>
  <label for="cantidad">Cantidad</label>
  <input id="cantidad" name="cantidad" type="number" min="1" step="1" required>
  <button type="submit">Continuar</button>
</form>
```

[Abrir el fragmento como archivo](fragmentos/clase_06.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

for="correo" apunta al input con id="correo". El navegador comprueba la forma básica de un email y la cantidad mínima antes de un envío normal. El ejemplo no tiene backend y no guarda información. Más adelante interceptaremos submit con JavaScript para practicar sin enviar datos fuera de la página.

## Cambiar una decisión y explorar un límite

Quitá required: un correo vacío puede pasar si no hay otra regla. Agregá type="button" al botón de enviar: ya no provoca un envío. Para cantidad, min="1" y step="1" expresan unidades enteras. Escribir una dirección con formato válido no prueba que su propietario exista.

## Confusión que conviene evitar

Usar placeholder como único nombre del campo: desaparece al escribir y no sustituye a label.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_07.md)
