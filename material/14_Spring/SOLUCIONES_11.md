# Soluciones 14.11 · Spring Data JPA, H2 y transacciones

[Clase](CLASE_11.md) · [Ejercicios](EJERCICIOS_11.md)

## 1. Una solución explicada

List<Producto> findByStockGreaterThan(int stock);. Con cero recupera productos disponibles según esa regla. El servicio puede mapearlos a DTO dentro de una transacción de lectura. No cambies el tipo del id del repositorio si la entidad utiliza Long.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El nombre del método describe un filtro que Spring Data interpreta sobre el atributo nombre. Si el atributo cambia, el método debe cambiar. Las consultas derivadas son convenientes para casos simples; para consultas avanzadas podemos usar @Query con JPQL y parámetros.

## 3. Qué conviene corregir

La confusión a evitar es: Confiar en que el nombre de un método encontrará cualquier columna aunque no exista el atributo.

Spring Data JPA puede generar un repositorio desde una interface. JpaRepository<Producto,Long> aporta operaciones sobre esa entidad y tipo de id.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
