# Práctica 04.10 · Preparación del frontend de Food Store

[Clase](CLASE_10.md) · [Soluciones separadas](SOLUCIONES_10.md)

## 1. Actividad guiada

Agregá dos ítems al carrito y calculá el total. Explicá dónde validarías stock.

1. Creá dos ítems con precio y cantidad conocidos.
2. Seguí el acumulador 0→1600→3600.
3. Validá stock antes de alta y explicá la confirmación del backend.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Calculá el total de dos ítems con for...of y comparalo con reduce del ejemplo.

## 3. Combinar lo aprendido

Definí una función puedeAgregar(stock:number,actual:number,nueva:number):boolean y validá enteros, stock no negativo, actual no negativa, nueva positiva y actual+nueva <= stock. Probá stock 3, actual 2, nueva 1 y nueva 2. ¿Por qué el servidor debe volver a comprobar?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La nueva cantidad se suma a la existente.
2. La condición de máximo incluye igualdad.
3. El estado del cliente no es la disponibilidad vigente garantizada.
