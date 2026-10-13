# Soluciones 12.01 · ORM, JPA y proveedor de persistencia

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

JPA define reglas y APIs de persistencia; Hibernate las implementa; Spring Data facilita repositorios y consultas en una aplicación Spring. Una entidad anotada sigue necesitando un entorno que gestione su persistencia.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Entity marca una clase persistente y Id identifica su clave. El constructor sin argumentos es requerido para entidades ordinarias y puede ser protected. Una anotación no crea por sí sola la conexión: hacen falta proveedor y configuración, incluidos en el proyecto de práctica.

## 3. Qué conviene corregir

La confusión a evitar es: Tratar JPA, Hibernate y Spring Data como tres nombres idénticos para la misma capa.

ORM relaciona un modelo de objetos con almacenamiento relacional. JPA, hoy Jakarta Persistence, es una especificación; Hibernate es un proveedor que la implementa.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
