# Soluciones 04.01 · JavaScript y TypeScript: compilación y tipos

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Los tipos se comprueban sobre el código, no cambian automáticamente el JSON recibido. Si viene {precio:"gratis"}, hay que validar los datos al recibirlos. La compilación puede detectar que el código espera un número, pero no garantiza que un servicio externo lo cumpla.

## 2 y 3. Resolver y justificar las decisiones

`let cantidad:number=2; cantidad=3;` es compatible; cantidad="tres" no. Number("20") ejecuta una conversión a 20. Afirmar que el dato es number solo altera la información del compilador. Para precio remoto, comprobá forma, typeof y Number.isFinite, y la regla no negativo. Un number negativo también puede compilar y ser inválido para la compra.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
