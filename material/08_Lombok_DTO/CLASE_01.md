# Clase 08.01 · Anotaciones y código repetitivo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_07.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **anotaciones y código repetitivo**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una anotación añade metadatos o activa herramientas que interpretan el código. @Override es comprobada por el compilador. Las anotaciones de Lombok generan código durante la compilación: sin la dependencia y el procesador configurado, sus métodos no aparecen.

Antes de automatizar, entendé el código manual. Un getter devuelve un atributo y un constructor lo inicializa. Lombok reduce repetición, pero no define por vos las reglas del dominio ni convierte una clase en DTO o entidad.

## Ejemplo

```java
class ProductoManual {
    private final String nombre;
    ProductoManual(String nombre) { this.nombre = nombre; }
    String getNombre() { return nombre; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

Este ejemplo no necesita Lombok y permite ver qué se automatiza. Una anotación no es una llamada que se ejecuta al recorrer main. En el proyecto de Spring preparado, Lombok se declara como dependencia y procesador; las clases de esta unidad distinguen fragmentos de Java puro y fragmentos que la necesitan.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Identificá qué partes son repetitivas y cuál podría necesitar una regla adicional.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Agregar una anotación esperando que el IDE descargue y configure cualquier dependencia.

## Resumen para repasar

Una anotación añade metadatos o activa herramientas que interpretan el código. @Override es comprobada por el compilador.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_07.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_02.md)
