# Laboratorio JPA y JPQL desde consola

[Ejemplos](../../EJEMPLOS.md) · [JPA](../../12_JPA/GUIA.md) · [JPQL](../../13_JPQL/GUIA.md)

Programa propio completo para comprender mapeos, contextos, relaciones, confirmación, rollback y consultas. No inicia Spring ni HTTP. Requiere Java 21, Maven y conexión para descargar las dependencias declaradas. El parent de Spring Boot solo fija versiones compatibles; el main utiliza JPA directamente con Hibernate y H2.

## Ejecutar en Windows

Abrí PowerShell en esta carpeta, comprobá `java -version` y `mvn -version` y ejecutá:

```text
mvn compile dependency:copy-dependencies
java -cp "target/classes;target/dependency/*" curso.PersistenciaDemo
```

En Linux/macOS el separador de classpath es `:` en lugar de `;`. Cada comando se ejecuta separado. El programa cierra el entorno al finalizar. H2 vive en memoria y el esquema es descartable; no requiere ni afecta una base externa.

## Qué prepara y qué observar

Primero crea datos y confirma. Después recupera un producto en otro contexto, verifica referencia de categoría, modifica, ejecuta flush y revierte. Una lectura nueva debe seguir mostrando Cuaderno. Luego realiza consultas con parámetros, proyecciones, texto, fechas, IN, DISTINCT, joins, grupos, subconsultas y CASE. Al final verifica borrado y rollback de orphanRemoval.

Los mensajes `OK` comprueban id generado, identidad del contexto, categoría recuperada, rollback, facturas únicas por marca, resultado vacío, eliminación y conservación de detalles tras rollback. Los mensajes del proveedor y su arranque son salida técnica adicional.

| Dato de prueba | Resultado previsto |
|---|---|
| Facturas 1, 2 y 3 | Totales 10000, 50000 y 50001, calculados desde detalles |
| Punto Centro | Dos facturas, suma 60000 |
| Punto Norte | Una factura, suma 50001 |
| Artículo Regla | Sin marca y sin ventas |
| Buscar denominación con `%ana%` | Ana |
| Estado inexistente | Lista vacía |
| CASE | Facturas 1 y 2 MEDIO; factura 3 ALTO |
| Condición A | Total 110001 |
| Promedio global | Aproximadamente 36667; facturas 2 y 3 lo superan |
| Promedio por cliente | Para Ana, solo factura 2 supera su promedio; Luis no supera el suyo |

La factura 3 tiene dos detalles de la misma marca: sirve para comprobar que seleccionar facturas no las repita. Uno usa precio histórico 1 como dato sintético para obtener el caso exacto 50001; no se presenta como catálogo real.

## Leer archivos y modificar una cosa por vez

`EntityId` comparte identidad; `Categoria` y `Producto` enseñan referencia y precio decimal; las otras entidades forman el modelo de factura reducido. `PersistenciaDemo` muestra preparación y consultas; `FacturaResumen` es DTO de proyección. `META-INF/persistence.xml` declara proveedores, clases y base.

Para probar una consulta nueva, agregá una llamada `consulta(em,etiqueta,jpql,parametros)` en la sección de consultas del main, compilá otra vez y compará con los datos anteriores. Para practicar un fallo, conservá una copia y modificá una sola condición. No reemplaces clases homónimas del proyecto Spring con estas: son proyectos separados.

El modelo usa `FacturaVenta.numero` y el camino `detalle.listaPrecioArticulo.articulo`, coherentes con los nombres inspeccionados del campus. No incluye todas sus clases, auditoría, impuestos, monedas ni 22 consignas completas. Usa double en los importes de factura para conservar ese caso del modelo original y valores enteros pequeños; no es una recomendación para precisión contable real. Producto utiliza BigDecimal y enseña una alternativa. La política de cascada/orphanRemoval es propia de esta demostración.

Los helpers de categoría solo implementan alta; rechazan traslado a otra categoría para evitar desincronizar colecciones. La demostración se concentra en mecanismo JPA y no implementa usuarios, autorización, pagos ni concurrencia de ventas.
