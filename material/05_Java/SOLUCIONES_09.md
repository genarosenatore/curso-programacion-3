# Soluciones 05.09 · Excepciones y manejo de errores

[Clase](CLASE_09.md) · [Ejercicios](EJERCICIOS_09.md)

## 1. Una solución explicada

"3" da 3. "3.5" y "abc" producen NumberFormatException. Después de convertir, todavía debemos validar que 3 sea una cantidad aceptable según el negocio.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

parseInt no puede convertir dos y lanza NumberFormatException. El código salta al catch correspondiente y muestra una explicación. No ejecuta el println de cantidad. En una aplicación, distinguir errores esperados de programación ayuda a elegir qué mensaje mostrar y qué información registrar.

## 3. Qué conviene corregir

La confusión a evitar es: Tratar una conversión válida como prueba de que el dato cumple todas las reglas.

Una excepción representa una situación que impide continuar normalmente. throw lanza; try rodea una operación; catch maneja un tipo de fallo; finally permite cerrar una acción independientemente del resultado.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
