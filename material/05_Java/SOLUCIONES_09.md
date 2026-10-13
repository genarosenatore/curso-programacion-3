# Soluciones 05.09 · Excepciones y manejo de errores

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

"3" da 3. "3.5" y "abc" producen NumberFormatException. Después de convertir, todavía debemos validar que 3 sea una cantidad aceptable según el negocio.

## 2 y 3. Resolver y justificar las decisiones

"3" llega al println con 3; los otros dos pasan al catch sin imprimir cantidad. Tras convertir, `if(cantidad<=0) throw new IllegalArgumentException("Cantidad positiva requerida");` diferencia -1 de abc. Capturá NumberFormatException primero porque hereda de IllegalArgumentException; si capturás su base antes, el específico queda inalcanzable. El stock debe permanecer anterior al rechazo, validando antes de la resta.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
