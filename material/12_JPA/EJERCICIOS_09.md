# Práctica 12.09 · Prácticas de JPA y modelo FacturaArca

[Clase](CLASE_09.md) · [Soluciones separadas](SOLUCIONES_09.md)

## 1. Actividad guiada

Armá una tabla de relaciones de FacturaArca con cardinalidad, propietario, columna y regla de borrado.

1. Arma tabla de cardinalidad y propietario.
2. Incluye columna y regla de borrado por relación.
3. Guarda y lee desde otro contexto antes de afirmar mapeo correcto.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Construí la tabla de relaciones de factura, cliente y detalles con propietario y regla de borrado.

## 3. Combinar lo aprendido

Ejecutá el laboratorio y compará objetos recuperados con los datos iniciales. Elegí una relación de FacturaArca que no esté en el laboratorio y describí qué necesitarías para agregarla. ¿Qué límites no cubre el ejemplo?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. ManyToOne de factura a cliente posee normalmente su clave.
2. Detalle.factura posee la referencia de cada renglón.
3. Lo ausente del modelo requiere datos, reglas y mapeos explícitos.
