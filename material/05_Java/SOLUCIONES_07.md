# Soluciones 05.07 · Herencia, composición y clases abstractas

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Composición: un cliente tiene un domicilio. class Cliente { private Domicilio domicilio; }. Heredar de Domicilio implicaría tratar al cliente como domicilio, lo que no representa el problema.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Efectivo es un MedioPago. Pedido tiene un MedioPago mediante composición. Podemos agregar otro medio sin convertir Pedido en una subclase de cada opción. El campo final fija su referencia después del constructor, no garantiza que el objeto referenciado sea inmutable.

## 3. Qué conviene corregir

La confusión a evitar es: Construir jerarquías solo porque dos clases comparten algunos atributos.

La herencia expresa una relación de tipo: una clase especializada extiende otra. La composición expresa que un objeto contiene o utiliza otro.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
