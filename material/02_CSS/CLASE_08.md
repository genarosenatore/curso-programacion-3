# Clase 02.08 · Media queries y diseño adaptable

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_09.md)

## Adaptar el diseño a su espacio

Un diseño adaptable conserva contenido útil cuando cambia el ancho. Una **media query** es una condición que habilita ciertas reglas CSS. `@media (min-width:48rem)` significa «aplicar el bloque si el ancho del viewport llega al menos a 48rem». No detecta una marca de teléfono. Las reglas dentro participan en la cascada cuando la condición se cumple.

La base puede usar una sola columna. Después una condición agrega dos cuando hay espacio. Este recorrido desde pantallas pequeñas permite que el contenido siga funcionando aun cuando no alcance el punto de cambio. No ocultes precio o controles necesarios solo para hacer caber una captura.

## Construir y comprobar el cambio

Con [Grid](CLASE_07.md), colocá una navegación y un main dentro de .pagina. La base define 1fr; el bloque condicional define 16rem 1fr. El navegador evalúa el ancho y, cuando se cumple, la declaración posterior sustituye la anterior. Las otras propiedades, como gap, siguen presentes: la condición no reinicia toda la hoja.

Verificá que el head contenga `<meta name="viewport" content="width=device-width, initial-scale=1">`, enseñado en HTML. Sin esa indicación, móviles pueden presentar una superficie virtual ancha que cambia el comportamiento esperado. Para imágenes, max-width:100% impide superar su referencia y height:auto conserva la proporción.

Elegí el punto de cambio observando cuándo deja de ser legible el contenido. Probá justo por debajo, en el límite y por encima. Sumá títulos largos, teclado y zoom, porque el espacio necesario no depende solo de la cantidad de tarjetas. En media queries, rem se calcula a partir de la fuente inicial del navegador, no de una modificación CSS de html; no asumas que cambiar font-size en html moverá exactamente ese umbral.

## Ejemplo de la clase

```css
.pagina { display: grid; grid-template-columns: 1fr; gap: 1rem; }
img { max-width: 100%; height: auto; }
@media (min-width: 48rem) {
  .pagina { grid-template-columns: 16rem 1fr; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

En pantallas pequeñas, la barra lateral y el contenido se apilan. Desde 48rem, se separan en dos columnas. La consulta agrega reglas; no borra automáticamente las previas. Revisá también la altura de contenido, el zoom y etiquetas largas.

## Cambiar una decisión y explorar un límite

Si el umbral es 40rem, min-width lo incluye. Un ancho menor usa una columna; uno igual o mayor permite dos. Si ambas consultas y reglas escriben tamaños incompatibles, investigá el orden de cascada en lugar de agregar más cortes.

## Confusión que conviene evitar

Ocultar información necesaria en móvil para que el diseño parezca más limpio.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_09.md)
