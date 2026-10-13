# Práctica 03.11 · Timers, callbacks y promesas

[Clase](CLASE_11.md) · [Soluciones separadas](SOLUCIONES_11.md)

## 1. Actividad guiada

Creá una promesa que se cumpla con "Listo" y mostrala con then. Explicá por qué then recibe una función.

1. Creá Promise.resolve("Listo").
2. Pasá una función a then para mostrar el resultado.
3. Compará el momento de esa salida con un log inmediato.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Usá Promise.resolve(4), transformá con then al doble y mostrá el valor en un segundo then.

## 3. Combinar lo aprendido

Creá una función esperarMensaje que devuelva la promesa del ejemplo. Llamala y mostrá un mensaje inmediato y otro al recibir el resultado. Añadí una variante rechazada. ¿Por qué una espera fija no confirma el éxito de una petición?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Retorná el doble dentro del primer then.
2. La función debe devolver la promesa para que el llamador pueda seguirla.
3. catch trata el rechazo, no el transcurso de un plazo.
