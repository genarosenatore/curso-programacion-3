# Clase 14.10 · Errores, excepciones y ControllerAdvice

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_09.md) · [Clase siguiente](../14_Spring/CLASE_11.md)

## Traducir una causa a una respuesta uniforme

Una excepción Java no es todavía una respuesta HTTP. @RestControllerAdvice declara un componente para tratar excepciones que llegan desde controllers. @ExceptionHandler selecciona un tipo de causa y el método construye estado/cuerpo. Esto evita repetir try/catch de traducción en cada endpoint.

NoEncontrado es una clase de la aplicación que extiende RuntimeException. El servicio la lanza si una búsqueda requerida falla. error.getMessage conserva su explicación y el handler devuelve404 con ErrorDTO. No traduce cualquier NullPointerException a recurso ausente: un fallo de programación necesita otra política y diagnóstico.

## Distinguir caminos de error

Petición inválida puede surgir al leer JSON, convertir id o validar DTO y merece400 en los casos del ejemplo. Ausencia requerida404. Conflicto con estado actual podría requerir409 si la API lo define. Fallo inesperado500 con mensaje público apropiado y causa registrada en servidor. No inventes una falla de stock como404 si el producto sí existe.

En [el proyecto](../Ejemplos/spring/README.md), Errores.java incluye manejadores de entrada y ausencia; lee su forma real antes de escribir el cliente. El fragmento inferior concentra NoEncontrado y requiere su definición existente. Un ErrorDTO tiene datos de salida, no una traza completa para publicar.

La interfaz comprueba ok y, cuando hay error, interpreta el cuerpo según su formato. No todos los fallos tienen JSON: un intermediario o servidor puede devolver otro contenido; leer text primero o comprobar Content-Type evita perder la causa por un segundo error de parseo. Registrar mensaje técnico en la consola de desarrollo ayuda, mientras el usuario recibe una acción comprensible.

No capturar todo en service para devolver null: puede esconder rollback y hacer que controller responda éxito. Manejo de transacción y traducción HTTP deben conservar la causa y el significado.

## Ejemplo de la clase

```java
record ErrorDTO(String mensaje) {}
@org.springframework.web.bind.annotation.RestControllerAdvice
class Errores {
    @org.springframework.web.bind.annotation.ExceptionHandler(NoEncontrado.class)
    org.springframework.http.ResponseEntity<ErrorDTO> noEncontrado(NoEncontrado error) {
        return org.springframework.http.ResponseEntity.status(404).body(new ErrorDTO(error.getMessage()));
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_10.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

NoEncontrado es una excepción definida por la aplicación. El advice convierte el fallo en una respuesta específica. Debe existir un manejador de validación adecuado y una política para errores inesperados; el proyecto de práctica incluye los casos comunes.

## Cambiar una decisión y explorar un límite

Un producto ausente provoca NoEncontrado y404. Un id mal formado produce otro error y400. Retornar404 para todo escondería un servidor defectuoso y dificultaría corregirlo. Un JSON de error con HTTP200 hace que ok no detecte el fallo.

## Confusión que conviene evitar

Exponer la traza completa de Java como mensaje visible de la API.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_10.md). Las [soluciones razonadas](SOLUCIONES_10.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_09.md) · [Clase siguiente](../14_Spring/CLASE_11.md)
