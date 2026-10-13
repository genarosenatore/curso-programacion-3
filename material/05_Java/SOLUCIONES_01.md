# Soluciones 05.01 · JDK, JVM, código fuente y ejecución

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Si solo ejecutás java Hola después de cambiar .java, podrías ver el mensaje anterior. Recompilá antes de ejecutar. Para versiones recientes también existe ejecución directa java Hola.java, pero aquí distinguimos los dos pasos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Guardá Hola.java con ese nombre porque contiene la clase pública Hola. Desde su carpeta ejecutá javac Hola.java y luego java Hola. Debe mostrar Hola, Java. Compilar comprueba reglas y genera bytecode; ejecutar realiza las instrucciones. También podés usar un IDE después de configurar el JDK.

## 3. Qué conviene corregir

La confusión a evitar es: Ejecutar java Hola.class: se usa el nombre de la clase sin esa extensión.

El JDK contiene herramientas para compilar y ejecutar Java; la JVM ejecuta bytecode. javac transforma .java en .class y java ejecuta una clase o aplicación.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
