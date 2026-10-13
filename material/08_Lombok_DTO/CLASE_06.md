# Clase 08.06 · Práctica: DTO de producto y factura

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_05.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: dto de producto y factura**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La práctica de DTO conecta el modelo con una vista sin añadir todavía una API. Vamos a transformar productos a objetos de salida y mostrar solo los campos definidos. Las consignas de facturación usarán luego DTO de reporte y entrada con estructuras más amplias.

Escribí ejemplos manuales antes de incorporar Lombok. Después compará las firmas de acceso generadas y verificá que las reglas sigan vigentes. Reducir líneas no es la única meta: el contrato debe seguir siendo claro.

## Ejemplo

```java
record Producto(String codigo, String nombre, int precioCentavos, int stock) {}
record ProductoVista(String codigo, String nombre, boolean disponible) {}
static ProductoVista presentar(Producto p) {
    return new ProductoVista(p.codigo(), p.nombre(), p.stock() > 0);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

La salida omite precio en este contrato de ejemplo y transforma stock en una condición. Otro DTO del catálogo podría requerir precio; no existe un único DTO obligatorio para cada entidad. Usar nombres distintos hace visible la diferencia de responsabilidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá un DTO para una tarjeta de producto con nombre, precio y disponibilidad. Probá dos stocks distintos.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Afirmar que usar un DTO impide todo problema de permisos sin revisar qué datos expone.

## Resumen para repasar

La práctica de DTO conecta el modelo con una vista sin añadir todavía una API. Vamos a transformar productos a objetos de salida y mostrar solo los campos definidos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_05.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_01.md)
