# Clase 03.01 · Consola, valores, variables y tipos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_02.md)

## Ejecutar una instrucción y observar un valor

HTML describe una página y CSS su aspecto. JavaScript es un lenguaje para expresar operaciones y decisiones. Empezaremos sin página ni eventos: solo datos y resultados. En un navegador abrí las herramientas de desarrollo y su pestaña Consola, escribí `console.log(800);` y ejecutá. Otra opción es guardar un archivo `clase.js` y ejecutar `node clase.js` desde su carpeta si tenés Node instalado. Los ejemplos de esta clase son programas completos y no necesitan HTML.

Un **valor** es un dato que el programa puede usar. `800` es un número, `"Cuaderno"` texto y `true` una afirmación verdadera. Escribir directamente esos datos es usar **literales**. En el texto, las comillas delimitan el valor, no son parte de él. `console` ofrece herramientas de salida y `log` es su operación de mostrar: el punto elige esa operación y los paréntesis contienen el valor a mostrar. El punto y coma separa instrucciones; usaremos uno al final para que su límite sea claro. `//` inicia un comentario que explica el código y no se ejecuta.

## Por qué necesitamos variables

Si usás 800 varias veces, repetirlo dificulta saber qué representa y actualizarlo. Una **variable** vincula un nombre con un valor que usaremos después. `precio` comunica su función; `x` no la explica tan bien. JavaScript distingue mayúsculas y minúsculas, no permite espacios en el nombre y reserva palabras como let. El nombre no lleva comillas cuando queremos consultar su valor; `"precio"` es solo ese texto.

```javascript
const precio = 800;
let cantidad = 2;
console.log(precio * cantidad);
cantidad = 3;
console.log(precio * cantidad);
```

`const precio` **declara** el nombre, haciéndolo existir en ese alcance. `= 800` lo **inicializa**, asignándole su primer valor. `let cantidad = 2` hace ambas cosas. Más abajo, `cantidad = 3` es una nueva **asignación**, sin redeclarar. `*` multiplica: primero consulta 800 y 2 y muestra 1600; después consulta 800 y 3 y muestra 2400. No modifica precio. El cálculo se repite cuando ejecutás la instrucción; no hay una fórmula viva conectada a cantidad.

```javascript
let total = precio * cantidad;
cantidad = 4;
console.log(total); // conserva 2400
total = precio * cantidad;
console.log(total); // ahora 3200
```

Este segundo bloque continúa el anterior en el mismo archivo. Guardar un resultado conserva el valor de esa evaluación; cambiar sus entradas después no lo recalcula automáticamente. Este punto es fundamental para formularios y carritos.

## Declarar, inicializar y reasignar

`let` permite asignar otro valor al mismo nombre. `const` requiere un valor al declararse y evita reasignar el nombre. No significa que el dato sea una constante matemática universal. Usá const cuando no planeás reasignar y let para un estado que cambia, como un contador. `let respuesta;` declara sin valor explícito y empieza con `undefined`, que indica ausencia de un valor asignado. `const respuesta;` es incorrecto porque falta su inicialización.

Reasignar y redeclarar son acciones distintas. `let cantidad = 2; cantidad = 3;` es válido. Volver a declarar `let cantidad` en el mismo alcance es un error. En consolas puede haber comportamientos particulares con declaraciones repetidas; para practicar, ejecutá un archivo nuevo o recargá el contexto en lugar de atribuir ese efecto a las reglas del programa.

## Tipos: qué operaciones tienen sentido

El **tipo** describe la clase de valor, no la función de la variable. `number` representa números, incluyendo fracciones; `string` texto; `boolean` verdadero o falso; `undefined` valor todavía no asignado o ausente y `null` ausencia intencional. El operador `typeof` permite consultar un nombre de tipo: `typeof 800` da `"number"` y `typeof "800"` da `"string"`. Las comillas cambian el tipo aunque el texto parezca un número. La convención histórica `typeof null` da `"object"`; para detectar null compararemos directamente con null.

JavaScript permite cambiar el tipo del valor de una variable let, pero eso no hace que la operación siga teniendo sentido. Una cantidad que pasa de 3 a "tres" deja de servir para multiplicar. Aprenderemos conversiones explícitas en 03.02. También existen bigint para enteros grandes y symbol para identificadores únicos; no los necesitamos en estas compras. Los números habituales tienen precisión limitada: 0.1 + 0.2 no da exactamente 0.3. Para ejemplos monetarios posteriores usaremos centavos enteros con límites razonables.

## Una primera distinción sobre objetos

Un objeto reúne datos con nombres; lo desarrollaremos en [03.07](CLASE_07.md). Para entender const alcanza este pequeño ejemplo completo:

```javascript
const producto = { nombre: "Cuaderno", stock: 3 };
producto.stock = 2;
console.log(producto.stock); // 2
```

Las llaves contienen propiedades; `stock:3` asocia un nombre con un valor y la coma separa propiedades. El punto accede a stock. La variable producto sigue referenciando el mismo objeto, aunque una propiedad cambió: eso es **mutación**, no reasignación. `producto = { stock:5 };` sí intentaría cambiar la referencia de const y falla. Si necesitás datos inmutables, const por sí solo no garantiza que todas sus partes sean inmutables.

## Ejemplo de la clase

```javascript
const precio = 2000;
let cantidad = 3;
console.log(precio * cantidad);
cantidad = 4;
console.log(precio * cantidad);
console.log(typeof precio);
```

[Abrir el fragmento como archivo](fragmentos/clase_01.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Los resultados son 6000, 8000 y "number". El precio permanece; la cantidad cambia mediante asignación. = asigna un valor: no pregunta si dos valores son iguales. typeof ayuda a inspeccionar el tipo de un valor. Si pegás const repetidas veces en la misma consola, podés necesitar recargar para evitar redeclaraciones.

## Cambiar una decisión y explorar un límite

En el programa de precio y cantidad, cambiá cantidad inicial a 0: el primer total es 0, pero luego sigue apareciendo 2400 porque la asignación a 3 permanece. Cambiá let por const para cantidad y conservá cantidad = 3: esa reasignación falla. Probá el caso incorrecto en un archivo separado, porque un error puede impedir seguir con las líneas posteriores.

## Confusión que conviene evitar

Escribir el número entre comillas y asumir que todas las operaciones serán numéricas.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_10.md) · [Clase siguiente](../03_JavaScript/CLASE_02.md)
