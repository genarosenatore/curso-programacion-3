# Clase 09.04 · Class y metadatos de una clase

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_03.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **class y metadatos de una clase**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Class representa información sobre una clase en ejecución. Producto.class obtiene su descriptor; objeto.getClass() el de su clase real. Reflection permite inspeccionar campos, métodos y constructores. getMethods incluye métodos públicos heredados; getDeclaredMethods se limita a los declarados, incluyendo no públicos.

No inspeccionamos datos de negocio con la misma facilidad que accedemos normalmente: Reflection tiene costos, restricciones y puede saltarse garantías si se usa mal. Primero lo usaremos para observar metadatos, sin modificar el estado de objetos.

## Ejemplo

```java
Class<?> tipo = String.class;
System.out.println(tipo.getSimpleName());
for (java.lang.reflect.Method metodo : tipo.getDeclaredMethods()) {
    if (metodo.getName().equals("length")) System.out.println(metodo.getName());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

Muestra String y el método length. El orden de métodos no es un contrato estable. Class<?> indica que tenemos información de una clase cuyo tipo concreto no necesitamos fijar. No se ejecuta length por enumerarlo.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Inspeccioná una clase propia Cliente y mostrale su nombre y sus campos declarados.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir nombre de atributo con su valor en un objeto particular.

## Resumen para repasar

Class representa información sobre una clase en ejecución. Producto.class obtiene su descriptor; objeto.getClass() el de su clase real.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_03.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_05.md)
