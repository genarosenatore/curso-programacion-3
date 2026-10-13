# Soluciones 15.03 · Estados de carga, error, resultado y CORS

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

boton.disabled=true antes de la petición y en finally boton.disabled=false. Mostrá error si falla y solo limpiá el formulario después de éxito. Conservá los datos ingresados para que la persona pueda corregirlos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

estado y render se definen en la página completa. La URL relativa apunta al mismo origen. Si movés el frontend a Vite, definí un proxy o configuración de CORS coherente y restringida al origen de práctica. Un 404 por ruta mal escrita no se corrige concediendo todos los orígenes.

## 3. Qué conviene corregir

La confusión a evitar es: Desactivar permanentemente un botón al olvidar manejar el caso de error.

La pantalla necesita estados reconocibles: cargando, resultado, vacío y error. Un botón puede quedar deshabilitado durante una escritura para evitar dobles clics accidentales; al terminar debe volver a su estado mediante finally.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
