# Soluciones 11.07 · Transacciones: confirmar o revertir cambios

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Se revierte el conjunto si no se cumple la operación completa. El código debe manejar el error y solicitar rollback o usar un gestor transaccional configurado. No confirmar la cabecera antes de comenzar los detalles.

## 2 y 3. Resolver y justificar las decisiones

Los valores son200000,210000,200000. Si el segundo detalle falla, se descartan cabecera y primer detalle de esa transacción para no guardar una factura parcial. La aplicación debe ejecutar rollback o utilizar un gestor con esa política. Capturar e informar éxito puede confirmar lo anterior; eso contradice la atomicidad requerida y engaña al usuario.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
