# Clase 03.01 · Consola, valores, variables y tipos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **consola, valores, variables y tipos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un valor puede ser un número, texto, booleano u otro tipo. Una variable permite darle un nombre. const impide reasignar la variable; let permite cambiarla. En objetos, const no impide modificar propiedades: esa diferencia aparecerá al estudiar objetos.

console.log muestra información en la consola. Una cadena va entre comillas; un número no. JavaScript distingue mayúsculas y minúsculas. En esta unidad podés probar ejemplos pequeños en la consola del navegador o en los archivos de práctica enlazados. La consola se abre desde las herramientas de desarrollo, habitualmente con F12.

## Ejemplo

```javascript
const precio = 2000;
let cantidad = 3;
console.log(precio * cantidad);
cantidad = 4;
console.log(precio * cantidad);
console.log(typeof precio);
```

[Abrir el fragmento como archivo](fragmentos/clase_01.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

Los resultados son 6000, 8000 y "number". El precio permanece; la cantidad cambia mediante asignación. = asigna un valor: no pregunta si dos valores son iguales. typeof ayuda a inspeccionar el tipo de un valor. Si pegás const repetidas veces en la misma consola, podés necesitar recargar para evitar redeclaraciones.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Declarar nombreProducto, precio y cantidad. Mostrar un total y el tipo del nombre.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir el número entre comillas y asumir que todas las operaciones serán numéricas.

## Resumen para repasar

Un valor puede ser un número, texto, booleano u otro tipo. Una variable permite darle un nombre.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_02.md)
