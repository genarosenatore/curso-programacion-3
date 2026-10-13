# Soluciones 10.04 · Streams: origen, operaciones intermedias y terminales

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

numeros.stream().filter(n->n>0).count(). Origen: numeros; intermedia: filter; terminal: count. Para [-1,2,3] devuelve 2L, porque count retorna long.

## 2 y 3. Resolver y justificar las decisiones

Fuente numeros, intermedia filter, terminal count. El conteo es 2L y la lista [2,3]. Para ambas salidas, iniciá dos veces numeros.stream(). Vacía da 0L y []. La fuente conserva [-1,2,3] porque no se llama una operación que la modifique. No es equivalente a removeIf, que sí elimina de la colección.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
