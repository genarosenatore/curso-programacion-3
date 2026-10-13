# Soluciones 10.05 · filter, map y sorted

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

productos.stream().filter(p->p.stock()>0&&p.precio()<1500).map(p->p.nombre().toUpperCase(Locale.ROOT)).toList(). Con los datos indicados resulta vacío. Agregá un producto disponible de 1000 y comprobá que aparezca.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Hasta sorted, los elementos son Producto. Después de map son String. El resultado es [Cuaderno], porque Lapicera estaba agotada. La ordenación usa int del ejemplo didáctico; el criterio debe reflejar la unidad del precio.

## 3. Qué conviene corregir

La confusión a evitar es: Llamar precio() después de transformar cada producto a String.

filter selecciona manteniendo el tipo de elementos; map transforma y puede cambiarlo; sorted ordena mediante un criterio. El orden de operaciones define lo que llega a cada paso.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
