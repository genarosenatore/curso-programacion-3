# Clase 10.03 · Referencias a métodos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_02.md) · [Clase siguiente](../10_Funcional/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **referencias a métodos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una referencia a método es una forma abreviada de una lambda que delega directamente en un método compatible. String::toUpperCase puede representar s -> s.toUpperCase(); System.out::println una acción de impresión. Tipo::new puede referenciar un constructor.

La compatibilidad depende del contrato esperado. No todas las lambdas se simplifican a una referencia: si hacemos varias operaciones o agregamos argumentos calculados, una lambda puede ser más clara.

## Ejemplo

```java
java.util.function.Function<String, String> mayusculas = String::toUpperCase;
java.util.function.Consumer<String> mostrar = System.out::println;
mostrar.accept(mayusculas.apply("ana"));
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

Muestra ANA. Function recibe un String y devuelve String, encajando con el método de instancia toUpperCase. Para resultados reproducibles de mayúsculas según idioma, podés usar una lambda s->s.toUpperCase(Locale.ROOT) cuando la regla lo requiera.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Reescribí s -> s.length() como referencia y explicá qué recibe.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Usar referencias solo para acortar aunque vuelva menos evidente la intención.

## Resumen para repasar

Una referencia a método es una forma abreviada de una lambda que delega directamente en un método compatible. String::toUpperCase puede representar s -> s.toUpperCase(); System.out::println una acción de impresión.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_02.md) · [Clase siguiente](../10_Funcional/CLASE_04.md)
