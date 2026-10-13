# Clase 05.01 · JDK, JVM, código fuente y ejecución

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_10.md) · [Clase siguiente](../05_Java/CLASE_02.md)

## Java es otro lenguaje y otro recorrido de ejecución

Las ideas de entrada, variables y funciones se reutilizan, pero Java tiene sus propias reglas. No es una versión de JavaScript. El **código fuente** es texto en .java. El **compilador** javac comprueba y lo traduce a **bytecode**, instrucciones en .class. La **JVM**, máquina virtual de Java, ejecuta ese bytecode. El **JDK** es el conjunto de herramientas para desarrollar, incluyendo compilador y ejecución.

Usaremos Java 21 y la forma clásica de programa de consola. Comprobá `java -version` y `javac -version`: ambos deben apuntar al JDK elegido. Si solo funciona java, puede faltar el compilador o su configuración. Un IDE como IntelliJ o Eclipse organiza estas tareas, pero necesita el JDK y no cambia las reglas del lenguaje.

## Leer la estructura inicial sin palabras misteriosas

En el ejemplo inferior `class Hola` declara un tipo que agrupa código; `public` permite acceder a esa clase. Las llaves exteriores delimitan su contenido. `main` es el método que el lanzador usa como inicio. Un **método** es una función declarada en una clase. `public` hace accesible el inicio; `static` permite invocarlo sin crear una instancia; `void` indica que no devuelve un valor al llamador.

`String` es el tipo de texto. `[]` indica un array, una secuencia de valores, y args es el nombre del parámetro que recibe argumentos de la terminal. Por ejemplo `java Hola Ana` proporciona Ana como dato de entrada de ese array; no se muestra si el programa no lo utiliza. El parámetro pertenece a la firma esperada, aunque este primer ejemplo no lo lea.

`System.out` ofrece la salida estándar de consola y `println` imprime un valor y termina una línea. El punto accede a miembros; los paréntesis contienen el argumento; las comillas dobles delimitan texto; el punto y coma termina la instrucción. Las llaves de main delimitan las operaciones que se ejecutarán al iniciar.

Guardá el documento completo exactamente como Hola.java. Desde su carpeta, compilá `javac -encoding UTF-8 Hola.java` y ejecutá `java Hola`. El nombre público y el archivo deben coincidir. Si editás fuente, repetí compilación antes de ejecutar .class; de lo contrario podés observar una versión anterior. Es posible ejecutar ciertos fuentes directamente con java Hola.java, pero mantendremos ambos pasos para distinguirlos.

## Ejemplo de la clase

```java
public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola, Java");
    }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Guardá Hola.java con ese nombre porque contiene la clase pública Hola. Desde su carpeta ejecutá javac Hola.java y luego java Hola. Debe mostrar Hola, Java. Compilar comprueba reglas y genera bytecode; ejecutar realiza las instrucciones. También podés usar un IDE después de configurar el JDK.

## Cambiar una decisión y explorar un límite

Cambiá el mensaje, ejecutá sin recompilar y luego recompilá: en el recorrido clásico el .class conserva el mensaje viejo hasta regenerarse. Quitar una comilla impide compilar; sumar una línea println genera otra salida. No ejecutes java Hola.class: java espera el nombre de clase en este modo.

## Confusión que conviene evitar

Ejecutar java Hola.class: se usa el nombre de la clase sin esa extensión.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_10.md) · [Clase siguiente](../05_Java/CLASE_02.md)
