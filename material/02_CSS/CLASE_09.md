# Clase 02.09 · BEM y organización de estilos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_08.md) · [Clase siguiente](../02_CSS/CLASE_10.md)

## Qué vas a aprender

Vamos a trabajar **bem y organización de estilos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

BEM es una convención de nombres para clases: bloque, elemento y modificador. Un bloque es un componente independiente, como tarjeta. Un elemento pertenece a él: tarjeta__titulo. Un modificador expresa una variante: tarjeta--agotada.

La convención no agrega funciones al navegador. Su valor es hacer entendibles las responsabilidades y reducir selectores que dependen demasiado de la estructura. Un modificador se añade a la clase base y puede coexistir con otros.

## Ejemplo

```css
.tarjeta { border: 1px solid #ccc; padding: 1rem; }
.tarjeta__titulo { margin-top: 0; }
.tarjeta--agotada { opacity: .6; }
/* HTML: <article class="tarjeta tarjeta--agotada">...</article> */
```

[Abrir el fragmento como archivo](fragmentos/clase_09.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

tarjeta mantiene el estilo común. tarjeta--agotada cambia una variante. El título puede moverse dentro de la tarjeta sin requerir un selector profundo como main section article div h3. Usá nombres que describan función en lugar del color actual.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Nombrá las clases de un carrito con título, total y una variante vacía.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir BEM con una librería que hay que instalar.

## Resumen para repasar

BEM es una convención de nombres para clases: bloque, elemento y modificador. Un bloque es un componente independiente, como tarjeta.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_08.md) · [Clase siguiente](../02_CSS/CLASE_10.md)
