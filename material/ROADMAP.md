# Roadmap de Programación 3 desde cero

Este es el orden de estudio. No es un calendario: avanzamos cuando puedas explicar y aplicar cada tema. La numeración es propia de este curso y puede diferir de la del campus.

## Recorrido

| Unidad | Tema | Resultado |
|---|---|---|
| 00 | [Fundamentos y herramientas](00_Fundamentos/GUIA.md) | Explicar entrada, proceso y salida; escribir un algoritmo pequeño y distinguir navegador, editor y servidor. |
| 01 | [HTML: estructura de una página](01_HTML/GUIA.md) | Crear una página con estructura semántica, enlaces que funcionen y un formulario con etiquetas asociadas a sus campos. |
| 02 | [CSS: estilo y diseño](02_CSS/GUIA.md) | Construir un catálogo que se adapte a pantallas distintas y explicar cómo se distribuye el espacio de sus elementos. |
| 03 | [JavaScript: lógica e interactividad](03_JavaScript/GUIA.md) | Mostrar productos, filtrar una lista, responder a un formulario y consumir datos mostrando estados de carga y error. |
| 04 | [TypeScript y entorno Node.js](04_TypeScript/GUIA.md) | Modelar datos con interfaces, compilar un proyecto y consumir una API sin usar any como solución general. |
| 05 | [Java desde cero y orientación a objetos](05_Java/GUIA.md) | Crear clases con responsabilidades claras, instanciar objetos y explicar una interfaz y el manejo de una excepción. |
| 06 | [toString, equals y hashCode](06_Metodos_objetos/GUIA.md) | Definir igualdad para una clase y explicar por qué objetos iguales deben tener el mismo hashCode, aunque el recíproco no sea obligatorio. |
| 07 | [Colecciones de Java](07_Colecciones/GUIA.md) | Elegir una lista, conjunto o mapa para un caso concreto y comprobar el comportamiento con elementos repetidos. |
| 08 | [Lombok, DTO y records](08_Lombok_DTO/GUIA.md) | Construir y mapear un DTO, explicar qué genera Lombok y elegir con criterio entre clase y record. |
| 09 | [Genéricos y Reflection](09_Genericos_Reflection/GUIA.md) | Escribir un método genérico con sentido e inspeccionar metadatos de una clase, explicando los límites de ambos mecanismos. |
| 10 | [Programación funcional en Java](10_Funcional/GUIA.md) | Construir una cadena de operaciones y explicar sus tipos, su resultado y cuándo se ejecuta. |
| 11 | [Bases de datos y SQL antes de JPA](11_Bases_de_datos/GUIA.md) | Dibujar un modelo sencillo, relacionar filas mediante claves y explicar una consulta y una transacción. |
| 12 | [JPA: objetos y persistencia](12_JPA/GUIA.md) | Persistir entidades relacionadas y justificar sus anotaciones, las reglas de cascada y los límites de una transacción. |
| 13 | [JPQL: consultas sobre entidades](13_JPQL/GUIA.md) | Escribir consultas parametrizadas sobre el modelo de facturas y explicar cómo cambian los resultados con un JOIN o una agrupación. |
| 14 | [Spring Boot y API REST](14_Spring/GUIA.md) | Exponer una API con capas claras, datos validados, persistencia y respuestas coherentes para éxito y error. |
| 15 | [Integración y proyectos del campus](15_Integracion/GUIA.md) | Demostrar un flujo completo, identificar dónde ocurre un error y explicar cómo se conectan interfaz, API y persistencia. |

## Cómo se conectan las etapas

Fundamentos → HTML → CSS → JavaScript → TypeScript → Java y objetos → métodos de objetos → colecciones → Lombok y DTO → genéricos y Reflection → programación funcional → bases de datos → JPA → JPQL → Spring → integración.

Git se introduce después de comprender archivos y carpetas y se practica durante el recorrido. Node.js y Vite se explican antes de usarlos en TypeScript. HTTP se presenta al consumir APIs en JavaScript y se retoma en profundidad al construir el backend.

## Proyectos que nos van a acompañar

### Una tienda que crece con lo que aprendés

1. HTML: estructura de un catálogo y formularios.
2. CSS: tarjetas de productos y diseño adaptable.
3. JavaScript: filtros, cantidades y carrito.
4. TypeScript: interfaces, módulos y consumo de API.
5. Java: modelos de producto, cliente y pedido.
6. Bases de datos y JPA: persistencia y relaciones.
7. Spring: endpoints y lógica de negocio.
8. Integración: aproximación progresiva a la consigna Food Store.

Los ejercicios iniciales son pequeños y educativos. La versión final se contrastará con la consigna completa; no damos por resueltos sus requisitos desde el principio.

### Facturación del campus

El modelo de facturas sirve para JPA, JPQL, DTO y operaciones REST. En integración seguiremos los archivos del frontend y backend descomprimidos. Los ejemplos del campus y las consignas no necesariamente tienen exactamente los mismos nombres o contratos: compararemos ambos antes de reutilizar código.

## Forma de trabajar una clase

Objetivo → explicación → ejemplo comentado → práctica guiada → práctica propia → corrección → resumen.

Para seguir: explicás la idea sin repetir una definición de memoria, resolvés un ejercicio pequeño y entendés la corrección. Si necesitás ayuda, usamos pistas graduales: primero una pregunta, luego una orientación y finalmente una solución explicada.

Al cerrar cada unidad haremos una práctica integradora local y un repaso de los errores encontrados. El registro de avance se actualiza con ejercicios realmente trabajados.

## Base documental y límites

El recorrido se apoya en las secciones, recursos y consignas recopiladas del curso Programación 3 - 2026 (Magni). Se revisaron consignas de Food Store, consumo de API con TypeScript, JPA, JPQL y CRUD de facturas, junto con la estructura y código principal de los proyectos comprimidos.

El PDF enlazado en el campus como programa académico identifica Programación I, ciclo 2025. Se conserva como fuente original, pero no se usa para atribuir requisitos o evaluación de Programación 3. También hay encabezados reutilizados en algunas páginas del campus; la organización se guía por el contenido y las consignas.

Los videos y las diapositivas externas se conservan como referencias; no se ha revisado íntegramente su contenido. Todas las clases están redactadas. La relación con los materiales y los límites de los ejemplos se documenta en FUENTES_Y_ALCANCE.md. No hace falta ver todos los recursos antes de comenzar la primera clase.

Este curso de apoyo no define las fechas, notas ni condiciones oficiales de aprobación. La práctica se trabaja en archivos locales y en el chat; las actividades del campus quedan bajo tu control.

## Clases disponibles

Las 134 clases del recorrido están preparadas, con prácticas y soluciones. Abrí cada guía de unidad para acceder a ellas. Podés estudiar sin esperar nuevas entregas en el chat.
