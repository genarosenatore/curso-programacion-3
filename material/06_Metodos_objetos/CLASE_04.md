# Clase 06.04 · hashCode y relación con equals

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_03.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **hashcode y relación con equals**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

hashCode devuelve un entero usado para distribuir búsquedas en colecciones basadas en hash. Si equals considera iguales dos objetos, deben tener el mismo hashCode. Dos objetos distintos pueden tener el mismo hash: se llama colisión y no implica igualdad.

La regla debe usar los mismos datos relevantes que equals. Cambiar esos datos después de insertar como clave o elemento puede impedir encontrarlo donde la colección lo ubicó. Por eso usamos un código inmutable. El hash no sirve como identificador único universal.

## Ejemplo

```java
// Usando Producto final de la clase anterior:
Producto a = new Producto("P01");
Producto b = new Producto("P01");
System.out.println(a.equals(b));
System.out.println(a.hashCode() == b.hashCode());
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Usá las clases definidas en esta lección o en la anterior. El programa completo de igualdad permite verificar los contratos.

## Leamos el ejemplo paso a paso

Ambas líneas muestran true. La segunda es una consecuencia de la regla correcta, pero el mismo hash por sí solo no demuestra que sean iguales. La colección decide igualdad usando equals, además de su organización por hash.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué ocurre si equals usa código y hashCode usa precio.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que hashes distintos son el único caso importante y que no pueden existir colisiones.

## Resumen para repasar

hashCode devuelve un entero usado para distribuir búsquedas en colecciones basadas en hash. Si equals considera iguales dos objetos, deben tener el mismo hashCode.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **06.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_03.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_05.md)
