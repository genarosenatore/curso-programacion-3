# Soluciones 03.01 · Consola, valores, variables y tipos

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

const nombreProducto="Cuaderno"; const precio=800; const cantidad=2; console.log(precio*cantidad); console.log(typeof nombreProducto);. Muestra 1600 y "string".

## 2 y 3. Resolver y justificar las decisiones

Programa independiente, guardado como practica.js y ejecutado con node, o en una consola nueva:

```javascript
const nombre = "Ana";
let libros = 1;
console.log(nombre, libros);
libros = 2;
console.log(nombre, libros);
const precio = 1200;
let cantidad = 2;
let total = precio * cantidad;
cantidad = 3;
console.log(total); // 2400
total = precio * cantidad;
console.log(total); // 3600
```

log puede mostrar varios valores separados por comas. nombre y precio usan const porque no se reasignan; libros, cantidad y total usan let porque sí. 1200 es number y "1200" string. La mutación cambia una parte del mismo objeto; la reasignación vincula la variable con otro valor. Esa diferencia permite que una referencia const conserve un objeto con estado mutable.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
