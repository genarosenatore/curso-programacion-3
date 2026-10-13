# Soluciones 06.01 · Identidad de referencias y significado de igualdad

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Si el código estable identifica el producto, ambos representan la misma identidad del dominio aunque el precio cambie. Esa es una decisión del modelo; hay que documentarla y aplicarla de forma coherente con hashCode.

## 2 y 3. Resolver y justificar las decisiones

Dos new: == false y equals true. Con alias: ambos true. Libro de catálogo puede igualarse por código de edición; un ejemplar físico debe distinguirse por inventario aunque ambos correspondan a esa edición. El nombre por sí solo no decide quién o qué es el objeto. Definir el significado evita implementar una comparación que deduplique datos distintos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
