# Clase 09.02 · Límites de tipos y wildcards

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_01.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **límites de tipos y wildcards**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un límite como T extends Number restringe tipos permitidos y habilita operaciones del contrato Number. Una wildcard ? expresa un tipo desconocido. ? extends T resulta útil cuando leemos valores como T; ? super T cuando agregamos valores de T. La regla se recuerda como productor extends, consumidor super, pero hay que entender cada operación.

List<Integer> no es subtipo de List<Number>: si lo fuera, podríamos insertar un Double en una lista de Integer. Con una vista ? extends Number podemos leer Number sin insertar cualquier número.

## Ejemplo

```java
static double sumar(java.util.List<? extends Number> valores) {
    double total = 0;
    for (Number valor : valores) total += valor.doubleValue();
    return total;
}
// sumar(List.of(1,2)); sumar(List.of(1.5,2.5));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

Los dos arrays de lista se aceptan como productores de Number. Dentro no sabemos si la lista concreta admite Integer o Double, por eso no añadimos cualquiera de esos tipos. doubleValue expresa una conversión numérica para este cálculo didáctico, no una política de precisión monetaria.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué no podés añadir 2.5 a List<? extends Number>.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Interpretar extends como permiso para agregar cualquier subclase del límite.

## Resumen para repasar

Un límite como T extends Number restringe tipos permitidos y habilita operaciones del contrato Number. Una wildcard ? expresa un tipo desconocido.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_01.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_03.md)
