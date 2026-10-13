# Soluciones 07.02 · ArrayList y recorrido de listas

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

nombres.remove("Luis"); nombres.add("Omar");. Queda Anita, Eva, Omar con tamaño 3. Comprobá remove con un nombre inexistente: devuelve false y conserva la lista.

## 2 y 3. Resolver y justificar las decisiones

Queda [Anita,Eva,Omar], size 3. Con [1,2,1], remove(1) quita el segundo elemento y deja [1,1]; remove(Integer.valueOf(1)) quita la primera coincidencia de valor y deja [2,1]. El compilador elige la sobrecarga según el tipo del argumento, no según tu intención escrita en un comentario.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
