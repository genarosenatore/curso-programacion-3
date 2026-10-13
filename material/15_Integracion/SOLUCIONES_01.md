# Soluciones 15.01 · Seguir una petición del frontend al backend

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Revisá si se parseó el cuerpo, si se validó o adaptó su forma y si el render recibió el nuevo producto. Verificá selectors del DOM y errores de consola. No cambies el repositorio primero si la respuesta ya contiene lo esperado.

## 2 y 3. Resolver y justificar las decisiones

Tras201 revisa lectura del cuerpo, contrato validado/adaptado y render con selectores existentes. Sin petición: evento o validación local;400: formato y reglas de entrada;200 con error de consola al presentar: cliente/DOM. GET por el id devuelve el recurso almacenado durante ese arranque y evita confiar solo en un mensaje que la UI podría mostrar sin verificar la respuesta.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
