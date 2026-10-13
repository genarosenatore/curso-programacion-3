# Soluciones 06.04 · hashCode y relación con equals

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

Podrían ser iguales según equals y producir hashes diferentes, rompiendo el contrato. Un HashSet podría no detectar el duplicado. Calculá el hash a partir del código estable usado en equals.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Ambas líneas muestran true. La segunda es una consecuencia de la regla correcta, pero el mismo hash por sí solo no demuestra que sean iguales. La colección decide igualdad usando equals, además de su organización por hash.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que hashes distintos son el único caso importante y que no pueden existir colisiones.

hashCode devuelve un entero usado para distribuir búsquedas en colecciones basadas en hash. Si equals considera iguales dos objetos, deben tener el mismo hashCode.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
