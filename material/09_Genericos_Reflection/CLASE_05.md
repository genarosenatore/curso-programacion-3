# Clase 09.05 · Inspección de campos, métodos y anotaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_04.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **inspección de campos, métodos y anotaciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un descriptor de método puede invocarse sobre una instancia con argumentos, pero esa operación puede fallar por acceso, firma o excepción de la implementación. Una anotación solo es consultable en ejecución si su retención lo permite, como RetentionPolicy.RUNTIME.

Reflection ayuda a comprender cómo herramientas detectan componentes, pero no es el mecanismo único de todos los frameworks. Para llamar un método conocido normalmente preferimos llamada directa: el compilador comprueba mejor esa forma.

## Ejemplo

```java
class Saludo {
    public String texto() { return "Hola"; }
}
// Dentro de main declarado con throws ReflectiveOperationException:
Saludo saludo = new Saludo();
var metodo = Saludo.class.getMethod("texto");
System.out.println(metodo.invoke(saludo));
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

getMethod busca el método público sin parámetros. invoke lo ejecuta sobre saludo y devuelve Object. Si el método lanza una excepción, Reflection puede envolverla en InvocationTargetException. Una llamada directa saludo.texto() es más clara cuando conocemos la operación al compilar.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí una anotación Marca visible en ejecución y comprobá si una clase la tiene.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que todas las anotaciones están disponibles mediante Reflection.

## Resumen para repasar

Un descriptor de método puede invocarse sobre una instancia con argumentos, pero esa operación puede fallar por acceso, firma o excepción de la implementación. Una anotación solo es consultable en ejecución si su retención lo permite, como RetentionPolicy.RUNTIME.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_04.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_06.md)
