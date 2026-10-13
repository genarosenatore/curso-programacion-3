# Clase 01.03 · Enlaces, rutas e imágenes con texto alternativo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_02.md) · [Clase siguiente](../01_HTML/CLASE_04.md)

## Conectar documentos y recursos

Un enlace convierte una parte del contenido en un camino hacia otro recurso. El elemento `a` contiene el texto que se activa y el atributo `href` indica el destino. La imagen `img` incorpora un recurso visual; `src` señala de dónde obtenerlo. Esas rutas se resuelven como aprendimos en [00.02](../00_Fundamentos/CLASE_02.md), desde el documento actual.

Hay tres casos. Una ruta como `paginas/contacto.html` entra en una carpeta del proyecto. Una URL con `https://` apunta a un sitio completo. Un fragmento `#catalogo` apunta al elemento de esta página cuyo `id` sea catalogo. El `id` es un identificador único dentro del documento; no es el texto visible del encabezado.

## Preparar archivos que realmente existan

Creá index.html y paginas/contacto.html con la plantilla de 01.01. En el body del primero insertá el enlace del ejemplo. En el segundo insertá el regreso `../index.html`. Copiá la imagen local cuaderno.svg desde [el ejemplo web](../Ejemplos/web-basica/index.html) a imagenes, o elegí tu propia imagen y ajustá nombre y extensión. Escribí src exactamente igual al nombre guardado. No crees un archivo vacío esperando que se vea como una imagen.

Al activar el enlace, el navegador resuelve la ruta, carga el documento y cambia la página. Al encontrar img, solicita su archivo y reserva la presentación. `width="240"` indica un ancho de 240 píxeles CSS. El **texto alternativo** de alt comunica la información o función de la imagen cuando no se puede ver, incluyendo herramientas de asistencia; no es simplemente su nombre de archivo.

Una imagen informativa necesita una alternativa útil para su contexto. Si el enlace solo contiene una imagen, su alternativa debe explicar el destino o acción. Una decoración que no comunica información puede llevar `alt=""`. `target="_blank"` pide otra pestaña o ventana; `rel="noopener"` evita que la página abierta acceda al contexto original. Elegí abrir otra pestaña solo cuando ayude a navegar.

## Ejemplo de la clase

```html
<a href="paginas/contacto.html">Contactar con la tienda</a>
<a href="#catalogo">Ir al catálogo</a>
<a href="https://www.utn.edu.ar/" target="_blank" rel="noopener">UTN</a>
<h2 id="catalogo">Catálogo</h2>
<img src="imagenes/cuaderno.svg" alt="Cuaderno azul con espiral" width="240">
```

[Abrir el fragmento como archivo](fragmentos/clase_03.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El primer enlace busca la subcarpeta paginas; el segundo busca el elemento con id catalogo en esta página. target="_blank" solicita otro contexto, normalmente una pestaña. Para que la imagen funcione debe existir ese archivo: en los ejemplos ejecutables del curso se incluye una imagen local. El id debe ser único en la página.

## Cambiar una decisión y explorar un límite

Renombrá la imagen sin cambiar src: deja de encontrarse y puede mostrarse la alternativa. Cambiá el id del encabezado sin actualizar #catalogo: el enlace ya no ubica el destino. Estos fallos no se arreglan dando color al enlace; son inconsistencias entre referencia y recurso.

## Confusión que conviene evitar

Escribir una ruta que solo funciona en tu computadora, como C:/Users/... en un sitio compartido.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_02.md) · [Clase siguiente](../01_HTML/CLASE_04.md)
