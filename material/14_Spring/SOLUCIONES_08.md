# Soluciones 14.08 · DTO de entrada y salida; validación

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

La existencia se consulta por id y el stock se comprueba sobre el estado vigente dentro de la operación. El DTO valida estructura y valores locales; no conoce la base ni la concurrencia.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

NotBlank rechaza null y texto en blanco para nombre. NotNull y PositiveOrZero trabajan juntas para precio porque las restricciones numéricas pueden aceptar null por sí solas. int no admite null; según el contrato, un Integer con NotNull permite distinguir campo ausente de cero.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que @Valid convierte toda operación de negocio en segura sin implementar sus reglas.

Un DTO de entrada define qué aceptamos. Bean Validation permite restricciones como @NotBlank, @PositiveOrZero y @NotNull.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
