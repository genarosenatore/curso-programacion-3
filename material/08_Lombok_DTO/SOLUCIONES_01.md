# Soluciones 08.01 · Anotaciones y código repetitivo

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Getter y asignación del constructor son repetitivos. Si el nombre no puede estar vacío, esa validación debe permanecer en un constructor o fábrica apropiada. Generar un setter no valida automáticamente una condición del negocio.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Este ejemplo no necesita Lombok y permite ver qué se automatiza. Una anotación no es una llamada que se ejecuta al recorrer main. En el proyecto de Spring preparado, Lombok se declara como dependencia y procesador; las clases de esta unidad distinguen fragmentos de Java puro y fragmentos que la necesitan.

## 3. Qué conviene corregir

La confusión a evitar es: Agregar una anotación esperando que el IDE descargue y configure cualquier dependencia.

Una anotación añade metadatos o activa herramientas que interpretan el código. @Override es comprobada por el compilador.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
