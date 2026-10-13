# Soluciones 11.01 · Persistencia, tablas, filas y columnas

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

categoria(id INTEGER PRIMARY KEY,nombre TEXT NOT NULL). Si querés nombres no vacíos añadí una restricción acorde al motor o validación de aplicación. Una fila es una categoría, no una lista de nombres en una sola celda.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

CREATE define columnas y reglas; INSERT agrega una fila; SELECT la consulta. NOT NULL impide ausencia, pero no rechaza necesariamente una cadena vacía. CHECK exige precio no negativo. Estos nombres describen el modelo físico; JPA luego lo relacionará con clases Java.

## 3. Qué conviene corregir

La confusión a evitar es: Guardar varios valores separados por comas en una columna para simular una relación.

Persistir es conservar datos más allá de la ejecución actual. Una base relacional organiza información en tablas; cada fila representa un registro y cada columna un atributo con dominio.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
