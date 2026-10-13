# Soluciones 10.06 · reduce y collect

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

cantidades.stream().reduce(1,(a,b)->a*b) devuelve 24. Para una lista vacía devuelve 1, consistente con la identidad matemática elegida; documentá si el negocio espera otro significado.

## 2 y 3. Resolver y justificar las decisiones

`reduce(1,(a,b)->a*b)` produce 24 y 1 para vacío. Para salida editable: `numeros.stream().filter(n->n>0).collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new))`. La fuente no se modifica. reduce combina en un resultado; collect administra un contenedor de salida. No uses una lista mutable compartida como identidad de reduce para imitar collect sin entender sus condiciones.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
