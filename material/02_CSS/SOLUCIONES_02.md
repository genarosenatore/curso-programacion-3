# Soluciones 02.02 · Cascada, herencia y especificidad

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

Queda morado por el selector #mensaje, dentro de este escenario de reglas normales. Para un diseño mantenible, preferí clases y reglas sencillas en vez de acumular ids e !important.

## 2 y 3. Resolver y justificar las decisiones

El párrafo queda rojo: las clases superan a la etiqueta y la segunda clase aparece última. Sin reglas propias de color, hereda morado de body. No hereda margin: cada caja conserva sus reglas, incluidas las predeterminadas del navegador. Al restaurar p verde, el color se asigna al propio elemento, así que no necesita el heredado. El padre no es un selector más específico del párrafo.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
