# Soluciones 05.07 · Herencia, composición y clases abstractas

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

Composición: un cliente tiene un domicilio. class Cliente { private Domicilio domicilio; }. Heredar de Domicilio implicaría tratar al cliente como domicilio, lo que no representa el problema.

## 2 y 3. Resolver y justificar las decisiones

Transferencia extends MedioPago implementa descripcion y devuelve Pago por transferencia. Cliente conserva `private Domicilio domicilio;` y puede recibirlo por constructor o una operación validada. Cambiar domicilio modifica una relación del cliente, no su tipo. Heredar solo por un campo común impondría operaciones y significados que quizás no corresponden; el criterio es poder respetar el contrato de la base.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
