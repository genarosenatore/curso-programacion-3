# Soluciones 14.12 · Práctica: CRUD de cursos y facturación

[Clase](CLASE_12.md) · [Práctica](EJERCICIOS_12.md)

## 1. Razonamiento de la actividad guiada

Controller recibe/valida forma; Service aplica reglas, consulta referencias y calcula importes; Repository guarda; Service prepara DTO y Controller devuelve 201. Un importe final se calcula en backend con reglas vigentes, no se acepta sin comprobación desde navegador.

## 2 y 3. Resolver y justificar las decisiones

El CRUD verifica listar200, crear201, obtener200, actualizar200, eliminar204 y obtener404, junto a inválidos400 definidos. Factura: controller lee/valida forma; service resuelve referencias, calcula y conserva reglas; repository/JPA guarda; transacción confirma y DTO vuelve. Con detalle inválido no hay cabecera parcial confirmada. El ejemplo no implementa impuestos completos, pagos ni reglas fiscales de FacturaArca.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
