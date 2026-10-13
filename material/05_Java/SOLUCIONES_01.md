# Soluciones 05.01 · JDK, JVM, código fuente y ejecución

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

Si solo ejecutás java Hola después de cambiar .java, podrías ver el mensaje anterior. Recompilá antes de ejecutar. Para versiones recientes también existe ejecución directa java Hola.java, pero aquí distinguimos los dos pasos.

## 2 y 3. Resolver y justificar las decisiones

Dentro de main escribí `System.out.println("Ana"); System.out.println("Aprender Java");`. javac comprueba sintaxis y genera Hola.class; java Hola ejecuta las dos líneas. La comilla abierta produce error de compilación. Editar el mensaje sin recompilar no cambia el bytecode ya generado. Repará la fuente y compilá con éxito antes de evaluar una nueva salida.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
