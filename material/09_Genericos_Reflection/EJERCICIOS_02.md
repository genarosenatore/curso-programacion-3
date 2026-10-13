# Práctica 09.02 · Límites de tipos y wildcards

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Explicá por qué no podés añadir 2.5 a List<? extends Number>.

1. Imaginá que una vista Number pudiera insertar Double.
2. Aplicá ese caso a una lista Integer.
3. Explicá el límite de escritura de ? extends Number.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Explicá por qué List<Integer> no se asigna a List<Number> con un ejemplo de inserción de Double.

## 3. Combinar lo aprendido

Usá sumar con lista de enteros, decimales y vacía. Proponé una función que agregue Integer a List<? super Integer> y distinguí el tipo seguro al leer.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Pensá qué escritura permitiría el tipo receptor.
2. extends permite producir Number.
3. super acepta Integer y conserva lectura como Object.
