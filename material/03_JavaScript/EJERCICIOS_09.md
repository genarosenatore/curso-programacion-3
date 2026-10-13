# Práctica 03.09 · Eventos y formularios

[Clase](CLASE_09.md) · [Soluciones separadas](SOLUCIONES_09.md)

## 1. Actividad guiada

Añadí una comprobación para rechazar cantidades no enteras o menores que 1.

1. Escuchá submit y evitá la navegación predeterminada.
2. Leé y convertí cantidad y rechazá no entero o menor a 1.
3. Mostrá el cálculo solo en el camino válido.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Completá el callback para mostrar 800 por cantidad válida y rechazar cantidades no enteras o menores a 1.

## 3. Combinar lo aprendido

Agregá un campo precio con etiqueta y validá número finito no negativo. Calculá el total solo si ambos campos son válidos. Probá Enter, cantidad vacía y precio "0". ¿Por qué 0 puede ser válido para precio y no para cantidad?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Primero revisá vacío y convertí cada value.
2. Cantidad exige entero positivo; precio permite cero.
3. Mostrá un mensaje y terminá con return si falla.
