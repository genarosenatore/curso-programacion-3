# Práctica 13.01 · JPQL frente a SQL y parámetros nombrados

[Clase](CLASE_01.md) · [Soluciones separadas](SOLUCIONES_01.md)

## 1. Actividad guiada

Consultá todas las facturas de un cliente por su id usando parámetro.

1. Navega f.cliente.id en el modelo Java.
2. Vincula clienteId mediante setParameter.
3. Usa lista como salida para admitir cero coincidencias.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Consultá facturas emitidas con parámetro y luego un estado sin coincidencias.

## 3. Combinar lo aprendido

Consultá facturas por cliente.id con parámetro compatible. Explicá por qué cliente_id es un nombre SQL y por qué una lista vacía no equivale a fallo de consulta.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Navegá atributos persistentes.
2. El nombre del parámetro se vincula sin :.
3. getResultList admite cero resultados.
