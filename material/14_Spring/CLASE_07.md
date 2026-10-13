# Clase 14.07 · Endpoints GET y parámetros

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_06.md) · [Clase siguiente](../14_Spring/CLASE_08.md)

## Distinguir identidad de filtro

Un **endpoint** es una combinación de método y ruta atendida por el servidor. @GetMapping("/{id}") dentro de ruta base /api/productos atiende GET /api/productos/1. @PathVariable vincula ese segmento con el parámetro Long id; no consulta el producto por sí misma. Después el servicio decide existencia.

@RequestParam vincula consulta como ?nombre=cuaderno; puede ser opcional. Un id de recurso identifica uno; un filtro puede devolver muchos o ninguno. Esos resultados tienen contratos distintos:200 [] para lista sin coincidencias,404 para recurso pedido que no existe.

## Comprobar ruta, conversión y búsqueda

Para /1, Spring convierte "1" a Long y llama obtener. Para /abc, no puede convertir y el manejo preparado devuelve400. Para /999, convierte bien pero el servicio no encuentra y devuelve404. No atribuyas ambos a SQL o a CORS: fallan en etapas diferentes.

Ejecutá esas solicitudes en [la API local](../Ejemplos/spring/README.md) usando navegador o curl.exe -i. Una ruta escrita incorrectamente puede devolver404 sin haber llamado al método esperado. Mira la URL completa y el log antes de cambiar la búsqueda. El fragmento inferior presupone controller y servicio del proyecto.

Para construir filtros con datos que incluyan espacios, usa URLSearchParams en cliente en lugar de concatenar sin codificación: una URL debe representar el texto correctamente. Los parámetros de consulta HTTP no son los parámetros JPQL, aunque el servicio luego pase valores a una consulta segura.

Un listado grande necesita límites o paginación, pero los pocos datos locales permiten concentrarse en ruta y respuesta. No pongas un sistema completo de paginado como prerrequisito para entender un GET inicial.

## Ejemplo de la clase

```java
@org.springframework.web.bind.annotation.GetMapping("/{id}")
ProductoDTO obtener(@org.springframework.web.bind.annotation.PathVariable Long id) {
    return servicio.obtener(id);
}
// Consulta opcional: GET /api/productos?nombre=cuaderno
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El método pertenece al controller con ruta base /api/productos. Spring convierte el segmento a Long y puede rechazar una forma inválida. El servicio busca y devuelve DTO o lanza el error de inexistencia manejado por la aplicación.

## Cambiar una decisión y explorar un límite

?nombre=xyz devuelve200 y [] si no coincide. /api/producto/1 puede no coincidir con la ruta plural y devolver404 antes de repository. Código numérico válido no garantiza recurso existente.

## Confusión que conviene evitar

Devolver el mismo 200 con un mensaje de error para todos los fallos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_06.md) · [Clase siguiente](../14_Spring/CLASE_08.md)
