# Clase 00.03 · Algoritmos: entradas, pasos, decisiones y resultados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_02.md) · [Clase siguiente](../00_Fundamentos/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **algoritmos: entradas, pasos, decisiones y resultados**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un algoritmo necesita datos y pasos precisos. Una secuencia ejecuta instrucciones en orden. Una decisión elige un camino según una condición que puede ser verdadera o falsa. Una repetición ejecuta pasos varias veces. Estas tres ideas aparecerán en todos los lenguajes del curso.

Antes de escribir, definí el resultado y las condiciones del problema. Si calculamos un descuento, debemos acordar cuándo se aplica y sobre qué importe. El pseudocódigo permite discutir esas reglas sin preocuparnos todavía por la sintaxis de JavaScript o Java.

## Ejemplo

```text
LEER importe
SI importe >= 10000
    CALCULAR total COMO importe POR 0.90
SI NO
    ASIGNAR importe A total
MOSTRAR total
```

[Abrir el fragmento como archivo](fragmentos/clase_03.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Este ejemplo describe pasos o uso de herramientas. Seguí las instrucciones de la explicación; los bloques de pseudocódigo no se ejecutan como programas.

## Leamos el ejemplo paso a paso

Para 12.000 la condición se cumple y total es 10.800. Para 8.000 no se cumple y total sigue siendo 8.000. Multiplicar por 0,90 conserva el 90 % del precio, es decir, descuenta 10 %. La comparación incluye exactamente 10.000. Nuestro ejemplo asume un importe válido; validar el dato es una regla adicional.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá un algoritmo que cobre 500 de envío si la compra es menor a 5.000 y envío cero en caso contrario. Probalo con 4.000, 5.000 y 6.000.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir >= con >: cambia el tratamiento del valor exacto del límite.

## Resumen para repasar

Un algoritmo necesita datos y pasos precisos. Una secuencia ejecuta instrucciones en orden.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **00.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_02.md) · [Clase siguiente](../00_Fundamentos/CLASE_04.md)
