# Clase 01.04 · Estructura semántica: header, nav, main, section y footer

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_03.md) · [Clase siguiente](../01_HTML/CLASE_05.md)

## Organizar regiones que tienen una función

Las [etiquetas y encabezados](CLASE_02.md) permiten describir partes pequeñas. Una página completa también necesita regiones reconocibles. La **semántica** es el significado que asignamos a cada elemento: permite entender la organización sin depender del diseño visual. `main` identifica el contenido principal; `nav` un conjunto de navegación; `header` una introducción y `footer` un cierre.

`section` agrupa contenido de un tema, normalmente introducido por un encabezado. `article` representa una pieza que podría entenderse por separado, como una noticia o entrada de blog. `div` agrupa sin significado específico, útil cuando solo necesitamos un contenedor. No todo grupo debe ser section ni todo bloque de texto article.

## Construir el árbol de la página

Empezá con el documento de 01.01. Dentro de body, poné presentación y navegación; luego un main; al final el pie. Dentro de main, identificá los temas y las piezas autónomas. En el ejemplo, Productos disponibles es un tema y Cuaderno es una pieza. header puede ser introductorio de una página o de un artículo: no obliga a situarse arriba de la pantalla.

El navegador presenta las regiones en el orden del documento si no agregamos estilos. Las tecnologías de asistencia pueden usar regiones y encabezados para saltar entre partes. Por eso elegir etiquetas por su significado facilita acceder al contenido. El diseño en columnas llegará con CSS y no necesita cambiar esa organización.

Mantené un main principal visible y una jerarquía de encabezados comprensible. Si dos regiones nav tienen funciones distintas, se pueden identificar con `aria-label`, un atributo que asigna un nombre accesible; por ejemplo aria-label="Navegación principal". No reemplaza texto visible cuando el usuario necesita leerlo.

## Ejemplo de la clase

```html
<header><h1>Mi tienda</h1></header>
<nav><a href="#productos">Productos</a></nav>
<main>
  <section id="productos">
    <h2>Productos disponibles</h2>
    <article><h3>Cuaderno</h3><p>80 hojas.</p></article>
  </section>
</main>
<footer><p>Contacto: tienda@example.com</p></footer>
```

[Abrir el fragmento como archivo](fragmentos/clase_04.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

main delimita la parte central. La sección tiene un título que explica su tema. El producto se presenta como una pieza autónoma mediante article. Los encabezados respetan la jerarquía. Si mañana cambiamos el diseño, estas responsabilidades siguen siendo las mismas.

## Cambiar una decisión y explorar un límite

Cambiar todos los contenedores por div puede dejar una apariencia similar, pero se pierde información sobre las regiones. Si una agrupación existe únicamente para poner un fondo, un div con clase puede ser adecuado. Si quitás CSS, el orden y los encabezados deben seguir explicando el contenido.

## Confusión que conviene evitar

Elegir section solo para aplicar un fondo sin que exista una agrupación temática.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_03.md) · [Clase siguiente](../01_HTML/CLASE_05.md)
