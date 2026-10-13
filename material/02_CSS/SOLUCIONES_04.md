# Soluciones 02.04 · Modelo de caja: contenido, padding, border y margin

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

content-box: 200 + 20 + 2 = 222px sin margen. border-box: ancho exterior 200px y contenido 178px. Una regla global útil es *, *::before, *::after { box-sizing: border-box; }.

## 2 y 3. Resolver y justificar las decisiones

Content-box: 180 + 24 + 4 = 208px hasta el borde; con margen horizontal son 228px. Border-box: 180px hasta el borde y 200px con margen; contenido 180 − 24 − 4 = 152px. Esa reducción puede crear más líneas de texto y aumentar altura, sin cambiar el ancho definido. No se elimina texto: la caja debe permitir crecer en alto.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
