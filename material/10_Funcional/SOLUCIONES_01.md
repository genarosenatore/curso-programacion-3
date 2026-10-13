# Soluciones 10.01 · Interfaces funcionales y lambdas

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Operacion multiplicar=(a,b)->a*b; Operacion mayor=(a,b)->Math.max(a,b);. Probá (2,3): 6 y 3. Las operaciones no necesitan modificar variables externas.

## 2 y 3. Resolver y justificar las decisiones

multiplicar=(a,b)->a*b da 6; mayor=(a,b)->Math.max(a,b) da 3. restar=(a,b)->a-b da -1 con 2/3 y 1 con 3/2. Un acumulador exterior vuelve el resultado dependiente de llamadas anteriores y dificulta comprobarlo; aquí la operación solo necesita sus entradas y retorno.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
