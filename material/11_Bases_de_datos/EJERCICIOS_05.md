# Práctica 11.05 · INSERT, UPDATE y DELETE

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Actualizá el nombre de producto 1 en una copia de la base y comprobá que el 2 no cambió.

1. Consulta producto 1 y 2 antes de cambio.
2. Actualiza nombre solo WHERE id=1.
3. Repite SELECT y confirma que 2 se conserva.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Cambiá nombre de producto1 a Cuaderno grande y comprobá que producto2 conserve su nombre.

## 3. Combinar lo aprendido

Creá un producto de práctica con id10, actualizalo y elimínalo, consultando antes y después. Explicá la diferencia entre cero filas afectadas y error de restricción.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. SELECT con el mismo WHERE confirma objetivo.
2. La nueva clave debe estar libre.
3. Un id ausente puede dar cero cambios sin fallar.
