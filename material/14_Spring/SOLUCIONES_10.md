# Soluciones 14.10 · Errores, excepciones y ControllerAdvice

[Clase](CLASE_10.md) · [Práctica](EJERCICIOS_10.md)

## 1. Razonamiento de la actividad guiada

Nombre inválido: 400 con explicación de campo. Id inexistente: 404. Fallo inesperado: 500 con mensaje genérico y registro interno para diagnóstico. La clase del error debe guiar la traducción, no solo la palabra presente en su texto.

## 2 y 3. Resolver y justificar las decisiones

JSON roto falla al leer cuerpo; nombre vacío al validar request; recurso ausente al consultar. Los dos primeros producen400 y el último404 con el contrato de error definido. El cliente verifica estado y mensaje en vez de asumir éxito por recibir datos. La traza ayuda al desarrollador en registros del servidor, pero exponerla revela información y no ayuda al usuario a corregir su entrada.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
