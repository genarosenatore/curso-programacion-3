# Soluciones 05.06 · static, referencias y null

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

En la asignación, dos referencias apuntan a una misma instancia. Con new, se crea otra instancia independiente y se ejecuta nuevamente el constructor. Cambiar b.valor en el primer caso afecta lo observado mediante a; en el segundo, no.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra 7 y 1. b apunta al mismo objeto que a; no hubo un segundo constructor. creados se consulta por el nombre de la clase porque es compartido. Si creamos otro new Contador, hay otro valor de instancia y creados aumenta a 2.

## 3. Qué conviene corregir

La confusión a evitar es: Usar null como si fuera un objeto vacío con valores por defecto.

Una referencia permite acceder a un objeto. Asignarla a otra variable no copia el objeto.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
