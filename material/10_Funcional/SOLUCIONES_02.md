# Soluciones 10.02 · Predicate, Function, Consumer y Supplier

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

Predicate<Integer> valido=n->n>=1&&n<=5;. Con 0 false, 1 true, 5 true y 6 false. Si el contrato admite null, primero hay que descartarlo; aquí asumimos enteros presentes.

## 2 y 3. Resolver y justificar las decisiones

valido=n->n>=1&&n<=5 devuelve false,true,true,false. sumarUno.andThen(duplicar).apply(3) da 8; duplicar.andThen(sumarUno) da 7. Consumer.accept provoca la salida pero no devuelve el String para otra transformación; Function.apply sí lo entrega. La elección del contrato comunica si producís datos o realizás una acción.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
