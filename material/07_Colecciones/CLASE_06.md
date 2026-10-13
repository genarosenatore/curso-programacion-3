# Clase 07.06 · Comparable y Comparator

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_07.md)

## Ordenar con una comparación explícita

Comparable declara un orden natural mediante compareTo dentro de la clase. Comparator aporta un criterio externo con compare(a,b), permitiendo ordenar un mismo catálogo por nombre o precio sin cambiar su clase. El resultado negativo significa a antes, cero equivalentes en ese orden y positivo a después; no exige devolver exactamente -1 o 1.

Una lambda `(a,b) -> Integer.compare(a.length(),b.length())` define una comparación por longitud. `String::length` es una **referencia a método**, abreviatura de s -> s.length() cuando el contrato lo permite. Los dos puntos no ejecutan length en ese momento; ofrecen la operación al comparador. Lo desarrollaremos en [10.03](../10_Funcional/CLASE_03.md), pero esta equivalencia permite leer el ejemplo.

## Componer y desempatar

Comparator.comparingInt obtiene la clave numérica de cada valor. thenComparing define otro criterio cuando el primero empata. Ana y Eva tienen longitud tres; un criterio alfabético permite decidir su orden. reversed invierte el comparador sobre el que se aplica: si lo colocás al final de toda la cadena, puede invertir también los desempates.

sort modifica una lista editable. Ejecutá el ejemplo dentro de main; primero imprime [Ana,Eva,Luis] y la segunda ordenación mantiene ese orden en estos datos porque longitud y desempate coinciden. Para ver su efecto, agregá un nombre alfabéticamente temprano pero largo. Para preservar el original, copiá new ArrayList<>(nombres) antes de ordenar.

Restar enteros a-b como criterio puede desbordar; Integer.compare evita ese patrón. Un comparador debe ser consistente y transitivo. Devolver siempre 1, incluso comparando el mismo valor, no expresa un orden válido. TreeSet además usa comparación cero para unicidad, distinto del propósito de sort sobre List.

## Ejemplo de la clase

```java
java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Eva", "Ana", "Luis"));
nombres.sort(java.util.Comparator.naturalOrder());
System.out.println(nombres);
nombres.sort(java.util.Comparator.comparingInt(String::length).thenComparing(java.util.Comparator.naturalOrder()));
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El primer orden es Ana, Eva, Luis. El segundo ordena por longitud y desempata alfabéticamente. String::length es una referencia a método que se desarrolla en programación funcional. No hace falta cambiar la clase String para tener un criterio distinto.

## Cambiar una decisión y explorar un límite

Ordená ["Zoe","Alejandro","Ana"] alfabéticamente y por longitud: aparecen órdenes distintos. Aplicar reversed después de thenComparing invierte toda la cadena; aplicarlo al comparador de longitud antes del desempate conserva el desempate elegido.

## Confusión que conviene evitar

Asumir que orden natural significa siempre orden de inserción.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_07.md)
