# Clase 00.02 · Archivos, carpetas, extensiones y editor de código

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_01.md) · [Clase siguiente](../00_Fundamentos/CLASE_03.md)

## Del dato al archivo

En [00.01](CLASE_01.md) distinguimos instrucciones de resultados. Para conservar instrucciones necesitamos un archivo: una secuencia de datos guardada con un nombre. Un archivo de código suele ser texto plano, sin formato de Word. Un editor de código permite escribir ese texto, guardarlo y mostrar errores de escritura; guardar no ejecuta el programa.

La carpeta es un contenedor para organizar archivos. La **raíz del proyecto** es la carpeta que elegimos como punto de partida, no necesariamente la raíz del disco. `index.html` es una convención frecuente para la página de entrada; el nombre no crea contenido automáticamente. Las extensiones `.html`, `.css`, `.js` indican a las herramientas cómo tratar el archivo. Renombrar `foto.png` a `foto.html` no convierte una imagen en HTML.

## Resolver una ruta paso a paso

Una ruta es una indicación de ubicación. En `paginas/contacto.html`, primero entramos en `paginas` y luego buscamos el archivo. En `../index.html`, `..` significa subir a la carpeta que contiene la actual. `.` significa la carpeta actual. Los `/` separan pasos en las rutas web. La ruta relativa necesita un punto de referencia: en un enlace HTML es la ubicación del documento; en una referencia CSS externa suele ser la del archivo CSS.

Creá una carpeta `biblioteca`, un archivo `index.html` y la subcarpeta `paginas` con `contacto.html`. Desde el primero entrás a `paginas`; desde el segundo tenés que subir. Una ruta absoluta del disco identifica una ubicación completa, pero no sirve para compartir un sitio con otra persona. Una URL como `https://ejemplo.org/contacto` identifica un recurso de la web y tiene otro contexto.

En Windows activá las extensiones en el Explorador, abrí la carpeta con tu editor y guardá en UTF-8, una codificación capaz de representar tildes. Para comprobar cambios: editá, guardá, abrí el archivo apropiado en el navegador y recargá. Si no cambia, comprobá nombre completo, carpeta y pestaña antes de modificar el contenido.

## Ejemplo de la clase

```text
mi-tienda/
  index.html
  css/
    estilos.css
  imagenes/
    producto.png
```

[Abrir el fragmento como archivo](fragmentos/clase_02.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

index.html está en la raíz de mi-tienda. Para referirse a la imagen desde ese archivo, la ruta relativa es imagenes/producto.png. Desde css/estilos.css, la misma imagen está un nivel arriba: ../imagenes/producto.png. Los dos puntos indican subir una carpeta. Para practicar, creá una carpeta nueva para tus ejercicios y archivos vacíos con esos nombres; todavía no hace falta completar su contenido.

## Cambiar una decisión y explorar un límite

Mové contacto.html a paginas/ayuda/contacto.html: el enlace desde la raíz pasa a paginas/ayuda/contacto.html y el regreso a ../../index.html. En un servidor, mayúsculas y minúsculas pueden distinguir archivos aunque Windows tolere la diferencia. Usá nombres consistentes y evitá rutas de tu usuario.

## Confusión que conviene evitar

Guardar index.html.txt por tener ocultas las extensiones: el navegador puede tratarlo como texto. Verificá el nombre completo.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_01.md) · [Clase siguiente](../00_Fundamentos/CLASE_03.md)
