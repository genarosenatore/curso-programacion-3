# Clase 09.06 · Práctica de Reflection y relación con frameworks

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica de reflection y relación con frameworks**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Vamos a conectar los dos temas sin confundirlos: los genéricos comprueban relaciones de tipos principalmente durante compilación y Reflection observa estructura en ejecución. Un listado de atributos puede servir como ejercicio de exploración; un contenedor genérico sirve para conservar seguridad de tipos.

La práctica del campus usa clases y casos de reflexión. Hacé primero una clase pequeña cuyos campos conocés, anticipá la salida y comparala. Evitá comenzar con una aplicación grande donde no sepas qué está recorriendo.

## Ejemplo

```java
record Cliente(String nombre, String correo) {}
for (var componente : Cliente.class.getRecordComponents()) {
    System.out.println(componente.getName() + ": " + componente.getType().getSimpleName());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las clases y métodos se declaran fuera de main; los recorridos van dentro de main. Reflection puede requerir manejar excepciones.

## Leamos el ejemplo paso a paso

Muestra nombre:String y correo:String. Para records, getRecordComponents expresa sus componentes directamente. Para una clase común usaríamos campos o métodos según el objetivo. El código observa nombres y tipos; no conoce valores de un cliente concreto.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Guardá un Cliente en Caja<Cliente> e inspeccioná su clase. Explicá qué comprueba cada mecanismo.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Pretender usar Reflection para reemplazar toda comprobación de tipos en código ordinario.

## Resumen para repasar

Vamos a conectar los dos temas sin confundirlos: los genéricos comprueban relaciones de tipos principalmente durante compilación y Reflection observa estructura en ejecución. Un listado de atributos puede servir como ejercicio de exploración; un contenedor genérico sirve para conservar seguridad de tipos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **09.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_01.md)
