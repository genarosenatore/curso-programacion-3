# Clase 02.05 · Display, visibilidad y posicionamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_04.md) · [Clase siguiente](../02_CSS/CLASE_06.md)

## Flujo y visibilidad

El **flujo normal** es cómo se distribuye el documento antes de posicionarlo especialmente. Un bloque suele empezar en una línea nueva y usar el ancho disponible. Un elemento en línea participa con el texto. `display` cambia el tipo de caja: un enlace suele ser inline; `inline-block` le permite dimensiones y mantiene el flujo en línea; `block` lo convierte en caja de bloque.

`display:none` elimina su caja del diseño. `visibility:hidden` la conserva sin mostrarla. `opacity:0` la vuelve transparente, pero puede seguir recibiendo foco y acciones: no es equivalente a retirar un control. Cuando ocultás información, comprobá también cómo se navega con teclado; un botón invisible y activo resulta confuso.

## Elegir una referencia de posición

`position:relative` mantiene el espacio del elemento y permite desplazar visualmente su caja con top, left y otros lados. `absolute` retira la caja del flujo y la sitúa respecto de su bloque de referencia, frecuentemente un ancestro con position distinto de static. En el ejemplo, la tarjeta relative proporciona esa referencia a la etiqueta absoluta.

`top:.5rem` y `right:.5rem` separan la etiqueta de esos bordes. El punto decimal equivale a 0.5. Como la etiqueta no reserva espacio, el texto normal puede quedar debajo: reservá padding suficiente o usá otra disposición. `fixed` suele referirse al viewport, el área visible del navegador; `sticky` permanece en el flujo y se adhiere al alcanzar un umbral como top:0, dentro de límites de su contenedor y desplazamiento.

Prepará un article.tarjeta con un span.etiqueta y un párrafo en el [documento base](../01_HTML/CLASE_01.md). span agrupa una parte de texto sin crear una región semántica. Aplicá la hoja y observá la esquina. Para distribuir una página completa, las coordenadas rígidas suelen producir superposiciones; usá flujo, Flexbox o Grid.

## Ejemplo de la clase

```css
.tarjeta { position: relative; padding: 1rem; }
.etiqueta { position: absolute; top: .5rem; right: .5rem; }
.oculto { display: none; }
```

[Abrir el fragmento como archivo](fragmentos/clase_05.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La tarjeta crea la referencia para ubicar etiqueta en su esquina. Al ser absoluta, la etiqueta no reserva espacio como un hijo normal; el contenido podría quedar debajo si no se prevé. La clase oculto hace desaparecer un elemento del diseño. Un menú completo no debería posicionarse con coordenadas rígidas para cada pantalla.

## Cambiar una decisión y explorar un límite

Quitá position:relative de tarjeta: la etiqueta puede buscar otra referencia y moverse lejos. Reemplazá display:none por visibility:hidden en una de dos tarjetas: aparece un hueco. El espacio conservado puede ser deseado, pero no lo confundas con reordenar una lista.

## Confusión que conviene evitar

Usar position:absolute para todo y perder el flujo adaptable de la página.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_04.md) · [Clase siguiente](../02_CSS/CLASE_06.md)
