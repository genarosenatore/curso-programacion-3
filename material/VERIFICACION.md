# Verificación de los materiales

[Inicio](INICIO.md) · [Ejemplos](EJEMPLOS.md)

Revisión final: 10 de octubre de 2026.

| Comprobación | Resultado |
|---|---|
| Índice del curso | 134 clases distribuidas en 16 unidades. |
| Prácticas y soluciones | Un archivo de ejercicios y uno de soluciones por clase. |
| Enlaces locales Markdown | Comprobados contra archivos existentes. |
| TypeScript | Compilación con TypeScript 5.6.3 y configuración estricta sin errores. Se incluye dist/main.js. |
| Java | Se compilaron y ejecutaron los seis ejemplos independientes con Java 21. |
| JavaScript | Sintaxis comprobada; pruebas de búsqueda, cantidades inválidas, límite de stock, subtotal, total y carrito vacío superadas. |
| SQL | Esquema y consultas ejecutados en SQLite: categorías vacías, factura de 480000 centavos y rollback que conserva el precio. |
| Spring | pom.xml analizado como XML. Código y configuración revisados; el proyecto no se compiló ni arrancó porque Maven y sus dependencias no están disponibles en este entorno. |
| Interfaz de los ejemplos | La comprobación interactiva del navegador quedó pendiente por una interrupción de la herramienta. No se afirma una prueba visual completa. |

Los fragmentos de las clases ilustran una idea y no se compilan individualmente cuando requieren el modelo o framework. Las comprobaciones ejecutadas corresponden a los proyectos identificados en Ejemplos. La compilación y las pruebas acotadas ayudan a detectar errores, pero no garantizan todos los comportamientos posibles.

## Resultados observados en Java

- Fundamentos y objetos: stock final 3; subtotal 400000; una cantidad inválida se rechaza sin modificar el stock.
- Igualdad: identidad false, igualdad true, hash coherente true y dos códigos únicos.
- Colecciones: cuatro elementos en la lista y tres en el set; conteos y eliminación según el ejemplo.
- DTO: producto disponible true.
- Genéricos y Reflection: valor Ana; componentes nombre y correo de tipo String.
- Funcional: totales Libros 50000 y Útiles 30000; filtro devuelve Libros; suma vacía 0.

## Para comprobar Spring en tu equipo

Seguí el [README del proyecto](Ejemplos/spring/README.md). Compilá con Maven, iniciá la API y ejecutá las peticiones de peticiones.http. Comprobá listado, creación, modificación, eliminación, identificador inexistente y entrada inválida. El proyecto usa una base H2 en memoria: los datos de práctica se reinician al arrancar.
