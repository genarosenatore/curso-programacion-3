# Soluciones 05.11 · Práctica: productos y clientes

[Clase](CLASE_11.md) · [Ejercicios](EJERCICIOS_11.md)

## 1. Una solución explicada

La compra de 2 sobre stock 5 reduce a 3. Una compra de 6 se rechaza y conserva 5. Cantidad cero se rechaza. subtotalCentavos devuelve precio*cantidad con validación y puede usar Math.multiplyExact para detectar un desborde de int. El ejemplo completo de Java incluye estos casos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El resultado esperado es stock 3 y subtotal 400000 centavos. La clase de ejemplo completa incluye constructor y métodos. Cada regla se aplica antes de modificar. Una clase pequeña puede evolucionar después a DTO y entidad, pero no hacemos esa mezcla en la primera práctica.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir un objeto de dominio con una fila de base de datos antes de estudiar persistencia.

Una práctica orientada a objetos empieza por las responsabilidades. Producto conoce su precio y stock; Cliente su identificación; un cálculo puede recibir productos y cantidades sin modificar indebidamente ambos objetos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
