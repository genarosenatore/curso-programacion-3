# Práctica 03.12 · async/await, fetch y manejo de errores

[Clase](CLASE_12.md) · [Soluciones separadas](SOLUCIONES_12.md)

## 1. Actividad guiada

Mostrá un mensaje de carga antes de fetch y reemplazalo por éxito o error al terminar.

1. Prepará estado y archivo JSON en el servidor local.
2. Mostrá carga, revisá ok y leé el cuerpo con await.
3. Diferenciá resultado, vacío y catch.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Agregá un p id="estado" y actualizalo con «Cargando», cantidad recibida o error al ejecutar la función.

## 3. Combinar lo aprendido

Comprobá que la respuesta parseada sea un array. Distinguí array vacío de error y probá los tres casos de la variación. ¿Por qué se necesitan dos await y por qué un 404 puede resolver fetch?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La primera espera recibe la respuesta, la segunda sus datos.
2. Comprobá ok antes de leer el cuerpo esperado.
3. Array.isArray distingue forma, length distingue vacío.
