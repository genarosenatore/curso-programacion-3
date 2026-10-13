# Clase 04.08 · DOM tipado y consumo de APIs

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_07.md) · [Clase siguiente](../04_TypeScript/CLASE_09.md)

## El elemento esperado puede faltar o ser otro

En JavaScript comprobamos null antes de modificar el [DOM](../03_JavaScript/CLASE_08.md). TypeScript además distingue clases de elementos: Element es genérico; HTMLInputElement tiene value. Escribir querySelector<HTMLInputElement> comunica una expectativa al compilador, pero no verifica que el HTML real tenga ese elemento.

`instanceof HTMLInputElement` comprueba la clase en ejecución. Descarta null y otras clases; dentro del if se puede leer value. El callback captura ese campo ya comprobado. Si el id no existe, el bloque se omite: para una pantalla que requiere buscador, comunicá ese problema de montaje y corregí el documento.

## Validar un dato de red

Recibí JSON como unknown, comprobá que sea objeto no nulo y que tenga los campos esperados. El operador `in` pregunta si existe una propiedad. `typeof v === "object"` solo no alcanza porque null también tiene ese typeof. Array.isArray detecta una colección y every comprueba que todos sus elementos cumplan un predicado; en un array vacío every devuelve true porque no hay contraejemplos.

```typescript
function esProducto(v: unknown): v is {id:number; nombre:string} {
  return typeof v === "object" && v !== null &&
    "id" in v && "nombre" in v &&
    typeof v.id === "number" && Number.isInteger(v.id) &&
    typeof v.nombre === "string";
}
```

Este fragmento puede compilarse sin DOM; su función devuelve un booleano y justifica el predicado. Para entrada externa de id, completá las reglas requeridas, como positivo. Un `as Producto[]` no realiza estos pasos. El código de DOM inferior requiere un input id="busqueda" en una página que cargue el JavaScript compilado por [04.07](CLASE_07.md) o el proyecto local.

Separá fallas de HTTP, lectura JSON, forma de datos y representación: permiten explicar por qué no puede usarse una respuesta. Tipar Promise<Producto[]> solo describe el contrato prometido por tu función; debes implementarlo realmente.

## Ejemplo de la clase

```typescript
const campo = document.querySelector("#busqueda");
if (campo instanceof HTMLInputElement) {
  campo.addEventListener("input", () => {
    console.log(campo.value.trim());
  });
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La comprobación descarta null y elementos de otra clase. En el callback, campo conserva el tipo de input y value es válido. Si la página usa otro id, el código no agrega el listener; esa ausencia debe detectarse al comprobar el montaje de la pantalla.

## Cambiar una decisión y explorar un límite

Poné un div con id busqueda: querySelector lo encuentra, pero instanceof descarta usar value. Probá esProducto(null), un objeto sin nombre y uno con id:"1": deben rechazarse. Un objeto con id:1 y nombre:"Ana" cumple la forma enseñada.

## Confusión que conviene evitar

Usar una afirmación de tipo como solución universal para errores del DOM.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_07.md) · [Clase siguiente](../04_TypeScript/CLASE_09.md)
