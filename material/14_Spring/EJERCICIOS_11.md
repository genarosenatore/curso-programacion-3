# Práctica 14.11 · Spring Data JPA, H2 y transacciones

[Clase](CLASE_11.md) · [Soluciones separadas](SOLUCIONES_11.md)

## 1. Actividad guiada

Definí findByStockGreaterThan(int stock) y explicá qué devuelve con parámetro cero.

1. Declara findByStockGreaterThan(int stock) en ProductoRepository.
2. Consulta con cero para seleccionar disponibles sin incluir stock 0.
3. Explica tipo de lista y resultado vacío sin inventar una consulta SQL por el nombre.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Leé ProductoRepository e identificá tipo de entidad, id y consulta con categoría.

## 3. Combinar lo aprendido

Seguí actualizar en service y explicá por qué puede conservar un cambio sin otro save. Probá un nombre inválido y revisá que no se informe éxito. ¿readOnly implementa autorización?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. find recupera una instancia gestionada en ese límite.
2. El seguimiento detecta cambios.
3. Intención de lectura y permisos son garantías distintas.
