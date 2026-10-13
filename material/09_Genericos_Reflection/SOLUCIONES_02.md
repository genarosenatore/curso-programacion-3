# Soluciones 09.02 · Límites de tipos y wildcards

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

El compilador desconoce el subtipo concreto capturado. Insertar un Double rompería una lista de Integer. Si una operación consume Integer, List<? super Integer> permite añadirlo y leer como Object.

## 2 y 3. Resolver y justificar las decisiones

Si se permitiera la asignación, agregar 2.5 a través de List<Number> introduciría Double en una lista que promete Integer. sumar da 3.0, 4.0 y 0.0. `static void agregarUno(List<? super Integer> destino){destino.add(1);}` puede recibir List<Integer>, List<Number> o List<Object>. Leer esa vista devuelve algo que solo se sabe Object; no asumas que todos sus elementos sean Integer.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
