# Clase 10.06 · reduce y collect

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **reduce y collect**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

reduce combina elementos hasta obtener un resultado acumulado. Una identidad expresa el valor neutral: cero para suma y uno para multiplicación. collect permite construir estructuras y resultados mediante un Collector. mapToInt, mapToLong y mapToDouble ofrecen streams especializados.

El valor inicial evita un resultado ausente cuando la fuente está vacía. La operación debe ser coherente y, si se paraleliza, asociativa con reglas correctas. No empezaremos con parallelStream; el orden y efectos sobre objetos compartidos requieren otros cuidados.

## Ejemplo

```java
var cantidades = java.util.List.of(2, 3, 4);
int total = cantidades.stream().reduce(0, Integer::sum);
int otroTotal = cantidades.stream().mapToInt(Integer::intValue).sum();
System.out.println(total + " / " + otroTotal);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

Ambas sumas dan 9. Si la lista está vacía, ambas dan cero. mapToInt transforma los wrappers en valores int. La suma no cambia los elementos originales. Para totales grandes elegí un tipo que no desborde y para dinero aplicá una política de precisión adecuada.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Calculá el producto de [2,3,4] con reduce y explicá la identidad.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Usar cero como inicio de una reducción de multiplicación.

## Resumen para repasar

reduce combina elementos hasta obtener un resultado acumulado. Una identidad expresa el valor neutral: cero para suma y uno para multiplicación.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_07.md)
