# Soluciones 15.05 · Food Store: catálogo, filtros y detalle

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

const visibles=seleccionar(productos,texto,categoriaId).sort((a,b)=>a.precioCentavos-b.precioCentavos);. Para empatar usá nombre.localeCompare. Probá categoría sin productos y una búsqueda que no coincida dentro de la categoría seleccionada.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

null significa todas las categorías, no cero. La búsqueda vacía coincide con todos los nombres. La función devuelve otra lista sin modificar la original; después podemos copiar y ordenar. El stock se muestra y se vuelve a validar cuando se intenta comprar.

## 3. Qué conviene corregir

La confusión a evitar es: Aplicar filtros a una lista ya filtrada y no poder recuperar resultados al borrar búsqueda.

Food Store comienza por un catálogo con categorías, búsqueda, orden y detalle. Separaremos datos, filtrado y representación.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
