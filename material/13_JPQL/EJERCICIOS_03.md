# Práctica 13.03 · Fechas, texto, IN, DISTINCT y ordenamiento

[Clase](CLASE_03.md) · [Soluciones separadas](SOLUCIONES_03.md)

## 1. Actividad guiada

Buscá clientes cuya denominación contenga ana sin importar mayúsculas.

1. Aplica lower a denominación.
2. Vincula patron con %ana%.
3. Distingue comodines de caracteres literales del usuario.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Buscá clientes con denominación que contenga ana sin importar mayúsculas usando un parámetro.

## 3. Combinar lo aprendido

Escribí una consulta de facturas no anuladas en un intervalo con inicio incluido y fin excluido. Probá mentalmente un dato justo en cada extremo. ¿Qué significa una búsqueda que contenga %?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. lower se aplica al dato consultado.
2. El parámetro ya contiene el patrón.
3. El extremo superior usa < para quedar fuera.
