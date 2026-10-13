# Clase 03.08 · DOM: seleccionar, crear y modificar elementos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_07.md) · [Clase siguiente](../03_JavaScript/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **dom: seleccionar, crear y modificar elementos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El DOM es la representación de la página como un árbol de objetos. JavaScript puede seleccionar nodos, leer su contenido y modificarlos. querySelector devuelve la primera coincidencia o null. createElement crea un elemento todavía no insertado; append lo incorpora al documento.

textContent asigna texto. innerHTML interpreta marcado y exige cuidado cuando el contenido proviene de usuarios o servicios: para mostrar nombres y mensajes usaremos textContent. Ejecutar el script antes de que exista el elemento puede hacer que la selección devuelva null.

## Ejemplo

```javascript
// HTML: <ul id="productos"></ul>
const lista = document.querySelector("#productos");
if (lista) {
  const item = document.createElement("li");
  item.textContent = "Cuaderno";
  lista.append(item);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

La selección busca el id productos. El if evita actuar sobre null. li se crea, recibe texto y se añade a ul. Poné el script al final del body o usá un script externo con defer. En los ejemplos de la unidad se entrega el HTML necesario para ejecutar estas operaciones.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Mostrá los nombres de tres productos creando un li por cada uno.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Reemplazar datos de usuario con innerHTML como si fuera una simple asignación de texto.

## Resumen para repasar

El DOM es la representación de la página como un árbol de objetos. JavaScript puede seleccionar nodos, leer su contenido y modificarlos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_07.md) · [Clase siguiente](../03_JavaScript/CLASE_09.md)
