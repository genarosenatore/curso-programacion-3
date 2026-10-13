# Soluciones 04.10 · Preparación del frontend de Food Store

[Clase](CLASE_10.md) · [Ejercicios](EJERCICIOS_10.md)

## 1. Una solución explicada

Con dos productos de 800×2 y 2000×1, total devuelve 3600. Validá cada alta o modificación del carrito; al crear el pedido, el backend vuelve a comprobar disponibilidad y precios. El valor mostrado en el navegador no es la autoridad del total guardado.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

reduce comienza en cero y acumula cada subtotal. Un carrito vacío da cero porque hay un valor inicial. Las cantidades y los precios de este ejemplo deben validarse antes de entrar a la función. Para dinero real usaremos centavos enteros en los ejemplos integrados y BigDecimal en Java para evitar errores de precisión.

## 3. Qué conviene corregir

La confusión a evitar es: Confiar en precios y stock enviados por el frontend como si no pudieran cambiar.

Food Store pide más que mostrar productos: incluye categorías, carrito, pedidos y administración. Vamos a descomponerla en modelos y funciones antes de construir pantallas completas.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
