# Clase 03.02 · Operadores, conversiones y comparaciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_01.md) · [Clase siguiente](../03_JavaScript/CLASE_03.md)

## Expresiones y operaciones

Una **expresión** produce un valor: `2 + 3` produce 5 y `cantidad > 0` produce un booleano. Un **operador** indica la operación y sus **operandos** son los valores que utiliza. Ya vimos [valores y variables](CLASE_01.md); ahora necesitamos combinar y comparar esos valores sin confundir sus tipos.

`+`, `-`, `*`, `/` y `%` expresan suma, resta, multiplicación, división y resto. `7 % 2` da 1 porque siete dividido en grupos de dos deja una unidad. No calcula un porcentaje. La multiplicación precede a la suma: 2 + 3 * 4 da 14. `(2 + 3) * 4` da 20; los paréntesis piden evaluar esa parte primero. `=` asigna; no compara. `===` pregunta igualdad estricta y `!==` diferencia; `>`, `<`, `>=`, `<=` comparan orden.

## Texto numérico y conversión

`"3" + 2` produce `"32"`: si se trata como texto, + concatena, es decir une representaciones. `Number("3") + 2` produce 5. `Number` pide una conversión explícita. JavaScript también realiza algunas conversiones automáticas: `"3" * 2` da 6, pero depender de ellas oculta qué aceptamos. Conviene comprobar entrada y convertir conscientemente.

```javascript
const entrada = "1200";
const precio = Number(entrada);
const cantidad = Number("2");
console.log(precio * cantidad); // 2400
console.log(typeof entrada, typeof precio); // string number
console.log(Number("hola")); // NaN
```

Este programa completo funciona en consola o con node archivo.js. `NaN` significa «no es un número» y representa una conversión u operación numérica inválida; su typeof sigue siendo number. `Number.isFinite(valor)` pregunta si es un número finito y excluye NaN e infinitos. El punto elige la operación isFinite del objeto Number, como log de console. `Number.isInteger` pregunta si no tiene parte fraccionaria.

`Number("")` y `Number("   ")` producen 0; por eso un campo vacío no se detecta solo convirtiendo. Un texto tiene métodos: `entrada.trim()` devuelve el texto sin espacios en sus extremos. Antes de aceptar una compra, se comprueba que no esté vacío, luego se convierte y finalmente se comprueba que el número sea finito y cumpla su rango. Esas decisiones se escribirán con if en 03.03. Una coma decimal en "1,5" no tiene el mismo formato que "1.5": Number no interpreta automáticamente la convención local.

## Comparaciones y lógica

`3 === "3"` es false: difieren sus tipos. `==` admite conversiones para comparar, como 3 == "3" verdadero; hasta aprender sus reglas, usaremos la estricta. `true` y `false` son booleanos, mientras `"false"` es texto no vacío. `&&` combina condiciones que deben cumplirse ambas; `||` admite al menos una y `!` niega el significado lógico.

Con cantidad = 3, `cantidad >= 1 && cantidad <= 5` comprueba primero el mínimo y después el máximo. `&&` no evalúa la derecha cuando la izquierda es falsa; `||` no la evalúa cuando la izquierda es verdadera. Se llama **cortocircuito**. En JavaScript estos operadores pueden devolver uno de los operandos, no necesariamente un booleano; aquí los usaremos con comparaciones booleanas para que el resultado sea claro. No escribas `1 <= cantidad <= 5`: la primera comparación ya produce un booleano y la siguiente no expresa el rango deseado.

## Ejemplo de la clase

```javascript
const texto = "3";
console.log(texto + 2);
console.log(Number(texto) + 2);
console.log(3 === "3");
console.log(3 >= 1 && 3 <= 5);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra "32", 5, false y true. El primer + concatena porque hay una cadena. Number produce un valor numérico para el segundo cálculo. La comparación estricta conserva la diferencia entre número y texto. El rango exige cumplir sus dos extremos.

## Cambiar una decisión y explorar un límite

Compará Number(""), Number("0"), Number("abc") y Number("1.5"): producen 0, 0, NaN y 1.5. Los dos primeros se distinguen antes de convertir. Dividir 10 por 0 produce Infinity, no un importe válido. No compruebes NaN con valor === NaN, porque NaN no es igual a sí mismo: usá Number.isFinite para aceptar el número finito.

## Confusión que conviene evitar

Usar == sin comprender sus conversiones o asumir que Number de cualquier texto será válido.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_01.md) · [Clase siguiente](../03_JavaScript/CLASE_03.md)
