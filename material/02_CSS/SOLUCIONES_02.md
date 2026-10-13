# Soluciones 02.02 · Cascada, herencia y especificidad

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

Queda morado por el selector #mensaje, dentro de este escenario de reglas normales. Para un diseño mantenible, preferí clases y reglas sencillas en vez de acumular ids e !important.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Un p con class="aviso" queda rojo: las dos reglas de clase superan a p y la última desempata. Un párrafo sin clase queda verde. Un elemento sin color definido puede heredar el del body. Cambiar el orden solo resuelve empates entre reglas comparables; no supera por sí solo una especificidad mayor.

## 3. Qué conviene corregir

La confusión a evitar es: Usar !important ante cualquier conflicto sin investigar qué regla está ganando.

La cascada decide qué declaración se aplica cuando varias compiten. Para reglas normales de la misma procedencia y capa, importa la especificidad y, si empatan, el orden.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
