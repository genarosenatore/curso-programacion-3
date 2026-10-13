# Soluciones 03.08 · DOM: seleccionar, crear y modificar elementos

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

Para cada nombre, createElement("li"), textContent=nombre y lista.append(item). Antes de volver a renderizar podés usar lista.replaceChildren() para evitar duplicados. Confirmá que el número de elementos sea tres después de repetir el render.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La selección busca el id productos. El if evita actuar sobre null. li se crea, recibe texto y se añade a ul. Poné el script al final del body o usá un script externo con defer. En los ejemplos de la unidad se entrega el HTML necesario para ejecutar estas operaciones.

## 3. Qué conviene corregir

La confusión a evitar es: Reemplazar datos de usuario con innerHTML como si fuera una simple asignación de texto.

El DOM es la representación de la página como un árbol de objetos. JavaScript puede seleccionar nodos, leer su contenido y modificarlos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
