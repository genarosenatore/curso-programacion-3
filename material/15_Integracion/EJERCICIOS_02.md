# Práctica 15.02 · Alinear interfaces TypeScript y DTO Java

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Compará un JSON con denominacion y una interface que usa nombre. Proponé una adaptación explícita.

1. Valida id y denominacion del contrato externo.
2. Construye modelo con propiedad nombre.
3. Prueba que as por sí solo no renombra campos.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Adapta {id:1,denominacion:"Cuaderno"} a un modelo con nombre, conservando identidad.

## 3. Combinar lo aprendido

Propone contratos para un id Long muy grande, una fecha sin hora y un precio en centavos. Explica las conversiones permitidas y lo que no debe interpretarse automáticamente.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Construye un objeto nuevo con nombres explícitos.
2. La política debe preservar precisión.
3. Identidad, calendario y dinero tienen significados distintos.
