# Soluciones 12.09 · Prácticas de JPA y modelo FacturaArca

[Clase](CLASE_09.md) · [Ejercicios](EJERCICIOS_09.md)

## 1. Una solución explicada

Factura→Cliente suele ser ManyToOne, propiedad de Factura, sin remove en cascada. Factura→Detalles es OneToMany con mappedBy factura; Detalle→Factura es propietario. La política de anulación puede conservar ambos. Comprobá la consigna completa para nombres y requisitos concretos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El fragmento expresa una estrategia y no un modelo completo. Las entidades del campus están en el proyecto contable descomprimido. Consultá sus atributos para adaptar nombres. Primero practicá con Producto/Categoria del proyecto ejecutable de apoyo y después ampliá a la consigna.

## 3. Qué conviene corregir

La confusión a evitar es: Dar por terminado el mapeo sin guardar, recuperar y comparar las relaciones.

FacturaArca amplía el modelo con cliente, condición de IVA, punto de venta, moneda, artículos y detalles. Vamos a trasladar el diagrama y las reglas a entidades antes de realizar consultas avanzadas.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
