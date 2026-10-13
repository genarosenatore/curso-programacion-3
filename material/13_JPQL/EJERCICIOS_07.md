# Práctica 13.07 · CASE y consultas avanzadas

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Clasificá 9999, 10000, 50000 y 50001.

1. Evalúa primer WHEN con cada límite.
2. Si falla,evalúa el segundo.
3. Clasifica 9999,10000,50000,50001 sin actualizar entidad.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Clasificá9999,10000,50000 y50001 y explicá el primer WHEN que corresponde.

## 3. Combinar lo aprendido

Agregá orden secundario por numero y proyectá una etiqueta para un precio Producto que puede faltar en un modelo alternativo. ¿Cómo distinguirías ausencia de bajo valor sin inventar precio cero?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Las condiciones se prueban en orden.
2. El límite exacto revela > frente a >=.
3. IS NULL permite clasificar ausencia antes de rangos.
