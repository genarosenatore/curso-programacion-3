# Clase 05.02 · Variables, tipos, operadores y consola

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_01.md) · [Clase siguiente](../05_Java/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **variables, tipos, operadores y consola**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Java distingue tipos primitivos, como int, double y boolean, y referencias, como String. Cada variable tiene un tipo. int representa enteros; double números en coma flotante; String texto entre comillas dobles. final impide reasignar una variable.

La división entre enteros descarta la parte fraccionaria. Si necesitamos una división decimal, al menos un operando debe tener el tipo apropiado. double no representa exactamente todos los decimales: para importes de negocio aprenderemos BigDecimal o centavos enteros.

## Ejemplo

```java
int cantidad = 3;
double precio = 800.0;
String nombre = "Lapicera";
boolean disponible = true;
System.out.println(nombre + ": " + precio * cantidad);
System.out.println(5 / 2);
System.out.println(5.0 / 2);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

Este fragmento va dentro de main. Muestra Lapicera: 2400.0, 2 y 2.5. La multiplicación se resuelve antes de concatenar el resultado al texto. Para comparar contenido de strings usamos equals, no ==, que compara referencias.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Calculá un promedio de tres enteros manteniendo decimales.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Asumir que 5/2 produce 2.5 porque la variable receptora es double.

## Resumen para repasar

Java distingue tipos primitivos, como int, double y boolean, y referencias, como String. Cada variable tiene un tipo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_01.md) · [Clase siguiente](../05_Java/CLASE_03.md)
