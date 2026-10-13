# Práctica 13.06 · Subconsultas, EXISTS y NOT EXISTS

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Buscá artículos que nunca aparecieron en un detalle de factura.

1. Parte de Articulo a como origen.
2. Correlaciona detalles donde articulo=a.
3. Usa NOT EXISTS para conservar solo ausentes.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Consultá facturas por encima del promedio global y anticipá qué sucede con totales100,200,300.

## 3. Combinar lo aprendido

Buscá artículos nunca incluidos en detalles. Probá uno con varias ventas y otro sin ninguna. ¿Qué cambia si el promedio buscado fuera por cliente y no global?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Promedio global200, comparación estricta.
2. La correlación vincula cada artículo con sus detalles.
3. Promedio por cliente necesita vincular el alias exterior.
