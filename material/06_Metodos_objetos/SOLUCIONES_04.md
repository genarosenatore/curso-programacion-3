# Soluciones 06.04 · hashCode y relación con equals

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Podrían ser iguales según equals y producir hashes diferentes, rompiendo el contrato. Un HashSet podría no detectar el duplicado. Calculá el hash a partir del código estable usado en equals.

## 2 y 3. Resolver y justificar las decisiones

Mismo hash no demuestra igualdad; hashes diferentes excluyen igualdad si el contrato está bien implementado. Hash por precio puede violarlo para dos códigos iguales. Hash constante permite colisiones y respeta la obligación pero distribuye mal. Usar el código estable mantiene ambas partes coherentes y evita que una mutación cambie la ubicación lógica tras insertar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
