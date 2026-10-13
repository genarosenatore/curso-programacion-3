# Soluciones 10.06 · reduce y collect

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

cantidades.stream().reduce(1,(a,b)->a*b) devuelve 24. Para una lista vacía devuelve 1, consistente con la identidad matemática elegida; documentá si el negocio espera otro significado.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Ambas sumas dan 9. Si la lista está vacía, ambas dan cero. mapToInt transforma los wrappers en valores int. La suma no cambia los elementos originales. Para totales grandes elegí un tipo que no desborde y para dinero aplicá una política de precisión adecuada.

## 3. Qué conviene corregir

La confusión a evitar es: Usar cero como inicio de una reducción de multiplicación.

reduce combina elementos hasta obtener un resultado acumulado. Una identidad expresa el valor neutral: cero para suma y uno para multiplicación.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
