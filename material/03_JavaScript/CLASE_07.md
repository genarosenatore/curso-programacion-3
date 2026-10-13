# Clase 03.07 · Objetos y nociones de clases

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_06.md) · [Clase siguiente](../03_JavaScript/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **objetos y nociones de clases**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un objeto reúne propiedades con nombre. Podemos representar un producto con nombre, precio y stock. La notación con punto accede a una propiedad; los corchetes permiten usar un nombre calculado. Un método es una función asociada al objeto.

Los objetos se manejan mediante referencias: asignar un objeto a otra variable no crea automáticamente una copia. El operador spread crea una copia superficial, pero los objetos anidados siguen compartidos. Una clase describe cómo crear objetos con estructura y comportamiento común.

## Ejemplo

```javascript
const producto = { nombre: "Cuaderno", precio: 2000, stock: 3 };
const copia = { ...producto, stock: 5 };
console.log(producto.stock, copia.stock);
class Producto {
  constructor(nombre, precio) { this.nombre = nombre; this.precio = precio; }
}
console.log(new Producto("Lapicera", 800).nombre);
```

[Abrir el fragmento como archivo](fragmentos/clase_07.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

Muestra 3/5 y Lapicera. La copia cambia una propiedad simple sin cambiar producto. this apunta al objeto creado en el constructor. const impide reasignar producto, pero permite producto.stock=2. Para datos anidados necesitaríamos estudiar una copia más profunda si queremos independencia.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá un array de dos productos y encontrá por nombre uno de ellos.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir una variable que referencia al mismo objeto con una copia independiente.

## Resumen para repasar

Un objeto reúne propiedades con nombre. Podemos representar un producto con nombre, precio y stock.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_06.md) · [Clase siguiente](../03_JavaScript/CLASE_08.md)
