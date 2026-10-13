# Soluciones 14.09 · POST, PUT y DELETE

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

@DeleteMapping("/{id}") ResponseEntity<Void> eliminar(@PathVariable Long id){servicio.eliminar(id);return ResponseEntity.noContent().build();}. El servicio lanza el error de inexistencia si corresponde. El advice lo traduce a 404.

## 2 y 3. Resolver y justificar las decisiones

El método llama servicio.eliminar(id) y retorna ResponseEntity.noContent().build(); Void expresa ausencia de cuerpo. El recorrido esperado es201,200,200 según la actualización del proyecto,204 y404. Dos POST pueden crear dos objetos; dos PUT idénticos dejan los mismos campos. Anulación o borrado se decide por reglas del modelo y contrato, no únicamente por un verbo HTTP.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
