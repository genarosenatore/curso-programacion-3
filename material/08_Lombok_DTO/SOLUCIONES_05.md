# Soluciones 08.05 · Records y datos de transporte

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

record ListaDTO(List<String> nombres){ListaDTO{nombres=List.copyOf(nombres);}}. Cambiar la lista original no cambia la colección del DTO. Si los elementos son mutables, la copia sigue siendo superficial; en este caso String es inmutable.

## 2 y 3. Resolver y justificar las decisiones

Los dos DTO válidos tienen equals true y hashes coherentes. El nombre vacío se rechaza al construir. `record ListaDTO(List<String> nombres){ ListaDTO{ nombres=List.copyOf(nombres); } }` conserva los elementos iniciales aunque crezca la lista original. Sus Strings no se modifican, pero si fueran objetos de dominio mutables, ambas listas podrían observar mutaciones de esos elementos. Copia de contenedor y copia de objetos internos son cosas distintas.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
