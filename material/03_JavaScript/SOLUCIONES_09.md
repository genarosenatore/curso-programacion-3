# Soluciones 03.09 · Eventos y formularios

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

Antes de calcular: if(!Number.isInteger(cantidad)||cantidad<1){resultado.textContent="Ingresá una cantidad entera mayor a cero";return;}. Si es válida, mostrás el total. Probá 2, 0 y 1.5.

## 2 y 3. Resolver y justificar las decisiones

Dentro del listener enseñado: `if (!Number.isInteger(cantidad) || cantidad < 1) { resultado.textContent="Cantidad entera positiva requerida"; return; }`, luego asigná el total. Para precio, agregá un input id="precio", name="precio", type="number", min="0", step="0.01" y required.

Leé su value, comprobá trim() !== "", convertí y comprobá Number.isFinite(precio) && precio >= 0 antes de multiplicar. Una muestra gratuita puede tener precio cero; una compra de cero unidades no cumple este contrato. El Enter produce submit y usa el mismo procedimiento. No uses Number del vacío como si la persona hubiera elegido cero.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
