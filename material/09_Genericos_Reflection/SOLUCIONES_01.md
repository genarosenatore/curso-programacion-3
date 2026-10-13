# Soluciones 09.01 · Clases y métodos genéricos

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Caja<String> texto=new Caja<>("Hola"); Caja<Integer> numero=new Caja<>(7);. Caja<int> no compila. El tipo de obtener conserva String o Integer según cada variable.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

obtener devuelve String cuando la variable es Caja<String>, sin una conversión manual. <> permite inferir el tipo de la construcción. El método identidad relaciona el tipo recibido con el devuelto. No usar Caja sin parámetro ayuda a evitar tipos crudos y errores ocultos.

## 3. Qué conviene corregir

La confusión a evitar es: Usar Object y conversiones por todas partes cuando un genérico expresa la relación.

Un parámetro de tipo permite escribir una clase sin fijar un único tipo de contenido. T es un nombre convencional, no una palabra especial.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
