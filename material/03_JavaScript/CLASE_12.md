# Clase 03.12 · async/await, fetch y manejo de errores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_11.md) · [Clase siguiente](../03_JavaScript/CLASE_13.md)

## Pedir datos y recibir una respuesta

Una **petición HTTP** pide un recurso mediante una URL. La **respuesta** incluye un estado, cabeceras y normalmente un cuerpo. 200 indica éxito habitual; 404 recurso no encontrado; 500 un fallo del servidor. JSON puede ser el formato del cuerpo. Esa distinción permite entender fetch antes de estudiar la API de Spring.

`fetch(url)` devuelve una promesa que resuelve con un objeto Response cuando llega la respuesta inicial. Un estado 404 es una respuesta recibida, no necesariamente un rechazo de red. `respuesta.ok` indica estado en el rango 200–299; `respuesta.status` expone el número. `respuesta.json()` devuelve otra promesa, que lee e interpreta el cuerpo. Puede fallar si está vacío o no es JSON.

## Preparar un ejemplo local completo

En una carpeta de ejercicios creá productos.json con `[{"nombre":"Cuaderno","precio":2000}]` y un index.html basado en [03.08](CLASE_08.md). Copiá la función cargarProductos del ejemplo inferior dentro de su script. Desde esa carpeta podés servir con `python -m http.server 3001 --bind 127.0.0.1` si tenés Python y abrir http://127.0.0.1:3001. También podés usar el servidor de [Ejemplos](../EJEMPLOS.md) con sus archivos de JavaScript. No abras fetch local como file sin servidor.

## Leer async y await paso a paso

`async` declara una función que siempre devuelve una promesa. `await` suspende esa llamada hasta obtener el resultado de una promesa, sin detener todo el navegador. Primero await fetch obtiene Response. Se revisa ok. Después await json obtiene los datos. Por último se muestran. La función debe llamarse; definirla no descarga nada.

El bloque try/catch de [03.10](CLASE_10.md) trata un error de red, el Error lanzado por un estado no aceptado o un JSON inválido. Si no existe error, catch se omite. `finally` es un bloque opcional que se ejecuta al salir del intento, tanto con éxito como con error; resulta útil para retirar una señal de carga.

No escribas `const productos = respuesta.json();` y leas productos.length como si ya fuera el array: sigue siendo una promesa. Tampoco leas dos veces el mismo cuerpo: una respuesta normalmente se consume una vez. Después de parsear comprobá Array.isArray y los campos necesarios; una respuesta exitosa puede tener una forma inesperada.

La interfaz necesita un estado inicial, carga, resultado, vacío o error. Vacío no significa fallo: un catálogo válido con cero elementos necesita su propio mensaje. Mantener estos estados impide dejar resultados antiguos como si pertenecieran a una petición nueva.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

productos.json debe estar junto a la página y servirse desde un servidor local. await de fetch obtiene Response y await de json obtiene los datos. Un error de red o uno lanzado al comprobar ok llega al catch. Todavía debemos validar que los datos tengan la forma que el programa espera.

## Cambiar una decisión y explorar un límite

Renombrá productos.json: se recibe 404 y la comprobación lanza el error. Dejá el archivo con una coma final inválida: HTTP puede ser 200, pero json falla. Escribí []: es éxito vacío. Son tres casos distintos que no deben producir el mismo diagnóstico.

## Confusión que conviene evitar

Suponer que fetch lanza error automáticamente ante cualquier respuesta HTTP de error.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_12.md). Las [soluciones razonadas](SOLUCIONES_12.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_11.md) · [Clase siguiente](../03_JavaScript/CLASE_13.md)
