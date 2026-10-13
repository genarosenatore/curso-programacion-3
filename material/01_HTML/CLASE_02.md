# Clase 01.02 · Encabezados, párrafos, listas y caracteres especiales

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_01.md) · [Clase siguiente](../01_HTML/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **encabezados, párrafos, listas y caracteres especiales**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Los encabezados h1 a h6 expresan una jerarquía. No los elijas por el tamaño visual: más adelante lo cambiaremos con CSS. Un párrafo usa p. Una lista sin orden usa ul y una lista numerada usa ol; cada ítem usa li. strong señala importancia y em énfasis.

El navegador normalmente colapsa espacios y saltos de línea del código fuente. Para separar párrafos creá elementos p. Una entidad representa un carácter que podría confundirse con el marcado: &lt; muestra < y &amp; muestra &.

## Ejemplo

```html
<h1>Catálogo</h1>
<h2>Útiles escolares</h2>
<p>Elegí los materiales que necesitás.</p>
<ul>
  <li>Cuaderno</li>
  <li>Lapicera</li>
</ul>
<p><strong>Importante:</strong> los precios incluyen IVA.</p>
<p>Ejemplo de etiqueta: &lt;p&gt;</p>
```

[Abrir el fragmento como archivo](fragmentos/clase_02.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

Catálogo es el tema principal y Útiles escolares una sección. La lista agrupa elementos del mismo tipo. El texto con strong destaca una advertencia semánticamente. Las entidades hacen que la etiqueta de ejemplo aparezca como texto, sin crear un nuevo párrafo. Para una receta con pasos, ol expresa que el orden importa.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Escribí una página con un h1, dos secciones h2 y una lista ordenada de tres pasos para hacer una compra.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Saltar de h1 a h5 solo para obtener letra pequeña.

## Resumen para repasar

Los encabezados h1 a h6 expresan una jerarquía. No los elijas por el tamaño visual: más adelante lo cambiaremos con CSS.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_01.md) · [Clase siguiente](../01_HTML/CLASE_03.md)
