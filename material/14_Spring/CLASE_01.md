# Clase 14.01 · HTTP: URL, petición, respuesta, JSON y códigos de estado

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **http: url, petición, respuesta, json y códigos de estado**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

HTTP intercambia peticiones y respuestas. Una petición tiene método, URL, cabeceras y a veces cuerpo. Una respuesta tiene código, cabeceras y cuerpo opcional. JSON es un formato frecuente del cuerpo, no el protocolo. Content-Type comunica su formato.

GET suele recuperar; POST crear o ejecutar una operación; PUT reemplazar o actualizar según el contrato; DELETE eliminar o aplicar una política documentada. 200 indica éxito con respuesta, 201 creación, 204 éxito sin cuerpo, 400 petición inválida y 404 recurso inexistente. Elegir el código hace parte del contrato.

## Ejemplo

```http
POST /api/productos
Content-Type: application/json

{"nombre":"Cuaderno","precio":2000.00,"stock":3}

Respuesta esperada: 201 Created, Location y JSON del producto creado.
```

[Abrir el fragmento como archivo](fragmentos/clase_01.http) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

El cliente no envía un programa Java, sino datos. El backend valida y crea una representación persistente. Location puede señalar el recurso recién creado. Una respuesta 204 no debería intentar parsearse como JSON porque no lleva cuerpo.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Describí petición y respuesta para consultar producto 1 y para consultar 999 inexistente.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir que la conexión respondió con que la operación del negocio salió bien.

## Resumen para repasar

HTTP intercambia peticiones y respuestas. Una petición tiene método, URL, cabeceras y a veces cuerpo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_08.md) · [Clase siguiente](../14_Spring/CLASE_02.md)
