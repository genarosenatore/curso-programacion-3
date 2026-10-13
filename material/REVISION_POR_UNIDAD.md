# Registro de revisión por unidad

[Inicio](INICIO.md) · [Verificación ejecutada](VERIFICACION.md) · [Fuentes](FUENTES_Y_ALCANCE.md)

Revisión del 13 de octubre de 2026. Revisión preparada en una copia independiente y publicada posteriormente con autorización del estudiante; la versión anterior se conserva en el historial de GitHub. La carpeta original se conserva. Se mantienen 134 identificadores de clase, 16 unidades, el formato del avance y las evaluaciones por unidad.

## Qué se revisó primero

Se inventariaron las 134 clases, sus prácticas y soluciones, los 64 cuestionarios, los ejemplos y el cargador web. Salvo la primera clase, el desarrollo anterior dependía ampliamente de una plantilla con dos párrafos centrales, práctica breve y consignas genéricas repetidas. Se inspeccionaron las fuentes locales recopiladas: documentos extraídos de PDF y DOCX, consignas y archivos de código de los proyectos. El inventario de extracción de esta revisión contiene 113 documentos y archivos fuente; no son 113 materiales nuevos de la materia.

Se contrastaron fundamentos con documentación oficial de MDN, TypeScript, Java, Jakarta Persistence, SQLite, Lombok, Vite y Spring. La URL GitHub suministrada no pudo recuperarse en la consulta web inicial: el contenido revisado es el de la carpeta local indicada. No se afirma comparación con una revisión remota exacta, lectura integral de videos ni acceso a recursos remotos de campus que no estaban descargados. El PDF de programa de Programación I no se tomó como programa de Programación 3.

## Registro de cambios y límites

| Unidad | Clases revisadas | Desarrollo y prácticas mejorados | Límite que se conserva explícito |
|---|---:|---|---|
| 00 Fundamentos | 5 | Entrada/proceso/salida, algoritmo y prueba de escritorio; archivos y rutas; categorías de errores; Git separando guardar, preparar, confirmar y publicar. Prácticas con límites y estados observables. | Pseudocódigo y diagramas no son programas ejecutables; no se publica desde las prácticas. |
| 01 HTML | 7 | Lectura de etiquetas, atributos y anidamiento; plantilla completa; jerarquía, listas y referencias de caracteres; rutas verificables, alt, semántica, tablas y formularios con labels. Soluciones concretas que explican la elección. | Un formulario estático no crea cuentas ni confirma operaciones en servidor. |
| 02 CSS | 10 | Conexión y sintaxis; selectores y estados; cascada con alcance de sus reglas; unidades; cuentas de caja; flujo y posición; ejes flex; pistas grid; adaptación, variables CSS y BEM. Prácticas de zoom, tamaño y teclado. | Las reglas simplificadas de cascada se delimitan; una captura no verifica toda adaptación. |
| 03 JavaScript | 13 | Valores y literales; declaración, inicialización, asignación y estado; tipos, conversión, comparaciones y cortocircuito; ejecución de condiciones, bucles, funciones y alcance; arrays, callbacks, objetos y referencias. Después DOM, eventos, JSON, almacenamiento, promesas, fetch y módulos. | Const no vuelve inmutable un objeto; datos externos y almacenamiento requieren comprobación. No se agrega ejecutor de código a la web. |
| 04 TypeScript | 10 | Comprobación frente a ejecución; inferencia y contratos; forma estructural, uniones y ausencia; genéricos y unknown; herramientas, Vite y salida; DOM comprobado y validación/adaptación de JSON. | La API remota de personajes no se presenta como un contrato verificado ni se requiere para el ejemplo local. El Food Store completo se integra después. |
| 05 Java | 11 | Fuente→bytecode→JVM; lectura de main y símbolos; tipos y división; arrays/métodos con ubicación exacta; objetos y this; invariantes antes de mutar; referencias y static; composición, herencia, interfaces y excepciones; paquetes y classpath. | Java 21 y estructura clásica del ejemplo; modelo inicial de consola sin persistencia ni seguridad. |
| 06 Métodos de objetos | 5 | Identidad frente a igualdad de dominio; texto de depuración; contratos de equals y hashCode; colisiones y claves estables; pertenencia con Set explicado antes de usarlo. | Igualdad por código del catálogo no se transfiere automáticamente a entidades con ids generados. |
| 07 Colecciones | 7 | Elegir secuencia, unicidad o asociación; interfaces/implementaciones y boxing; cambios por índice o valor; normalización; claves; eliminación con iterador/removeIf; comparadores y desempates; índices coherentes. | HashSet/HashMap no prometen orden; estructuras redundantes necesitan sincronización. |
| 08 Lombok y DTO | 6 | Metadatos y procesamiento; comportamiento manual antes de generación; builder y sus límites; contratos de entrada/salida; mapeo explícito; records, copia superficial y reportes sin ciclos. | Dependencia/procesador para Lombok; DTO no garantiza autorización ni record reemplaza una entidad ordinaria. |
| 09 Genéricos y Reflection | 6 | Relaciones de tipos y borrado; límites e invariancia; lectura/escritura con wildcards; ausencia en contenedores; metadatos frente a valores; firma, invocación, retención y componentes de record. | Reflection tiene errores y restricciones; no reemplaza llamadas tipadas conocidas ni recupera toda información borrada. |
| 10 Funcional | 8 | Método abstracto objetivo, captura y efectos; cuatro contratos; referencias; recorrido perezoso; tipos entre filter/map/sorted; identidades; collect; Optional y agrupamiento antes de filtrar totales. | Streams procesan datos ya cargados; no se presume paralelismo ni consultas automáticas de base. |
| 11 SQL | 8 | Esquema frente a datos; claves y restricciones; cardinalidad/opcionalidad; lógica NULL; consultas y parámetros; alcance de cambios; filas intermedias, agregados y HAVING; transacciones e histórico. Se agrega lanzador reproducible en memoria. | SQLite tiene particularidades; esquema pequeño no reproduce impuestos ni monedas de FacturaArca. |
| 12 JPA | 9 | ORM/especificación/proveedor; configuración; identidad, acceso, columnas y BigDecimal; propietario/inverso; herencia de mapeos; contextos y estados; persist/merge/remove; cascadas, carga, transacción y recuperación posterior. Laboratorio independiente añadido. | Clases contables originales inspeccionadas no traen todos los mapeos; laboratorio propio reducido, sin sistema fiscal integral. |
| 13 JPQL | 8 | Entidades/atributos frente a nombres SQL; parámetros y forma de salida; proyecciones, fechas, LIKE, IN, DISTINCT; relaciones y duplicación; tipos de agregados; subconsultas correlacionadas y CASE; método para niveles del TP. | Ejemplos de mecanismos no se anuncian como implementación de las 22 consignas sobre el modelo integral del campus. |
| 14 Spring | 12 | HTTP y códigos; recurso/CRUD/idempotencia; arranque y dependencias; beans/colaboradores; entorno/perfiles; capas; conversión y búsqueda; DTO/Valid y reglas de negocio; escrituras; errores; repositorios y límites transaccionales. | CRUD de productos de apoyo sin cuentas, pagos, reserva concurrente o reglas fiscales completas. |
| 15 Integración | 9 | Localizar primera falla del recorrido; campos/unidades/precisión; estados y CORS; mapa comprobado del proyecto original; filtros reversibles, cantidades combinadas y recuperación; transiciones y sesión simulada; evidencia por requisito. | Tabla de estados didáctica y almacenamiento local no son seguridad ni reglas oficiales nuevas. |

