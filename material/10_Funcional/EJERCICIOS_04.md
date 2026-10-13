# Práctica 10.04 · Streams: origen, operaciones intermedias y terminales

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Identificá origen, operación intermedia y terminal en una cadena que cuenta números positivos.

1. Identificá fuente numeros e intermedia filter.
2. Usá count como terminal.
3. Anticipá 2L para [-1,2,3] y 0L para vacío.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Identificá fuente, intermedia y terminal en numeros.stream().filter(n->n>0).count().

## 3. Combinar lo aprendido

Contá positivos de [-1,2,3] y luego obtené su lista usando dos streams nuevos. Probá fuente vacía. ¿Por qué el resultado no implica modificar la lista original?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Cada terminal consume su propio recorrido.
2. count retorna long.
3. filter describe selección, no borrado de la fuente.
