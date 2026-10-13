# Soluciones 07.04 · HashMap: claves y valores

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

for(String codigo:List.of("A","B","A")){conteos.put(codigo,conteos.getOrDefault(codigo,0)+1);}. Resultado A=2 y B=1. Una solución alternativa usa merge(codigo,1,Integer::sum).

## 2 y 3. Resolver y justificar las decisiones

Los conteos finales son A=2,B=2,C=1. El algoritmo es `conteos.put(codigo,conteos.getOrDefault(codigo,0)+1);`. En el índice, put(P01,nuevoNombre) conserva size si P01 ya estaba. Para detectar no registrado, consultá containsKey; imponer valores no nulos simplifica el contrato. Un nombre "" puede ser un dato inválido que debe rechazarse, no sinónimo universal de ausencia.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
