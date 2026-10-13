# Soluciones 07.03 · HashSet y duplicados

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

if(!codigos.add(codigo)){System.out.println("Ya estaba inscripto");}. Probá dos entradas iguales. Si un correo admite diferencias de mayúsculas, normalizá con una política acordada antes de insertar, no después.

## 2 y 3. Resolver y justificar las decisiones

A agrega, B agrega y el segundo A no: size 2. Para códigos del ejercicio, usá codigo.trim() antes de add y antes de contains. Así ambas entradas representan P01. Si guardás con espacios y consultás sin ellos, las cadenas siguen siendo distintas. La política pertenece al modelo y debe aplicarse uniformemente; HashSet solo utiliza la igualdad que recibe.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
