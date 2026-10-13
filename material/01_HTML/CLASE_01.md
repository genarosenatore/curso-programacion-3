# Clase 01.01 · Documento HTML: doctype, html, head y body

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **documento html: doctype, html, head y body**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un documento HTML contiene elementos. Una etiqueta de apertura, contenido y etiqueta de cierre forman muchos elementos: <p>Hola</p>. Los atributos aportan información dentro de la apertura. Algunos elementos, como img e input, no llevan etiqueta de cierre.

El doctype indica el modo de documento moderno. html contiene la página; head contiene metadatos y referencias; body contiene el contenido visible. lang informa el idioma a herramientas de accesibilidad. UTF-8 permite representar tildes y otros caracteres. El viewport ayuda al navegador móvil a usar el ancho del dispositivo.

## Ejemplo

```html
<!doctype html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Mi tienda</title>
</head>
<body>
  <h1>Mi tienda</h1>
  <p>Bienvenido a mi primera página.</p>
</body>
</html>
```

[Abrir el fragmento como archivo](fragmentos/clase_01.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

Guardá el ejemplo como index.html y abrilo con el navegador. El texto de title aparece en la pestaña; h1 es el título dentro de la página. La sangría facilita leer la estructura, aunque no crea la relación: esa relación la establecen las etiquetas. Editá un texto, guardá y recargá para comprobar la diferencia entre archivo y página mostrada.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá una página Biblioteca con un título de pestaña, un encabezado principal y un párrafo de presentación.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Colocar todo dentro de head: el contenido visible debe estar en body.

## Resumen para repasar

Un documento HTML contiene elementos. Una etiqueta de apertura, contenido y etiqueta de cierre forman muchos elementos: <p>Hola</p>.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_05.md) · [Clase siguiente](../01_HTML/CLASE_02.md)
