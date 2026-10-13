# Práctica 07.06 · Comparable y Comparator

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Ordená nombres por longitud descendente y explicá el desempate.

1. Definí longitud como criterio principal descendente.
2. Agregá desempate alfabético ascendente.
3. Probá Ana,Eva,Luis y explicá reversed.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Ordená nombres por longitud ascendente con desempate alfabético.

## 3. Combinar lo aprendido

Creá una copia y ordenala por longitud descendente, pero alfabética ascendente en empates. Verificá que la fuente conserve orden. ¿Por qué a-b puede fallar para enteros grandes?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Orden principal y desempate son criterios separados.
2. reversed debe aplicarse solo al principal.
3. Una resta puede superar el rango int.
