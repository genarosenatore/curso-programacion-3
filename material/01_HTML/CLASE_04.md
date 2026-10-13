# Clase 01.04 · Estructura semántica: header, nav, main, section y footer

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_03.md) · [Clase siguiente](../01_HTML/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **estructura semántica: header, nav, main, section y footer**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Los elementos semánticos describen la función de una región. header presenta contenido introductorio; nav agrupa navegación; main contiene el contenido principal; footer información de cierre. section agrupa un tema y suele tener un encabezado; article representa contenido autónomo. div es un contenedor genérico cuando no corresponde uno más específico.

La semántica ayuda a leer el documento y a navegarlo con tecnologías de asistencia. Un elemento semántico no define por sí mismo columnas, colores ni posiciones: eso será CSS.

## Ejemplo

```html
<header><h1>Mi tienda</h1></header>
<nav><a href="#productos">Productos</a></nav>
<main>
  <section id="productos">
    <h2>Productos disponibles</h2>
    <article><h3>Cuaderno</h3><p>80 hojas.</p></article>
  </section>
</main>
<footer><p>Contacto: tienda@example.com</p></footer>
```

[Abrir el fragmento como archivo](fragmentos/clase_04.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

main delimita la parte central. La sección tiene un título que explica su tema. El producto se presenta como una pieza autónoma mediante article. Los encabezados respetan la jerarquía. Si mañana cambiamos el diseño, estas responsabilidades siguen siendo las mismas.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Organizá una página de blog con presentación, navegación, dos artículos y pie de página.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Elegir section solo para aplicar un fondo sin que exista una agrupación temática.

## Resumen para repasar

Los elementos semánticos describen la función de una región. header presenta contenido introductorio; nav agrupa navegación; main contiene el contenido principal; footer información de cierre.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_03.md) · [Clase siguiente](../01_HTML/CLASE_05.md)
