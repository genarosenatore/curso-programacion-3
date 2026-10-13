# Clase 13.06 · Subconsultas, EXISTS y NOT EXISTS

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_05.md) · [Clase siguiente](../13_JPQL/CLASE_07.md)

## Preguntar algo dentro de otra consulta

Una subconsulta calcula un dato o existencia que la consulta exterior usa. La del ejemplo obtiene el promedio global y la exterior compara cada factura con él. No referencia f dentro, así que es independiente: el promedio es el mismo criterio para todas las filas.

Una subconsulta **correlacionada** utiliza un alias exterior. Para artículo a, consulta detalles donde d.listaPrecioArticulo.articulo=a. Su respuesta depende del artículo actual. EXISTS pregunta si hay al menos una coincidencia; NOT EXISTS si ninguna. El valor seleccionado dentro no es una suma: importa la existencia de filas.

## Seguir una ausencia

Si el artículo Cuaderno tiene uno o muchos detalles, EXISTS es true y NOT EXISTS false. Si Regla no aparece, EXISTS false y NOT EXISTS true. Sin correlación, preguntar si existe cualquier detalle en toda la base produce el mismo resultado para todos los artículos y no responde «este artículo nunca se vendió».

JPQL estándar admite subconsultas en WHERE y HAVING con sus reglas. Algunas extensiones de proveedores permiten otras posiciones; no enseñaremos esa extensión como portable. NOT IN con valores nulos puede producir resultados inesperados por lógica desconocida; NOT EXISTS con correlación expresa mejor esta pregunta de ausencia.

Ejecutá ambas consultas en [el laboratorio](../Ejemplos/persistencia/README.md), que incluye artículo vendido y no vendido. El promedio de la cabecera usa importeTotal del modelo; vacío no tiene facturas externas y AVG puede ser null. Como en las otras clases, parametrizá valores externos y tipá la selección según origen.

## Ejemplo de la clase

```sql
select f from FacturaVenta f
where f.importeTotal > (select avg(otra.importeTotal) from FacturaVenta otra)
```

[Abrir el fragmento como archivo](fragmentos/clase_06.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La subconsulta calcula el promedio global y la externa selecciona facturas que lo superan. No calcula un promedio separado por cliente. Si no hay facturas, no hay resultado externo y el promedio puede ser null.

## Cambiar una decisión y explorar un límite

Quitá `...articulo=a` de NOT EXISTS y conservá un detalle en la base: todos quedan excluidos. La sintaxis puede ser válida, pero la correlación desapareció. Un artículo con tres ventas debe seguir excluyéndose una sola vez de la consulta de nunca vendidos.

## Confusión que conviene evitar

Olvidar la correlación y usar una subconsulta que responde lo mismo para todos los artículos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_05.md) · [Clase siguiente](../13_JPQL/CLASE_07.md)
