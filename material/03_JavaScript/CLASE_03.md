# Clase 03.03 · Condiciones y decisiones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_02.md) · [Clase siguiente](../03_JavaScript/CLASE_04.md)

## Elegir un camino con una condición

Un programa de compra no debería calcular sin comprobar una cantidad. La condición de [03.02](CLASE_02.md) produce true o false; `if` usa ese resultado para decidir si ejecuta un bloque. `else` proporciona el camino alternativo. Las llaves delimitan las instrucciones del bloque, no un objeto en este contexto.

```javascript
const cantidad = 3;
if (cantidad >= 1) {
  console.log("Podés continuar");
} else {
  console.log("Cantidad inválida");
}
console.log("Comprobación terminada");
```

Programa completo para consola o Node. Primero se consulta cantidad y se compara con 1. Como 3 >= 1 da true, se ejecuta el primer log; el else se salta. Después continúa fuera del bloque y muestra el último mensaje. Una condición no repite la comprobación cada vez que cambia un dato: se evalúa cuando la ejecución llega a ella.

## Más de dos posibilidades

Podés encadenar `else if` para alternativas excluyentes. Se prueban en orden y se ejecuta el primer camino verdadero. Si stock = 0 significa agotado y stock < 3 significa últimas unidades, comprobá primero el cero: de otro modo cero cumple < 3 y nunca llega al caso de agotado. Varios if independientes son diferentes: más de uno puede ejecutarse.

Un `switch` compara una expresión con casos de igualdad; `break` evita continuar al siguiente caso y `default` trata lo no previsto. Para rangos numéricos, if suele expresar mejor la condición. El operador ternario `condicion ? valorA : valorB` es una expresión que elige un valor; no conviene anidar muchos ternarios para esconder un procedimiento.

## Validar antes de calcular

```javascript
const texto = "2";
const cantidad = Number(texto);
if (texto.trim() === "" || !Number.isInteger(cantidad) || cantidad < 1) {
  console.log("Ingresá una cantidad entera positiva");
} else {
  console.log(800 * cantidad);
}
```

Se rechaza si al menos una regla falla: vacío, no entero o menor a uno. `!` niega la comprobación de entero. Con "2", las tres son falsas y el else muestra 1600. La validación no modifica la entrada; decide si cumple las reglas antes de usarla. Un precio válido necesita su propia regla; este programa supone 800 como precio conocido.

if convierte su condición a un significado lógico si no es booleano: 0, "", null, undefined y NaN se consideran falsos; un texto no vacío, incluido "false", verdadero. Para empezar, escribí comparaciones explícitas. `if (cantidad = 1)` asigna uno y luego lo interpreta como verdadero: no pregunta igualdad y cambia el dato.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

La condición es verdadera exactamente en 10000, por eso el envío es cero. Con 9999 el envío sería 500. let envio permite asignar en cualquiera de los bloques y usar después el resultado. Cada ejecución elige solo un bloque de este if/else.

## Cambiar una decisión y explorar un límite

Probá el segundo programa con "0", "1.5", "dos" y "": ninguno debe calcular el total. Cambiá || por && en el rechazo: exigirías que todas las fallas ocurran juntas y dejarías pasar entradas inválidas. Ese cambio muestra que la lógica representa una regla, no una decoración.

## Confusión que conviene evitar

Usar = dentro de la condición cuando querías comparar con ===.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_02.md) · [Clase siguiente](../03_JavaScript/CLASE_04.md)
