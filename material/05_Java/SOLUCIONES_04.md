# Soluciones 05.04 · Clases, objetos, atributos y constructores

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

Producto a=new Producto("Cuaderno",200000); Producto b=new Producto("Lapicera",80000);. Comparten atributos definidos por la clase y tienen valores distintos. a.nombre y b.nombre leen estados diferentes.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

p referencia una instancia de Producto. this.nombre recibe el parámetro nombre. Otro new construye otro objeto con su propio estado. Usamos centavos para que el importe del ejemplo sea entero; 200000 centavos representan 2000 unidades monetarias.

## 3. Qué conviene corregir

La confusión a evitar es: Agregar void al constructor y convertirlo accidentalmente en un método.

Una clase define atributos y comportamiento; un objeto es una instancia concreta. El constructor inicializa una instancia y tiene el mismo nombre de la clase sin tipo de retorno.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
