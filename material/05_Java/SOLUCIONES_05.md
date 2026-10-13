# Soluciones 05.05 · Encapsulamiento, getters y setters

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

void descontarStock(int cantidad){if(cantidad<=0||cantidad>stock)throw new IllegalArgumentException("Cantidad inválida");stock-=cantidad;}. Con stock 5 y cantidad 2 queda 3; con 6 se rechaza y conserva 5.

## 2 y 3. Resolver y justificar las decisiones

descontarStock comprueba cantidad<=0 || cantidad>stock y lanza antes de `stock -= cantidad;`. Libro sigue la misma idea: constructor rechaza ejemplares<0, prestarUno rechaza ejemplares==0 y después decrementa. El primer préstamo deja cero y el segundo no debe dejar -1. Un método con intención conserva la regla sin permitir números arbitrarios desde afuera; el setter no hace falta para esta operación.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
