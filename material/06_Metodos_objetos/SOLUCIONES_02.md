# Soluciones 06.02 · toString y representación legible

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

Una salida posible es Cliente{codigo='C01', nombre='Ana'}. Excluí contraseña y cualquier dato que no haga falta para este registro. No devuelvas todos los objetos relacionados sin controlar la profundidad.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

println utiliza toString y muestra Producto{codigo='P01'}. El nombre de la clase y código hacen reconocible el objeto. Si agregamos precio, podemos decidir incluirlo; esa decisión no cambia su regla de igualdad.

## 3. Qué conviene corregir

La confusión a evitar es: Esperar que toString produzca JSON correcto o sirva como base de datos.

toString devuelve una representación textual de un objeto. Sirve al imprimir, depurar o construir mensajes.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
