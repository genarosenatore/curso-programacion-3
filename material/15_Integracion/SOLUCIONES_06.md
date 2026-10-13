# Soluciones 15.06 · Carrito, cantidades y localStorage

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Después de agregar 2 queda 2; añadir otras 2 se rechaza y conserva 2; quitar 1 deja 1; serializar y recargar debe recuperar 1 tras validar. Si los datos almacenados están corruptos, mostrás un estado recuperable en lugar de fallar toda la página.

## 2 y 3. Resolver y justificar las decisiones

La secuencia es2, rechazo conservando2,1 y1 recuperado si almacenamiento válido. Para corrupción, try/catch protege parseo; Array.isArray comprueba colección; cada ítem exige id conocido, entero positivo y máximo permitido. Retira o informa inválidos según política explícita. Recalcula desde catálogo válido y cantidades, no desde un total enviado. Servidor confirma existencia, stock y precios para todos los clientes.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
