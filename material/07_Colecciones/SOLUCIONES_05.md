# Soluciones 07.05 · Iteradores, búsqueda y eliminación

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

numeros.removeIf(n->n<0);. Para [-2,0,4,-1] queda [0,4]. Comprobá una lista sin negativos y una vacía. Con un iterador, llamá iterator.remove después de next, no lista.remove.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Queda [3,5]. La lambda recibe cada valor y decide qué eliminar. En el ejemplo usa Integer con autounboxing para compararlo numéricamente. Si se admitieran null, habría que manejarlos antes. removeIf modifica la lista, distinto de filter de un stream que produce otro resultado.

## 3. Qué conviene corregir

La confusión a evitar es: Usar lista.remove dentro del for mejorado y provocar ConcurrentModificationException.

Modificar una colección mientras un for mejorado la recorre puede invalidar su iterador. Para eliminar según una regla, removeIf expresa la intención.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
