# Soluciones 13.03 · Fechas, texto, IN, DISTINCT y ordenamiento

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

select c from Cliente c where lower(c.denominacion) like :patron. Parámetro "%ana%". Si querés que el texto del usuario trate % y _ literalmente, definí una política de escape en vez de considerarlos siempre patrones.

## 2 y 3. Resolver y justificar las decisiones

`select c from Cliente c where lower(c.denominacion) like :patron` con "%ana%". La consulta de fechas usa `f.fechaEmision>=:desde and f.fechaEmision<:hastaExclusiva and f.fechaAnulacion is null`. En inicio entra, en fin no. % es comodín aun pasado como parámetro; para pedirlo literal se agrega una política de escape. Parametrizar y definir patrón resuelven problemas diferentes.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
