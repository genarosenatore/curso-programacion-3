# Fuentes y alcance

[Inicio](INICIO.md) · [Verificación](VERIFICACION.md)

Estas 134 clases son explicaciones propias revisadas para empezar desde cero. Incluyen fundamentos previos a los temas del campus. El material original se conserva en la recopilación local y está disponible en el campus; no se redistribuye en esta copia de Pages. Cada guía identifica el bloque correspondiente. Los ejercicios locales permiten practicar sin realizar actividades dentro del campus. El [registro por unidad](REVISION_POR_UNIDAD.md) explica cambios, correcciones y límites.

## Relación con el material

| Clases | Material y propósito |
|---|---|
| Fundamentos | Preparación añadida: algoritmos, herramientas y lectura de errores. |
| HTML, CSS, JavaScript y TypeScript | Apuntes, presentaciones y consignas del bloque web. |
| Java | Base añadida para comprender los ejemplos Java del campus. |
| Métodos, colecciones, Lombok y DTO | Apuntes y ejemplos del bloque de objetos y colecciones. |
| Genéricos y Reflection | Conceptos y ejemplos del bloque correspondiente. |
| Funcional | Interfaces funcionales, lambdas y operaciones sobre streams. |
| Bases de datos | Preparación añadida para abordar persistencia y consultas. |
| JPA y JPQL | Apuntes, relaciones, consultas y modelo de facturación. |
| Spring e integración | Proyectos extraídos y consignas de frontend, backend y Food Store. |

Se revisaron los Markdown existentes, el contenido incorporado a course.json, los cuestionarios, documentos de la recopilación y archivos de los proyectos extraídos. Para esta revisión se preparó un inventario de extracción de texto de 113 documentos y archivos fuente, incluyendo PDF, DOCX y código; ese inventario no equivale a un programa oficial ni a 113 clases. Se inspeccionaron especialmente las consignas HTML/CSS/TypeScript/Food Store, objetos, colecciones, genéricos, funcional, FacturaArca, los cinco niveles JPQL y el recorrido contable frontend/backend. Los videos y recursos remotos no se presentan como transcripciones completas. El PDF de programa disponible lleva el título Programación I 2025: no se usa como programa oficial de Programación 3.

La URL del repositorio indicada no se pudo recuperar en la primera consulta web; la revisión utiliza la carpeta local solicitada. No se afirma una comparación contra un commit remoto exacto. La copia original local queda conservada con un manifiesto SHA256 para verificarlo. No se publicaron cambios.

## Compatibilidad de ejemplos

El frontend empieza con archivos simples; después incorpora TypeScript. El proyecto Java utiliza Java 21. Spring utiliza Spring Boot 3.5 y jakarta.persistence. Algunas fuentes antiguas usan javax.persistence; hay que mantener todas las dependencias y anotaciones en la misma generación. No mezcles ambas familias copiando fragmentos.

El ejemplo SQL se ejecuta con SQLite para practicar y su lanzador usa bases en memoria. Las consultas JPQL se ejecutan mediante JPA y trabajan con entidades Java; no se pegan en SQLite. Se agregó un laboratorio independiente JPA/JPQL con entidades mapeadas y datos conocidos, para practicar sin Spring ni completar primero todo el modelo contable. La copia original de varias clases contables no trae sus mapeos completos; sus consultas requieren realizar ese trabajo. El proyecto API de productos es otro ejemplo pequeño independiente y tiene una configuración distinta.

La sesión de Food Store guardada en localStorage sirve para entender la interfaz. La autorización real debe comprobarse en el servidor. Este curso no implementa pagos reales ni un sistema completo de autenticación.

## Documentación oficial de consulta

Documentación consultada durante la revisión del 13 de octubre de 2026; las explicaciones son propias y no sustituyen las referencias:

- [MDN: aprendizaje web](https://developer.mozilla.org/en-US/docs/Learn_web_development).
- [MDN: gramática y tipos JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Grammar_and_types).
- [MDN: cascada CSS](https://developer.mozilla.org/en-US/docs/Web/CSS/Guides/Cascade/Introduction).
- [TypeScript](https://www.typescriptlang.org/docs/).
- [Vite: requisitos e inicio](https://vite.dev/guide/). Usá una versión de Node compatible con la versión de Vite elegida; el mínimo antiguo del apunte no garantiza esa compatibilidad.
- [Java](https://dev.java/learn/).
- [SQLite: lenguaje de consultas](https://www.sqlite.org/lang.html).
- [Lombok](https://projectlombok.org/features/).
- [Jakarta Persistence 3.1](https://jakarta.ee/specifications/persistence/3.1/).
- [Spring Boot 3.5: requisitos](https://docs.spring.io/spring-boot/3.5/system-requirements.html).
- [Transacciones en Spring](https://docs.spring.io/spring-framework/reference/data-access/transaction/declarative/annotations.html).
- [Instalación de Maven](https://maven.apache.org/install.html).

## Qué significa estar preparado

Todas las clases, prácticas y soluciones están escritas. Eso no implica que hayas aprendido los temas ni completado evaluaciones del campus. Registrá tu avance después de practicar. Los fragmentos ilustran una idea y pueden necesitar las clases que los rodean; los proyectos ejecutables están identificados en [Ejemplos](EJEMPLOS.md). Consultá el registro de verificación para distinguir ejemplos ejecutados de código pendiente de ejecución.
