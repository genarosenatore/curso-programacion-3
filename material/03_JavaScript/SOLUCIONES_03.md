# Soluciones 03.03 · Condiciones y decisiones

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

if(stock===0){estado="agotado";} else if(stock<=3){estado="bajo";} else{estado="disponible";}. Antes, validá que stock sea entero no negativo si proviene de entrada. Probá 0, 1, 3 y 4.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La condición es verdadera exactamente en 10000, por eso el envío es cero. Con 9999 el envío sería 500. let envio permite asignar en cualquiera de los bloques y usar después el resultado. Cada ejecución elige solo un bloque de este if/else.

## 3. Qué conviene corregir

La confusión a evitar es: Usar = dentro de la condición cuando querías comparar con ===.

Una condición elige un bloque de instrucciones. if ejecuta cuando la condición es verdadera; else cubre el otro caso; else if prueba otra posibilidad.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
