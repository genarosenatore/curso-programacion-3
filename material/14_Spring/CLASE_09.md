# Clase 14.09 · POST, PUT y DELETE

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_10.md)

## Qué vas a aprender

Vamos a trabajar **post, put y delete**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

POST del ejemplo crea y devuelve 201. PUT actualiza los campos editables definidos y devuelve la representación o un éxito sin cuerpo según contrato. DELETE devuelve 204 sin JSON. Cada método resuelve id y valida antes de escribir.

Para facturación, la consigna contempla eliminación o anulación según reglas. El historial contable puede requerir conservar registros y marcar estado, no borrarlos indiscriminadamente. En nuestro CRUD pequeño de productos usamos borrado físico de datos de práctica para mostrar el protocolo.

## Ejemplo

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

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

El DTO recibido no fija el id. La respuesta señala el nuevo recurso con Location. El ejemplo completo también implementa PUT y DELETE. El frontend debe tratar 204 antes de intentar json. Repetir POST crea otro producto salvo que exista una política de unicidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá DELETE por id y describí qué hace si el recurso no existe.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Borrar sin comprobar relaciones o políticas de historial del modelo real.

## Resumen para repasar

POST del ejemplo crea y devuelve 201. PUT actualiza los campos editables definidos y devuelve la representación o un éxito sin cuerpo según contrato.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_10.md)
