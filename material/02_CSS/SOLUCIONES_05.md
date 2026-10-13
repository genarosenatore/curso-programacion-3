# Soluciones 02.05 · Display, visibilidad y posicionamiento

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

display:none quita la caja y los vecinos reorganizan el espacio. visibility:hidden deja un hueco. Elegí según la interacción: para retirar un resultado de una lista normalmente se usa display:none.

## 2 y 3. Resolver y justificar las decisiones

Con display:none, el segundo párrafo ocupa el espacio liberado; con visibility:hidden el primero mantiene su caja. La tarjeta usa position:relative y el distintivo position:absolute con top/right; reservá padding superior para el distintivo o ubicá título y distintivo con Flexbox. opacity:0 puede dejar el botón en el orden de foco, por lo que no basta para retirarlo de la interacción.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
