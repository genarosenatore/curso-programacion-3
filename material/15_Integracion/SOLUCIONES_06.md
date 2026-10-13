# Soluciones 15.06 · Carrito, cantidades y localStorage

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Después de agregar 2 queda 2; añadir otras 2 se rechaza y conserva 2; quitar 1 deja 1; serializar y recargar debe recuperar 1 tras validar. Si los datos almacenados están corruptos, mostrás un estado recuperable en lugar de fallar toda la página.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Si hay 2 unidades en carrito y se agregan 2 sobre stock 3, la cantidad combinada 4 se rechaza. Validar solo la nueva cantidad 2 sería insuficiente. Quitar el último ítem deja un carrito vacío con total cero y un mensaje visible.

## 3. Qué conviene corregir

La confusión a evitar es: Validar stock solo al abrir la pantalla y no al modificar la cantidad.

El carrito debe decidir cómo combinar repetidas selecciones del mismo producto. Una estructura por productoId evita renglones duplicados.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
