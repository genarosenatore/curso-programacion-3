# Soluciones 02.09 · BEM y organización de estilos

[Clase](CLASE_09.md) · [Práctica](EJERCICIOS_09.md)

## 1. Razonamiento de la actividad guiada

carrito, carrito__titulo, carrito__total y carrito--vacio. En HTML conservá carrito al añadir carrito--vacio. Podés cambiar el diseño sin renombrar una clase llamada rojo.

## 2 y 3. Resolver y justificar las decisiones

carrito, carrito__titulo, carrito__total y carrito--vacio; el atributo es class="carrito carrito--vacio". En CSS: `:root { --color-acento:#075985; } .carrito__titulo, .tarjeta__titulo { color:var(--color-acento); }`. Al cambiar el valor cambia su presentación compartida. La convención hace legible la intención y reduce dependencia del árbol, pero no garantiza accesibilidad ni que los cálculos o estados del carrito sean correctos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
