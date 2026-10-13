# Práctica 12.07 · Cascadas, orphanRemoval y carga de relaciones

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Explicá por qué no aplicarías REMOVE de factura hacia cliente automáticamente.

1. Distingue detalle exclusivo de cliente compartido.
2. Elige propagación según ciclo de vida.
3. Explica qué se perdería si remove llegara al cliente.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Explicá la política de cascada entre factura y detalles frente a factura y cliente.

## 3. Combinar lo aprendido

Diseñá una pantalla que muestre cliente y total de facturas. Indicá qué datos cargarías y dónde mapearías DTO. ¿Por qué EAGER no equivale a una sola consulta?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Preguntá si el hijo existe fuera del padre.
2. La salida solo necesita parte del grafo.
3. Momento de disponibilidad y forma de SQL son decisiones diferentes.
