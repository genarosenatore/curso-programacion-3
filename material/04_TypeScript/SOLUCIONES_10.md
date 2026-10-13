# Soluciones 04.10 · Preparación del frontend de Food Store

[Clase](CLASE_10.md) · [Práctica](EJERCICIOS_10.md)

## 1. Razonamiento de la actividad guiada

Con dos productos de 800×2 y 2000×1, total devuelve 3600. Validá cada alta o modificación del carrito; al crear el pedido, el backend vuelve a comprobar disponibilidad y precios. El valor mostrado en el navegador no es la autoridad del total guardado.

## 2 y 3. Resolver y justificar las decisiones

Ambas formas dan 3600 y conservan cero para vacío. puedeAgregar comprueba Number.isInteger de los tres valores, stock >= 0, actual >= 0, nueva > 0 y actual + nueva <= stock. Con 3/2/1 devuelve true y con 3/2/2 false. Validar solo nueva <= stock dejaría superar el máximo al repetir. El servidor ve datos actuales y aplica la regla a todos los clientes, aunque el navegador haya sido manipulado.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
