# Soluciones 10.04 · Streams: origen, operaciones intermedias y terminales

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

numeros.stream().filter(n->n>0).count(). Origen: numeros; intermedia: filter; terminal: count. Para [-1,2,3] devuelve 2L, porque count retorna long.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

stream crea el origen; filter es intermedia; toList es terminal y obtiene [Ana,Eva]. La lista original conserva los tres nombres. toList de Stream produce una lista no modificable; si necesitás editarla, elegí otra construcción explícita.

## 3. Qué conviene corregir

La confusión a evitar es: Guardar un Stream consumido y llamar a otra terminal sobre la misma instancia.

Un stream representa un recorrido de datos para procesarlos. Se construye desde una fuente, encadena operaciones intermedias y termina con una operación terminal.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
