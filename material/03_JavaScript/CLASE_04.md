# Clase 03.04 · Bucles y seguimiento paso a paso

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_03.md) · [Clase siguiente](../03_JavaScript/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **bucles y seguimiento paso a paso**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un bucle repite instrucciones. for reúne inicio, condición y actualización. while repite mientras una condición sea verdadera. Cada recorrido del bloque es una iteración. Un acumulador conserva un resultado parcial; un contador registra cuántas veces ocurrió algo.

La actualización debe llevar el programa hacia el fin. Si la condición nunca cambia, el bucle puede no terminar. Primero seguiremos pocas iteraciones a mano y después trabajaremos con arrays. Los bucles anidados repiten un recorrido dentro de otro, como filas y columnas.

## Ejemplo

```javascript
let total = 0;
for (let numero = 1; numero <= 3; numero++) {
  total += numero;
  console.log(numero, total);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

Muestra las parejas 1/1, 2/3 y 3/6. numero++ suma uno al contador al terminar cada iteración. total += numero equivale a total = total + numero. La cuarta comprobación pregunta si 4 <= 3; como es falsa, termina. El acumulador se declara fuera del bloque para conservar las sumas.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Sumá los números del 1 al 5 y escribí los valores parciales del acumulador.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Reiniciar total en cero dentro de cada iteración.

## Resumen para repasar

Un bucle repite instrucciones. for reúne inicio, condición y actualización.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_03.md) · [Clase siguiente](../03_JavaScript/CLASE_05.md)
