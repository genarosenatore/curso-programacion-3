# Soluciones 07.07 · Práctica: catálogo e índice de productos

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Antes de put, si containsKey(codigo), devolvé rechazo. Para consultar, usá el valor nullable con comprobación o envolvelo en Optional. Probá alta CUA dos veces y consulta XXX. Documentá si actualizar es una operación diferente de crear.

## 2 y 3. Resolver y justificar las decisiones

Consulta existente devuelve su nombre; ausente se maneja como falta, no como nombre vacío. Antes de alta, si indice.containsKey(codigo) rechazá. Solo después agregá a lista y mapa. En duplicado ambos tamaños se conservan. Mantener dos estructuras puede desincronizarlas si una operación modifica solo una; una alternativa es tener un mapa como fuente y construir una lista ordenada para mostrar cuando haga falta.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
