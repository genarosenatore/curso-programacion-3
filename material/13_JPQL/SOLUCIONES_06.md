# Soluciones 13.06 · Subconsultas, EXISTS y NOT EXISTS

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

select a from Articulo a where not exists (select d.id from FacturaVentaDetalle d where d.listaPrecioArticulo.articulo = a). Conserva artículos sin ventas y elimina los que tengan al menos un detalle. No depende de contar todos los detalles.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La subconsulta calcula el promedio global y la externa selecciona facturas que lo superan. No calcula un promedio separado por cliente. Si no hay facturas, no hay resultado externo y el promedio puede ser null.

## 3. Qué conviene corregir

La confusión a evitar es: Olvidar la correlación y usar una subconsulta que responde lo mismo para todos los artículos.

Una subconsulta en WHERE o HAVING calcula o comprueba algo usado por la consulta externa. Puede ser independiente o correlacionada, cuando referencia un alias externo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
