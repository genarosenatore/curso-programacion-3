# Clase 03.05 · Funciones, parámetros, retorno y alcance

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_04.md) · [Clase siguiente](../03_JavaScript/CLASE_06.md)

## Nombrar un procedimiento reutilizable

Una función agrupa instrucciones que resuelven una tarea. Evita copiar un cálculo y permite describir qué datos necesita y qué resultado entrega. **Definir** una función prepara su cuerpo; **llamarla** ejecuta ese cuerpo. Usaremos variables, decisiones y operaciones de las clases anteriores.

```javascript
function subtotal(precio, cantidad) {
  const resultado = precio * cantidad;
  return resultado;
}
const compraA = subtotal(800, 2);
const compraB = subtotal(1200, 3);
console.log(compraA, compraB); // 1600 3600
```

`function` declara; subtotal es el nombre; precio y cantidad son **parámetros**, nombres locales para las entradas. En la llamada, 800 y 2 son **argumentos**, valores concretos que ocupan esas posiciones. Las comas separan entradas y los paréntesis marcan la llamada. Cada llamada tiene sus propios datos y ejecuta desde el principio. `return` entrega el valor al lugar de llamada y termina esa ejecución.

## Retornar no es mostrar

```javascript
function mostrarDoble(numero) {
  console.log(numero * 2);
}
const recibido = mostrarDoble(4);
console.log(recibido); // undefined
```

Programa independiente: muestra primero 8 y luego undefined. El log dentro tiene un efecto en la consola, pero la función no entrega ese resultado. Para usarlo en otro cálculo, necesitás `return numero * 2;`. Las funciones sin return de valor devuelven undefined. Un return anticipado permite terminar antes cuando un dato no sirve; también puede indicar explícitamente un resultado como null si ese es el contrato.

## Alcance y duración de nombres

El **alcance** determina desde dónde se puede consultar un nombre. Un parámetro y un const declarado dentro de la función son locales. Fuera, `console.log(resultado)` no puede leer el resultado del primer ejemplo: para compartirlo, devolvelo. let y const dentro de llaves también tienen alcance de bloque. Una variable exterior puede ser visible dentro; si dependés de ella, la función deja de tener todas sus entradas explícitas.

Un nombre local puede ocultar uno exterior del mismo nombre: se llama sombreado. Evitalo cuando confunda. No necesitás usar variables globales para comunicar llamadas. Una **función pura**, para estos ejercicios, produce el mismo resultado con las mismas entradas y no cambia datos externos; facilita seguir y probar los cálculos.

## Otras formas de escribir funciones

Una expresión de función se guarda en una variable: `const doble = function(numero) { return numero * 2; };`. Una **flecha** puede abreviar: `const doble = numero => numero * 2;`. Antes de => van los parámetros y después el resultado. Con dos parámetros usás paréntesis. Con cuerpo de bloque necesitás return: `const doble = numero => { return numero * 2; };`. Sin ese return, un bloque no entrega automáticamente su última expresión.

Un parámetro por defecto como `cantidad = 1` se usa si ese argumento falta o es undefined, no si llega cero o null. Las declaraciones function pueden llamarse antes de su línea de definición; las expresiones const requieren que se haya ejecutado su inicialización. Para empezar, definí antes de llamar. Las flechas también difieren en el manejo de this; lo explicaremos al introducir objetos en 03.07.

Las funciones pueden recibirse como argumentos, porque son valores. Eso será la base de map, eventos y callbacks. Por ahora una función `aplicar(numero, operacion)` puede hacer `return operacion(numero);`: el segundo argumento es una función que será llamada con numero, no una operación ejecutada al pasarla.

## Ejemplo de la clase

```javascript
function calcularTotal(precio, cantidad) {
  const total = precio * cantidad;
  return total;
}
const resultado = calcularTotal(800, 3);
console.log(resultado);
```

[Abrir el fragmento como archivo](fragmentos/clase_05.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

precio y cantidad son parámetros; 800 y 3 argumentos. El cálculo local produce 2400 y return lo entrega a resultado. Otra llamada tiene sus propios parámetros y variables locales. El cuerpo no se ejecuta al definirlo, sino al llamar la función.

## Cambiar una decisión y explorar un límite

En subtotal, intercambiar los argumentos no cambia esta multiplicación, pero sí cambiaría una función que divida precio por cantidad. El orden forma parte del contrato. Eliminá return y guardá la llamada: obtenés undefined. Añadir más console.log no corrige la falta de retorno.

## Confusión que conviene evitar

Escribir console.log(total) dentro y creer que la función devuelve ese número.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_04.md) · [Clase siguiente](../03_JavaScript/CLASE_06.md)
