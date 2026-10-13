# Soluciones 10.03 · Referencias a métodos

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

Function<String,Integer> longitud=String::length;. Recibe un string y devuelve su longitud mediante boxing de int a Integer. No está contando elementos de una lista.

## 2 y 3. Resolver y justificar las decisiones

longitud.apply("Ana") da 3 y con "" da 0. `s -> s.toUpperCase(java.util.Locale.ROOT)` explicita una política independiente del idioma predeterminado del equipo. La referencia se guarda como comportamiento y se ejecuta al invocar el contrato, no al declarar. Elegí la forma que deje visible la regla necesaria.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
