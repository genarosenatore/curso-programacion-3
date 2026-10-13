# Clase 04.02 · Tipos básicos, inferencia, arrays y funciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_01.md) · [Clase siguiente](../04_TypeScript/CLASE_03.md)

## Expresar un contrato de entradas y salida

Un tipo restringe valores; la **inferencia** permite deducirlo cuando el contexto alcanza. En `let cantidad = 2`, TypeScript infiere number. No hace falta escribir number después de cada literal. En los parámetros de una función independiente conviene declarar el contrato: `precio:number` evita que el llamador envíe texto por error.

`number[]` es un array cuyos elementos son números; los corchetes pertenecen al tipo, mientras `[100,200]` es un valor. Un array numérico puede estar vacío: el tipo de sus elementos no prueba que exista la posición cero. `noUncheckedIndexedAccess` en tsconfig agrega undefined a ciertos accesos por índice; strict por sí solo no habilita esa opción.

## Leer una función tipada

En la función subtotal inferior, las anotaciones antes del cierre de parámetros describen entradas y `):number` la salida. El cuerpo debe devolver un número. `void` describe una función cuyo resultado no se usa como un valor útil, por ejemplo una que solo muestra un mensaje. Es diferente de devolver un saludo string para que otro código lo coloque en pantalla.

Seguí el ejemplo con precios[0]=100 y cantidad=3: devuelve 300. Si querés hacerlo seguro ante vacío, obtené primero la posición y comprobá que no sea undefined; luego llamá subtotal. Esa condición también reduce las posibilidades del tipo. No uses una afirmación de existencia para ocultar un array vacío.

Guardá el fragmento en un .ts y compilalo con el procedimiento de [04.01](CLASE_01.md). El cálculo no necesita DOM. number incluye fracciones y NaN, por lo que una cantidad tipada todavía necesita reglas como entero y positivo. Los tipos primitivos usan minúscula; Number con mayúscula es el objeto constructor y no el tipo habitual para estos datos.

## Ejemplo de la clase

```typescript
function subtotal(precio: number, cantidad: number): number {
  return precio * cantidad;
}
const precios: number[] = [100, 200];
console.log(subtotal(precios[0], 3));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La función recibe dos números y devuelve otro. precios solo admite números. En configuraciones que comprueban acceso por índice, podría requerirse comprobar que precios[0] existe. Un array vacío demuestra por qué una suposición sobre sus elementos puede fallar aunque sus elementos sean numéricos.

## Cambiar una decisión y explorar un límite

Cambiá el retorno de una función number por "300": el compilador detecta el incumplimiento. Cambiá los datos a []: el problema es existencia, no tipo de elemento. Comprobar la posición antes de calcular produce un camino definido para ambos casos.

## Confusión que conviene evitar

Agregar tipos a todo mecánicamente y no comprender lo que se está garantizando.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_01.md) · [Clase siguiente](../04_TypeScript/CLASE_03.md)
