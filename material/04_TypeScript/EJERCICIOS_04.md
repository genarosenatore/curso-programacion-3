# Práctica 04.04 · Uniones, opcionales, null y narrowing

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Recibí precio:number|null y devolvé "Sin precio" si falta o el precio como texto si existe.

1. Aceptá precio numérico o null en la firma.
2. Separá null antes de convertir a String.
3. Probá cero para evitar tratarlo como ausencia.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Escribí longitudSegura(texto:string|null):number y probá "Ana", "" y null.

## 3. Combinar lo aprendido

Modelá estado de una carga como "cargando" | "listo" | "error" y escribí una función de mensajes. Luego proponé un discriminador para incluir cantidad solo en listo. ¿Por qué no conviene afirmar todo con !?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Separá null antes de leer length.
2. Cada estado tiene un mensaje propio.
3. Una afirmación no modifica la ejecución.
