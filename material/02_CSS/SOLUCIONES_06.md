# Soluciones 02.06 · Flexbox

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Usá productos como contenedor y producto en cada tarjeta. Probá 1200px y 400px de ancho. Si aparecen desbordes por palabras largas, añadí overflow-wrap:anywhere según corresponda y revisá min-width en los hijos.

## 2 y 3. Resolver y justificar las decisiones

`.productos { display:flex; flex-wrap:wrap; gap:1rem; } .producto { flex:1 1 12rem; }` resuelve la primera parte. La barra usa display:flex, justify-content:space-between y align-items:center. Al pasar a column, el eje principal se vuelve vertical: sin altura adicional puede no sobrar espacio para distribuir. Flex aplicado dentro de tarjeta organiza su título y enlace, pero el catálogo requiere su propio display:flex.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
