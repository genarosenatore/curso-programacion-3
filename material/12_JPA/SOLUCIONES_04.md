# Soluciones 12.04 · Herencia y clases base persistentes

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Una MappedSuperclass puede declarar fechaCreacion. El valor se establece mediante constructor, servicio o callback @PrePersist según el diseño. Documentá el mecanismo y probá que el campo no quede vacío al guardar.

## 2 y 3. Resolver y justificar las decisiones

Cliente hereda un id persistente y su estrategia; la base no crea una tabla consultable independiente. Para auditoría podés asignar fecha con @PrePersist usando un tipo temporal compatible y probarla tras recuperación. Una jerarquía real de medios de pago podría requerir @Inheritance según consultas; compartir id con Cliente no implica que sean subtipos de la misma capacidad del negocio.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
