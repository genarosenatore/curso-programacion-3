# Soluciones 05.10 · Paquetes, dependencias y estructura de proyecto

[Clase](CLASE_10.md) · [Ejercicios](EJERCICIOS_10.md)

## 1. Una solución explicada

Colocá los modelos en src/tienda/modelo y escribí package tienda.modelo. Inicio en src/tienda con package tienda importa esos modelos. En la raíz, compilá indicando el destino de clases y ejecutá el nombre cualificado tienda.Inicio si usás consola.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La clase pública coincide con Producto.java. Si otra clase está en otro paquete, debe poder acceder al tipo y métodos necesarios. En proyectos Maven, la raíz de código suele ser src/main/java; dentro se ubica tienda/Producto.java. El prefijo de carpeta no forma parte del nombre del paquete.

## 3. Qué conviene corregir

La confusión a evitar es: Editar .class en lugar de .java o confundir una carpeta de compilados con código fuente.

Un paquete organiza clases y evita conflictos de nombres. La declaración package corresponde a su ubicación de código dentro del proyecto.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
