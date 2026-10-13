# Soluciones 10.01 · Interfaces funcionales y lambdas

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Operacion multiplicar=(a,b)->a*b; Operacion mayor=(a,b)->Math.max(a,b);. Probá (2,3): 6 y 3. Las operaciones no necesitan modificar variables externas.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La variable sumar contiene una implementación de Operacion y devuelve 5. El compilador infiere tipos desde el contrato. Para varias instrucciones, usá llaves y return si corresponde. Capturar una variable local exige que sea final o efectivamente final.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar estado compartido dentro de una lambda sin reconocer sus efectos secundarios.

Una interface funcional tiene un único método abstracto relevante para su contrato y puede ser implementada con una lambda. @FunctionalInterface pide al compilador verificarlo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
