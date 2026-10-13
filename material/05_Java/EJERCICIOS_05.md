# Práctica 05.05 · Encapsulamiento, getters y setters

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Añadí descontarStock(cantidad) que rechace cero, negativos y cantidades superiores al disponible.

1. Comprobá cantidad positiva y no mayor al stock.
2. Restá solo después de validar.
3. Probá exacto, exceso y cero sin aceptar estado negativo.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Agregá descontarStock(int cantidad) con comprobaciones de cantidad positiva y disponible.

## 3. Combinar lo aprendido

Definí Libro con ejemplares private, getter y prestarUno que rechace si está agotado. Probá dos préstamos sobre un ejemplar, en ejecuciones o con el manejo de la clase 05.09. ¿Hace falta exponer setEjemplares para prestar?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Validá antes de asignar.
2. La operación de negocio reduce una unidad.
3. Un setter general no es obligatorio.
