# Soluciones 14.02 · API, recursos y operaciones CRUD

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

GET /api/pedidos, POST /api/pedidos y GET /api/pedidos/{id}. Para cambiar un estado se puede acordar una operación específica o actualización del recurso; lo importante es documentar cuerpo, validación y códigos.

## 2 y 3. Resolver y justificar las decisiones

GET /api/pedidos200 con array; POST /api/pedidos201 con nuevo recurso; GET /api/pedidos/{id}200 o404. PUT completo exige todos los campos editables, así que omitir precio es entrada inválida o una política distinta que debe acordarse. PATCH puede describir cambios parciales. Deshabilitar botón reduce doble clic accidental, pero el servidor debe resolver repeticiones y reglas propias.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
