# Clase 05.09 · Excepciones y manejo de errores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_08.md) · [Clase siguiente](../05_Java/CLASE_10.md)

## Qué vas a aprender

Vamos a trabajar **excepciones y manejo de errores**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una excepción representa una situación que impide continuar normalmente. throw lanza; try rodea una operación; catch maneja un tipo de fallo; finally permite cerrar una acción independientemente del resultado. No todas las excepciones deben atraparse en el mismo lugar.

Una excepción comprobada exige manejar o declarar el caso; una RuntimeException no exige esa declaración, pero sigue necesitando una política de manejo. No captures Exception para ocultar todo: podés perder la causa y mostrar un resultado falso. Los recursos que implementan AutoCloseable se gestionan con try-with-resources.

## Ejemplo

```java
try {
    int cantidad = Integer.parseInt("dos");
    System.out.println(cantidad);
} catch (NumberFormatException error) {
    System.out.println("La cantidad debe ser un entero");
}
```

[Abrir el fragmento como archivo](fragmentos/clase_09.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

parseInt no puede convertir dos y lanza NumberFormatException. El código salta al catch correspondiente y muestra una explicación. No ejecuta el println de cantidad. En una aplicación, distinguir errores esperados de programación ayuda a elegir qué mensaje mostrar y qué información registrar.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Probá "3", "3.5" y "abc". Explicá cuáles acepta parseInt.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Tratar una conversión válida como prueba de que el dato cumple todas las reglas.

## Resumen para repasar

Una excepción representa una situación que impide continuar normalmente. throw lanza; try rodea una operación; catch maneja un tipo de fallo; finally permite cerrar una acción independientemente del resultado.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_08.md) · [Clase siguiente](../05_Java/CLASE_10.md)
