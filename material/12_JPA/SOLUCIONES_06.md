# Soluciones 12.06 · Persistencia, consulta, modificación y eliminación

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

En transacción: find por id; si no existe, error de recurso ausente; si el nombre está vacío, rechazo; después setNombre. No permitas que un DTO de actualización cambie id o relaciones arbitrarias sin resolverlas.

## 2 y 3. Resolver y justificar las decisiones

En transacción, find; si null lanza un rechazo adecuado; si nombre null o isBlank, rechaza; luego setNombre(nombre.trim()). merge conserva separado como referencia ajena y devuelve gestionado; los cambios posteriores deben ocurrir en gestionado. Copiar precio null de un DTO incompleto puede borrar o invalidar el valor, por eso una actualización explícita de campos evita interpretar omisión como orden de borrar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
