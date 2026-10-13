# Soluciones 05.03 · Condiciones, bucles, arrays y métodos

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

static int contarPositivos(int[] valores){int cantidad=0;for(int valor:valores){if(valor>0)cantidad++;}return cantidad;}. Con [-1,0,2,3] devuelve 2 y con [] cero.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El método se escribe dentro de la clase, fuera de main. Recibe un array y devuelve 600 para los datos indicados. En un array vacío, el bucle no entra y devuelve cero. El ejemplo asume que valores no es null; más adelante decidiremos cómo representar o rechazar esa ausencia.

## 3. Qué conviene corregir

La confusión a evitar es: Poner un método dentro de otro método: en esta estructura Java no lo permite.

Java reutiliza condiciones y bucles, pero exige tipos y sintaxis propia. Un array tiene tamaño fijo y usa length sin paréntesis.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
