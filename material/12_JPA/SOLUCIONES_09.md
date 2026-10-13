# Soluciones 12.09 · Prácticas de JPA y modelo FacturaArca

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

Factura→Cliente suele ser ManyToOne, propiedad de Factura, sin remove en cascada. Factura→Detalles es OneToMany con mappedBy factura; Detalle→Factura es propietario. La política de anulación puede conservar ambos. Comprobá la consigna completa para nombres y requisitos concretos.

## 2 y 3. Resolver y justificar las decisiones

Factura→Cliente es ManyToOne con clave en factura y sin remove hacia cliente. Factura→Detalles es OneToMany inverso; Detalle→Factura es propietario y mantiene la columna. Una moneda agregaría entidad o valor según consigna, referencia y regla de conversión/redondeo. El laboratorio no implementa cálculo fiscal completo, autorización ni el proyecto del campus; sí permite guardar, recuperar y consultar las relaciones enseñadas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
