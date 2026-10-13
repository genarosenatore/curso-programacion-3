# Soluciones 03.02 · Operadores, conversiones y comparaciones

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

Number("1200")*Number("2") da 2400. "1200"+"2" da "12002". Para datos recibidos, comprobá texto.trim() !== "" y Number.isFinite(valor) antes de usarlos.

## 2 y 3. Resolver y justificar las decisiones

Las salidas son "105", 15, 2.5 y 2. El resto responde cuántas unidades quedan después de grupos completos de cuatro. Para el rango: `cantidad >= 1 && cantidad <= 5`; 0 da false, 3 true y 6 false.

"" debe rechazarse antes de Number porque convertirlo a 0 pierde la información de vacío. "2" se convierte a 2 y cumple la regla. "dos" produce NaN y Number.isFinite da false. La decisión completa se implementará con if en la próxima clase; todavía podés escribir una tabla con texto, conversión y comparación. No agregues una condición que aún no sabés leer solo para copiar una solución.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
