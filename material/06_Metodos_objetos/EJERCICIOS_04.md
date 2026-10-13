# Práctica 06.04 · hashCode y relación con equals

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Explicá qué ocurre si equals usa código y hashCode usa precio.

1. Aplicá equals por código al par de P01.
2. Calculá hashes con el mismo dato estable.
3. Analizá el contraejemplo que usa precio en hash.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Explicá si mismo hash demuestra igualdad y si hashes distintos pueden corresponder a objetos iguales bajo un contrato correcto.

## 3. Combinar lo aprendido

Con igualdad por código, analizá hash por precio y hash constante. Proponé una corrección y justificá por qué conviene una clave inmutable.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La obligación tiene una sola dirección.
2. Separá colisión de violación del contrato.
3. Calculá con los datos usados en equals.
