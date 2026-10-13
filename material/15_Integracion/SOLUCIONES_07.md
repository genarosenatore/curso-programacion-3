# Soluciones 15.07 · Pedidos y administración

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Las dos primeras se aceptan; la última se rechaza. Para validar: permitidos[actual].includes(nuevo). Conservá el estado anterior si falla y mostrá un mensaje. Contrastá con las reglas concretas que decidas aplicar al proyecto de la consigna.

## 2 y 3. Resolver y justificar las decisiones

Los resultados son true,true,false. `function puedeCambiar(actual:EstadoPedido,nuevo:EstadoPedido):boolean { return permitidos[actual].includes(nuevo); }`. Una entrada "reabierto" no pertenece a la unión y se rechaza al validarla. Servidor consulta el estado real y verifica permisos antes de modificar; el botón solo organiza experiencia y no impide una petición manual.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
