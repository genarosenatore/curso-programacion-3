# Clase 03.10 · JSON, localStorage y sessionStorage

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_11.md)

## Conservar datos fuera de la ejecución actual

Una variable conserva estado mientras ese contexto existe. Al recargar, el programa empieza de nuevo. Para recordar una preferencia o un carrito, el navegador ofrece almacenamiento por **origen**: combinación de protocolo, dominio y puerto. http://localhost:3000 y http://localhost:3001 no comparten automáticamente sus claves.

localStorage conserva pares clave/texto entre sesiones según las políticas del navegador. sessionStorage está asociado también a una sesión de pestaña. `setItem(clave,texto)` escribe y `getItem(clave)` devuelve texto o null si falta. `removeItem` elimina una clave; clear elimina todo el almacenamiento de ese origen, así que evitá usarlo para borrar solo tu carrito.

## Representar un objeto como texto

JSON es un formato textual de datos: admite objetos, arrays, texto, números, booleanos y null. Sus nombres y cadenas usan comillas dobles; no admite comentarios ni funciones. Un objeto JavaScript y su texto JSON no son lo mismo. `JSON.stringify` serializa a texto; `JSON.parse` interpreta el texto y reconstruye valores. No recupera automáticamente métodos de una clase.

Para el ejemplo inferior, abrí [la página JavaScript local](../Ejemplos/javascript/index.html) mediante el servidor de [Ejemplos](../EJEMPLOS.md) y usá su consola. No lo ejecutes en Node, que no proporciona el almacenamiento de esa página. Guardar el carrito cambia el texto bajo la clave; recargar permite recuperarlo, pero no verifica que siga habiendo stock en el servidor.

## Cuando leer también puede fallar

Un texto alterado puede no ser JSON. `try { ... } catch (error) { ... }` intenta un bloque y, si se lanza un error, pasa a catch con el objeto del error. No salta al catch por una condición falsa: tiene que existir una excepción. `throw new Error("mensaje")` crea y lanza un error intencional; new construye el objeto como vimos con clases.

```javascript
let carrito = [];
try {
  const texto = localStorage.getItem("curso-carrito");
  carrito = texto === null ? [] : JSON.parse(texto);
  if (!Array.isArray(carrito)) throw new Error("Se esperaba un array");
} catch (error) {
  console.error("No se pudo recuperar el carrito", error);
  carrito = [];
}
console.log(carrito);
```

Array.isArray comprueba el tipo de colección. Todavía hay que revisar cada elemento y sus cantidades: poder parsear no garantiza un contrato válido. `??` ofrece un valor alternativo solo cuando la izquierda es null o undefined; `||` también lo hace para cero y texto vacío. Elegí según qué ausencia querés representar.

Los permisos, el precio vigente y las contraseñas no deben confiarse a este estado manipulable. El almacenamiento puede borrarse o fallar por políticas o cuota; manejá esos casos y ofrecé recuperación cuando el dato importe.

## Ejemplo de la clase

```javascript
const carrito = [{ id: 1, cantidad: 2 }];
localStorage.setItem("carrito", JSON.stringify(carrito));
const texto = localStorage.getItem("carrito");
const recuperado = texto ? JSON.parse(texto) : [];
console.log(recuperado);
```

[Abrir el fragmento como archivo](fragmentos/clase_10.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El texto almacenado representa el array. Al recuperarlo, parse reconstruye datos, no instancias ni métodos originales. Un texto alterado puede fallar al parsear: en una aplicación real se usa try/catch y se valida la forma de los datos. Estas APIs se usan desde una página del mismo origen; trabajar desde un servidor local evita limitaciones del protocolo file.

## Cambiar una decisión y explorar un límite

Escribí texto inválido en curso-carrito y ejecutá el bloque: entra a catch y usa []. Escribí un objeto JSON en vez de un array: parse funciona, pero falla la forma. Cambiar la clave separa datos; cambiar el puerto cambia el origen y puede hacer que parezca que desaparecieron.

## Confusión que conviene evitar

Confiar en localStorage como prueba de permisos o como almacenamiento seguro de contraseñas.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_10.md). Las [soluciones razonadas](SOLUCIONES_10.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_11.md)
