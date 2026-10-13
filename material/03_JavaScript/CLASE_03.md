# Clase 03.03 · Condiciones y decisiones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_02.md) · [Clase siguiente](../03_JavaScript/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **condiciones y decisiones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una condición elige un bloque de instrucciones. if ejecuta cuando la condición es verdadera; else cubre el otro caso; else if prueba otra posibilidad. Los bloques se delimitan con llaves y su orden importa: si una condición amplia aparece primero, puede impedir llegar a una más específica.

Un booleano tiene valores true o false. Para practicar condiciones es útil una tabla de casos: por debajo, exactamente en el límite y por encima. Así comprobamos las comparaciones antes de conectar el código a una interfaz.

## Ejemplo

```javascript
const importe = 10000;
let envio;
if (importe >= 10000) {
  envio = 0;
} else {
  envio = 500;
}
console.log(importe + envio);
```

[Abrir el fragmento como archivo](fragmentos/clase_03.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

La condición es verdadera exactamente en 10000, por eso el envío es cero. Con 9999 el envío sería 500. let envio permite asignar en cualquiera de los bloques y usar después el resultado. Cada ejecución elige solo un bloque de este if/else.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Clasificá stock en agotado si es 0, bajo si está entre 1 y 3, y disponible si es mayor.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Usar = dentro de la condición cuando querías comparar con ===.

## Resumen para repasar

Una condición elige un bloque de instrucciones. if ejecuta cuando la condición es verdadera; else cubre el otro caso; else if prueba otra posibilidad.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_02.md) · [Clase siguiente](../03_JavaScript/CLASE_04.md)
