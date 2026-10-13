# Soluciones 07.04 · HashMap: claves y valores

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

for(String codigo:List.of("A","B","A")){conteos.put(codigo,conteos.getOrDefault(codigo,0)+1);}. Resultado A=2 y B=1. Una solución alternativa usa merge(codigo,1,Integer::sum).

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El valor de P01 queda 3. P02 no existe y obtiene cero mediante getOrDefault. var permite inferir el tipo de una variable local; no vuelve dinámico el lenguaje. entrySet evita buscar el valor nuevamente para cada clave.

## 3. Qué conviene corregir

La confusión a evitar es: Reemplazar siempre por 1 y perder el conteo acumulado.

HashMap relaciona claves únicas con valores. put asocia y puede reemplazar; get consulta; containsKey diferencia una clave ausente de una cuyo valor es null.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
