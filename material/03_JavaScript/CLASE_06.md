# Clase 03.06 · Strings, arrays y métodos de recorrido

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_05.md) · [Clase siguiente](../03_JavaScript/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **strings, arrays y métodos de recorrido**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un array guarda una secuencia de valores. Sus posiciones comienzan en cero y length cuenta elementos. push añade al final. for...of recorre valores; map produce un array transformado; filter selecciona elementos; find devuelve la primera coincidencia o undefined. No todas esas operaciones modifican el original.

Un string representa texto y también permite acceder a posiciones. trim quita espacios en los extremos y toLowerCase ayuda a comparar texto. Las cadenas son inmutables: sus métodos devuelven otra cadena. Elegí el método por la intención antes de escribir un recorrido manual.

## Ejemplo

```javascript
const nombres = ["Cuaderno", "LAPICERA", "Mochila"];
const normalizados = nombres.map(nombre => nombre.toLowerCase());
const encontrados = normalizados.filter(nombre => nombre.includes("la"));
console.log(encontrados);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

map transforma cada nombre y construye otro array. filter conserva los que contienen "la": lapicera y mochila. nombres permanece con su texto original. La flecha recibe cada elemento y devuelve el valor usado por el método. Con un array vacío, map y filter producen arrays vacíos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

A partir de [100,200,300], creá un array con precios que superen 150 y otro con sus precios duplicados.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Acceder a array[length] para obtener el último elemento: el último índice es length-1.

## Resumen para repasar

Un array guarda una secuencia de valores. Sus posiciones comienzan en cero y length cuenta elementos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_05.md) · [Clase siguiente](../03_JavaScript/CLASE_07.md)
