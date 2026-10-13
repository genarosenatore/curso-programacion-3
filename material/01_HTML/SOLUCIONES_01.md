# Soluciones 01.01 · Documento HTML: doctype, html, head y body

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

title: Biblioteca; h1: Mi biblioteca; p: Un lugar para organizar mis lecturas. Conservá lang="es", charset y viewport. El título de pestaña y el visible pueden ser distintos porque cumplen funciones distintas.

## 2 y 3. Resolver y justificar las decisiones

El documento ejecutable puede ser:

```html
<!doctype html>
<html lang="es">
<head><meta charset="UTF-8"><title>Recetas de casa</title></head>
<body>
  <h1>Mi recetario</h1>
  <p>Voy a guardar mis comidas favoritas.</p>
  <p>La próxima receta será una tarta.</p>
</body>
</html>
```

El título de pestaña identifica el documento entre pestañas; h1 introduce su contenido. La ausencia de viewport no impide este ejemplo de escritorio, pero añadilo desde la plantilla para móviles. `<body><p>Hola</body></p>` cierra el contenedor antes del hijo; debe ser `<body><p>Hola</p></body>`. La sangría no arregla ese orden.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
