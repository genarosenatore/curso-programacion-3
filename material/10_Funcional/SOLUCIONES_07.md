# Soluciones 10.07 · Agrupaciones y Optional

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

nombres.stream().filter(n->!n.isEmpty()).collect(groupingBy(n->n.substring(0,1),counting())). Con Ana, Abel y Eva da A=2, E=1. La decisión de excluir vacíos debe ser explícita.

## 2 y 3. Resolver y justificar las decisiones

`filter(n->!n.isEmpty()).collect(groupingBy(n->n.substring(0,1),counting()))` produce A=2,E=1 con esos datos. La búsqueda Z usa findFirst().orElse("Sin coincidencia"). Si construir el mensaje implica una función, orElse la llama siempre para preparar el argumento; orElseGet(()->crearMensaje()) la llama solo si falta. length clasifica por tamaño del texto; no consulta su inicial.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
