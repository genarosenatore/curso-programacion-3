# Soluciones 08.04 · Mapeo entre entidad y DTO

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

aDTO calcula disponible=producto.stock()>0 al construir el DTO. Probá stock 0 y 3. Es una decisión del contrato; no significa que ese valor no pueda cambiar antes de concretar una compra.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El método toma un objeto y construye otro. En este ejemplo ambos son records para concentrarnos en el mapeo. Si la entidad tuviera datos internos, simplemente no se incluirían en la salida. Los valores del dominio no cambian porque se prepare una representación.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir mapear con validar o guardar automáticamente.

Mapear consiste en transformar datos entre representaciones. Un mapeo manual explícito es fácil de entender y permite elegir qué campo corresponde a cuál.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
