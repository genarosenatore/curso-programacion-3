# Soluciones 12.04 · Herencia y clases base persistentes

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

Una MappedSuperclass puede declarar fechaCreacion. El valor se establece mediante constructor, servicio o callback @PrePersist según el diseño. Documentá el mecanismo y probá que el campo no quede vacío al guardar.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Cliente hereda el mapeo del id. EntityId no se consulta como una entidad independiente en JPQL solo por ser MappedSuperclass. Las restricciones de constructor se cumplen en la subclase. Si dos clases comparten auditoría, esa base puede resultar útil sin forzar que todo el dominio sea una única jerarquía consultable.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que heredar una propiedad de auditoría activa automáticamente todo el seguimiento.

La herencia persistente puede modelarse con estrategias como SINGLE_TABLE, JOINED o TABLE_PER_CLASS, cada una con efectos en esquema y consultas. @MappedSuperclass comparte mapeos con subclases, pero no representa por sí sola una entidad consultable.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
