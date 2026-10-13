# Clase 02.05 · Display, visibilidad y posicionamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_04.md) · [Clase siguiente](../02_CSS/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **display, visibilidad y posicionamiento**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

display controla el tipo de caja y su participación en el diseño. block suele ocupar el ancho disponible; inline fluye con el texto y no admite dimensiones como un bloque; inline-block combina flujo en línea y dimensiones. display:none elimina la caja del diseño; visibility:hidden conserva su espacio.

position:relative mantiene el espacio original y permite desplazamiento visual; absolute sale del flujo y se posiciona respecto del ancestro que establece su referencia; fixed suele fijarse al viewport; sticky combina flujo y adherencia con un umbral. Usaremos cada uno cuando el comportamiento lo requiera.

## Ejemplo

```css
.tarjeta { position: relative; padding: 1rem; }
.etiqueta { position: absolute; top: .5rem; right: .5rem; }
.oculto { display: none; }
```

[Abrir el fragmento como archivo](fragmentos/clase_05.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

La tarjeta crea la referencia para ubicar etiqueta en su esquina. Al ser absoluta, la etiqueta no reserva espacio como un hijo normal; el contenido podría quedar debajo si no se prevé. La clase oculto hace desaparecer un elemento del diseño. Un menú completo no debería posicionarse con coordenadas rígidas para cada pantalla.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué diferencia visual hay entre ocultar una tarjeta con display:none y con visibility:hidden.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Usar position:absolute para todo y perder el flujo adaptable de la página.

## Resumen para repasar

display controla el tipo de caja y su participación en el diseño. block suele ocupar el ancho disponible; inline fluye con el texto y no admite dimensiones como un bloque; inline-block combina flujo en línea y dimensiones.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_04.md) · [Clase siguiente](../02_CSS/CLASE_06.md)
