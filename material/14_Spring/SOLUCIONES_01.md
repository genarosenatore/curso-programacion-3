# Soluciones 14.01 · HTTP: URL, petición, respuesta, JSON y códigos de estado

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

GET /api/productos/1: 200 con JSON si existe. GET /api/productos/999: 404 con mensaje de error del contrato. El frontend debe comprobar response.ok y decidir qué mostrar.

## 2 y 3. Resolver y justificar las decisiones

Producto1: GET con URL y sin cuerpo,200 con representación si existe.999:404 con mensaje según contrato.400 requiere revisar forma o valores de petición;404 recurso/ruta;500 diagnóstico del servidor; conexión rechazada proceso y puerto. Content-Type indica cómo interpretar cuerpo; un error también puede tener JSON válido. Estado, datos y regla se comprueban juntos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
