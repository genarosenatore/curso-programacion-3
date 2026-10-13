# Clase 13.04 · Navegación de relaciones, INNER JOIN y LEFT JOIN

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_03.md) · [Clase siguiente](../13_JPQL/CLASE_05.md)

## Recorrer relaciones que realmente están mapeadas

Una expresión como f.cliente.id navega una relación persistente. JPQL no deduce un vínculo por nombres parecidos; el atributo debe existir y estar mapeado. Para una colección, `join f.detalles d` crea un alias por detalle. El camino del modelo inspeccionado hacia artículo es d.listaPrecioArticulo.articulo, no d.articulo.

INNER JOIN conserva coincidencias. LEFT JOIN conserva el origen aunque el vínculo falte y proyecta null en los valores derechos. En el ejemplo, un Articulo sin marca se incluye junto a marca nula. Si luego WHERE exige m.denominacion='X', la fila nula no cumple y se pierde; el filtro puede contradecir la intención de incluir ausencia.

## Seguir la multiplicación de filas

Una factura con dos detalles de la marca buscada puede generar dos filas con la misma f. `select distinct f` expresa que la salida necesita facturas únicas. No es una solución universal para toda suma: SUM de importeTotal tras duplicar cabeceras seguirá necesitando pensar el origen correcto. SUM(DISTINCT importeTotal) tampoco sirve si dos facturas diferentes tienen el mismo total.

Las consultas se ejecutan en [el laboratorio](../Ejemplos/persistencia/README.md), que incluye Articulo.marca y el camino de detalle. El resultado de entidad completa se tipa con FacturaVenta.class; una selección de denominaciones tiene otra forma. Primero anticipá filas intermedias y después proyección.

`join fetch` es una variante para obtener asociaciones junto al origen y reducir cargas pendientes cuando corresponde. No es igual a un JOIN usado solo para filtrar: afecta cómo se obtiene el grafo. Cargar colecciones con paginación requiere cuidados adicionales; no agregaremos esa complejidad para estas consultas pequeñas.

## Ejemplo de la clase

```sql
select a.denominacion, m.denominacion
from Articulo a left join a.marca m
order by a.denominacion
```

[Abrir el fragmento como archivo](fragmentos/clase_04.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Incluye artículos sin marca y devuelve null como denominación de marca en esas filas. join a.marca usa una relación mapeada. Para facturas con un artículo de cierta marca, el camino del campus es factura.detalles → listaPrecioArticulo → articulo → marca.

## Cambiar una decisión y explorar un límite

Cambiá LEFT a INNER en artículos/marca: desaparece el artículo sin marca. En factura por marca, quitá distinct y revisá si varios detalles pueden repetir el origen. No inventes una relación directa solo para abreviar.

## Confusión que conviene evitar

Inventar d.articulo cuando la relación real pasa por listaPrecioArticulo.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_03.md) · [Clase siguiente](../13_JPQL/CLASE_05.md)
