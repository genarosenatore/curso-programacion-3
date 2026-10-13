# Práctica 04.05 · Genéricos básicos y diferencias entre any y unknown

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Creá ultimo<T> que devuelva el último elemento o undefined.

1. Declará el parámetro T y el array T[].
2. Comprobá longitud antes del último índice.
3. Incluí undefined en retorno y probá vacío.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Implementá ultimo<T>(valores:T[]):T|undefined y usalo con nombres y números.

## 3. Combinar lo aprendido

Recibí un unknown y devolvé su texto en minúsculas si es string, o «No es texto» si no. Probá "ANA", 3 y null. ¿Qué información conserva el genérico que any pierde?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El último índice es length - 1 cuando existe.
2. typeof comprueba antes de usar un método.
3. T mantiene el tipo concreto entre entrada y salida.
