# API de productos · ejemplo de apoyo

[Guía de ejemplos](../../EJEMPLOS.md)

## Objetivo y alcance

Proyecto pequeño para aprender Spring, JPA y conexión con el navegador. Incluye CRUD de productos, categoría inicial, DTO de entrada/salida, validación, errores 400/404 y base H2 en memoria. No es el proyecto completo Food Store ni implementa el modelo de facturación del campus.

## Requisitos

- JDK 21. Comprobá java -version.
- Maven 3.6.3 o posterior. Comprobá mvn -version; debe usar un JDK compatible.
- Conexión para descargar dependencias en el primer arranque.

La versión de Spring Boot está fijada en pom.xml. No necesitás actualizarla para estudiar. Lombok queda configurado como dependencia opcional/procesador para poder probar sus fragmentos, aunque el modelo del ejemplo usa métodos manuales para que sean visibles.

## Ejecutar

Desde esta carpeta:

```text
mvn spring-boot:run
```

Esperá el mensaje de arranque. Abrí http://127.0.0.1:8080 y usá el formulario. Para detener, Ctrl+C en la terminal. Los datos se reinician al apagar; es intencional en esta práctica. Si 8080 está ocupado, podés usar mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081 y abrir ese puerto.

## Qué archivo estudiar

| Archivo en src/main/java/curso | Responsabilidad |
|---|---|
| Aplicacion.java | Arranque y datos de prueba |
| Categoria.java y Producto.java | Mapeo de entidades |
| ProductoRepository.java | Operaciones persistentes, método derivado y JPQL |
| ProductoRequest.java | Campos aceptados y validaciones |
| ProductoDTO.java | Respuesta pública |
| ProductoService.java | Transacciones, búsqueda y mapeo |
| ProductoController.java | HTTP y rutas |
| Errores.java | Traducción de fallos comunes |

src/main/resources/static contiene el cliente HTTP local. Al servirse desde el mismo origen, no necesita configurar CORS para este recorrido. application.properties prepara una base local descartable y limita el servidor a 127.0.0.1.

## Prueba guiada

1. Abrí el listado: aparecen Cuaderno y Lapicera.
2. Creá Mochila con precio 5000 y stock 2.
3. Anotá el id de su respuesta o consultá el listado.
4. Editá el producto y comprobá los nuevos datos mediante GET.
5. Eliminá y comprobá que su GET devuelve 404.
6. Probá POST con nombre vacío: debe devolver 400.
7. Probá id no numérico: debe devolver 400.

[peticiones.http](peticiones.http) contiene solicitudes listas para un cliente HTTP compatible. También podés usar herramientas de red del navegador. El archivo no se envía solo por abrirlo.

## Supuestos

- PUT recibe todos los campos editables requeridos; no es actualización parcial.
- Precio usa BigDecimal con dos decimales y validación de precisión.
- La categoría se carga en los productos iniciales y no se modifica desde este CRUD.
- Las consultas se mapean a DTO dentro de transacciones de lectura para no depender de relaciones lazy fuera del servicio.
- El ejemplo no tiene cuentas, autorización, reservas concurrentes de stock ni pagos. Esas capacidades requieren diseño adicional antes de aplicarlo a producción.

## Verificación

Consultá [VERIFICACION.md](../../VERIFICACION.md) para ver qué se pudo ejecutar en el entorno de preparación. No se afirma que una prueba de sintaxis sustituya arrancar el servidor y probar las peticiones.
