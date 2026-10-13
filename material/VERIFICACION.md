# Verificación de la revisión

[Inicio](INICIO.md) · [Registro por unidad](REVISION_POR_UNIDAD.md) · [Ejemplos y comandos](EJEMPLOS.md)

Realizada el 13 de octubre de 2026. Este registro corresponde a la copia revisada, no a resultados de una versión anterior.

| Comprobación | Resultado y alcance |
|---|---|
| Cobertura | 134 clases en 16 unidades. Los 402 archivos de teoría, práctica y solución se regeneraron con explicaciones y actividades específicas. |
| Prerrequisitos | Lectura del recorrido completo; fundamentos antes de DOM/asincronía, Java antes de colecciones, SQL antes de JPA y HTTP antes de endpoints. Se explica sintaxis mínima cuando un ejemplo la necesita antes de su desarrollo extenso. |
| Cuestionarios | 64 preguntas: correcta y dos distractores explicados y clase de repaso vinculada. La pregunta sobre Java prematura en Fundamentos se reemplazó por guardar/commit/publicar. |
| Sincronización | La herramienta compara `course.json` completo con una generación nueva desde los Markdown. Igualdad exacta confirmada. |
| Enlaces | Referencias locales de Markdown y HTML incorporado comprobadas contra archivos existentes; sin enlaces locales rotos. Enlaces remotos no se presentan como todos comprobados. |
| Web y contenido | Edge sin ventana, perfil temporal: las 402 pestañas se compararon con el HTML esperado de las 134 clases. Se probó también bajo `/curso-programacion-3/`, simulando una subruta de Pages. |
| Evaluaciones web | Se respondió correctamente el banco de las 16 unidades: 100 % en cada una. Se comprobó que la corrección muestre las tres opciones y enlace de repaso. La lógica de notas también se probó con 0, 50, 100 e ingreso inválido. |
| Progreso | Marcar, recargar y conservar completada; exportar JSON e importar/combinar un respaldo con progreso y notas anteriores. Los ids y la clave local se mantienen. Validación de formato e ids inválidos comprobada. |
| Navegación | Teoría→Soluciones, rutas explícitas a Práctica/Soluciones de cualquier clase, unidades, documentos de apoyo y registro de revisión probados. |
| JavaScript | Los siete fragmentos básicos, 20 bloques de código de la teoría básica en contextos independientes, filtro, validación de cantidades y totales fueron ejecutados. Los ejemplos que continúan otro bloque se probaron con esa preparación. |
| TypeScript | TypeScript 5.6.3: proyecto local estricto comprobado y JavaScript regenerado; ocho fragmentos `.ts` comprobados por separado. Los otros dos fragmentos son instrucciones de herramientas. Filtro de personajes en navegador probado. |
| Java | Seis programas independientes compilados y ejecutados con JDK 21.0.11. Se comprobaron salidas de stock, subtotal, igualdad, colecciones, DTO, genéricos y funcional. |
| SQL | Ocho fragmentos ejecutados en SQLite con preparación explícita. Conteos con categoría vacía, total histórico 480000 y rollback 210000→200000 confirmados. INSERT usa id 10 y no colisiona con Libro id 3. |
| JPA/JPQL | Laboratorio nuevo compilado y ejecutado con Hibernate 6.6.53.Final, Jakarta Persistence 3.1 y H2 2.3.232. Id, contexto, relaciones, flush/rollback, eliminación y orphanRemoval comprobados. Consultas de parámetros, DTO, fechas, texto, IN, DISTINCT, joins, grupos, subconsultas y CASE ejecutadas. |
| Spring | API empaquetada y arrancada con Spring Boot 3.5.16 y Java 21. CRUD: 201/Location, 200, 204 sin cuerpo, 404 por ausencia y 400 para nombre/precio/stock/precisión inválidos e id mal formado. Los rechazos conservaron cantidad de recursos. |
| Ejemplos de interfaz | Catálogo JS: agregar repetido, exceso de stock, recargar, vaciar y filtro sin resultados. Personajes TS: carga, búsqueda y vacío. Sin errores de ejecución de página en esos recorridos. |
| Conservación | Los 611 archivos de la carpeta original coinciden con su manifiesto SHA256. No se modificó la versión anterior ni se hizo publicación/push. |

## Resultados conocidos del laboratorio JPA

- Tres facturas con importes 10000, 50000 y 50001, obtenidos desde sus detalles.
- Centro: dos facturas y total 60000; el grupo supera un mínimo de una factura.
- Condición A: total 110001; promedio global 36667.
- Subconsulta global: facturas 2 y 3; por cliente: solo factura 2.
- Artículo sin ventas: Regla; LEFT JOIN conserva su marca nula.
- Factura 3 contiene dos detalles de la misma marca: la selección DISTINCT devuelve tres facturas únicas en total.
- CASE: 10000 y 50000 son MEDIO; 50001 es ALTO, con las reglas enseñadas.
- Tras flush y rollback, el nombre confirmado sigue siendo Cuaderno. Tras rollback de orphanRemoval, siguen existiendo cuatro detalles.

## Qué no demuestra esta verificación

Los programas completos sí se ejecutaron. Los fragmentos ilustrativos que requieren una clase, DTO, contexto o relación no se anuncian como programas autónomos ni como todos compilados sin preparación. Las pruebas estructurales y de ejecución no garantizan comprensión individual ni todos los comportamientos posibles: la revisión pedagógica agrega seguimiento, cambio, límite y práctica, sin utilizar cantidad de palabras como garantía.

La API remota de personajes no se conectó: el ejemplo usa JSON local conocido. No se ejecutaron todas las versiones originales del campus ni sus 22 consultas contra un modelo fiscal integral; varias clases contables inspeccionadas requieren completar sus mapeos. Los videos y enlaces remotos no fueron tratados como documentos íntegramente leídos. La revisión inicial no verificó equivalencia con un commit remoto de GitHub. La publicación posterior se prepara sobre el historial del repositorio y fue autorizada por el estudiante; no cambia el alcance de las pruebas enumeradas arriba.

El curso no implementa pagos, seguridad de producción, reserva concurrente de stock ni todos los requisitos fiscales del sistema original. Son límites de los ejemplos, identificados en las clases y en cada README; no se presentan como temas implementados a través de una bandera local o una anotación.

## Repetir las comprobaciones del sitio

Desde `tools`, instalá su dependencia declarada con `npm install --ignore-scripts` y ejecutá `npm run build` y `npm run verify`. El verificador controla sincronización, cobertura, preguntas, enlaces y lógica de progreso. Para las prácticas, seguí los comandos de cada ejemplo y anotá salida prevista, observada y estado posterior.
