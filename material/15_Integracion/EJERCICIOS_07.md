# Práctica 15.07 · Pedidos y administración

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Probá pending→processing, processing→completed y completed→pending bajo esta política.

1. Consulta destinos permitidos de cada estado.
2. Prueba las tres transiciones propuestas.
3. Mantén estado anterior al rechazar completed→pending.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Comprueba pending→processing, processing→completed y completed→pending.

## 3. Combinar lo aprendido

Escribe puedeCambiar(actual,nuevo) tipada y diseña una entrada JSON inválida. ¿Dónde se verifican estado vigente y permisos, y por qué no basta ocultar un botón?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Consulta el array de la clave actual.
2. Valida estados antes de indexar datos externos.
3. La operación de servidor puede recibirse sin la pantalla.
