# Soluciones 11.05 · INSERT, UPDATE y DELETE

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

UPDATE producto SET nombre='Cuaderno grande' WHERE id=1; SELECT id,nombre FROM producto WHERE id IN(1,2) ORDER BY id;. Solo 1 cambia. Las prácticas del archivo SQL se hacen en una base en memoria reconstruible.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La categoría 1 debe existir. El UPDATE cambia solo el producto 3 y el SELECT permite observarlo antes del DELETE. Si el producto ya está referenciado por detalles, la política de claves foráneas puede rechazar su borrado. Ese rechazo indica una relación que hay que respetar.

## 3. Qué conviene corregir

La confusión a evitar es: Olvidar WHERE al editar un registro individual.

INSERT añade registros; UPDATE modifica los que cumplen una condición; DELETE elimina. Antes de una modificación, escribí un SELECT con el mismo filtro para comprobar el conjunto objetivo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
