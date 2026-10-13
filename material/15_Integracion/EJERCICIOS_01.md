# Práctica 15.01 · Seguir una petición del frontend al backend

[Clase](CLASE_01.md) · [Soluciones separadas](SOLUCIONES_01.md)

## 1. Actividad guiada

Una petición devuelve 201 con JSON correcto pero no aparece la tarjeta. ¿Qué revisarías primero?

1. Mira cuerpo correcto de 201 recibido.
2. Sigue parseo y adaptación del cliente.
3. Revisa selector y render que deben mostrar la tarjeta.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

POST devuelve201 con producto correcto, pero no aparece. Identifica las primeras tres comprobaciones del cliente.

## 3. Combinar lo aprendido

Compara «no salió petición», «respuesta400» y «respuesta200 pero render falla». Escribe evidencia que diferencia cada caso. ¿Qué aporta consultar después por el id creado?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Mira Red antes de investigar base.
2. El estado distingue etapas.
3. GET posterior comprueba el recurso concreto.
