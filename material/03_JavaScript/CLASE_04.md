# Clase 03.04 · Bucles y seguimiento paso a paso

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_03.md) · [Clase siguiente](../03_JavaScript/CLASE_05.md)

## Repetir sin copiar instrucciones

Si necesitás sumar los números del 1 al 3, podés escribir tres sumas. Para cien números, copiar es frágil. Un **bucle** repite un bloque según una regla. Tiene estado inicial, condición, cuerpo y un cambio que lo acerca a terminar. Usaremos [variables](CLASE_01.md), [comparaciones](CLASE_02.md) y [condiciones](CLASE_03.md).

```javascript
let suma = 0;
for (let numero = 1; numero <= 3; numero = numero + 1) {
  suma = suma + numero;
  console.log(numero, suma);
}
console.log("Total", suma);
```

Este programa completo se ejecuta en consola o Node. `for` tiene tres partes separadas por punto y coma: declara numero una vez; comprueba <= 3 antes de cada vuelta; actualiza numero después de cada vuelta. Dentro, suma es un **acumulador**: conserva lo anterior y agrega el valor actual. Empezar en cero representa no haber sumado nada.

## Una tabla revela la ejecución

| Vuelta | numero antes | suma antes | suma después | numero tras actualizar |
|---|---:|---:|---:|---:|
| 1 | 1 | 0 | 1 | 2 |
| 2 | 2 | 1 | 3 | 3 |
| 3 | 3 | 3 | 6 | 4 |

Al llegar numero a 4, la condición es falsa y se sale; el total es 6. `numero++` abrevia el incremento de uno cuando se usa como instrucción, pero entender la asignación explícita evita memorizar un símbolo sin su efecto. `suma += numero` abrevia sumar y reasignar.

## Elegir una forma de repetición

`while (condicion) { ... }` comprueba antes de cada vuelta y sirve cuando no conocemos el número de repeticiones de antemano. `do { ... } while (condicion);` comprueba después y ejecuta al menos una vuelta. `break` termina el bucle actual; `continue` omite el resto de la vuelta y pasa a la siguiente. Usarlos sin seguir los cambios de estado puede ocultar por qué termina.

No reinicies suma dentro del bucle: perderías lo acumulado. Si no actualizás numero, la condición puede seguir verdadera para siempre. Se llama bucle infinito; si bloquea una consola, interrumpí la ejecución o cerrá ese contexto y corregí antes de repetir. El primer y último valor admitido por la comparación determinan cuántas vueltas hay. Esta idea se aplicará a posiciones de arrays en 03.06.

## Ejemplo de la clase

```javascript
let total = 0;
for (let numero = 1; numero <= 3; numero++) {
  total += numero;
  console.log(numero, total);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra las parejas 1/1, 2/3 y 3/6. numero++ suma uno al contador al terminar cada iteración. total += numero equivale a total = total + numero. La cuarta comprobación pregunta si 4 <= 3; como es falsa, termina. El acumulador se declara fuera del bloque para conservar las sumas.

## Cambiar una decisión y explorar un límite

Cambiá <= 3 por < 3: se suman 1 y 2, total 3. Empezá numero en 4: no hay vueltas y suma queda 0. Con do/while sí habría una primera vuelta. Si suma empieza en 10, el resultado es 16: el estado inicial participa del cálculo.

## Confusión que conviene evitar

Reiniciar total en cero dentro de cada iteración.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_03.md) · [Clase siguiente](../03_JavaScript/CLASE_05.md)
