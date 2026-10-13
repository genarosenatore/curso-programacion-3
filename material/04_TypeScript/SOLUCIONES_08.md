# Soluciones 04.08 · DOM tipado y consumo de APIs

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

function esProducto(v:unknown):v is {id:number;nombre:string} { return typeof v==="object" && v!==null && "id" in v && "nombre" in v && typeof v.id==="number" && typeof v.nombre==="string"; }. Aplicala a cada elemento de un array antes de usarlo.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La comprobación descarta null y elementos de otra clase. En el callback, campo conserva el tipo de input y value es válido. Si la página usa otro id, el código no agrega el listener; esa ausencia debe detectarse al comprobar el montaje de la pantalla.

## 3. Qué conviene corregir

La confusión a evitar es: Usar una afirmación de tipo como solución universal para errores del DOM.

En TypeScript, un nodo genérico no tiene necesariamente value. HTMLInputElement sí lo tiene.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
