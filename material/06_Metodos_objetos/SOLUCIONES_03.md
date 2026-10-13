# Soluciones 06.03 · equals y su contrato

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

a.equals(a) true; a.equals(b) y b.equals(a) true; a.equals(c) false; a.equals(null) false. Para transitividad agregá otro P01 y comprobá las tres comparaciones. No modifiques el campo de identidad entre pruebas.

## 2 y 3. Resolver y justificar las decisiones

a.equals(a), a.equals(b), b.equals(a) y a.equals(tercerP01) dan true; a.equals(null) y a.equals(P02) false. Tres P01 cumplen la cadena transitiva porque su clave coincide. La distancia menor a diez acepta 0/8 y 8/16 pero no 0/16; esa regla sirve para proximidad, no para equals. Una comparación que depende de un orden de llamadas no es confiable para colecciones.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
