# Soluciones 14.09 · POST, PUT y DELETE

[Clase](CLASE_09.md) · [Ejercicios](EJERCICIOS_09.md)

## 1. Una solución explicada

@DeleteMapping("/{id}") ResponseEntity<Void> eliminar(@PathVariable Long id){servicio.eliminar(id);return ResponseEntity.noContent().build();}. El servicio lanza el error de inexistencia si corresponde. El advice lo traduce a 404.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El DTO recibido no fija el id. La respuesta señala el nuevo recurso con Location. El ejemplo completo también implementa PUT y DELETE. El frontend debe tratar 204 antes de intentar json. Repetir POST crea otro producto salvo que exista una política de unicidad.

## 3. Qué conviene corregir

La confusión a evitar es: Borrar sin comprobar relaciones o políticas de historial del modelo real.

POST del ejemplo crea y devuelve 201. PUT actualiza los campos editables definidos y devuelve la representación o un éxito sin cuerpo según contrato.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
