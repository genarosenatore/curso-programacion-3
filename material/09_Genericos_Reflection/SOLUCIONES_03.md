# Soluciones 09.03 · Prácticas de genéricos del campus

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

Contenedor<String> c=new ContenedorSimple<>(); c.guardar("Ana"); String nombre=c.obtener();. c.guardar(3) no compila. Podés cambiar obtener a Optional<T> con Optional.ofNullable(valor) si querés ausencia explícita.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Los métodos son públicos por el contrato de interface. Antes de guardar, obtener devuelve null porque valor es una referencia sin asignación inicial. Esa ausencia debe documentarse o modelarse con Optional. Después de guardar, recuperar mantiene el mismo tipo.

## 3. Qué conviene corregir

La confusión a evitar es: Dar por existente el contenido antes de guardarlo y provocar null.

Una práctica genérica debe tener una razón para relacionar tipos. Un almacén que guarda y recupera un mismo tipo es un buen caso.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
