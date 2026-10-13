# Clase 07.05 · Iteradores, búsqueda y eliminación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_06.md)

## Recorrer y modificar con una política compatible

Un iterador mantiene una posición de recorrido. `hasNext()` informa si queda un elemento y `next()` avanza y lo devuelve. El for mejorado utiliza un mecanismo de iteración; modificar directamente la colección durante ese recorrido puede invalidarlo. ConcurrentModificationException no exige dos hilos: puede ocurrir por esa modificación en el mismo flujo.

Para quitar según una condición, removeIf comunica la intención. La expresión `valor -> valor == 0` es una **lambda**: antes de -> está el parámetro y después una expresión booleana. La colección invoca ese criterio con cada elemento y elimina los true. Su contrato es Predicate, que desarrollaremos en [10.02](../10_Funcional/CLASE_02.md); esta sintaxis mínima alcanza para seguir el ejemplo.

## Dos formas seguras

El fragmento inferior modifica una ArrayList editable y deja [3,5]. Integer se desempaqueta para comparar con cero; si admitís null, comprobalo antes. Una variante manual es `Iterator<Integer> it = numeros.iterator(); while(it.hasNext()){ int n=it.next(); if(n<0) it.remove(); }`. remove del iterador corresponde al último next y solo se invoca una vez por ese avance.

No llames lista.remove desde el for mejorado esperando que el recorrido se adapte. Tampoco modifiques List.of, que no admite esa operación. Si querés conservar el original, creá una copia y quitá de ella, o más adelante usá filter de un stream para obtener una selección sin modificar la fuente.

Una búsqueda sin coincidencias puede ser normal. Decidí si la operación devuelve boolean, null o un Optional según su contrato; no conviertas toda ausencia en una excepción. Eliminar todos los elementos puede ser un resultado válido y debe poder representarse.

## Ejemplo de la clase

```java
java.util.List<Integer> stock = new java.util.ArrayList<>(java.util.List.of(0, 3, 0, 5));
stock.removeIf(valor -> valor == 0);
System.out.println(stock);
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Queda [3,5]. La lambda recibe cada valor y decide qué eliminar. En el ejemplo usa Integer con autounboxing para compararlo numéricamente. Si se admitieran null, habría que manejarlos antes. removeIf modifica la lista, distinto de filter de un stream que produce otro resultado.

## Cambiar una decisión y explorar un límite

Si todos los valores son cero, removeIf deja una lista vacía; no es un fallo. En una lista sin ceros, no cambia. Una lista no modificable puede lanzar al intentar eliminar: comprobá cómo fue construida.

## Confusión que conviene evitar

Usar lista.remove dentro del for mejorado y provocar ConcurrentModificationException.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_06.md)
