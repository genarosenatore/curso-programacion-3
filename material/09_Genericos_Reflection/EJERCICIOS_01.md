# Práctica 09.01 · Clases y métodos genéricos

[Clase](CLASE_01.md) · [Soluciones separadas](SOLUCIONES_01.md)

## 1. Actividad guiada

Creá cajas para un texto y un entero y explicá por qué Caja<int> no es válido.

1. Crea Caja<String> y Caja<Integer>.
2. Consultá contenido sin casts.
3. Comprobá por qué int no es argumento genérico admitido.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá Caja<String> y Caja<Integer> y consultá ambos contenidos sin casts.

## 3. Combinar lo aprendido

Escribí un método genérico elegirPrimero(T a,T b) que retorne a y probalo con dos Strings. Explicá qué garantiza y qué no si a es null.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El tipo precede al retorno en un método genérico.
2. El retorno relaciona entrada y salida.
3. Un tipo referencia no prohíbe null automáticamente.
