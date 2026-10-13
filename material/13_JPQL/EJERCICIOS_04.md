# Práctica 13.04 · Navegación de relaciones, INNER JOIN y LEFT JOIN

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Escribí una consulta de facturas que contengan un artículo de una marca por id sin duplicar facturas.

1. Sigue detalle→listaPrecioArticulo→articulo→marca.
2. Filtra por id de marca parametrizado.
3. Selecciona distinct factura para evitar repetidos.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Consultá denominación de artículo y marca incluyendo artículos sin marca.

## 3. Combinar lo aprendido

Consultá facturas con al menos un detalle de marca por id, sin duplicarlas. Diseñá una factura con dos detalles de esa marca y justificá cada JOIN o navegación.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La relación a.marca existe en el modelo.
2. El detalle pasa por listaPrecioArticulo.
3. distinct se aplica a la factura seleccionada.
