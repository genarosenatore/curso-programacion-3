# Soluciones 01.04 · Estructura semántica: header, nav, main, section y footer

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Usá header para el nombre del blog, nav para los enlaces, main con dos article que tengan h2 y párrafos, y footer para contacto. Si agrupás artículos por tema, agregá section con su encabezado.

## 2 y 3. Resolver y justificar las decisiones

La estructura del body es:

```html
<header><h1>Biblioteca</h1></header>
<nav><a href="#noticias">Noticias</a></nav>
<main>
  <section id="noticias">
    <h2>Noticias de la biblioteca</h2>
    <article><h3>Nuevos libros</h3><p>Llegaron nuevas lecturas.</p></article>
    <article><h3>Horario</h3><p>Abrimos por la mañana.</p></article>
  </section>
</main>
<footer><p>Contacto: biblioteca@example.com</p></footer>
```

Al agregar el título de sección, los artículos pasan a h3 porque pertenecen a ese tema. En el ejercicio simple, sin section titulada, podían usar h2. id enlaza la referencia de navegación con la región; la etiqueta semántica por sí sola no crea ese enlace.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
