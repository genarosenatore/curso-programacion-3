# Práctica 12.08 · Transacciones y consistencia

[Clase](CLASE_08.md) · [Soluciones separadas](SOLUCIONES_08.md)

## 1. Actividad guiada

Describí una creación de factura con cabecera y detalles bajo un único límite transaccional.

1. Resuelve referencias y valida todos los detalles.
2. Guarda bajo un único límite transaccional.
3. Falla un detalle y comprueba ausencia de estado parcial.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Describí creación de factura con cliente y detalles bajo una única transacción.

## 3. Combinar lo aprendido

Compará el límite explícito del laboratorio y el gestionado de Spring. Explicá qué verificarías al probar un detalle inválido y qué no garantiza la anotación por sí sola.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Resolver referencias y validar pertenece a la operación completa.
2. El fallo debe llegar a la política que decide rollback.
3. Verificá desde un contexto posterior.
