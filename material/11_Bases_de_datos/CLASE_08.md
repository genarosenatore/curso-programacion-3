# Clase 11.08 · Práctica: productos, clientes, facturas y detalles

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_01.md)

## Conservar hechos históricos

Producto tiene un precio actual; detalle conserva el precio al realizar una venta. Son dos hechos diferentes. Una factura antigua debe seguir sumando lo que se cobró entonces aunque el catálogo cambie. Por eso detalle referencia el producto, pero además guarda cantidad y precioCentavos de la operación.

En [tienda.sql](../Ejemplos/sql/tienda.sql), factura1 tiene dos renglones: Cuaderno200000×2 y Lapicera80000×1. La suma esperada es480000 centavos. La consulta inferior une factura con detalles y agrupa por factura: cada producto del renglón aporta su subtotal guardado.

## Comprobar desde los datos, no solo desde la consulta

Ejecutá el fragmento con --tienda y compará con el cálculo manual. Luego, en el mismo archivo de práctica, actualizá producto.precio_centavos y repetí la consulta: el total histórico debe conservarse. Si unís producto y sumás su precio actual en cambio, modificás el significado del reporte.

INNER JOIN excluye factura sin detalles. Para incluirla, usá LEFT JOIN y COALESCE(SUM(...),0) si el contrato considera total cero; otra política es impedir crear factura vacía. No inventes una obligación general: la consigna real decide cuál es válida.

Este modelo de apoyo no incluye todos los impuestos, bonificaciones, monedas y reglas de FacturaArca. Sirve para enseñar relaciones, cantidades e histórico antes de trasladar el esquema a entidades. Al incorporar otras unidades monetarias, documentá cómo se convierten y redondean; sumar números con distinta moneda sin esa regla no produce un total válido.

## Ejemplo de la clase

```sql
SELECT f.id AS factura, SUM(d.cantidad*d.precio_centavos) AS total_centavos
FROM factura f
JOIN detalle d ON d.factura_id=f.id
GROUP BY f.id
ORDER BY f.id;
```

[Abrir el fragmento como archivo](fragmentos/clase_08.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La suma calcula sobre el precio guardado en cada detalle, no sobre el precio actual de producto. El esquema ejecutable de tienda.sql define esa columna y datos de prueba. Una factura sin renglones no aparece con INNER JOIN; decidí si debe rechazarse al crearla o representarse con otro resultado.

## Cambiar una decisión y explorar un límite

Cambiar precio del producto no cambia detalle.precio_centavos. Agregar un tercer detalle sí cambia la factura. Si el JOIN añade otra colección con varias filas por detalle, puede multiplicar aportes y alterar la suma: revisá qué representa cada fila intermedia.

## Confusión que conviene evitar

Calcular una factura antigua con los precios actuales del catálogo.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_01.md)
