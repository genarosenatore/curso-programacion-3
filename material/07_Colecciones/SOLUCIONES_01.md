# Soluciones 07.01 · List, Set y Map: qué problema resuelve cada uno

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Receta: List por secuencia. Correos únicos: Set, con una política explícita de normalización. Precios por código: Map. Si los correos deben conservar orden de ingreso, LinkedHashSet puede ser adecuado.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra 2 / 1. La lista conserva ambos; el conjunto usa igualdad de String para deduplicar. El mapa conserva el precio bajo la clave A. Una nueva llamada put con A reemplaza su valor anterior en lugar de crear otra clave.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que toda colección tiene posiciones numéricas como una lista.

List representa una secuencia que permite duplicados; Set un grupo sin duplicados según su regla; Map relaciona claves con valores y no es un subtipo de Collection. Usamos interfaces en variables e implementaciones concretas al construir: List<String> nombres = new ArrayList<>.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
