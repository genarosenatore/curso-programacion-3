# Soluciones 14.07 · Endpoints GET y parámetros

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Listado sin coincidencias: 200 y []. Producto por id no encontrado: 404. Id mal formado: 400 en el manejo configurado. Agregá mensajes que ayuden a corregir la petición y probá cada ruta local.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El método pertenece al controller con ruta base /api/productos. Spring convierte el segmento a Long y puede rechazar una forma inválida. El servicio busca y devuelve DTO o lanza el error de inexistencia manejado por la aplicación.

## 3. Qué conviene corregir

La confusión a evitar es: Devolver el mismo 200 con un mensaje de error para todos los fallos.

@GetMapping expone recuperación. @PathVariable lee parte de ruta y @RequestParam un parámetro de consulta.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
