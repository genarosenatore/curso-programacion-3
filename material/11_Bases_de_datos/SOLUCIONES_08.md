# Soluciones 11.08 · Práctica: productos, clientes, facturas y detalles

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

factura_id relaciona el detalle con su cabecera. precio_centavos en detalle conserva el precio de venta. Modificar producto.precio_centavos no cambia ese dato histórico. El subtotal se calcula con la cantidad de cada detalle.

## 2 y 3. Resolver y justificar las decisiones

200000×2+80000×1=480000. La consulta variante usa `FROM factura f LEFT JOIN detalle d ON d.factura_id=f.id`, selecciona f.id y `COALESCE(SUM(d.cantidad*d.precio_centavos),0)` y agrupa por f.id. La factura nueva da0 bajo esa política. El precio guardado en detalle conserva el hecho histórico; referencia al producto por sí sola solo permite ver su estado actual.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
