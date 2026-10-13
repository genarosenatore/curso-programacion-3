# Soluciones 01.06 · Formularios, labels, tipos de campos y validación nativa

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Nombre: input type="text" required; correo: type="email" required; aceptación: checkbox required con su propio id y label. Añadí name en cada campo y un botón submit. Probá un envío vacío y explicá qué controla el navegador.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

for="correo" apunta al input con id="correo". El navegador comprueba la forma básica de un email y la cantidad mínima antes de un envío normal. El ejemplo no tiene backend y no guarda información. Más adelante interceptaremos submit con JavaScript para practicar sin enviar datos fuera de la página.

## 3. Qué conviene corregir

La confusión a evitar es: Usar placeholder como único nombre del campo: desaparece al escribir y no sustituye a label.

Un formulario agrupa controles para recibir datos. label describe un control y for se asocia con su id.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
