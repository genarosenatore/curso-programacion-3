# Soluciones 02.07 · Grid

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Base: grid-template-columns:1fr. Dentro de @media (min-width:40rem): grid-template-columns:repeat(2,1fr). gap:1rem separa celdas. No necesitás cambiar el HTML.

## 2 y 3. Resolver y justificar las decisiones

640 − 16 = 624px; dos columnas reciben 312px en el caso simple. Dos columnas fijas se mantienen como dos, aunque el contenido necesite otras decisiones. auto-fit puede reducirlas a una. min permite que el mínimo no supere el contenedor cuando es menor que 14rem. Para pedir exactamente dos columnas solo desde cierto ancho, necesitás una condición de medios, que aprenderemos en la clase siguiente; el ejercicio guiado original ofrece esa variante como adelanto identificado.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
