# Soluciones 04.04 · Uniones, opcionales, null y narrowing

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

function mostrarPrecio(precio:number|null):string { return precio===null?"Sin precio":String(precio); }. Con cero devuelve "0"; con null, Sin precio.

## 2 y 3. Resolver y justificar las decisiones

longitudSegura retorna texto===null ? 0 : texto.length: da 3, 0 y 0. La función de estados puede usar if o switch y devolver un string por camino. Un tipo discriminado incluye `{estado:"listo"; cantidad:number}` y alternativas sin cantidad. La comprobación de estado habilita su acceso. ! solo silencia una posibilidad; si el dato falta, sigue pudiendo fallar al ejecutar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
