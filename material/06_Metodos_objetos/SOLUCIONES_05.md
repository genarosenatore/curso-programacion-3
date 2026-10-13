# Soluciones 06.05 · Práctica: objetos repetidos y claves estables

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

catalogo.contains(new Producto("P01")) true y con P03 false. La tabla de contratos debe pasar y los dos P01 tener el mismo hash. El ejemplo de la unidad permite ejecutar estas comprobaciones.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El conjunto debe tener tamaño 2 con la clase de igualdad anterior. No garantiza un orden de impresión. Para comprobarlo, buscá por igualdad con otro new Producto("P01"). La relación entre Set y sus reglas se desarrolla en la siguiente unidad.

## 3. Qué conviene corregir

La confusión a evitar es: Modificar la clave después de insertar y atribuir a la colección la búsqueda fallida.

Vamos a comprobar representación, igualdad y hash como un conjunto. Un catálogo puede recibir el mismo producto varias veces y necesita decidir si es duplicado.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
