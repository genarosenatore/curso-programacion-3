# Soluciones 13.02 · Selección, proyecciones y filtros

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

Si numero es Long e importeTotal double, un constructor FacturaResumen(Long numero,double total) es compatible. JPQL: select new curso.FacturaResumen(f.numero,f.importeTotal) from FacturaVenta f. Verificá el tipo del atributo en tu entidad antes de copiarlo.

## 2 y 3. Resolver y justificar las decisiones

La proyección es `select f.numero,f.importeTotal from FacturaVenta f order by f.numero`; posición0 Long y1 Double al envolver double. La variante `select new curso.FacturaResumen(f.numero,f.importeTotal) from FacturaVenta f where f.estado=:estado` construye DTO. Cambiar sus valores no actualiza la entidad. Con BigDecimal en origen el constructor debe admitirlo y conservar su política de precisión; no se convierte por un nombre semejante.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
