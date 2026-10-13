# Clase 03.07 · Objetos y nociones de clases

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_06.md) · [Clase siguiente](../03_JavaScript/CLASE_08.md)

## Representar una cosa con propiedades

Un array reúne una secuencia; un objeto reúne datos relacionados con nombres. `{ nombre:"Cuaderno", precio:2000, stock:3 }` representa un producto. Las llaves delimitan el objeto, `:` relaciona propiedad y valor y la coma separa propiedades. `producto.precio` lee una propiedad conocida; `producto[clave]` usa el nombre contenido en la variable clave. `producto["precio"]` también vale.

Una propiedad ausente devuelve undefined. No es lo mismo que stock = 0, que expresa agotado. Un **método** es una propiedad cuyo valor es una función. En una llamada como producto.describir(), `this` normalmente referencia el objeto receptor. Las funciones flecha no tienen su propio this: por eso no son una sustitución automática de métodos que lo necesitan.

## Referencias y copias

```javascript
const producto = { nombre: "Cuaderno", stock: 3 };
const mismo = producto;
mismo.stock = 2;
console.log(producto.stock); // 2
const copia = { ...producto, stock: 5 };
console.log(producto.stock, copia.stock); // 2 5
```

Programa completo para consola o Node. La asignación a mismo conserva la referencia al mismo objeto; no duplica sus propiedades. `...producto` es **spread**: copia sus propiedades propias enumerables al nuevo objeto. La propiedad stock escrita después reemplaza ese valor en la copia. producto y copia son objetos distintos, pero la copia es **superficial**: si una propiedad contiene otro objeto, se copia su referencia.

```javascript
const original = { datos: { stock: 3 } };
const copia = { ...original };
copia.datos.stock = 1;
console.log(original.datos.stock); // 1
```

Este segundo programa muestra un límite de la copia superficial: ambos datos apuntan al mismo objeto interno. No prometas independencia profunda por haber usado spread. Para estos ejercicios, usaremos objetos simples o elegiremos explícitamente qué partes copiar.

## Un catálogo y una clase

Un array de objetos representa un catálogo. `productos.find(p => p.nombre === "Lapicera")` busca un objeto por su propiedad. La flecha y find ya se enseñaron en [03.05](CLASE_05.md) y [03.06](CLASE_06.md). Como puede no encontrarse, comprobá `elegido !== undefined` antes de leer su precio. `elegido?.precio` ofrece **encadenamiento opcional**: devuelve undefined si elegido es null o undefined en vez de intentar acceder. No valida que precio exista ni que sea un número correcto.

Una **clase** define una manera de crear objetos con estructura y comportamiento comunes. `class Producto` da nombre a esa definición; `constructor` recibe argumentos al crear; `new Producto("Lapicera",800)` construye una instancia nueva. Dentro del constructor, this referencia esa instancia y guarda sus datos. La clase no es el producto concreto, como un molde no es cada pieza creada.

Los objetos literales son adecuados para datos simples; una clase puede ser útil cuando muchas instancias comparten operaciones y reglas. No necesitás una clase para cada JSON. El operador `===` entre objetos compara referencias: dos literales con el mismo contenido son distintos. Más adelante Java desarrollará su propio contrato de igualdad; no copies sus reglas a JavaScript sin distinguir el lenguaje.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

Muestra 3/5 y Lapicera. La copia cambia una propiedad simple sin cambiar producto. this apunta al objeto creado en el constructor. const impide reasignar producto, pero permite producto.stock=2. Para datos anidados necesitaríamos estudiar una copia más profunda si queremos independencia.

## Cambiar una decisión y explorar un límite

Cambiá la búsqueda a "Regla" sin incluir ese nombre en el catálogo: find da undefined. Leer elegido.precio entonces falla; la comprobación debe preceder al acceso. Cambiar una propiedad de mismo modifica el objeto compartido, mientras cambiar stock en la copia simple no modifica producto. Con objetos anidados, ese límite vuelve a aparecer.

## Confusión que conviene evitar

Confundir una variable que referencia al mismo objeto con una copia independiente.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_06.md) · [Clase siguiente](../03_JavaScript/CLASE_08.md)
