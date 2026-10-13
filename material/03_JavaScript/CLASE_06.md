# Clase 03.06 · Strings, arrays y métodos de recorrido

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_05.md) · [Clase siguiente](../03_JavaScript/CLASE_07.md)

## Guardar una secuencia

Un array reúne valores en orden. Evita crear precio1, precio2 y precio3 y permite trabajar con cualquier cantidad. Los corchetes delimitan el literal y las comas separan valores: `[100, 200, 300]`. Un **índice** es una posición, empezando por cero: precios[0] vale 100 y precios[2] vale 300. length cuenta elementos, así que el último índice de este array es 2, no 3.

```javascript
const precios = [100, 200, 300];
let total = 0;
for (let indice = 0; indice < precios.length; indice = indice + 1) {
  total = total + precios[indice];
}
console.log(total); // 600
```

Programa completo para consola o Node. La condición `< length` admite 0, 1 y 2. En cada vuelta consulta un valor y lo suma. `for (const precio of precios)` es otra forma de recorrer directamente los valores; conviene cuando no necesitás su posición. En un array vacío, ambos recorridos tienen cero vueltas y el total inicial queda en cero.

`push` agrega al final, `pop` quita y devuelve el último. Son métodos: `precios.push(400)` cambia el array. const conserva su referencia, no impide esa mutación. `slice` obtiene una porción en otro array; su final es excluyente. `splice` agrega o quita en el original. Elegí sabiendo si querés modificar o producir un resultado independiente.

## Funciones que guían un recorrido

En [03.05](CLASE_05.md) vimos que una función puede ser un valor. Un **callback** es una función que entregamos para que otra operación la invoque. `map` llama a un callback por cada elemento y construye un nuevo array con los valores devueltos:

```javascript
const precios = [100, 200, 300];
const dobles = precios.map(precio => precio * 2);
const caros = precios.filter(precio => precio > 150);
const primero = precios.find(precio => precio > 150);
console.log(dobles); // [200, 400, 600]
console.log(caros); // [200, 300]
console.log(primero); // 200
console.log(precios); // [100, 200, 300]
```

Este es otro programa completo; no lo unas sin cambiar la declaración repetida. map transforma cada valor; filter conserva los que producen true; find se detiene en la primera coincidencia y entrega un valor, no un array. Si ninguna coincide, find entrega undefined. Esos métodos no cambian por sí solos el array original, aunque un callback podría modificar objetos compartidos: su responsabilidad importa.

`forEach` llama una función por valor para realizar acciones y no genera un array de resultados. Si necesitás una transformación, map expresa esa intención mejor. `sort` modifica el array y, por defecto, compara texto; para números usá `.sort((a,b) => a-b)`. El callback devuelve negativo, cero o positivo para expresar el orden. Para conservar el original, primero copiá con slice(). No confundas ordenar con filtrar.

## Operar con texto

Un string también tiene length y posiciones, pero es inmutable: no cambiás un carácter mediante asignación. `trim()` devuelve otra cadena sin espacios exteriores; `toLowerCase()` devuelve minúsculas; `includes("la")` pregunta si contiene ese texto; `split(" ")` divide por un separador y devuelve un array; `join(", ")` hace el recorrido inverso desde un array.

El ejemplo de nombres de abajo usa map para normalizar y filter para buscar. Primero "LAPICERA" pasa a "lapicera"; después includes pregunta por "la" y la conserva. "Mochila" también contiene "la" al final. El array original conserva las mayúsculas iniciales. Normalizar mayúsculas no elimina tildes: «café» y «cafe» siguen distintos.

Acceder fuera del array devuelve undefined. Antes de utilizar un último elemento preguntá si length es mayor que cero. `[]` es un array vacío pero no se considera falso en if. Para saber si está vacío, comprobá su longitud, no el significado lógico del objeto.

## Ejemplo de la clase

```javascript
const nombres = ["Cuaderno", "LAPICERA", "Mochila"];
const normalizados = nombres.map(nombre => nombre.toLowerCase());
const encontrados = normalizados.filter(nombre => nombre.includes("la"));
console.log(encontrados);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

map transforma cada nombre y construye otro array. filter conserva los que contienen "la": lapicera y mochila. nombres permanece con su texto original. La flecha recibe cada elemento y devuelve el valor usado por el método. Con un array vacío, map y filter producen arrays vacíos.

## Cambiar una decisión y explorar un límite

Cambiá el filtro a > 300: produce []; find da undefined. Comparar esos resultados explica que «sin coincidencias» no tiene la misma forma para ambos métodos. Intentar leer precios[precios.length] está fuera del array. Con sort sin comparador, [2,10] puede quedar [10,2] por orden textual.

## Confusión que conviene evitar

Acceder a array[length] para obtener el último elemento: el último índice es length-1.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_05.md) · [Clase siguiente](../03_JavaScript/CLASE_07.md)
