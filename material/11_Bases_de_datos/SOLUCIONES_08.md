# Soluciones 11.08 · Práctica: productos, clientes, facturas y detalles

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

factura_id relaciona el detalle con su cabecera. precio_centavos en detalle conserva el precio de venta. Modificar producto.precio_centavos no cambia ese dato histórico. El subtotal se calcula con la cantidad de cada detalle.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La suma calcula sobre el precio guardado en cada detalle, no sobre el precio actual de producto. El esquema ejecutable de tienda.sql define esa columna y datos de prueba. Una factura sin renglones no aparece con INNER JOIN; decidí si debe rechazarse al crearla o representarse con otro resultado.

## 3. Qué conviene corregir

La confusión a evitar es: Calcular una factura antigua con los precios actuales del catálogo.

El modelo de facturación reúne clientes, productos, facturas y detalles. Un cliente puede tener varias facturas; una factura varios renglones.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
