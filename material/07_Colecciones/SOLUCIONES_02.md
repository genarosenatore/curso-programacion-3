# Soluciones 07.02 · ArrayList y recorrido de listas

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

nombres.remove("Luis"); nombres.add("Omar");. Queda Anita, Eva, Omar con tamaño 3. Comprobá remove con un nombre inexistente: devuelve false y conserva la lista.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La lista queda Anita, Luis, Eva y get(2) devuelve Eva. set no agrega al final: necesita una posición existente. size es un método en List, distinto de length de un array. El orden de la lista corresponde a la secuencia de inserción y cambios.

## 3. Qué conviene corregir

La confusión a evitar es: Intentar agregar a List.of y no comprender UnsupportedOperationException.

ArrayList crece a medida que agregamos elementos y permite acceso por índice. add añade, get consulta, set reemplaza y size cuenta.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
