# Soluciones 04.05 · Genéricos básicos y diferencias entre any y unknown

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

function ultimo<T>(valores:T[]):T|undefined { return valores.length===0?undefined:valores[valores.length-1]; }. Con [1,2] devuelve 2 y con [] undefined.

## 2 y 3. Resolver y justificar las decisiones

ultimo puede retornar valores.length===0 ? undefined : valores[valores.length-1]. Con [1,2] devuelve 2 y con ["Ana"] devuelve "Ana", conservando el tipo de cada llamada. `if (typeof valor === "string") return valor.toLowerCase(); return "No es texto";` produce ana, No es texto y No es texto. any permitiría llamar métodos sin esa evidencia; T conserva relaciones sin eliminar comprobaciones.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
