# Clase 01.03 · Enlaces, rutas e imágenes con texto alternativo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_02.md) · [Clase siguiente](../01_HTML/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **enlaces, rutas e imágenes con texto alternativo**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un enlace a utiliza href para indicar su destino. Puede apuntar a otra página, una dirección externa o una parte del mismo documento. Una ruta relativa se interpreta desde la ubicación de la página. Una imagen usa src para su archivo y alt para una alternativa textual significativa.

El texto del enlace debería explicar adónde lleva. El alt describe la información que aporta una imagen; una imagen puramente decorativa puede usar alt="". No todas las imágenes necesitan repetir su nombre de archivo ni todo su aspecto visual.

## Ejemplo

```html
<a href="paginas/contacto.html">Contactar con la tienda</a>
<a href="#catalogo">Ir al catálogo</a>
<a href="https://www.utn.edu.ar/" target="_blank" rel="noopener">UTN</a>
<h2 id="catalogo">Catálogo</h2>
<img src="imagenes/cuaderno.svg" alt="Cuaderno azul con espiral" width="240">
```

[Abrir el fragmento como archivo](fragmentos/clase_03.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

El primer enlace busca la subcarpeta paginas; el segundo busca el elemento con id catalogo en esta página. target="_blank" solicita otro contexto, normalmente una pestaña. Para que la imagen funcione debe existir ese archivo: en los ejemplos ejecutables del curso se incluye una imagen local. El id debe ser único en la página.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá un enlace a ../index.html desde paginas/contacto.html y explicá qué significa ../. Elegí un alt para una foto informativa de un producto.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir una ruta que solo funciona en tu computadora, como C:/Users/... en un sitio compartido.

## Resumen para repasar

Un enlace a utiliza href para indicar su destino. Puede apuntar a otra página, una dirección externa o una parte del mismo documento.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_02.md) · [Clase siguiente](../01_HTML/CLASE_04.md)
