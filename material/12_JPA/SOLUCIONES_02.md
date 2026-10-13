# Soluciones 12.02 · Entity, Table, Id, GeneratedValue y Column

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

@Column(nullable=false,precision=12,scale=2) private BigDecimal precio;. Validá el precio antes de guardar. Creá BigDecimal desde texto como new BigDecimal("2000.00") para evitar introducir un error de double.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El id comienza null y el proveedor lo asigna al persistir según IDENTITY. La columna nombre no debería aceptar null en el esquema generado. Con acceso por campo no necesitamos getters para que el proveedor lea, aunque pueden ser útiles para el resto del código. No supongas que dos entidades nuevas con id null son iguales.

## 3. Qué conviene corregir

La confusión a evitar es: Usar el id generado no asignado como única regla de equals para todas las entidades nuevas.

@Entity participa en persistencia, @Table puede especificar la tabla y @Column el mapeo o restricciones de una columna. @Id marca la clave y @GeneratedValue delega su generación según estrategia.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
