# Clase 14.02 · API, recursos y operaciones CRUD

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_01.md) · [Clase siguiente](../14_Spring/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **api, recursos y operaciones crud**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una API define cómo otros programas interactúan. Una API REST organiza recursos identificados por URLs y operaciones con semántica HTTP. CRUD significa crear, leer, actualizar y eliminar. Los nombres de rutas deben ser coherentes y el contrato explicar qué devuelve cada operación.

Idempotencia significa que repetir la misma petición produce el mismo efecto pretendido sobre el estado; no exige la misma respuesta. DELETE repetido puede dar 204 primero y 404 después sin dejar de buscar un mismo efecto. POST de creación puede duplicar si no hay otra regla.

## Ejemplo

```http
GET    /api/productos
GET    /api/productos/1
POST   /api/productos
PUT    /api/productos/1
DELETE /api/productos/1
```

[Abrir el fragmento como archivo](fragmentos/clase_02.http) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

La colección y un recurso concreto se distinguen por el id. PUT del ejemplo recibe todos los campos editables requeridos; si querés modificaciones parciales, definí un contrato apropiado como PATCH. No uses GET para cambiar stock o borrar productos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Proponé rutas para listar pedidos, crear uno y obtener uno por id.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que un método se comporta correctamente solo por tener una ruta con nombre REST.

## Resumen para repasar

Una API define cómo otros programas interactúan. Una API REST organiza recursos identificados por URLs y operaciones con semántica HTTP.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_01.md) · [Clase siguiente](../14_Spring/CLASE_03.md)
