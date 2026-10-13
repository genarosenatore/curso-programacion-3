# Práctica 03.10 · JSON, localStorage y sessionStorage

[Clase](CLASE_10.md) · [Soluciones separadas](SOLUCIONES_10.md)

## 1. Actividad guiada

Guardá una preferencia de tema y recuperala usando claro cuando no exista.

1. Guardá curso-tema como texto simple.
2. Recuperá con alternativa solo para clave ausente.
3. Eliminá esa clave y repetí la lectura.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Guardá la preferencia tema="oscuro" bajo curso-tema; recuperala y usá "claro" si no existe. Eliminá solo esa clave.

## 3. Combinar lo aprendido

Guardá un array de dos cantidades y recuperalo con try/catch. Probá clave ausente, JSON válido y texto roto. ¿Qué diferencia hay entre error de sintaxis JSON y datos válidos de forma incorrecta?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Un texto simple no necesita stringify.
2. El array sí debe convertirse a texto JSON.
3. Tras parse comprobá Array.isArray.
