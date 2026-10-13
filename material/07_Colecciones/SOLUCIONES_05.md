# Soluciones 07.05 · Iteradores, búsqueda y eliminación

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

numeros.removeIf(n->n<0);. Para [-2,0,4,-1] queda [0,4]. Comprobá una lista sin negativos y una vacía. Con un iterador, llamá iterator.remove después de next, no lista.remove.

## 2 y 3. Resolver y justificar las decisiones

`numeros.removeIf(n -> n < 0);` deja [0,4]; [] permanece []. El iterador usa hasNext, next y su remove cuando n<0. it.remove actúa sobre el último elemento que entregó next, no sobre un índice escrito aparte. Antes de next no hay un elemento actual válido, y repetir remove sin otro next viola su contrato.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
