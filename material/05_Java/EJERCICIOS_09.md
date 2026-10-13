# Práctica 05.09 · Excepciones y manejo de errores

[Clase](CLASE_09.md) · [Soluciones separadas](SOLUCIONES_09.md)

## 1. Actividad guiada

Probá "3", "3.5" y "abc". Explicá cuáles acepta parseInt.

1. Convertí cada texto por separado con parseInt.
2. Anotá dónde salta al catch.
3. Distinguí formato válido de cantidad permitida.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Probá la conversión con "3", "3.5" y "abc" y explicá qué líneas del try se ejecutan.

## 3. Combinar lo aprendido

Combiná conversión de "-1" y la validación de cantidad positiva. Lanzá IllegalArgumentException cuando convierta pero no cumpla. Usá catches específicos para distinguir formato y regla. ¿Qué estado debe conservar un stock si se rechaza?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La primera falla abandona el resto del try.
2. Formato y dominio tienen causas distintas.
3. Modificá solo después de todas las comprobaciones.
