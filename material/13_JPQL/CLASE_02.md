# Clase 13.02 · Selección, proyecciones y filtros

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_01.md) · [Clase siguiente](../13_JPQL/CLASE_03.md)

## Elegir la forma del resultado

Una **proyección** selecciona solo datos necesarios. `select f.numero` devuelve valores Long; `select f.numero,f.fechaEmision,f.importeTotal` devuelve una fila con tres posiciones, habitualmente Object[]. No son entidades completas gestionadas de FacturaVenta. El tipo de createQuery debe coincidir con esa selección.

Una **expresión de constructor** `select new curso.FacturaResumen(f.numero,f.importeTotal)` crea un DTO por fila. Necesita nombre cualificado y constructor con tipos y orden compatibles. No marca el DTO como entidad ni guarda esa representación en una tabla.

## Seguir una fila

En [el laboratorio](../Ejemplos/persistencia/README.md), FacturaVenta.numero es Long e importeTotal double, igual que esos campos del modelo inspeccionado. FacturaResumen(Long numero,double total) corresponde. Una proyección de fecha usa java.util.Date en este modelo; no cambies arbitrariamente el DTO a otro temporal sin adaptar.

La primera posición de Object[] sería número, segunda fecha y tercera total. Un índice invertido puede producir cast incorrecto o mostrar valores con el significado equivocado. Un DTO con nombre de componentes reduce esa dependencia y permite que el compilador compruebe sus usos posteriores, aunque la compatibilidad del constructor JPQL se valida al preparar/ejecutar la consulta.

Ejecutá las proyecciones del laboratorio antes de agregar condiciones. Después usa WHERE para limitar filas y ORDER BY para presentar. Un nombre de entidad no es el paquete de su clase por defecto, mientras el constructor DTO sí usa nombre cualificado. Leer campos elegidos reduce datos de salida, pero no aplica autorización por sí solo.

El double se conserva aquí para practicar sobre un modelo parecido al campus; no es la recomendación de precisión para contabilidad real. Producto del laboratorio utiliza BigDecimal para enseñar la diferencia y un DTO sobre ese precio debe recibir BigDecimal, no double por imitación.

## Ejemplo de la clase

```sql
select f.numero, f.fechaEmision, f.importeTotal
from FacturaVenta f
order by f.numero
```

[Abrir el fragmento como archivo](fragmentos/clase_02.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Cada fila contiene tres valores en ese orden, no una FacturaVenta completa. Para Object[], documentá índices o preferí un DTO. Una variante sería select new curso.FacturaResumen(f.numero,f.importeTotal), con ese tipo definido y constructor compatible.

## Cambiar una decisión y explorar un límite

Usar FacturaVenta.class con tres valores seleccionados incumple la forma del resultado. Cambiar numero por numeroFactura no encuentra la propiedad. Una expresión de constructor con tipos invertidos puede fallar aunque ambos campos existan.

## Confusión que conviene evitar

Usar FacturaVenta.class como resultado cuando se seleccionan tres valores escalares.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_01.md) · [Clase siguiente](../13_JPQL/CLASE_03.md)
