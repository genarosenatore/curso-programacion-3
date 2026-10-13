# Soluciones 09.02 · Límites de tipos y wildcards

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

El compilador desconoce el subtipo concreto capturado. Insertar un Double rompería una lista de Integer. Si una operación consume Integer, List<? super Integer> permite añadirlo y leer como Object.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Los dos arrays de lista se aceptan como productores de Number. Dentro no sabemos si la lista concreta admite Integer o Double, por eso no añadimos cualquiera de esos tipos. doubleValue expresa una conversión numérica para este cálculo didáctico, no una política de precisión monetaria.

## 3. Qué conviene corregir

La confusión a evitar es: Interpretar extends como permiso para agregar cualquier subclase del límite.

Un límite como T extends Number restringe tipos permitidos y habilita operaciones del contrato Number. Una wildcard ? expresa un tipo desconocido.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
