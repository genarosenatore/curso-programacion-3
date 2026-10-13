# Clase 09.01 · Clases y métodos genéricos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_06.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **clases y métodos genéricos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un parámetro de tipo permite escribir una clase sin fijar un único tipo de contenido. T es un nombre convencional, no una palabra especial. Caja<String> y Caja<Integer> comparten implementación pero el compilador conserva qué dato puede guardarse y recuperarse.

En Java, los parámetros de tipo usan referencias, no primitivos: Integer en vez de int. Un método también puede introducir su propio tipo antes del retorno. El borrado de tipos implica que muchas diferencias genéricas no se conservan como tipos separados durante ejecución.

## Ejemplo

```java
class Caja<T> {
    private final T contenido;
    Caja(T contenido) { this.contenido = contenido; }
    T obtener() { return contenido; }
}
static <T> T identidad(T valor) { return valor; }
// Caja<String> caja = new Caja<>("Hola");
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

obtener devuelve String cuando la variable es Caja<String>, sin una conversión manual. <> permite inferir el tipo de la construcción. El método identidad relaciona el tipo recibido con el devuelto. No usar Caja sin parámetro ayuda a evitar tipos crudos y errores ocultos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá cajas para un texto y un entero y explicá por qué Caja<int> no es válido.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Usar Object y conversiones por todas partes cuando un genérico expresa la relación.

## Resumen para repasar

Un parámetro de tipo permite escribir una clase sin fijar un único tipo de contenido. T es un nombre convencional, no una palabra especial.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_06.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_02.md)
