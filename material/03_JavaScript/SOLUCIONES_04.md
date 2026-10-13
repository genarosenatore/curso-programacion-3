# Soluciones 03.04 · Bucles y seguimiento paso a paso

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

Los parciales son 1, 3, 6, 10 y 15. Dos bucles anidados del 1 al 2 recorrerían cuatro pares: (1,1), (1,2), (2,1), (2,2). No confundas cantidad de iteraciones con valor final del contador.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra las parejas 1/1, 2/3 y 3/6. numero++ suma uno al contador al terminar cada iteración. total += numero equivale a total = total + numero. La cuarta comprobación pregunta si 4 <= 3; como es falsa, termina. El acumulador se declara fuera del bloque para conservar las sumas.

## 3. Qué conviene corregir

La confusión a evitar es: Reiniciar total en cero dentro de cada iteración.

Un bucle repite instrucciones. for reúne inicio, condición y actualización.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
