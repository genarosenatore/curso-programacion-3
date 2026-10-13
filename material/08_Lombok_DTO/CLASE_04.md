# Clase 08.04 · Mapeo entre entidad y DTO

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_03.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **mapeo entre entidad y dto**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Mapear consiste en transformar datos entre representaciones. Un mapeo manual explícito es fácil de entender y permite elegir qué campo corresponde a cuál. No toda relación debe copiarse completa: el DTO puede incluir un id, un nombre o una proyección específica.

El mapeo de salida consulta datos; el de entrada debe resolver identificadores y validar reglas. Crear una entidad vacía y asignarle un id no garantiza que exista en la base. Aprenderemos a buscar esas relaciones en la capa de servicios.

## Ejemplo

```java
record Producto(String codigo, String nombre, int precioCentavos) {}
record ProductoDTO(String codigo, String nombre, int precioCentavos) {}
static ProductoDTO aDTO(Producto producto) {
    return new ProductoDTO(producto.codigo(), producto.nombre(), producto.precioCentavos());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

El método toma un objeto y construye otro. En este ejemplo ambos son records para concentrarnos en el mapeo. Si la entidad tuviera datos internos, simplemente no se incluirían en la salida. Los valores del dominio no cambian porque se prepare una representación.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Añadí stock al modelo y disponibilidad:boolean al DTO, calculada desde stock.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir mapear con validar o guardar automáticamente.

## Resumen para repasar

Mapear consiste en transformar datos entre representaciones. Un mapeo manual explícito es fácil de entender y permite elegir qué campo corresponde a cuál.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_03.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_05.md)
