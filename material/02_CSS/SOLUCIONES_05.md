# Soluciones 02.05 · Display, visibilidad y posicionamiento

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

display:none quita la caja y los vecinos reorganizan el espacio. visibility:hidden deja un hueco. Elegí según la interacción: para retirar un resultado de una lista normalmente se usa display:none.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La tarjeta crea la referencia para ubicar etiqueta en su esquina. Al ser absoluta, la etiqueta no reserva espacio como un hijo normal; el contenido podría quedar debajo si no se prevé. La clase oculto hace desaparecer un elemento del diseño. Un menú completo no debería posicionarse con coordenadas rígidas para cada pantalla.

## 3. Qué conviene corregir

La confusión a evitar es: Usar position:absolute para todo y perder el flujo adaptable de la página.

display controla el tipo de caja y su participación en el diseño. block suele ocupar el ancho disponible; inline fluye con el texto y no admite dimensiones como un bloque; inline-block combina flujo en línea y dimensiones.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
