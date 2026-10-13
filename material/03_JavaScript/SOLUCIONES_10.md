# Soluciones 03.10 · JSON, localStorage y sessionStorage

[Clase](CLASE_10.md) · [Práctica](EJERCICIOS_10.md)

## 1. Razonamiento de la actividad guiada

localStorage.setItem("tema","oscuro"); const tema=localStorage.getItem("tema") ?? "claro";. removeItem("tema") elimina solo esa preferencia. ?? usa el valor alternativo si hay null o undefined.

## 2 y 3. Resolver y justificar las decisiones

Preferencia: `localStorage.setItem("curso-tema","oscuro"); const tema = localStorage.getItem("curso-tema") ?? "claro";` y `localStorage.removeItem("curso-tema");`. No uses clear.

Para cantidades, `localStorage.setItem("curso-cantidades", JSON.stringify([1,2]));` y adaptá el bloque de recuperación a esa clave. Ausente da []; JSON válido da [1,2]; texto roto lanza durante parse y catch usa []. `{"cantidad":2}` se interpreta sin error de sintaxis, pero no es un array y debe rechazarse por el contrato. Esa segunda comprobación evita confundir «se pudo leer» con «sirve para el programa».

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
