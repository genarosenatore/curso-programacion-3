# Práctica 15.03 · Estados de carga, error, resultado y CORS

[Clase](CLASE_03.md) · [Soluciones separadas](SOLUCIONES_03.md)

## 1. Actividad guiada

Explicá cómo restaurar un botón después de POST tanto si funciona como si falla.

1. Deshabilita botón al empezar POST.
2. Maneja éxito y error sin borrar entrada fallida.
3. Restaura botón en finally de ambos caminos.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Envuelve un POST con boton.disabled=true y finally para restaurarlo en cualquier resultado.

## 3. Combinar lo aprendido

Distingue200 [],404 de ruta y bloqueo CORS. Describe qué evidencia usarías antes de cambiar configuración. ¿no-cors vuelve legible una respuesta JSON?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. finally no depende del camino de éxito.
2. HTTP y políticas del navegador son capas distintas.
3. Respuesta opaca no deja leer cuerpo.
