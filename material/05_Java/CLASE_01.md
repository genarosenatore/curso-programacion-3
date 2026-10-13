# Clase 05.01 · JDK, JVM, código fuente y ejecución

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_10.md) · [Clase siguiente](../05_Java/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **jdk, jvm, código fuente y ejecución**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El JDK contiene herramientas para compilar y ejecutar Java; la JVM ejecuta bytecode. javac transforma .java en .class y java ejecuta una clase o aplicación. El curso utiliza la sintaxis clásica compatible con Java 21. Comprobá ambas herramientas y su versión antes de empezar.

main es el punto de entrada de nuestro programa de consola. public permite acceso, static evita crear un objeto para iniciar, void indica que no devuelve valor y String[] args recibe argumentos de la ejecución. No hace falta dominar cada palabra antes de ejecutar la primera prueba; las retomaremos en las clases siguientes.

## Ejemplo

```java
public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola, Java");
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

Guardá Hola.java con ese nombre porque contiene la clase pública Hola. Desde su carpeta ejecutá javac Hola.java y luego java Hola. Debe mostrar Hola, Java. Compilar comprueba reglas y genera bytecode; ejecutar realiza las instrucciones. También podés usar un IDE después de configurar el JDK.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Modificá el mensaje y volvé a compilar y ejecutar. Explicá qué pasa si ejecutás sin recompilar el .class.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Ejecutar java Hola.class: se usa el nombre de la clase sin esa extensión.

## Resumen para repasar

El JDK contiene herramientas para compilar y ejecutar Java; la JVM ejecuta bytecode. javac transforma .java en .class y java ejecuta una clase o aplicación.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_10.md) · [Clase siguiente](../05_Java/CLASE_02.md)
