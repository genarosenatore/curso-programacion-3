# Soluciones 07.07 · Práctica: catálogo e índice de productos

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Antes de put, si containsKey(codigo), devolvé rechazo. Para consultar, usá el valor nullable con comprobación o envolvelo en Optional. Probá alta CUA dos veces y consulta XXX. Documentá si actualizar es una operación diferente de crear.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

LinkedHashMap permite buscar por clave y conserva inserción para este caso. Integer puede ser null si falta la clave; no lo convertimos automáticamente a int antes de comprobar. Un precio cero sigue siendo un precio presente.

## 3. Qué conviene corregir

La confusión a evitar es: Usar getOrDefault con cero y después confundir producto inexistente con producto gratuito.

Un catálogo puede usar List para mostrar una secuencia, Map para buscar por código y Set para comprobar códigos repetidos. Mantener estructuras redundantes requiere sincronizarlas; para un ejercicio pequeño, elegí una fuente principal y derivá lo necesario.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
