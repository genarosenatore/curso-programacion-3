# Soluciones 11.04 · SELECT, WHERE y ORDER BY

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

SELECT id,nombre,precio_centavos FROM producto WHERE precio_centavos BETWEEN 80000 AND 200000 ORDER BY nombre,id;. Añadir id hace estable el desempate de nombres iguales. Si querés límites exclusivos, usá > y <.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El filtro conserva productos cuyo precio sea al menos 1000 unidades, porque almacenamos centavos. El orden principal es precio descendente y el id desempata. El resultado no incluye productos por debajo del límite, aunque estén disponibles.

## 3. Qué conviene corregir

La confusión a evitar es: Esperar que WHERE columna=NULL encuentre filas sin valor.

SELECT elige columnas, FROM el origen, WHERE filtra filas y ORDER BY ordena. No existe orden garantizado sin ORDER BY.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
