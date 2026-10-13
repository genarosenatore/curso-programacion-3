# Clase 10.01 · Interfaces funcionales y lambdas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_02.md)

## Pasar una operación como comportamiento

Una interfaz funcional tiene un único método abstracto que define la operación a implementar. Puede tener métodos default o static sin dejar de ser funcional. @FunctionalInterface permite pedir al compilador que compruebe esa condición. Es la base para proporcionar una lambda como implementación breve.

Si Operacion declara int aplicar(int a,int b), `(a,b) -> a+b` recibe dos enteros y retorna su suma. El contexto indica tipos y retorno. La lambda no es una cadena ni un método que ejecutamos al escribirla: es un comportamiento que invocamos después con sumar.aplicar(2,3).

## Seguir definición y ejecución

Poné Operacion fuera de main y la variable sumar dentro. El compilador conecta el método abstracto con los parámetros. Al llamar, a toma 2, b toma 3 y vuelve 5. Con varias instrucciones se usan llaves y return si hay resultado: `(a,b) -> { int total=a+b; return total; }`.

Una lambda puede capturar variables locales exteriores que sean final o **efectivamente finales**, no reasignadas después de inicializar. Eso no significa que objetos referenciados sean inmutables: una lista capturada podría cambiar. No uses esa posibilidad para acumular efectos externos sin reconocerlos.

La programación funcional en estos ejemplos busca expresar transformaciones y decisiones mediante operaciones, favoreciendo resultados comprensibles con las mismas entradas. Java sigue permitiendo objetos y estado; no necesitas reemplazar todo bucle por una cadena. Empezá con una operación simple que se pueda verificar a mano.

## Ejemplo de la clase

```java
@FunctionalInterface
interface Operacion { int aplicar(int a, int b); }
Operacion sumar = (a, b) -> a + b;
System.out.println(sumar.aplicar(2, 3));
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La variable sumar contiene una implementación de Operacion y devuelve 5. El compilador infiere tipos desde el contrato. Para varias instrucciones, usá llaves y return si corresponde. Capturar una variable local exige que sea final o efectivamente final.

## Cambiar una decisión y explorar un límite

Cambiá suma por multiplicación: la misma interfaz produce 6 con 2 y 3. Agregar un segundo método abstracto diferente a Operacion impide usar esa lambda porque ya no hay una única operación objetivo. Cambiar una variable local capturada puede generar error de compilación.

## Confusión que conviene evitar

Cambiar estado compartido dentro de una lambda sin reconocer sus efectos secundarios.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_06.md) · [Clase siguiente](../10_Funcional/CLASE_02.md)
