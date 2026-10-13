# Soluciones 06.02 · toString y representación legible

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

Una salida posible es Cliente{codigo='C01', nombre='Ana'}. Excluí contraseña y cualquier dato que no haga falta para este registro. No devuelvas todos los objetos relacionados sin controlar la profundidad.

## 2 y 3. Resolver y justificar las decisiones

Una salida posible es Cliente{codigo=C01, nombre=Ana}. Pedido puede mostrar su código y clienteCodigo, sin recorrer los pedidos del cliente. Otra aplicación no debe parsear ese texto como JSON porque no tiene reglas JSON ni estabilidad prometida. Un DTO define propiedades explícitas y una serialización apropiada crea el formato de intercambio.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
