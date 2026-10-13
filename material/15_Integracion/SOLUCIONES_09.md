# Soluciones 15.09 · Verificación de requisitos y explicación del proyecto

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

Por ejemplo: catálogo carga y falla; detalle existe y no existe; carrito suma y rechaza exceso; pedido se guarda y rechaza referencias; actualización de estado acepta transición y rechaza inválida. Para cada una registrá petición o acción, salida y estado posterior. El checklist de la unidad te guía para ampliar a la consigna completa.

## 2 y 3. Resolver y justificar las decisiones

Cinco filas posibles: catálogo, detalle, carrito, pedido y cambio de estado, cada una con normal y fallo explicados arriba. Para el error de recarga registra ids/cantidades, JSON guardado, JSON leído y total recalculado. Ubica la primera diferencia: almacenamiento, validación, catálogo o cálculo. Verifica la corrección con repetidos, vacío y dato roto si esa fue la causa. Los ejemplos no cubren pagos, seguridad real, reservas concurrentes ni todas las reglas fiscales; no declares esas capacidades implementadas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
