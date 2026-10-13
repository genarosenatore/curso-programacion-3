# Clase 14.07 · Endpoints GET y parámetros

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_06.md) · [Clase siguiente](../14_Spring/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **endpoints get y parámetros**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

@GetMapping expone recuperación. @PathVariable lee parte de ruta y @RequestParam un parámetro de consulta. Un filtro opcional no es lo mismo que un id obligatorio. Si el recurso no existe, una excepción de dominio o una respuesta controlada se traduce a 404.

Para listas, una búsqueda sin coincidencias suele devolver 200 con array vacío. Para un recurso por id, devolver null con 200 confunde ausencia y éxito. El contrato debe diferenciar ambos casos. Un listado grande necesitará paginación, aunque nuestro ejercicio tenga pocos productos.

## Ejemplo

```java
@org.springframework.web.bind.annotation.GetMapping("/{id}")
ProductoDTO obtener(@org.springframework.web.bind.annotation.PathVariable Long id) {
    return servicio.obtener(id);
}
// Consulta opcional: GET /api/productos?nombre=cuaderno
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

El método pertenece al controller con ruta base /api/productos. Spring convierte el segmento a Long y puede rechazar una forma inválida. El servicio busca y devuelve DTO o lanza el error de inexistencia manejado por la aplicación.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí respuesta para listado vacío, id ausente e id con texto no numérico.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Devolver el mismo 200 con un mensaje de error para todos los fallos.

## Resumen para repasar

@GetMapping expone recuperación. @PathVariable lee parte de ruta y @RequestParam un parámetro de consulta.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_06.md) · [Clase siguiente](../14_Spring/CLASE_08.md)
