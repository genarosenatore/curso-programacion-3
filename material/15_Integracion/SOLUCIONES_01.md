# Soluciones 15.01 · Seguir una petición del frontend al backend

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Revisá si se parseó el cuerpo, si se validó o adaptó su forma y si el render recibió el nuevo producto. Verificá selectors del DOM y errores de consola. No cambies el repositorio primero si la respuesta ya contiene lo esperado.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

No todas las operaciones consultan la base, pero este recorrido representa un CRUD persistente típico. Una respuesta útil incluye el id creado. Volver a consultar por ese id comprueba la persistencia mejor que solo mostrar un mensaje de éxito.

## 3. Qué conviene corregir

La confusión a evitar es: Resolver todo error cambiando CORS sin observar la respuesta o el evento.

Una operación completa empieza en la interfaz y atraviesa varias responsabilidades. Seguir ese recorrido ayuda a localizar fallos: si el botón no dispara evento, el problema está antes de HTTP; si llega 400, hay que revisar la petición; si llega 200 pero no se muestra, hay que revisar interpretación o render.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
