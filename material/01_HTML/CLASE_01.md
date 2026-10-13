# Clase 01.01 · Documento HTML: doctype, html, head y body

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_02.md)

## Dar estructura al texto

Una página no es una captura de pantalla. Es un documento que el navegador interpreta. HTML usa **marcado**: etiquetas que indican qué función tiene cada parte. `<p>Hola</p>` forma un elemento de párrafo: `<p>` abre, `Hola` es contenido y `</p>` cierra. `<` y `>` delimitan la etiqueta; `/` distingue el cierre. El nombre `p` lo reconoce HTML, no lo elegimos libremente.

Un elemento puede contener otros: `body` contiene el párrafo. Esa relación se llama **anidamiento**. Abrir A, abrir B, cerrar B y cerrar A conserva la estructura. Las etiquetas no son órdenes ejecutadas una después de otra como un cálculo: describen un documento que el navegador construye y presenta.

## Preparar y abrir tu primer documento

Necesitás lo visto en [archivos y editor](../00_Fundamentos/CLASE_02.md). Copiá el documento completo de abajo a `index.html`, guardalo como texto UTF-8 y abrilo en un navegador. El navegador ya sabe mostrar un párrafo sin instalar paquetes.

`<!doctype html>` indica el documento HTML moderno. `html` es el elemento que contiene la página. `head` guarda información sobre ella; `body` contiene lo que lee la persona. Un **atributo** es información adicional escrita en la apertura: en `lang="es"`, lang es su nombre y "es" su valor. El signo `=` asocia ambos y las comillas delimitan el texto del valor.

`meta charset` declara cómo interpretar los caracteres. UTF-8 permite leer «Programación» sin deformar sus tildes. `title` identifica la pestaña; `h1` será el encabezado principal visible. `meta name="viewport"` configura el área de presentación para que un móvil use el ancho del dispositivo. `meta` no contiene texto ni lleva cierre; no todos los elementos funcionan como p.

La sangría ayuda a ver qué contiene a qué; por sí misma no crea elementos. El navegador suele corregir marcado mal formado: que una página aparezca no demuestra que esté bien escrita. Conservá una estructura explícita para entenderla y revisarla.

## Ejemplo de la clase

```html
<!doctype html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Mi tienda</title>
</head>
<body>
  <h1>Mi tienda</h1>
  <p>Bienvenido a mi primera página.</p>
</body>
</html>
```

[Abrir el fragmento como archivo](fragmentos/clase_01.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Guardá el ejemplo como index.html y abrilo con el navegador. El texto de title aparece en la pestaña; h1 es el título dentro de la página. La sangría facilita leer la estructura, aunque no crea la relación: esa relación la establecen las etiquetas. Editá un texto, guardá y recargá para comprobar la diferencia entre archivo y página mostrada.

## Cambiar una decisión y explorar un límite

Cambiá solo title: cambia la pestaña, no el encabezado visible. Cambiá h1: cambia el título de la página. Si ponés un párrafo dentro de head, el navegador puede recolocarlo al reparar el documento; no dependas de esa reparación. Si ves las etiquetas como texto, comprobá que el archivo no sea index.html.txt.

## Confusión que conviene evitar

Colocar todo dentro de head: el contenido visible debe estar en body.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_02.md)
