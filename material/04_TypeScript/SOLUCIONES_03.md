# Soluciones 04.03 · Interfaces y tipos para objetos

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

interface Cliente { id:number; nombre:string; correo:string; }. const cliente:Cliente={id:1,nombre:"Ana",correo:"ana@example.com"};. Validar la forma real del correo sigue siendo otra responsabilidad.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El objeto debe incluir id, nombre y precio con tipos compatibles. readonly impide escribir producto.id=2 desde esta referencia. Cambiar precio sigue permitido. Al conectar la API, los nombres deben coincidir con el JSON; llamar costo a precio en la interface no renombra automáticamente la respuesta.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que una interface genera un constructor o valida automáticamente un JSON.

Una interface describe la forma de un objeto: nombres de propiedades y sus tipos. type permite expresar alias, incluyendo uniones.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
