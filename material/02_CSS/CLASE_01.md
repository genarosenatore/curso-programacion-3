# Clase 02.01 · Conectar CSS y usar selectores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_02.md)

## Separar contenido y presentación

HTML describe un párrafo; CSS decide cómo se muestra. Separarlos permite cambiar la apariencia de muchos elementos sin reescribir su contenido. Una **regla** tiene un selector, que elige elementos, y un bloque de declaraciones entre `{` y `}`. En `p { color: blue; }`, p selecciona párrafos; color es la propiedad; blue el valor; `:` los separa y `;` termina la declaración.

Creá un documento como en [HTML 01.01](../01_HTML/CLASE_01.md) y un archivo estilos.css en la misma carpeta. En head escribí `<link rel="stylesheet" href="estilos.css">`. rel informa que es una hoja de estilos y href indica su ubicación. No pegues link en el CSS: es HTML. Guardá ambos y recargá el documento en el navegador.

## Seleccionar por etiqueta, clase e identificador

`p` alcanza todos los párrafos. `.aviso` alcanza los elementos cuyo atributo HTML class incluye aviso, sin importar su etiqueta. `#mensaje` alcanza el elemento con id mensaje. Una clase agrupa usos repetidos; un id identifica un elemento único. En `class="aviso importante"` hay dos clases, separadas por espacio: no una clase que se llama «aviso importante».

Podés seleccionar descendientes con `.tarjeta p`: los párrafos dentro de una tarjeta. La coma en `h1, h2` comparte declaraciones entre dos selecciones independientes. Una **pseudoclase** expresa un estado o condición: `a:hover` selecciona un enlace bajo el puntero y `a:focus-visible` cuando el navegador indica foco visible, por ejemplo al usar teclado. No requieren agregar una clase literal con esos nombres.

El navegador carga el HTML, obtiene la hoja y busca coincidencias. Si no se aplica un color, distinguí si la hoja no llegó o si el selector no coincide. En las herramientas de desarrollo, inspeccionar un elemento muestra las reglas; una regla ausente puede indicar una ruta o selector incorrectos. Un error en una declaración puede hacer que esa declaración se ignore sin inutilizar toda la hoja.

## Ejemplo de la clase

```css
/* estilos.css */
p { color: #333; }
.destacado { color: #075985; font-weight: bold; }

/* En HTML: <link rel="stylesheet" href="estilos.css"> */
/* En HTML: <p class="destacado">Oferta</p> */
```

[Abrir el fragmento como archivo](fragmentos/clase_01.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La regla p selecciona párrafos. .destacado selecciona la clase destacado. El link busca estilos.css junto al HTML. Al recargar, Oferta aparece con color azul y texto en negrita. Si no cambia, revisá primero la ruta del archivo y después el selector con las herramientas del navegador.

## Cambiar una decisión y explorar un límite

Cambiá class="aviso" por class=".aviso": deja de coincidir con .aviso. El punto es sintaxis del selector, no parte del nombre. Cambiá color por background-color: cambia la superficie detrás del texto. Si quitás link, conservás contenido y perdés esos estilos.

## Confusión que conviene evitar

Escribir class=".aviso": el punto solo va en el selector CSS.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_02.md)
