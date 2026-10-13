# Soluciones 12.05 · EntityManager y ciclo de vida

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

La entidad está separada y la modificación no se guarda por sí sola. Para una actualización, conviene recuperar una entidad gestionada dentro de una transacción y aplicar los datos aceptados, en vez de asumir que cualquier objeto con id está conectado.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

find obtiene una entidad gestionada. Cambiarla se detecta en el contexto y flush puede emitir SQL. Si la transacción se revierte, ese SQL no queda confirmado. El setter debe existir en la clase del proyecto; el fragmento no es un programa de consola independiente.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir id presente con entidad actualmente gestionada.

EntityManager gestiona un contexto de persistencia. Una entidad puede ser nueva, gestionada, separada o eliminada.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
