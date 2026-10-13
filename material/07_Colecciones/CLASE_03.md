# Clase 07.03 · HashSet y duplicados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_02.md) · [Clase siguiente](../07_Colecciones/CLASE_04.md)

## Preguntar pertenencia sin contar posiciones

HashSet representa un conjunto por igualdad. add devuelve true si añadió un elemento distinto y false si ya tenía uno equivalente. contains pregunta pertenencia; remove intenta quitar; size cuenta representantes. No hay get(0), porque el contrato no describe posiciones.

Para String, la igualdad por contenido está definida. Para Producto, necesitás equals y hashCode coherentes como en [unidad 06](../06_Metodos_objetos/CLASE_03.md). No compares el mensaje impreso para detectar duplicados: la colección utiliza sus contratos, no toString.

## Normalizar antes de comparar

Si "ANA@example.com" y "ana@example.com" se deben considerar una inscripción en tu ejercicio, definí una política de normalización antes de insertar. Convertir a minúsculas con Locale.ROOT puede ser una regla de práctica, pero no asumas que todos los sistemas externos tienen la misma política para direcciones. La colección no decide el significado del dato por vos.

Ejecutá el fragmento dentro de main. La primera P01 cambia el conjunto; la segunda no; contains da true y size uno. Agregar P02 aumenta a dos. El recorrido puede no seguir inserción: elegí LinkedHashSet si ese orden es requisito.

TreeSet aplica otro mecanismo: ordena por Comparable o Comparator y trata como equivalentes para pertenencia los valores cuyo comparador devuelve cero. Una comparación solo por precio puede excluir dos productos diferentes con igual precio. Conviene mantener el criterio coherente con la igualdad o documentar claramente la función de esa estructura.

## Ejemplo de la clase

```java
java.util.Set<String> codigos = new java.util.HashSet<>();
System.out.println(codigos.add("P01"));
System.out.println(codigos.add("P01"));
System.out.println(codigos.contains("P01"));
System.out.println(codigos.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra true, false, true y 1. La segunda inserción no crea otro elemento igual. No hay get(0), porque Set no expresa acceso por índice. Si necesitás una lista ordenada para la pantalla, convertí o seleccioná una implementación apropiada.

## Cambiar una decisión y explorar un límite

Si cambiás una propiedad usada en hash de un Producto insertado, contains puede dejar de encontrarlo. Cambiar su nombre, si no participa en igualdad, no debería afectar. Estabilidad de clave y orden de recorrido son problemas distintos.

## Confusión que conviene evitar

Ordenar visualmente según el recorrido accidental de HashSet.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_02.md) · [Clase siguiente](../07_Colecciones/CLASE_04.md)
