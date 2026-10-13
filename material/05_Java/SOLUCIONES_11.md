# Soluciones 05.11 · Práctica: productos y clientes

[Clase](CLASE_11.md) · [Práctica](EJERCICIOS_11.md)

## 1. Razonamiento de la actividad guiada

La compra de 2 sobre stock 5 reduce a 3. Una compra de 6 se rechaza y conserva 5. Cantidad cero se rechaza. subtotalCentavos devuelve precio*cantidad con validación y puede usar Math.multiplyExact para detectar un desborde de int. El ejemplo completo de Java incluye estos casos.

## 2 y 3. Resolver y justificar las decisiones

En U05Java el stock pasa 5 → 3, subtotal 400000, rechazo y stock 3. El libro pasa 3 → 0 y conserva 0 tras el intento extra. El getter y subtotal consultan; prestar o descontar cambia estado. Con instancia nueva, cambia el estado inicial y por lo tanto el esperado después de rechazar. Vincular cliente con una operación no exige que comparta herencia con producto; son responsabilidades distintas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
