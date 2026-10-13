# Práctica 12.06 · Persistencia, consulta, modificación y eliminación

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Diseñá una actualización de nombre usando find y explicá qué validás antes de asignar.

1. Valida nombre antes de actualizar.
2. Find por id y rechaza ausencia.
3. Asigna solo nombre en la entidad gestionada y confirma.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Diseñá una actualización de nombre con find, comprobación y asignación.

## 3. Combinar lo aprendido

Dibujá referencias antes y después de merge y señalá cuál debe modificarse. Explicá qué pasa si el DTO de actualización omite precio y se copia como null.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Recuperá o rechazá ausencia antes de acceder.
2. merge retorna el destino gestionado.
3. Solo asigná los campos que el contrato permite.
