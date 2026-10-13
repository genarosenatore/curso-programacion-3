# Clase 03.02 · Operadores, conversiones y comparaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_01.md) · [Clase siguiente](../03_JavaScript/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **operadores, conversiones y comparaciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Los operadores combinan valores: + suma o concatena texto; -, * y / hacen operaciones numéricas. === compara valor y tipo; !== expresa diferencia. && requiere ambas condiciones, || al menos una y ! niega. Los paréntesis hacen explícito el orden de cálculo.

Los controles HTML devuelven habitualmente texto. Number convierte un texto a número, pero Number("") da cero; conviene validar primero si hay entrada. Number.isFinite detecta si el resultado es un número finito. Elegir conversiones explícitas evita depender de conversiones automáticas difíciles de ver.

## Ejemplo

```javascript
const texto = "3";
console.log(texto + 2);
console.log(Number(texto) + 2);
console.log(3 === "3");
console.log(3 >= 1 && 3 <= 5);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

Muestra "32", 5, false y true. El primer + concatena porque hay una cadena. Number produce un valor numérico para el segundo cálculo. La comparación estricta conserva la diferencia entre número y texto. El rango exige cumplir sus dos extremos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Convertí "1200" y "2" y calculá el total. Compará qué ocurriría si usaras + directamente.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Usar == sin comprender sus conversiones o asumir que Number de cualquier texto será válido.

## Resumen para repasar

Los operadores combinan valores: + suma o concatena texto; -, * y / hacen operaciones numéricas. === compara valor y tipo; !== expresa diferencia.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_01.md) · [Clase siguiente](../03_JavaScript/CLASE_03.md)
