# Soluciones 14.12 · Práctica: CRUD de cursos y facturación

[Clase](CLASE_12.md) · [Ejercicios](EJERCICIOS_12.md)

## 1. Una solución explicada

Controller recibe/valida forma; Service aplica reglas, consulta referencias y calcula importes; Repository guarda; Service prepara DTO y Controller devuelve 201. Un importe final se calcula en backend con reglas vigentes, no se acepta sin comprobación desde navegador.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Ejecutá el proyecto de apoyo siguiendo su README. Los comandos de prueba HTTP están en un archivo .http y también se describen en la guía. Cuando cierres y reinicies el proyecto, los datos de H2 se reconstruyen. Después trasladá estas ideas al CRUD de cursos y a la consigna de facturas.

## 3. Qué conviene corregir

La confusión a evitar es: Tomar la confirmación visual de una pantalla como prueba suficiente de que el backend guardó los datos.

La práctica completa permite crear, listar, actualizar y borrar un producto, con validación, base en memoria y errores coherentes. Es una aplicación educativa que une capas y conceptos, no una solución completa de facturación o Food Store.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
