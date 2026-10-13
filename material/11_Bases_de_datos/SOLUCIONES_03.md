# Soluciones 11.03 · Relaciones uno a uno, uno a muchos y muchos a muchos

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

autor, libro y autor_libro(autor_id,libro_id) con clave primaria compuesta y ambas claves foráneas. Un par no debería repetirse. En JPA esa relación puede modelarse de forma distinta según si la asociación tiene datos propios.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Cada detalle referencia una factura y un producto. Varias filas pueden compartir factura_id, representando varios renglones de una factura. Las tablas factura y producto deben existir; este fragmento complementa el esquema de la unidad. No hay una columna lista_de_detalles en factura.

## 3. Qué conviene corregir

La confusión a evitar es: Poner una clave foránea de libro en autor y perder la posibilidad de varios libros.

Una relación uno a muchos permite que una fila tenga varias relacionadas: categoría y productos. Se representa normalmente con la clave foránea en el lado muchos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
