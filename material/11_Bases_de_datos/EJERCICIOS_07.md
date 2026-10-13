# Práctica 11.07 · Transacciones: confirmar o revertir cambios

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Explicá qué debería pasar si se guarda una factura pero falla uno de sus detalles.

1. Define factura y todos sus detalles como conjunto.
2. Simula fallo del segundo detalle antes de commit.
3. Solicita rollback y consulta desde contexto nuevo.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Ejecutá la actualización seguida de rollback y anotá valor anterior, durante y posterior.

## 3. Combinar lo aprendido

Describí crear factura y dos detalles en una transacción cuando el segundo es inválido. ¿Qué se revierte y por qué no alcanza con capturar el error e informar éxito?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La operación incluye todas sus escrituras.
2. Rollback solo afecta cambios no confirmados.
3. Capturar puede ocultar el fallo sin revertirlo.
