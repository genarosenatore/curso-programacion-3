# Soluciones 02.04 · Modelo de caja: contenido, padding, border y margin

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

content-box: 200 + 20 + 2 = 222px sin margen. border-box: ancho exterior 200px y contenido 178px. Una regla global útil es *, *::before, *::after { box-sizing: border-box; }.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La caja de borde mide 240px. El contenido disponible mide 240 - 32 - 4 = 204px. El margen queda por fuera. Si cambiamos a content-box, el borde exterior mide 276px. Observá estas zonas en el panel de caja del navegador.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar margin cuando lo que se necesita es separar el texto del borde interior.

Cada elemento tiene una caja: contenido, padding, border y margin. Padding crea espacio interior; margin separación exterior.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
