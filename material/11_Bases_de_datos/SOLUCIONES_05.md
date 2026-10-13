# Soluciones 11.05 · INSERT, UPDATE y DELETE

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

UPDATE producto SET nombre='Cuaderno grande' WHERE id=1; SELECT id,nombre FROM producto WHERE id IN(1,2) ORDER BY id;. Solo 1 cambia. Las prácticas del archivo SQL se hacen en una base en memoria reconstruible.

## 2 y 3. Resolver y justificar las decisiones

`UPDATE producto SET nombre='Cuaderno grande' WHERE id=1;` solo cambia esa fila; consultá ids1 y2 con ORDER BY id. Para id10, el recorrido del ejemplo muestra creación, precio480000 y ausencia final. UPDATE de id999 no cambia filas; una clave foránea inválida o id repetido sí produce error. No confundas una operación sin objetivo con una modificación confirmada de un recurso existente.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
