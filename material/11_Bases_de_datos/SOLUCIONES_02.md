# Soluciones 11.02 · Claves primarias, foráneas y restricciones

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

El INSERT falla por integridad referencial. Primero se crea la categoría o se usa un id existente. No se resuelve escribiendo un nombre en el campo numérico. Al borrar una categoría, habrá que decidir una política para productos relacionados.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

producto.categoria_id debe apuntar a una categoría existente cuando no es null. Si permitimos null, un producto puede no tener categoría. La base comprueba la integridad de la referencia, no que el nombre tenga sentido para nuestro negocio. Para hacer obligatoria la relación añadí NOT NULL.

## 3. Qué conviene corregir

La confusión a evitar es: Desactivar restricciones para que una carga inválida "funcione".

Una clave primaria identifica una fila y no admite duplicados. Una clave foránea relaciona valores con otra tabla.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
