# Soluciones 14.08 · DTO de entrada y salida; validación

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

La existencia se consulta por id y el stock se comprueba sobre el estado vigente dentro de la operación. El DTO valida estructura y valores locales; no conoce la base ni la concurrencia.

## 2 y 3. Resolver y justificar las decisiones

Nombre blanco falla NotBlank; precio null falla NotNull; precio -1 falla PositiveOrZero y0 pasa. PedidoRequest puede usar @NotNull @Positive para id y cantidad con tipos envoltorio. El servicio busca producto, comprueba cantidad contra stock actual, calcula importes y conserva coherencia. @Valid solo evalúa las restricciones implementadas y activadas, no inventa consultas ni autorización.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
