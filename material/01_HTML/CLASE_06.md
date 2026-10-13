# Clase 01.06 · Formularios, labels, tipos de campos y validación nativa

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **formularios, labels, tipos de campos y validación nativa**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un formulario agrupa controles para recibir datos. label describe un control y for se asocia con su id. name es la clave del dato al enviarlo; id permite identificar el elemento en el documento. type especifica el control: email, number, checkbox, radio, entre otros.

required pide un valor y min establece un mínimo para números. La validación nativa ayuda al usuario, pero el backend también debe comprobar los datos. Un botón dentro de un formulario suele enviar por defecto; usamos type="button" si solo realiza otra acción.

## Ejemplo

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

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

for="correo" apunta al input con id="correo". El navegador comprueba la forma básica de un email y la cantidad mínima antes de un envío normal. El ejemplo no tiene backend y no guarda información. Más adelante interceptaremos submit con JavaScript para practicar sin enviar datos fuera de la página.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá un formulario local de nombre, correo y aceptación de condiciones, con etiquetas asociadas.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Usar placeholder como único nombre del campo: desaparece al escribir y no sustituye a label.

## Resumen para repasar

Un formulario agrupa controles para recibir datos. label describe un control y for se asocia con su id.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_07.md)
