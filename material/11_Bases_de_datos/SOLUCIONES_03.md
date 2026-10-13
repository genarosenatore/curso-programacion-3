# Soluciones 11.03 · Relaciones uno a uno, uno a muchos y muchos a muchos

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

autor, libro y autor_libro(autor_id,libro_id) con clave primaria compuesta y ambas claves foráneas. Un par no debería repetirse. En JPA esa relación puede modelarse de forma distinta según si la asociación tiene datos propios.

## 2 y 3. Resolver y justificar las decisiones

autor_libro contiene autor_id y libro_id, ambas referencias, con par único. factura lleva cliente_id; detalle lleva factura_id y producto_id. Cada renglón agrega cantidad y precio de venta. Guardar ese precio permite que cambiar producto.precio actual no altere una factura anterior. La relación referencia al producto y el valor histórico conserva otro hecho: cuánto se cobró entonces.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
