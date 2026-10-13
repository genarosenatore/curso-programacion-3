# Clase 14.09 · POST, PUT y DELETE

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_10.md)

## Escribir con una respuesta verificable

POST del CRUD recibe DTO válido, crea una entidad nueva y devuelve201. ResponseEntity permite controlar estado, cabeceras y cuerpo: created(URI) prepara201 con Location y body añade el DTO creado. El cliente puede consultar esa dirección para comprobar el resultado.

PUT /{id} recibe todos los campos editables del contrato, busca la entidad existente y los aplica. El id de ruta decide qué recurso; no aceptamos cambiarlo mediante un campo generado en el cuerpo. DELETE /{id} busca y elimina según la política definida y retorna204 sin cuerpo. Para un recurso inexistente el proyecto utiliza404.

## Seguir el código del ejemplo

crear recibe entrada por RequestBody con Valid. servicio.crear valida sus reglas, construye Producto y guarda. creado.id() consulta el componente del DTO de salida; URI.create forma la referencia de recurso. El retorno describe la creación, no un mensaje genérico200 que obligue a adivinar qué pasó.

Probá en [la API](../Ejemplos/spring/README.md): creá Mochila, anotá el id devuelto, obtenelo, actualizá, volvé a obtener, eliminá y obtenelo una vez más. Conservá cuerpo y estado de cada paso. Un formulario que muestra «éxito» sin consultar ni revisar HTTP no demuestra persistencia correcta.

Una respuesta204 exige que el cliente termine sin json(). Los precios siguen su precisión declarada. Las relaciones pueden impedir eliminar objetos vinculados; el ejemplo pequeño controla alcance y no impone borrado físico a facturas reales. Anular conservando histórico sería otro contrato.

Repetir POST puede crear otro id; un botón deshabilitado no reemplaza política de deduplicación. PUT tiene intención idempotente de estado final, mientras actualizar sumando cantidad en cada repetición ya no representa ese reemplazo simple. Nombra y documenta lo que tu operación realiza.

## Ejemplo de la clase

```java
@org.springframework.web.bind.annotation.PostMapping
org.springframework.http.ResponseEntity<ProductoDTO> crear(
    @jakarta.validation.Valid @org.springframework.web.bind.annotation.RequestBody ProductoRequest entrada) {
    ProductoDTO creado = servicio.crear(entrada);
    return org.springframework.http.ResponseEntity.created(
        java.net.URI.create("/api/productos/" + creado.id())).body(creado);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_09.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El DTO recibido no fija el id. La respuesta señala el nuevo recurso con Location. El ejemplo completo también implementa PUT y DELETE. El frontend debe tratar 204 antes de intentar json. Repetir POST crea otro producto salvo que exista una política de unicidad.

## Cambiar una decisión y explorar un límite

Tras DELETE exitoso, GET del mismo id devuelve404 en este contrato. Intentar json sobre204 produce error del cliente posterior al éxito del servidor. Omitir un campo obligatorio de PUT no es una actualización parcial automáticamente.

## Confusión que conviene evitar

Borrar sin comprobar relaciones o políticas de historial del modelo real.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_10.md)
