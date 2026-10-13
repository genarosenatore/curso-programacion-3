# Práctica 11.08 · Práctica: productos, clientes, facturas y detalles

[Clase](CLASE_08.md) · [Soluciones separadas](SOLUCIONES_08.md)

## 1. Actividad guiada

Explicá qué relación y qué dato permiten conservar el total histórico al cambiar precios.

1. Identifica precio guardado en detalle.
2. Calcula cada subtotal de factura 1.
3. Cambia precio de catálogo y verifica histórico 480000.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Calculá a mano factura1 y comprobá480000 con SQL.

## 3. Combinar lo aprendido

Agregá una factura sin detalles y consultá todas con total cero para la vacía. Cambiá precio del catálogo y comprobá que la anterior conserva su total. ¿Qué dato asegura el histórico?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El subtotal usa precio del detalle.
2. LEFT conserva cabeceras sin renglones.
3. SUM vacío puede necesitar COALESCE.
