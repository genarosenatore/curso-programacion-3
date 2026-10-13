# Soluciones 10.05 · filter, map y sorted

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

productos.stream().filter(p->p.stock()>0&&p.precio()<1500).map(p->p.nombre().toUpperCase(Locale.ROOT)).toList(). Con los datos indicados resulta vacío. Agregá un producto disponible de 1000 y comprobá que aparezca.

## 2 y 3. Resolver y justificar las decisiones

Con los datos originales la selección es vacía: Cuaderno supera el precio y Lapicera está agotada. Tras agregar dos disponibles baratos, filter selecciona ambos; sorted ordena 800 antes de 1000; map obtiene sus nombres en mayúsculas. Usá `p->p.nombre().toUpperCase(java.util.Locale.ROOT)` si querés fijar la política. El tipo permanece Producto hasta map y pasa a String después.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
