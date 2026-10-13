# Soluciones 08.06 · Práctica: DTO de producto y factura

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

ProductoTarjetaDTO(String nombre,int precioCentavos,boolean disponible). Su constructor se llama con nombre, precio y stock>0. Los resultados deben ser true para 3 y false para 0. Revisá los TP Lombok/DTO y records del campus después de ejecutar este ejemplo.

## 2 y 3. Resolver y justificar las decisiones

ProductoTarjetaDTO retorna false para agotado y true para stock tres, conservando precio en centavos. FacturaVista puede recibir clienteNombre y List<DetalleVista> con copia no modificable; cada detalle contiene cantidad y subtotal ya calculado por reglas del modelo. Evitar el cliente completo reduce exposición y ciclos. Un usuario todavía puede no tener permiso para ver esa factura, por lo que el servidor debe decidir acceso antes de devolver el DTO.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
