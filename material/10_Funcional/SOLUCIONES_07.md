# Soluciones 10.07 · Agrupaciones y Optional

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

nombres.stream().filter(n->!n.isEmpty()).collect(groupingBy(n->n.substring(0,1),counting())). Con Ana, Abel y Eva da A=2, E=1. La decisión de excluir vacíos debe ser explícita.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El mapa contiene longitud 3 con conteo 2 y longitud 4 con conteo 1; su orden no está garantizado. elegido es Sin coincidencia. La clave length agrupa por longitud, no por inicial. Leé cada criterio antes de interpretar un mapa.

## 3. Qué conviene corregir

La confusión a evitar es: Hacer Optional.get() sobre una búsqueda que puede no tener resultado.

groupingBy agrupa elementos según una clave. Puede devolver Map<Clave,List<Elemento>> o usar otro collector para resumir cada grupo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
