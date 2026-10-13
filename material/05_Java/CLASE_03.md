# Clase 05.03 · Condiciones, bucles, arrays y métodos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_02.md) · [Clase siguiente](../05_Java/CLASE_04.md)

## Controlar el recorrido con tipos explícitos

if y else eligen con una condición boolean como en [JavaScript 03.03](../03_JavaScript/CLASE_03.md). for tiene inicio, condición y actualización; while comprueba antes de repetir. Java conserva estas ideas, pero no admite un número como condición booleana y comprueba el tipo de las operaciones antes de ejecutar.

Un array `int[]` reúne enteros con tamaño fijo. `new int[]{100,200,300}` crea tres posiciones; `new int[3]` crea tres enteros inicializados en cero. length es una propiedad y no lleva paréntesis; sus índices admitidos van de cero a length − 1. Acceder al índice length lanza un error; no retorna undefined.

## Ubicar y llamar un método

Un método declara tipo de retorno, nombre y parámetros. El método sumar inferior se coloca dentro de la clase Hola, pero **fuera** de main: no anides la definición dentro de otro método. `static` permite llamar sumar desde main sin crear todavía un objeto. `return total` entrega un int; println solo lo mostraría.

Para un programa ejecutable, conservá main de 05.01 y dentro escribí `System.out.println(sumar(new int[]{100,200,300}));`. Luego agrega el método inferior como hermano de main. Compilá el archivo y ejecutá su clase. El `for (int valor : valores)` lee un valor por vuelta: los dos puntos se interpretan aquí como recorrido, no una anotación TypeScript.

La suma inicia en cero, recibe 100 y queda 100; luego 300; luego 600. En [] tiene cero vueltas. Un array null representa ausencia y no es vacío: necesitará una comprobación antes de recorrer. El ejemplo supone array presente. Cuando necesitemos crecer y eliminar elementos usaremos colecciones, sin cambiar el significado básico de acumular.

## Ejemplo de la clase

```java
static int sumar(int[] valores) {
    int total = 0;
    for (int valor : valores) {
        total += valor;
    }
    return total;
}
// Dentro de main: System.out.println(sumar(new int[]{100, 200, 300}));
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El método se escribe dentro de la clase, fuera de main. Recibe un array y devuelve 600 para los datos indicados. En un array vacío, el bucle no entra y devuelve cero. El ejemplo asume que valores no es null; más adelante decidiremos cómo representar o rechazar esa ausencia.

## Cambiar una decisión y explorar un límite

Con new int[3] la suma es cero porque las tres posiciones comienzan en cero. Cambiar <= valores.length por < valores.length en un bucle de índices evita acceder fuera. Poner return dentro de la primera vuelta entregaría solo el primer acumulado.

## Confusión que conviene evitar

Poner un método dentro de otro método: en esta estructura Java no lo permite.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_02.md) · [Clase siguiente](../05_Java/CLASE_04.md)
