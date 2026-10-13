# Soluciones 02.06 · Flexbox

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Usá productos como contenedor y producto en cada tarjeta. Probá 1200px y 400px de ancho. Si aparecen desbordes por palabras largas, añadí overflow-wrap:anywhere según corresponda y revisá min-width en los hijos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Cada producto puede crecer y encoger desde 14rem. Cuando no caben, pasan a otra fila. La barra separa sus hijos a lo largo del eje principal y los centra en el transversal. Aplicá las clases a padres con hijos reales; poner display:flex en un hijo aislado no organiza a sus hermanos.

## 3. Qué conviene corregir

La confusión a evitar es: Esperar que justify-content:center centre verticalmente en cualquier flex-direction.

Flexbox distribuye elementos principalmente en un eje. El padre es el contenedor flex y sus hijos directos son ítems.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
