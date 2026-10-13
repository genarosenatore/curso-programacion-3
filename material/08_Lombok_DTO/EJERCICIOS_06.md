# Práctica 08.06 · Práctica: DTO de producto y factura

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Creá un DTO para una tarjeta de producto con nombre, precio y disponibilidad. Probá dos stocks distintos.

1. Define la vista de tarjeta con nombre,precio y disponibilidad.
2. Construí salida desde producto.
3. Probá stocks 0 y 3 y explicá campos omitidos.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá ProductoTarjetaDTO con nombre, precioCentavos y disponible y mapeá dos productos con stock 0 y 3.

## 3. Combinar lo aprendido

Diseñá FacturaVista con clienteNombre y una lista de detalles resumidos. Justificá por qué no incluyes el cliente completo con sus facturas. ¿Usar DTO garantiza permisos?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Disponibilidad deriva del stock.
2. El reporte puede resumir relaciones.
3. Selección de campos y autorización son responsabilidades distintas.
