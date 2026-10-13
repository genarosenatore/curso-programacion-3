# Soluciones 07.03 · HashSet y duplicados

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

if(!codigos.add(codigo)){System.out.println("Ya estaba inscripto");}. Probá dos entradas iguales. Si un correo admite diferencias de mayúsculas, normalizá con una política acordada antes de insertar, no después.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra true, false, true y 1. La segunda inserción no crea otro elemento igual. No hay get(0), porque Set no expresa acceso por índice. Si necesitás una lista ordenada para la pantalla, convertí o seleccioná una implementación apropiada.

## 3. Qué conviene corregir

La confusión a evitar es: Ordenar visualmente según el recorrido accidental de HashSet.

HashSet permite consultar pertenencia sin mantener una secuencia de índices. add devuelve si el conjunto cambió.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
