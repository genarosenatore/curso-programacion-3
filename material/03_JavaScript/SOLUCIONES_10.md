# Soluciones 03.10 · JSON, localStorage y sessionStorage

[Clase](CLASE_10.md) · [Ejercicios](EJERCICIOS_10.md)

## 1. Una solución explicada

localStorage.setItem("tema","oscuro"); const tema=localStorage.getItem("tema") ?? "claro";. removeItem("tema") elimina solo esa preferencia. ?? usa el valor alternativo si hay null o undefined.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El texto almacenado representa el array. Al recuperarlo, parse reconstruye datos, no instancias ni métodos originales. Un texto alterado puede fallar al parsear: en una aplicación real se usa try/catch y se valida la forma de los datos. Estas APIs se usan desde una página del mismo origen; trabajar desde un servidor local evita limitaciones del protocolo file.

## 3. Qué conviene corregir

La confusión a evitar es: Confiar en localStorage como prueba de permisos o como almacenamiento seguro de contraseñas.

JSON es una representación textual de datos con objetos, arrays y valores simples. JSON.stringify convierte datos a texto y JSON.parse interpreta ese texto.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
