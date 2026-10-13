# Clase 14.10 · Errores, excepciones y ControllerAdvice

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_09.md) · [Clase siguiente](../14_Spring/CLASE_11.md)

## Qué vas a aprender

Vamos a trabajar **errores, excepciones y controlleradvice**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

@RestControllerAdvice centraliza manejo de excepciones de controllers. @ExceptionHandler traduce un tipo de error a código y cuerpo. El mensaje debería ayudar a quien llama sin exponer trazas internas, configuración o datos sensibles.

Distinguí una petición inválida, un recurso ausente y un fallo inesperado. Devolver 404 para cualquier excepción oculta problemas del programa. Una API coherente tiene una forma de error que el frontend pueda interpretar y mostrar; los detalles de validación pueden enumerar campos incorrectos.

## Ejemplo

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

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

NoEncontrado es una excepción definida por la aplicación. El advice convierte el fallo en una respuesta específica. Debe existir un manejador de validación adecuado y una política para errores inesperados; el proyecto de práctica incluye los casos comunes.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Relacioná nombre vacío, id inexistente y error interno de acceso a base con códigos y mensajes.

Abrí [los ejercicios y las pistas](EJERCICIOS_10.md). Las [soluciones explicadas](SOLUCIONES_10.md) están preparadas para consultar después de intentarlo.

## Error común

Exponer la traza completa de Java como mensaje visible de la API.

## Resumen para repasar

@RestControllerAdvice centraliza manejo de excepciones de controllers. @ExceptionHandler traduce un tipo de error a código y cuerpo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.10** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_09.md) · [Clase siguiente](../14_Spring/CLASE_11.md)
