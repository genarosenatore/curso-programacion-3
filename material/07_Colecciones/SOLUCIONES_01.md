# Soluciones 07.01 · List, Set y Map: qué problema resuelve cada uno

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Receta: List por secuencia. Correos únicos: Set, con una política explícita de normalización. Precios por código: Map. Si los correos deben conservar orden de ingreso, LinkedHashSet puede ser adecuado.

## 2 y 3. Resolver y justificar las decisiones

Capítulos: List por posición y orden; códigos únicos: Set; ejemplares por código: Map. Para inscripción única y ordenada, LinkedHashSet satisface ambas necesidades. HashSet puede dar un orden que parece estable en un ejemplo pero no lo promete. No prepares una prueba que dependa de esa casualidad.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
