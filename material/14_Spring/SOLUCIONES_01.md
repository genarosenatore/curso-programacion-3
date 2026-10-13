# Soluciones 14.01 · HTTP: URL, petición, respuesta, JSON y códigos de estado

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

GET /api/productos/1: 200 con JSON si existe. GET /api/productos/999: 404 con mensaje de error del contrato. El frontend debe comprobar response.ok y decidir qué mostrar.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El cliente no envía un programa Java, sino datos. El backend valida y crea una representación persistente. Location puede señalar el recurso recién creado. Una respuesta 204 no debería intentar parsearse como JSON porque no lleva cuerpo.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir que la conexión respondió con que la operación del negocio salió bien.

HTTP intercambia peticiones y respuestas. Una petición tiene método, URL, cabeceras y a veces cuerpo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
