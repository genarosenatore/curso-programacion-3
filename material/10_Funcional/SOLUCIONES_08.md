# Soluciones 10.08 · Práctica: consultas sobre productos y facturas

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

totales.entrySet().stream().filter(e->e.getValue()>40000).map(Map.Entry::getKey).toList(). Con los datos originales devuelve Libros. Si añadís Útiles por 20000, su total será 50000 y también aparecerá.

## 2 y 3. Resolver y justificar las decisiones

Útiles y Libros quedan 50000 y ambas se seleccionan. Filtrar antes descartaría las tres ventas de Útiles y perdería esa categoría. Una categoría de 40000 exactos no entra con >; vacío produce mapa y selección vacíos. summingLong permite acumular un rango mayor y devuelve Long, pero conserva agrupación y condición. No reemplaza decidir unidades ni controlar el rango total esperado.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
