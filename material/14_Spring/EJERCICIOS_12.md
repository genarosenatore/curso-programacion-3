# Práctica 14.12 · Práctica: CRUD de cursos y facturación

[Clase](CLASE_12.md) · [Soluciones separadas](SOLUCIONES_12.md)

## 1. Actividad guiada

Explicá en qué capa ocurre cada paso del caso POST y dónde se calcula un importe de factura.

1. Sigue POST por controller,service y repository.
2. Ubica validación,cálculo yDTO en su etapa.
3. Comprueba creación con GET posterior por id.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Ejecutá el recorrido CRUD del proyecto de apoyo y completa una tabla con resultado esperado y observado.

## 3. Combinar lo aprendido

Diseñá el recorrido de crear factura con dos detalles e indica dónde validar, calcular y confirmar. Agregá un detalle inválido y define el estado esperado después. ¿Qué límite del CRUD de productos no cubre facturación?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Comprobá escritura con una lectura posterior.
2. El servicio coordina el conjunto.
3. El modelo contable agrega histórico y reglas específicas.
