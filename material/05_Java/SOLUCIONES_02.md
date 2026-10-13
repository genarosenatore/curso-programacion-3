# Soluciones 05.02 · Variables, tipos, operadores y consola

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

int a=5,b=6,c=8; double promedio=(a+b+c)/3.0; System.out.println(promedio);. Da aproximadamente 6.3333. El decimal no se recupera convirtiendo a double después de una división entera ya realizada.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Este fragmento va dentro de main. Muestra Lapicera: 2400.0, 2 y 2.5. La multiplicación se resuelve antes de concatenar el resultado al texto. Para comparar contenido de strings usamos equals, no ==, que compara referencias.

## 3. Qué conviene corregir

La confusión a evitar es: Asumir que 5/2 produce 2.5 porque la variable receptora es double.

Java distingue tipos primitivos, como int, double y boolean, y referencias, como String. Cada variable tiene un tipo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
