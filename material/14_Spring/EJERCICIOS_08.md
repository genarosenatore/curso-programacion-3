# Práctica 14.08 · DTO de entrada y salida; validación

[Clase](CLASE_08.md) · [Soluciones separadas](SOLUCIONES_08.md)

## 1. Actividad guiada

Explicá qué reglas del request no cubren que un producto exista o tenga stock suficiente al vender.

1. Separa presencia/rango de forma del request.
2. Identifica existencia y stock como reglas adicionales.
3. Explica cuándo el servicio consulta datos vigentes.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Explicá qué casos rechazan NotBlank, NotNull y PositiveOrZero con ejemplos pequeños.

## 3. Combinar lo aprendido

Diseñá PedidoRequest con productoId Long requerido y cantidad Integer requerida positiva. ¿Qué verificaciones quedan para el servicio y por qué no basta @Valid?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Presencia y rango son restricciones diferentes.
2. @Positive exige mayor a cero, no cero.
3. El servidor necesita consultar existencia y disponibilidad.
