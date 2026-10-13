# Práctica 10.02 · Predicate, Function, Consumer y Supplier

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Creá un Predicate<Integer> que acepte entre 1 y 5 inclusive.

1. Define dos comparaciones de límite en Predicate.
2. Invocá test para 0,1,5,6.
3. Explicá la diferencia con Function.apply.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá un Predicate<Integer> para rango 1 a 5 inclusive y probá 0,1,5,6.

## 3. Combinar lo aprendido

Componé Function<Integer,Integer> sumarUno y duplicar con andThen. Compará el orden inverso. ¿Qué cambia entre un Consumer que imprime y una Function que devuelve el texto?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Dos límites unidos con &&.
2. andThen aplica la receptora primero.
3. La impresión no entrega un resultado útil.
