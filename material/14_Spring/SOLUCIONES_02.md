# Soluciones 14.02 · API, recursos y operaciones CRUD

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

GET /api/pedidos, POST /api/pedidos y GET /api/pedidos/{id}. Para cambiar un estado se puede acordar una operación específica o actualización del recurso; lo importante es documentar cuerpo, validación y códigos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La colección y un recurso concreto se distinguen por el id. PUT del ejemplo recibe todos los campos editables requeridos; si querés modificaciones parciales, definí un contrato apropiado como PATCH. No uses GET para cambiar stock o borrar productos.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que un método se comporta correctamente solo por tener una ruta con nombre REST.

Una API define cómo otros programas interactúan. Una API REST organiza recursos identificados por URLs y operaciones con semántica HTTP.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
