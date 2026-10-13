# Clase 13.03 · Fechas, texto, IN, DISTINCT y ordenamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_02.md) · [Clase siguiente](../13_JPQL/CLASE_04.md)

## Traducir límites y patrones sin perder su significado

BETWEEN incluye extremos; >= inicio y < fin expresa un intervalo **semiabierto**, útil para un día o mes con horas. Para octubre, el fin exclusivo es el inicio de noviembre: no inventás una última fracción de segundo. Los valores deben corresponder al tipo temporal de la entidad y a una política de zona horaria.

LIKE usa % para cualquier secuencia y _ para un carácter. lower normaliza letras según reglas disponibles en el motor; no garantiza eliminar tildes. IN compara con valores de una colección parametrizada compatible. Para colección vacía, define el resultado sin depender de sintaxis IN vacía no portable: puede retornarse lista vacía antes de ejecutar.

## Filtrar, distinguir y ordenar

IS NULL expresa ausencia, heredando la lógica de SQL. `fechaAnulacion is null` selecciona no anuladas en este modelo. `distinct` elimina repetidos de lo seleccionado: estados distintos no es lo mismo que entidades distintas. ORDER BY define orden y un id de desempate puede hacerlo estable si fechas coinciden.

En [el laboratorio](../Ejemplos/persistencia/README.md), la consulta de fechas recibe Date compatibles y datos conocidos. No pegarás sus consultas en SQLite: se ejecutan mediante EntityManager. Para denominación del cliente, el parámetro patron puede ser "%ana%"; setParameter recibe el texto completo del patrón por separado.

Si la búsqueda del usuario incluye % o _, decidí si son comodines admitidos o texto literal. En caso literal necesita escape según la sintaxis definida; parametrizar evita inyección, pero no cambia el significado de LIKE. La práctica puede usar un texto fijo para aprender primero el mecanismo.

## Ejemplo de la clase

```sql
select f from FacturaVenta f
where f.fechaEmision >= :desde and f.fechaEmision < :hastaExclusiva
and f.fechaAnulacion is null
order by f.fechaEmision, f.id
```

[Abrir el fragmento como archivo](fragmentos/clase_03.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La consulta incluye desde y excluye hastaExclusiva. Si querés todo octubre, el extremo superior puede ser el inicio de noviembre con una política de zona horaria apropiada. Los parámetros deben ser compatibles con Date o el tipo temporal elegido en la entidad.

## Cambiar una decisión y explorar un límite

Un fin con fecha del último día a medianoche puede excluir horas posteriores de ese mismo día. El fin exclusivo del siguiente día evita ese error. Distinct de estados agrupa coincidencias de esa cadena; no promete una factura por cliente.

## Confusión que conviene evitar

Concatenar texto del usuario dentro de la consulta para construir el filtro.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_02.md) · [Clase siguiente](../13_JPQL/CLASE_04.md)
