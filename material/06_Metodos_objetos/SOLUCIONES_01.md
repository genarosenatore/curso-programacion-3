# Soluciones 06.01 · Identidad de referencias y significado de igualdad

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Si el código estable identifica el producto, ambos representan la misma identidad del dominio aunque el precio cambie. Esa es una decisión del modelo; hay que documentarla y aplicarla de forma coherente con hashCode.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra false y true: los dos new crean objetos diferentes con contenido igual. No generalices el equals de String a cualquier clase propia. Una clase de producto que todavía no lo implemente seguirá usando identidad.

## 3. Qué conviene corregir

La confusión a evitar es: Usar == para comparar el contenido de objetos o strings.

Identidad pregunta si dos referencias apuntan al mismo objeto; == responde eso para referencias. Igualdad pregunta si dos objetos representan el mismo valor según una regla definida por su clase.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
