# Clase 13.05 · COUNT, SUM, AVG, GROUP BY y HAVING

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_04.md) · [Clase siguiente](../13_JPQL/CLASE_06.md)

## Resumir la cantidad correcta de datos

COUNT cuenta elementos o valores no nulos, SUM suma y AVG calcula promedio. GROUP BY define qué claves comparten una fila resumida. WHERE decide elementos antes del grupo y HAVING decide grupos después. Es la misma distinción de intención que vimos al [resumir streams](../10_Funcional/CLASE_08.md), con reglas de tipos y nulos del sistema persistente.

Agrupar por descripcion sola puede mezclar dos puntos de venta diferentes con el mismo texto. Incluir id y descripcion identifica cada grupo. Los campos proyectados sin agregado deben estar correctamente agrupados. No elijas un numero de factura arbitrario dentro de un grupo de muchas.

## Interpretar salida y tipos

COUNT devuelve Long; AVG devuelve Double para los tipos numéricos habituales y SUM depende del argumento: Long para enteros ordinarios, Double para flotantes, BigDecimal para BigDecimal. COUNT sin filas da0; los otros agregados pueden dar null si no tienen valores. Si el DTO usa primitivo para un agregado nullable, hay que definir cómo tratar ausencia.

En el ejemplo, puntoVenta.descripcion, count(f) y sum(f.importeTotal) generan una fila por punto. HAVING count(f)>:minimo selecciona por número de facturas, no por importe individual. Con minimo=1, un grupo de dos entra y uno de una no. Un LEFT JOIN desde todos los puntos puede requerirse para incluir puntos sin facturas; el origen actual FacturaVenta no los genera automáticamente.

Ejecutá las consultas del [laboratorio](../Ejemplos/persistencia/README.md) con datos de dos grupos. Evitá unir detalles antes de sumar cabecera sin analizar multiplicación: se podría sumar la misma factura dos veces. La consulta que funciona en sintaxis todavía debe responder la pregunta correcta.

## Ejemplo de la clase

```sql
select f.puntoVenta.descripcion, count(f), sum(f.importeTotal)
from FacturaVenta f
group by f.puntoVenta.id, f.puntoVenta.descripcion
having count(f) > :minimo
```

[Abrir el fragmento como archivo](fragmentos/clase_05.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Produce una fila por punto de venta con más facturas que minimo. No pregunta si una factura individual tiene gran importe. Agrupar también por id evita mezclar puntos distintos con misma descripción. El tipo del total debe coincidir con el atributo de entidad.

## Cambiar una decisión y explorar un límite

Dos facturas de100 y200 tienen suma300 y promedio150. Un join que repita la primera tres veces cambia sumas y conteos. SUM DISTINCT no arregla en general: dos facturas de100 deben sumar200, no100.

## Confusión que conviene evitar

Usar WHERE count(f)>5 en lugar de HAVING para filtrar un agregado.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_04.md) · [Clase siguiente](../13_JPQL/CLASE_06.md)
