# Soluciones 04.04 · Uniones, opcionales, null y narrowing

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

function mostrarPrecio(precio:number|null):string { return precio===null?"Sin precio":String(precio); }. Con cero devuelve "0"; con null, Sin precio.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Estado solo admite las dos cadenas definidas. nota puede faltar. La función usa un mensaje alternativo cuando falta, pero conserva una cadena vacía si existe. La comprobación de null permite acceder a length de un string en el otro camino.

## 3. Qué conviene corregir

La confusión a evitar es: Usar ! para afirmar que un valor existe sin explicar por qué.

Una unión admite varias alternativas. Una propiedad opcional puede no existir y al leerla puede aparecer undefined.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
