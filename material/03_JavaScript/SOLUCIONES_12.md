# Soluciones 03.12 · async/await, fetch y manejo de errores

[Clase](CLASE_12.md) · [Ejercicios](EJERCICIOS_12.md)

## 1. Una solución explicada

Antes: estado.textContent="Cargando...". Tras json: estado.textContent=`${productos.length} productos`. En catch: estado.textContent="No se pudo cargar". Cambiá la ruta por una inexistente y comprobá que aparezca el mensaje de error.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

productos.json debe estar junto a la página y servirse desde un servidor local. await de fetch obtiene Response y await de json obtiene los datos. Un error de red o uno lanzado al comprobar ok llega al catch. Todavía debemos validar que los datos tengan la forma que el programa espera.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que fetch lanza error automáticamente ante cualquier respuesta HTTP de error.

async declara una función cuyo resultado es una promesa. await espera un resultado dentro de esa función sin bloquear todo el navegador.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
