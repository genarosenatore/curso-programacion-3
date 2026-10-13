# Clase 02.03 · Colores, texto, unidades y medidas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_02.md) · [Clase siguiente](../02_CSS/CLASE_04.md)

## Elegir medidas que expresen la intención

Una medida CSS combina número y unidad. `16px` usa píxeles CSS de referencia, que no siempre equivalen a un punto físico de pantalla. `2rem` depende de la fuente del elemento raíz html: si vale 16px, son 32px. `em` en font-size depende de la fuente del padre y en muchas otras propiedades de la fuente del propio elemento. Los porcentajes necesitan una referencia que cambia según la propiedad.

Un ancho `90%` normalmente se calcula sobre el bloque contenedor, no sobre toda la pantalla. Para un contenedor de 800px produce 720px. `max-width:60rem` agrega un techo: se usa el ancho porcentual mientras no lo supere. Esto permite una lectura ancha en escritorio y ajustada en pantallas pequeñas.

## Color y legibilidad

`color` pinta el texto y `background-color` su fondo. Un nombre como blue y una notación hexadecimal como #075985 son maneras de indicar color. El hexadecimal combina rojo, verde y azul con pares de dígitos en base 16; no necesitás calcularlos a mano para practicar. Elegí contraste que deje leer el texto y no comuniques agotado solamente con un color.

`font-family: Arial, sans-serif` pide Arial y ofrece una familia alternativa si falta. `font-weight` controla el grosor y `text-align` la alineación. `line-height:1.5` hace que la distancia de línea corresponda a 1,5 veces el tamaño de fuente. No lleva unidad para que cada elemento adapte esa proporción a su fuente. Evitá fijar altura de párrafos: si el texto crece, puede quedar recortado.

Prepará body, h1 y un main class="contenido" en el [documento base](../01_HTML/CLASE_01.md), conectá la hoja como en [02.01](CLASE_01.md) y aplicá el ejemplo. Cambiá la ventana y el zoom: la prueba debe incluir un párrafo largo, no solo una palabra. La comodidad de lectura determina las medidas elegidas.

## Ejemplo de la clase

```css
body { font-family: Arial, sans-serif; font-size: 1rem; line-height: 1.5; }
h1 { font-size: 2rem; color: #075985; }
.contenido { width: 90%; max-width: 60rem; }
```

[Abrir el fragmento como archivo](fragmentos/clase_03.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El título tiene el doble del tamaño raíz. contenido ocupa 90 % del espacio de referencia, pero no supera 60rem. max-width permite poner un límite sin fijar siempre el ancho. El navegador suele partir de 16px, aunque la persona puede cambiarlo; por eso conviene pensar en proporciones.

## Cambiar una decisión y explorar un límite

Con raíz 20px, 2rem son 40px. Si contenido está dentro de un padre de 500px, width:90% da 450px aunque la pantalla sea mayor. Una altura fija de 50px puede recortar un párrafo al aumentar el zoom; dejar que crezca con su contenido evita ese límite artificial.

## Confusión que conviene evitar

Suponer que 100 % equivale siempre al ancho de toda la pantalla.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_02.md) · [Clase siguiente](../02_CSS/CLASE_04.md)
