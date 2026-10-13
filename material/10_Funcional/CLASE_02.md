# Clase 10.02 · Predicate, Function, Consumer y Supplier

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_01.md) · [Clase siguiente](../10_Funcional/CLASE_03.md)

## Cuatro contratos que expresan intención

Predicate<T> recibe T y responde boolean; Function<T,R> transforma T a R; Consumer<T> recibe T sin retorno útil y Supplier<T> produce T sin parámetros. Están en java.util.function y evitan declarar interfaces propias para variaciones de esas tareas.

Sus métodos son distintos: test, apply, accept y get. Escribir Predicate<Integer> significa que su entrada es un entero envoltorio y el retorno está fijado a boolean. Function<Integer,String> conserva dos tipos: el recibido y el producido. El compilador puede detectar una lambda que no corresponde a ese contrato.

## Leer una composición desde adentro

En el ejemplo, inicial.get() devuelve 0. etiqueta.apply(0) produce "Stock: 0". mostrar.accept recibe ese texto y println lo muestra. positivo.test(3) da true. Las operaciones van dentro de main; usá imports o nombres completos.

Un predicado puede combinarse con and, or y negate: positivo.and(n->n<=5) exige ambos. La combinación mantiene cortocircuito; si necesitás excluir null, esa comprobación debe ir antes de n>0. Function.andThen aplica primero la función receptora y después la siguiente; compose aplica primero la recibida como argumento. El orden cambia resultados si las operaciones no conmutan.

Consumer sirve para una acción como registrar o mostrar, por lo que tiene un efecto; no lo confundas con Function que produce un resultado utilizable. Supplier puede calcular un valor cuando se pide, pero no garantiza que cada llamada dé el mismo. Elegí el contrato que expresa tu tarea y sus límites.

## Ejemplo de la clase

```java
java.util.function.Predicate<Integer> positivo = n -> n > 0;
java.util.function.Function<Integer, String> etiqueta = n -> "Stock: " + n;
java.util.function.Consumer<String> mostrar = System.out::println;
java.util.function.Supplier<Integer> inicial = () -> 0;
mostrar.accept(etiqueta.apply(inicial.get()));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El supplier devuelve 0, la función genera Stock: 0 y el consumer lo imprime. positivo.test(3) devuelve true. Cada método del contrato tiene nombre propio: test, apply, accept y get. Esa diferencia ayuda a leer cómo se usa cada función.

## Cambiar una decisión y explorar un límite

Para sumar uno y luego duplicar: con 3 obtienes 8; duplicar y luego sumar uno da 7. Un andThen no es una lista decorativa: define ese orden. Invocar apply sobre Predicate no compila porque su método es test.

## Confusión que conviene evitar

Invocar apply sobre un Predicate o esperar retorno de Consumer.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_01.md) · [Clase siguiente](../10_Funcional/CLASE_03.md)
