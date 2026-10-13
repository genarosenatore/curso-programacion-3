# Soluciones 13.08 · Práctica escalonada: los cinco niveles del TP grupal

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

Nivel 1: todas las facturas. Nivel 2: filtro estado e importe. Nivel 3: facturas por marca con distinct. Nivel 4: total por condición. Nivel 5: artículos nunca vendidos con NOT EXISTS. Las siete clases anteriores tienen las piezas y soluciones explicadas para cada mecanismo; contrastá cada ejercicio concreto con el modelo del campus.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Con totales 100 y 200 en condición A, y 50 en B, esperamos A=300 y B=50. La consulta es select f.condicionIva.denominacion,sum(f.importeTotal) ... group by id y denominación. Si antes unimos detalles y no compensamos duplicados, podemos sumar más de una vez cada cabecera.

## 3. Qué conviene corregir

La confusión a evitar es: Evaluar una consulta sin datos que distingan sus casos correctos de los incorrectos.

El TP grupal organiza consultas en cinco niveles: selección y filtros, condiciones y agregados, relaciones y subconsultas, agrupamiento y consultas correlacionadas. Para estudiar por tu cuenta, hacé una consulta por vez y comprobala con datos cuyo resultado conozcas.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
