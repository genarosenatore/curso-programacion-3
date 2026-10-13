# Soluciones 02.08 · Media queries y diseño adaptable

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

Una solución cambia a dos columnas desde 40rem cuando cada tarjeta sigue siendo legible. Comprobá 39rem y 41rem. La justificación debe referirse al espacio del contenido, no a la marca de un dispositivo.

## 2 y 3. Resolver y justificar las decisiones

`.catalogo { display:grid; grid-template-columns:1fr; gap:1rem; } @media (min-width:40rem) { .catalogo { grid-template-columns:repeat(2,1fr); } }`. Añadí `img { max-width:100%; height:auto; }`. El umbral habilita la declaración de columnas; no borra display o gap. Si un título no puede partirse, revisá sus palabras y overflow-wrap. La evidencia debe indicar ancho, zoom y comportamiento observado, no solo «se ve bien».

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
