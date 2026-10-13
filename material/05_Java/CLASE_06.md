# Clase 05.06 · static, referencias y null

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_05.md) · [Clase siguiente](../05_Java/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **static, referencias y null**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una referencia permite acceder a un objeto. Asignarla a otra variable no copia el objeto. null indica ausencia de referencia y acceder a un método o atributo sobre null produce NullPointerException. Antes de usar un resultado que puede faltar, hay que decidir cómo manejarlo.

Un miembro static pertenece a la clase y es compartido por sus instancias. No usamos static para solucionar todos los problemas de acceso desde main: las operaciones que trabajan sobre el estado de un objeto suelen ser de instancia.

## Ejemplo

```java
class Contador {
    static int creados = 0;
    int valor = 0;
    Contador() { creados++; }
}
// En main:
Contador a = new Contador();
Contador b = a;
b.valor = 7;
System.out.println(a.valor);
System.out.println(Contador.creados);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

Muestra 7 y 1. b apunta al mismo objeto que a; no hubo un segundo constructor. creados se consulta por el nombre de la clase porque es compartido. Si creamos otro new Contador, hay otro valor de instancia y creados aumenta a 2.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá la diferencia entre Contador b=a y Contador b=new Contador().

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Usar null como si fuera un objeto vacío con valores por defecto.

## Resumen para repasar

Una referencia permite acceder a un objeto. Asignarla a otra variable no copia el objeto.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_05.md) · [Clase siguiente](../05_Java/CLASE_07.md)
