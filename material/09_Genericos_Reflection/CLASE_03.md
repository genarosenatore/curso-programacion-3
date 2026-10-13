# Clase 09.03 · Prácticas de genéricos del campus

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_02.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **prácticas de genéricos del campus**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una práctica genérica debe tener una razón para relacionar tipos. Un almacén que guarda y recupera un mismo tipo es un buen caso. Un método de impresión que acepta cualquier cosa no siempre necesita genéricos: Object puede ser suficiente si no relaciona entrada y salida.

El material del campus propone contenedores y métodos. Vamos a verificar compatibilidad, comportamiento de ausencia y separación de responsabilidades. Los genéricos no definen una base de datos ni una colección completa por sí solos.

## Ejemplo

```java
interface Contenedor<T> { void guardar(T valor); T obtener(); }
class ContenedorSimple<T> implements Contenedor<T> {
    private T valor;
    public void guardar(T valor) { this.valor = valor; }
    public T obtener() { return valor; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

Los métodos son públicos por el contrato de interface. Antes de guardar, obtener devuelve null porque valor es una referencia sin asignación inicial. Esa ausencia debe documentarse o modelarse con Optional. Después de guardar, recuperar mantiene el mismo tipo.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Usá un Contenedor<String> y explicá qué error impide guardar un Integer.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Dar por existente el contenido antes de guardarlo y provocar null.

## Resumen para repasar

Una práctica genérica debe tener una razón para relacionar tipos. Un almacén que guarda y recupera un mismo tipo es un buen caso.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_02.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_04.md)
