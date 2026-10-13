# Soluciones 08.06 · Práctica: DTO de producto y factura

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

ProductoTarjetaDTO(String nombre,int precioCentavos,boolean disponible). Su constructor se llama con nombre, precio y stock>0. Los resultados deben ser true para 3 y false para 0. Revisá los TP Lombok/DTO y records del campus después de ejecutar este ejemplo.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La salida omite precio en este contrato de ejemplo y transforma stock en una condición. Otro DTO del catálogo podría requerir precio; no existe un único DTO obligatorio para cada entidad. Usar nombres distintos hace visible la diferencia de responsabilidad.

## 3. Qué conviene corregir

La confusión a evitar es: Afirmar que usar un DTO impide todo problema de permisos sin revisar qué datos expone.

La práctica de DTO conecta el modelo con una vista sin añadir todavía una API. Vamos a transformar productos a objetos de salida y mostrar solo los campos definidos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
