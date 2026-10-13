# Clase 14.02 · API, recursos y operaciones CRUD

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_01.md) · [Clase siguiente](../14_Spring/CLASE_03.md)

## Un contrato para otros programas

Una API define operaciones, entradas y salidas para que otro programa interactúe. REST es un estilo arquitectónico que, aplicado a HTTP, modela recursos y utiliza la semántica del protocolo, con otras restricciones como mensajes comprensibles sin estado de conversación implícito. Una lista de rutas CRUD es una práctica de API HTTP; no demuestra por sí sola todas las propiedades de REST.

CRUD abrevia crear, leer, actualizar y eliminar. `/api/productos` identifica colección y `/api/productos/1` un recurso. GET consulta sin solicitar un cambio del negocio; POST del ejemplo crea; PUT reemplaza los campos editables definidos de un recurso; DELETE solicita retirarlo según política. PATCH puede definir actualización parcial con un contrato adicional.

## Repetir una petición

**Idempotencia** significa conservar el mismo efecto pretendido al repetir la misma petición. PUT con el mismo contenido deja el mismo estado final; DELETE repetido deja el recurso ausente, aunque el segundo devuelva404. POST de creación puede generar dos productos al repetirse si no hay otra política de deduplicación.

GET se considera seguro porque no solicita mutar estado del negocio, aunque el servidor registre logs. No uses GET para cambiar stock: navegadores, caches o previsualizaciones pueden recuperarlo suponiendo lectura. El nombre de ruta no corrige un método con efectos indebidos.

Para estudiar, armá una tabla con método, ruta, entrada, éxito y ausencia para cada operación. Después ejecutá [peticiones.http](../Ejemplos/spring/peticiones.http) tras iniciar la API como en14.03. Los bloques inferiores son un mapa de endpoints, no solicitudes completas con host o cuerpos.

Una eliminación contable puede significar anular conservando histórico en vez de borrar físicamente. El CRUD de productos usa datos de práctica; no determina las reglas de las facturas. Documentá esa elección sin inventar obligaciones del campus.

## Ejemplo de la clase

```http
GET    /api/productos
GET    /api/productos/1
POST   /api/productos
PUT    /api/productos/1
DELETE /api/productos/1
```

[Abrir el fragmento como archivo](fragmentos/clase_02.http) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La colección y un recurso concreto se distinguen por el id. PUT del ejemplo recibe todos los campos editables requeridos; si querés modificaciones parciales, definí un contrato apropiado como PATCH. No uses GET para cambiar stock o borrar productos.

## Cambiar una decisión y explorar un límite

Repetir POST con idéntico JSON puede crear ids distintos. Repetir DELETE puede devolver204 y luego404 con el mismo efecto final de ausencia. Idempotencia no exige idéntico texto ni número de respuesta.

## Confusión que conviene evitar

Suponer que un método se comporta correctamente solo por tener una ruta con nombre REST.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_01.md) · [Clase siguiente](../14_Spring/CLASE_03.md)
