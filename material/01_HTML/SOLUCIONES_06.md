# Soluciones 01.06 · Formularios, labels, tipos de campos y validación nativa

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Nombre: input type="text" required; correo: type="email" required; aceptación: checkbox required con su propio id y label. Añadí name en cada campo y un botón submit. Probá un envío vacío y explicá qué controla el navegador.

## 2 y 3. Resolver y justificar las decisiones

Fragmento para body:

```html
<p>Demostración: no registra cuentas.</p>
<form method="get">
  <label for="nombre">Nombre</label><input id="nombre" name="nombre" required>
  <label for="correo">Correo</label><input id="correo" name="correo" type="email" required>
  <label for="cantidad">Cantidad</label><input id="cantidad" name="cantidad" type="number" min="1" max="5" step="1" required>
  <label for="tema">Tema</label>
  <select id="tema" name="tema"><option value="ficcion">Ficción</option><option value="historia">Historia</option></select>
  <button type="submit">Probar</button>
</form>
```

El vacío y el correo mal formado fallan; cero queda fuera del mínimo; dos puede enviarse. GET muestra claves como cantidad y tema en la URL del documento. No envíes contraseñas aquí. id enlaza la etiqueta y debe ser único; name identifica el valor para quien recibe el formulario.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
