# Clase 05.03 · Condiciones, bucles, arrays y métodos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_02.md) · [Clase siguiente](../05_Java/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **condiciones, bucles, arrays y métodos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Java reutiliza condiciones y bucles, pero exige tipos y sintaxis propia. Un array tiene tamaño fijo y usa length sin paréntesis. Un método define retorno, nombre y parámetros. Un método static puede llamarse desde main sin instanciar la clase.

Un for mejorado recorre cada elemento. Un acumulador fuera del recorrido conserva el resultado. Separar el cálculo en un método facilita probarlo con un array vacío y con distintos valores. En esta etapa aprendemos la estructura antes de pasar a colecciones de tamaño variable.

## Ejemplo

```java
static int sumar(int[] valores) {
    int total = 0;
    for (int valor : valores) {
        total += valor;
    }
    return total;
}
// Dentro de main: System.out.println(sumar(new int[]{100, 200, 300}));
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

El método se escribe dentro de la clase, fuera de main. Recibe un array y devuelve 600 para los datos indicados. En un array vacío, el bucle no entra y devuelve cero. El ejemplo asume que valores no es null; más adelante decidiremos cómo representar o rechazar esa ausencia.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Escribí contarPositivos(int[] valores), que devuelva cuántos elementos superan cero.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Poner un método dentro de otro método: en esta estructura Java no lo permite.

## Resumen para repasar

Java reutiliza condiciones y bucles, pero exige tipos y sintaxis propia. Un array tiene tamaño fijo y usa length sin paréntesis.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_02.md) · [Clase siguiente](../05_Java/CLASE_04.md)
