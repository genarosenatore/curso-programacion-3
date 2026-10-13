# Clase 14.06 · Capas: Controller, Service y Repository

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_05.md) · [Clase siguiente](../14_Spring/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **capas: controller, service y repository**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Controller interpreta HTTP y traduce datos de entrada y salida. Service aplica reglas y coordina la operación. Repository accede a persistencia. Esa separación evita poner todos los cálculos, consultas y códigos HTTP en una sola clase.

Un controller puede devolver DTO; un servicio recuperar entidades y mapearlas antes de salir de la transacción. No todo proyecto necesita capas idénticas para cada clase, pero sí responsabilidades legibles. El repositorio no conoce cómo mostrar botones ni mensajes de la pantalla.

## Ejemplo

```java
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/productos")
class ProductoController {
    private final ProductoService servicio;
    ProductoController(ProductoService servicio) { this.servicio = servicio; }
    @org.springframework.web.bind.annotation.GetMapping
    java.util.List<ProductoDTO> listar() { return servicio.listar(null); }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

RestController escribe el retorno en la respuesta mediante conversión configurada. El controlador delega en el servicio y no arma SQL aquí. ProductoDTO y listar deben existir en el proyecto; el ejemplo completo incluye ambos y un repositorio.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Ubicá tres tareas: leer id de la URL, validar stock para una compra y consultar producto por id.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que crear archivos con sufijos Controller y Service basta si todos duplican la misma lógica.

## Resumen para repasar

Controller interpreta HTTP y traduce datos de entrada y salida. Service aplica reglas y coordina la operación.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_05.md) · [Clase siguiente](../14_Spring/CLASE_07.md)
