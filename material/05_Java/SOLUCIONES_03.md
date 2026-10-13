# Soluciones 05.03 · Condiciones, bucles, arrays y métodos

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

static int contarPositivos(int[] valores){int cantidad=0;for(int valor:valores){if(valor>0)cantidad++;}return cantidad;}. Con [-1,0,2,3] devuelve 2 y con [] cero.

## 2 y 3. Resolver y justificar las decisiones

contarPositivos inicializa cantidad=0 y aumenta si valor>0: devuelve 2 y 0. sumarMayores usa total=0, for(int valor:valores), if(valor>minimo) total+=valor, y return total después del bucle: devuelve 500. Ambos van fuera de main, dentro de la clase, y sus llamadas dentro de main. El código supone que valores no es null; documentar esa entrada evita confundirla con [].

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
