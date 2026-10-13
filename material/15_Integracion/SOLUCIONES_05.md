# Soluciones 15.05 · Food Store: catálogo, filtros y detalle

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

const visibles=seleccionar(productos,texto,categoriaId).sort((a,b)=>a.precioCentavos-b.precioCentavos);. Para empatar usá nombre.localeCompare. Probá categoría sin productos y una búsqueda que no coincida dentro de la categoría seleccionada.

## 2 y 3. Resolver y justificar las decisiones

`const visibles=seleccionar(productos,texto,categoriaId).sort((a,b)=>a.precioCentavos-b.precioCentavos);` conserva la fuente porque filter creó array nuevo. Al borrar texto permanecen los productos de la categoría seleccionada. Detalle ausente muestra No encontrado; agotado muestra datos y disponibilidad sin permitir alta. Cero puede ser una identidad real o inválida; null expresa explícitamente todas sin sobrecargar esa cifra.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
