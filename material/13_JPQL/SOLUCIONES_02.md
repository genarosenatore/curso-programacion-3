# Soluciones 13.02 · Selección, proyecciones y filtros

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

Si numeroFactura es Long e importeTotal double, un constructor FacturaResumen(Long numero,double total) es compatible. JPQL: select new curso.FacturaResumen(f.numeroFactura,f.importeTotal) from FacturaVenta f. Verificá el tipo del atributo en tu entidad antes de copiarlo.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Cada fila contiene tres valores en ese orden, no una FacturaVenta completa. Para Object[], documentá índices o preferí un DTO. Una variante sería select new curso.FacturaResumen(f.numeroFactura,f.importeTotal), con ese tipo definido y constructor compatible.

## 3. Qué conviene corregir

La confusión a evitar es: Usar FacturaVenta.class como resultado cuando se seleccionan tres valores escalares.

Una proyección selecciona datos concretos en lugar de toda la entidad. Varias expresiones pueden producir Object[]; una expresión de constructor permite crear un DTO si existe un constructor compatible.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
