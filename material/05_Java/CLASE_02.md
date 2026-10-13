# Clase 05.02 · Variables, tipos, operadores y consola

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_01.md) · [Clase siguiente](../05_Java/CLASE_03.md)

## Tipos y valores en Java

Una variable Java tiene un tipo declarado que limita sus valores. `int cantidad = 3;` declara un entero e inicializa con tres; `cantidad = 4;` asigna otro entero. `final int limite = 5;` evita reasignar después de su inicialización. Una variable local debe estar asignada antes de leerse; no empieza automáticamente con undefined como en JavaScript.

Los tipos **primitivos** almacenan valores básicos: int entero de 32 bits, long entero de 64 bits, double número con fracción aproximada, boolean verdadero/falso y char una unidad UTF-16 escrita entre comillas simples. String representa texto mediante una referencia y utiliza comillas dobles. Los enteros tienen límites: una operación que los excede puede desbordar y producir otro valor sin la intención matemática esperada.

## Operadores y conversiones

La suma, multiplicación y comparaciones conservan ideas de JavaScript, pero los tipos determinan operaciones. 5 / 2 con int produce 2; guardar ese resultado en double lo convierte a 2.0, sin recuperar la fracción. 5.0 / 2 usa división decimal y produce 2.5. Un **cast** como `(double)a` convierte el operando antes de dividir; no reemplaza reglas de entrada.

Para texto, + concatena y el orden importa: `"Total: " + 2 + 3` da Total: 23, mientras `"Total: " + (2 + 3)` da Total: 5. && y || combinan booleanos con cortocircuito; a diferencia de JavaScript, un if exige boolean, no usa automáticamente cero como falso. == sobre primitivos compara sus valores; sobre referencias compara identidad. String.equals compara contenido, que desarrollaremos en la unidad 06.

El fragmento inferior va dentro de main de [05.01](CLASE_01.md). Guardá la clase pública con su nombre, compilá y ejecutá. Si necesitás leer de consola, Scanner es una herramienta de java.util, pero no hace falta introducirla para seguir este ejemplo con datos conocidos. Separar primero lógica de entrada facilita comprenderla.

double no representa exactamente todos los decimales. Para dinero, centavos enteros con límites o BigDecimal permiten una política más controlada. No se arregla toda precisión mostrando menos decimales: presentación y cálculo son cosas distintas.

## Ejemplo de la clase

```java
int cantidad = 3;
double precio = 800.0;
String nombre = "Lapicera";
boolean disponible = true;
System.out.println(nombre + ": " + precio * cantidad);
System.out.println(5 / 2);
System.out.println(5.0 / 2);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Este fragmento va dentro de main. Muestra Lapicera: 2400.0, 2 y 2.5. La multiplicación se resuelve antes de concatenar el resultado al texto. Para comparar contenido de strings usamos equals, no ==, que compara referencias.

## Cambiar una decisión y explorar un límite

Usá double promedio = 5 / 2: muestra 2.0. Usá 5 / 2.0: muestra 2.5. `Integer.parseInt("3")` convierte texto a int; "3.5" no tiene formato de entero y lanza una excepción, que aprenderemos a manejar en 05.09. No es igual al parseInt de JavaScript.

## Confusión que conviene evitar

Asumir que 5/2 produce 2.5 porque la variable receptora es double.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_01.md) · [Clase siguiente](../05_Java/CLASE_03.md)
