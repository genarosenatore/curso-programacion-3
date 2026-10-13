# Soluciones 13.06 · Subconsultas, EXISTS y NOT EXISTS

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

select a from Articulo a where not exists (select d.id from FacturaVentaDetalle d where d.listaPrecioArticulo.articulo = a). Conserva artículos sin ventas y elimina los que tengan al menos un detalle. No depende de contar todos los detalles.

## 2 y 3. Resolver y justificar las decisiones

Con100,200,300 el promedio es200 y solo300 entra. Nunca vendidos: `select a from Articulo a where not exists (select d.id from FacturaVentaDetalle d where d.listaPrecioArticulo.articulo=a)`. El de varias ventas no entra y el ausente sí. Para promedio por cliente, la subconsulta incluye `where otra.cliente=f.cliente`; así el criterio depende del cliente de cada factura exterior.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
