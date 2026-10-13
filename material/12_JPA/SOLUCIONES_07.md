# Soluciones 12.07 · Cascadas, orphanRemoval y carga de relaciones

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Borrar una factura no debería borrar al cliente y todas sus relaciones. Conservá la referencia sin cascada remove salvo un caso de propiedad exclusivo deliberado. Para la salida de API, un DTO evita recorrer toda la red de relaciones.

## 2 y 3. Resolver y justificar las decisiones

Detalles exclusivos pueden usar persist/merge y, si el borrado físico es permitido, remove u orphanRemoval. Cliente compartido no recibe remove automáticamente. Para la pantalla, consulta cliente y total o proyectá un DTO, y prepara la salida dentro de la transacción/contexto. EAGER exige dato disponible pero puede realizar varios SELECT; revisá SQL y cantidad de consultas con datos que incluyan varias facturas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