## Correcciones técnicas concretas

- JPQL de facturas usa `FacturaVenta.numero`, el atributo inspeccionado, en lugar de `numeroFactura` tomado de un contrato HTTP/DTO. Los fragmentos descargables también se actualizan.
- El INSERT de práctica SQL utiliza id 10: el esquema de tienda ya conserva Libro con id 3. La secuencia ahora puede probarse sobre esos datos sin colisión accidental.
- Se separa builder generado de setters del objeto final; se explican las garantías reales de readonly, final, const y records.
- La evaluación inicial deja de preguntar sobre Java antes de enseñarlo y pregunta sobre guardar archivos, commits y publicación.
- Las 64 correcciones explican la correcta y los dos distractores, y enlazan una clase que enseña la respuesta.
- Se corrige la navegación a Práctica/Soluciones cuando el enlace procede de otra clase y se conservan los ids, clave de almacenamiento y formato de respaldo.
- `course.json` se construye desde Markdown con una herramienta reproducible y su igualdad exacta se verifica. Los cambios de contenido no dependen de mantener manualmente dos versiones.

## Cobertura por clase

El [registro de cobertura](../tools/cobertura.json) identifica los 402 archivos de teoría, práctica y solución correspondientes a las 134 clases. Cada clase tiene explicación de problema y funcionamiento, contexto de ejecución, variación/caso límite, actividad guiada con pasos concretos, ejercicio independiente, combinación, pistas y solución razonada. No se usa un umbral de palabras como prueba de aprendizaje.

La revisión de prerrequisitos conserva el recorrido general: primero estructura y estilo, después lógica básica, luego comportamiento y asincronía; Java y colecciones antes de persistencia; SQL antes de JPA; modelo mapeado antes de JPQL; HTTP antes de endpoints. Cuando un ejemplo adelanta una sintaxis necesaria, la explica en el mismo desarrollo y enlaza su clase extensa. Las herramientas TypeScript se explican sin exigir nuevos conceptos de tipos, para preparar el entorno antes de la primera ejecución.

El criterio pedagógico aplicado es poder explicar significado, propósito, pasos, cambio y límite y resolver una tarea pequeña con las piezas definidas. El registro de verificación distingue comprobaciones estructurales de lectura pedagógica y de ejecución real; ninguna cantidad de archivos o prueba automática garantiza comprensión de una persona. Las limitaciones de infraestructura o fuentes no se ocultan como trabajo ejecutado.

## Pendientes pedagógicos identificados antes de publicar

La profundidad no es uniforme. Algunas clases avanzadas aún necesitan un recorrido más visible y gradual. En relaciones JPA, conviene ampliar el seguimiento de objetos, instrucciones, filas guardadas y recuperación desde otro contexto. En Spring, conviene desarrollar primero la colaboración manual entre objetos y después su construcción por el contenedor. Las cuatro preguntas por unidad son un repaso breve y deben ampliarse para evaluar unidades extensas. Esta versión revisada puede usarse para estudiar, pero no se presenta como plenamente suficiente para comprender todos los temas desde cero sin ayuda.
