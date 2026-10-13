# Soluciones 08.02 · Lombok: getters, setters, constructores y builder

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

@Getter solo añade consultas. @Data incorpora, entre otros, setter, representación e igualdad basadas en campos, y podría recorrer relaciones. No lo aplicamos indiscriminadamente a JPA; elegimos qué generar y excluimos relaciones cuando corresponda.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El builder encadena setters del constructor generado y build crea el objeto. @Getter permite leer después. Esto requiere Lombok configurado; no es Java estándar sin librerías. Si se omite nombre, el builder no garantiza un nombre válido. El diseño debe decidir cómo validar.

## 3. Qué conviene corregir

La confusión a evitar es: Confiar en defaults de un builder como si fueran validaciones de datos obligatorios.

@Getter y @Setter generan accesores; @NoArgsConstructor un constructor sin argumentos; @AllArgsConstructor uno con campos; @RequiredArgsConstructor los requeridos según su definición. @Builder ofrece una forma de construcción mediante métodos encadenados.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
