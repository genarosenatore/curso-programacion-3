# Clase 08.03 · DTO: diferencia con entidad y modelo de pantalla

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_02.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **dto: diferencia con entidad y modelo de pantalla**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un DTO transporta datos entre capas o aplicaciones. Define el contrato: qué campos se reciben o muestran. Una entidad de persistencia tiene responsabilidades diferentes. Exponer directamente una entidad puede revelar datos o acoplar la API a relaciones y detalles de almacenamiento.

Podemos tener DTO de entrada y DTO de salida distintos. Un cliente envía identificadores y cantidades; el backend calcula importes y decide información pública. Cambiar una tabla no debería obligar a cambiar cada pantalla si el contrato se mantiene.

## Ejemplo

```java
record ProductoDTO(long id, String nombre, int precioCentavos) {}
record CrearPedidoDTO(long productoId, int cantidad) {}
// El request no incluye un total calculado por el usuario.
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

ProductoDTO presenta datos de catálogo. CrearPedidoDTO pide una operación y contiene solo lo necesario para solicitarla. Los records son una opción, no la definición de DTO: también puede ser una clase común. Validar el id y cantidad sigue siendo obligatorio al procesar la petición.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá DTO de entrada y salida para registrar un cliente sin devolver una contraseña.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Copiar todos los campos de entidad a cualquier DTO sin pensar el contrato.

## Resumen para repasar

Un DTO transporta datos entre capas o aplicaciones. Define el contrato: qué campos se reciben o muestran.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_02.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_04.md)
