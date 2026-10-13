# Soluciones 12.08 · Transacciones y consistencia

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

El servicio busca cliente y artículos, valida cantidades, calcula importes y construye cabecera/detalles manteniendo ambos lados. Guarda dentro de una transacción. Un detalle inválido produce rechazo y rollback de toda la operación, no una cabecera vacía confirmada.

## 2 y 3. Resolver y justificar las decisiones

Busca cliente y artículos, valida cantidades, calcula importes, construye ambos lados y guarda dentro de un límite. Un detalle inválido no deja cabecera confirmada. En modo explícito el código decide rollback; en Spring lo hace el gestor según llamada y reglas configuradas. La prueba recupera después y confirma ausencia de escritura parcial. La anotación no valida stock ni garantiza automáticamente cualquier nivel de aislamiento.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
