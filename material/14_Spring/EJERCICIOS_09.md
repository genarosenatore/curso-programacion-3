# Práctica 14.09 · POST, PUT y DELETE

[Clase](CLASE_09.md) · [Soluciones separadas](SOLUCIONES_09.md)

## 1. Actividad guiada

Diseñá DELETE por id y describí qué hace si el recurso no existe.

1. Define DELETE por id con búsqueda previa.
2. Retorna 204 sin cuerpo tras éxito.
3. Obtén otra vez el id y observa 404 según contrato.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Diseñá DELETE por id con ResponseEntity<Void> y explica por qué Void no requiere JSON.

## 3. Combinar lo aprendido

Ejecutá crear→obtener→actualizar→eliminar→obtener y anotá estados. Compara repetir POST con repetir PUT. ¿Dónde se decide anular frente a borrar?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Busca el id antes de modificar.
2.204 tiene cuerpo vacío.
3. La política del dominio determina historial.
