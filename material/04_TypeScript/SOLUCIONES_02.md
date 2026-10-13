# Soluciones 04.02 · Tipos básicos, inferencia, arrays y funciones

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

function saludar(nombre:string):string { return `Hola, ${nombre}`; }. saludar("Ana") devuelve Hola, Ana. Una función que solo imprime podría tener retorno void en vez de string.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La función recibe dos números y devuelve otro. precios solo admite números. En configuraciones que comprueban acceso por índice, podría requerirse comprobar que precios[0] existe. Un array vacío demuestra por qué una suposición sobre sus elementos puede fallar aunque sus elementos sean numéricos.

## 3. Qué conviene corregir

La confusión a evitar es: Agregar tipos a todo mecánicamente y no comprender lo que se está garantizando.

TypeScript puede inferir tipos a partir de un valor. No siempre hace falta anotarlo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
