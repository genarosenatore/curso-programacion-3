# Soluciones 04.08 · DOM tipado y consumo de APIs

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

function esProducto(v:unknown):v is {id:number;nombre:string} { return typeof v==="object" && v!==null && "id" in v && "nombre" in v && typeof v.id==="number" && typeof v.nombre==="string"; }. Aplicala a cada elemento de un array antes de usarlo.

## 2 y 3. Resolver y justificar las decisiones

El DOM usa la comprobación del ejemplo y campo.value.trim(). esLibro combina typeof v object, v !== null, propiedades presentes, typeof id number, Number.isInteger(id), id > 0, typeof titulo string y titulo.trim() !== "". Probá null, {id:"1",titulo:"A"}, {id:1,titulo:""} y {id:1,titulo:"A"}: false, false, false, true. La afirmación as desaparece en JavaScript; las condiciones del predicado permanecen y protegen la ejecución.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
