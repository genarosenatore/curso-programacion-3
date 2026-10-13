# Soluciones 03.12 · async/await, fetch y manejo de errores

[Clase](CLASE_12.md) · [Práctica](EJERCICIOS_12.md)

## 1. Razonamiento de la actividad guiada

Antes: estado.textContent="Cargando...". Tras json: estado.textContent=`${productos.length} productos`. En catch: estado.textContent="No se pudo cargar". Cambiá la ruta por una inexistente y comprobá que aparezca el mensaje de error.

## 2 y 3. Resolver y justificar las decisiones

Seleccioná estado antes de llamar. Antes del try o al comienzo asigná «Cargando». Tras json, si no es array lanzá new Error("Formato inesperado"); si length === 0 asigná «Sin productos», en otro caso `${productos.length} productos`. En catch asigná «No se pudo cargar» y registrá el error en consola para depurar.

Los dos await atienden momentos diferentes: cabeceras de respuesta y lectura del cuerpo. 404 demuestra que el servidor respondió; fetch no decide si ese estado sirve a tu operación. Tu comprobación lo convierte en una falla del flujo esperado. La interfaz informa al usuario y la consola conserva detalles para investigar.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
