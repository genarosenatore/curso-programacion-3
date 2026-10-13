# Práctica 14.10 · Errores, excepciones y ControllerAdvice

[Clase](CLASE_10.md) · [Soluciones separadas](SOLUCIONES_10.md)

## 1. Actividad guiada

Relacioná nombre vacío, id inexistente y error interno de acceso a base con códigos y mensajes.

1. Relaciona nombre vacío con validación 400 e id ausente con 404.
2. Distingue un fallo interno de base que no debe disfrazarse de ausencia.
3. Observa estado y mensaje sin exponer traza interna.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Identificá la excepción de ausencia y su handler en el proyecto y probá un id inexistente.

## 3. Combinar lo aprendido

Prepará tres casos: JSON roto, nombre vacío y recurso ausente. Explicá en qué etapa falla cada uno y qué forma de respuesta necesita el cliente. ¿Por qué no publicás la traza interna completa?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Deserialización precede a ciertas validaciones.
2. La ausencia ocurre en búsqueda.
3. La salida pública no necesita detalles internos de infraestructura.
