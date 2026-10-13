# Práctica 06.02 · toString y representación legible

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Definí toString para Cliente con código y nombre; justificá qué datos excluirías.

1. Elegí código y nombre útiles para el mensaje.
2. Retorná texto desde toString sin imprimir dentro.
3. Excluí credenciales y recorridos circulares.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Definí Cliente con código y nombre y un toString que los muestre sin datos privados innecesarios.

## 3. Combinar lo aprendido

Explicá cómo representarías un Pedido que referencia Cliente sin imprimir toda su lista de pedidos. ¿Qué falla si otra aplicación interpreta toString como JSON estable?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Retorná un String, no llames println dentro.
2. Mostrá una referencia breve de la relación.
3. Presentación de depuración y contrato de datos tienen fines distintos.
