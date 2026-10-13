# Soluciones 08.03 · DTO: diferencia con entidad y modelo de pantalla

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

Entrada: nombre, correo y un dato de credencial si la operación lo requiere. Salida: id, nombre y correo. No devuelvas la credencial ni su hash. En nuestro curso no implementamos seguridad real a partir del ejemplo de sesión del campus.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

ProductoDTO presenta datos de catálogo. CrearPedidoDTO pide una operación y contiene solo lo necesario para solicitarla. Los records son una opción, no la definición de DTO: también puede ser una clase común. Validar el id y cantidad sigue siendo obligatorio al procesar la petición.

## 3. Qué conviene corregir

La confusión a evitar es: Copiar todos los campos de entidad a cualquier DTO sin pensar el contrato.

Un DTO transporta datos entre capas o aplicaciones. Define el contrato: qué campos se reciben o muestran.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
