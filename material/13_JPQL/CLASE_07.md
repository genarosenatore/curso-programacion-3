# Clase 13.07 · CASE y consultas avanzadas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_06.md) · [Clase siguiente](../13_JPQL/CLASE_08.md)

## Calcular una etiqueta sin modificar el almacenamiento

CASE evalúa condiciones en orden y devuelve la expresión del primer WHEN verdadero; ELSE cubre el resto y END cierra. Es una expresión de consulta, no una actualización. Puede producir una categoría de reporte que no exista como atributo persistente.

La clasificación del TP usa alto para >50000, medio desde10000 hasta50000 inclusive y bajo para <10000. El segundo WHEN solo comprueba >=10000 porque el primero ya excluyó mayores de50000. El orden conserva los límites sin solapar resultados efectivos.

## Seguir casos y tipos

9999 falla ambos y vuelve BAJO.10000 falla alto y cumple medio.50000 también medio.50001 cumple el primer WHEN y no evalúa alternativas de clasificación posteriores. Si se invierten condiciones y >=10000 va primero, los altos también caerían en medio.

Las ramas necesitan tipos compatibles para la proyección. Strings de etiquetas funcionan juntas; mezclar número con texto como si fuera una misma columna estable puede romper el contrato. COALESCE elige primer valor no nulo y puede ofrecer una alternativa de presentación; no corrige datos de negocio incompletos automáticamente.

Ejecutá la consulta en [el laboratorio](../Ejemplos/persistencia/README.md), cuyo modelo usa importeTotal en unidades monetarias como el campo original, no centavos. En la consulta corregida se selecciona f.numero, porque numeroFactura corresponde a otros contratos y no al atributo. Si trabajás con el esquema SQL de centavos, los umbrales necesitan convertir unidad conscientemente.

ORDER BY importeTotal desc coloca altos antes por importe, sin alterar el registro original. Dos totales iguales pueden requerir numero o id como desempate. Después de consultar no aparece una propiedad categoria mágicamente guardada en FacturaVenta.

## Ejemplo de la clase

```sql
select f.numero, f.importeTotal,
case when f.importeTotal > 50000 then 'ALTO VALOR'
     when f.importeTotal >= 10000 then 'MEDIO VALOR'
     else 'BAJO VALOR' end
from FacturaVenta f
order by f.importeTotal desc
```

[Abrir el fragmento como archivo](fragmentos/clase_07.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La salida añade una etiqueta calculada. No requiere un atributo categoria en FacturaVenta. El rango medio llega a 50000 porque el primer WHEN solo toma mayores. Los importes están en las unidades del atributo del campus; no conviertas a centavos sin cambiar el modelo y parámetros.

## Cambiar una decisión y explorar un límite

Cambiá >50000 por >=50000:50000 pasa a alto. Cambiar la etiqueta no actualiza estado de factura. Si importeTotal fuera null en otro modelo, las comparaciones no serían verdaderas y ELSE podría clasificar ausencia como bajo: define su tratamiento en vez de asumirlo.

## Confusión que conviene evitar

Creer que una columna calculada de consulta queda guardada como propiedad persistente.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_06.md) · [Clase siguiente](../13_JPQL/CLASE_08.md)
