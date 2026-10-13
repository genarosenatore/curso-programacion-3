# Clase 03.12 · async/await, fetch y manejo de errores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_11.md) · [Clase siguiente](../03_JavaScript/CLASE_13.md)

## Qué vas a aprender

Vamos a trabajar **async/await, fetch y manejo de errores**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

async declara una función cuyo resultado es una promesa. await espera un resultado dentro de esa función sin bloquear todo el navegador. try/catch permite manejar errores. fetch hace una petición y devuelve una promesa de respuesta; un 404 no rechaza automáticamente esa promesa, por eso verificamos response.ok.

Después de recibir la respuesta, json interpreta su cuerpo. Puede fallar si el contenido no es JSON válido. La interfaz necesita estados de carga, éxito y error. Primero practicaremos con un JSON local para no depender de una API externa.

## Ejemplo

```javascript
async function cargarProductos() {
  try {
    const respuesta = await fetch("./productos.json");
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);
    const productos = await respuesta.json();
    console.log(productos);
  } catch (error) {
    console.error("No se pudieron cargar los productos", error);
  }
}
cargarProductos();
```

[Abrir el fragmento como archivo](fragmentos/clase_12.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

productos.json debe estar junto a la página y servirse desde un servidor local. await de fetch obtiene Response y await de json obtiene los datos. Un error de red o uno lanzado al comprobar ok llega al catch. Todavía debemos validar que los datos tengan la forma que el programa espera.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Mostrá un mensaje de carga antes de fetch y reemplazalo por éxito o error al terminar.

Abrí [los ejercicios y las pistas](EJERCICIOS_12.md). Las [soluciones explicadas](SOLUCIONES_12.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que fetch lanza error automáticamente ante cualquier respuesta HTTP de error.

## Resumen para repasar

async declara una función cuyo resultado es una promesa. await espera un resultado dentro de esa función sin bloquear todo el navegador.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.12** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_11.md) · [Clase siguiente](../03_JavaScript/CLASE_13.md)
