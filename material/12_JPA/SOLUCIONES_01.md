# Soluciones 12.01 · ORM, JPA y proveedor de persistencia

[Clase](CLASE_01.md) · [Práctica](EJERCICIOS_01.md)

## 1. Razonamiento de la actividad guiada

JPA define reglas y APIs de persistencia; Hibernate las implementa; Spring Data facilita repositorios y consultas en una aplicación Spring. Una entidad anotada sigue necesitando un entorno que gestione su persistencia.

## 2 y 3. Resolver y justificar las decisiones

JPA define, Hibernate implementa y H2 almacena durante el proceso. new crea un objeto en memoria; EntityManager.persist lo incorpora al seguimiento, la transacción y sincronización producen INSERT y commit lo confirma. Copiar @Entity no incluye proveedor, driver, configuración ni gestión de operaciones. SQL sigue explicando restricciones, joins y costos de lo que el ORM realiza.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
