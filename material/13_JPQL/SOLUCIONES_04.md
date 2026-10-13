# Soluciones 13.04 · Navegación de relaciones, INNER JOIN y LEFT JOIN

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

select distinct f from FacturaVenta f join f.detalles d where d.listaPrecioArticulo.articulo.marca.id = :marcaId. Una factura con dos renglones de esa marca sigue apareciendo una sola vez. Verificá nombres y mapeos del modelo.

## 2 y 3. Resolver y justificar las decisiones

`select a.denominacion,m.denominacion from Articulo a left join a.marca m order by a.denominacion`. Para factura: `select distinct f from FacturaVenta f join f.detalles d where d.listaPrecioArticulo.articulo.marca.id=:marcaId`. Dos detalles aportan dos coincidencias intermedias, pero la selección distinct conserva una factura. Es otra salida que contar detalles o sumar sus subtotales.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
