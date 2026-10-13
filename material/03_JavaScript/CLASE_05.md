# Clase 03.05 · Funciones, parámetros, retorno y alcance

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_04.md) · [Clase siguiente](../03_JavaScript/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **funciones, parámetros, retorno y alcance**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una función reúne pasos que podemos reutilizar. Los parámetros son los nombres de entradas en su definición; los argumentos son los valores de una llamada. return entrega un resultado y termina esa ejecución. Mostrar con console.log no equivale a retornar.

El alcance determina dónde existe una variable. Las variables creadas dentro de una función suelen ser locales. Una función que recibe datos y devuelve un cálculo es fácil de probar porque no depende de modificar variables externas. También existen expresiones de función y funciones flecha; empezamos por una declaración explícita.

## Ejemplo

```javascript
function calcularTotal(precio, cantidad) {
  const total = precio * cantidad;
  return total;
}
const resultado = calcularTotal(800, 3);
console.log(resultado);
```

[Abrir el fragmento como archivo](fragmentos/clase_05.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

precio y cantidad son parámetros; 800 y 3 argumentos. El cálculo local produce 2400 y return lo entrega a resultado. Otra llamada tiene sus propios parámetros y variables locales. El cuerpo no se ejecuta al definirlo, sino al llamar la función.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá calcularDescuento(importe, porcentaje) que devuelva el importe después del descuento.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir console.log(total) dentro y creer que la función devuelve ese número.

## Resumen para repasar

Una función reúne pasos que podemos reutilizar. Los parámetros son los nombres de entradas en su definición; los argumentos son los valores de una llamada.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_04.md) · [Clase siguiente](../03_JavaScript/CLASE_06.md)
