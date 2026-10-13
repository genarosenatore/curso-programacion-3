# Soluciones 09.01 · Clases y métodos genéricos

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Caja<String> texto=new Caja<>("Hola"); Caja<Integer> numero=new Caja<>(7);. Caja<int> no compila. El tipo de obtener conserva String o Integer según cada variable.

## 2 y 3. Resolver y justificar las decisiones

Las cajas entregan Hola y 7 con tipos String e Integer. `static <T> T elegirPrimero(T a,T b){return a;}` retorna el primer valor y conserva un tipo común deducido. No verifica existencia: si a es null lo devuelve. Si el contrato requiere no null, usa validación explícita y documentala. Un genérico conserva relaciones estáticas, no crea contenido inexistente.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
