# Clase 07.02 · ArrayList y recorrido de listas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_01.md) · [Clase siguiente](../07_Colecciones/CLASE_03.md)

## Una secuencia que puede crecer

ArrayList permite agregar y quitar valores sin fijar el tamaño inicial. `add` agrega, `get` consulta una posición, `set` reemplaza y `size()` cuenta. No confundas size() de colección con length del array. El índice sigue empezando en cero y una posición igual a size queda fuera.

En el ejemplo, new ArrayList<>(List.of("Ana","Luis")) crea una lista editable a partir de una lista no modificable. List.of admite datos iniciales, pero no add ni valores null. Copiarla en ArrayList permite editar la nueva estructura; si sus elementos fueran objetos mutables, seguirían siendo referencias a esos objetos, no copias profundas.

## Seguir cambios de orden y tamaño

Después de add("Eva") la lista tiene tres. set(0,"Anita") cambia el primer valor sin aumentar size. El for mejorado lee Anita, Luis y Eva, y get(2) retorna Eva. Colocá operaciones dentro de main de [05.01](../05_Java/CLASE_01.md), con imports java.util.List y ArrayList si querés abreviar nombres.

`remove("Luis")` elimina la primera coincidencia por igualdad. Con una lista de Integer hay sobrecargas: remove(1) elimina índice uno; remove(Integer.valueOf(1)) elimina el valor uno. La **sobrecarga** selecciona operaciones con el mismo nombre según sus argumentos; el tipo determina qué se invoca.

ArrayList resulta cómodo para consultas por posición y recorridos. Insertar o quitar en el medio puede desplazar muchos elementos; no elijas estructura únicamente por «es rápida» sin saber la operación. Para un catálogo pequeño conviene primero claridad y reglas comprobables.

## Ejemplo de la clase

```java
java.util.List<String> nombres = new java.util.ArrayList<>(java.util.List.of("Ana", "Luis"));
nombres.add("Eva");
nombres.set(0, "Anita");
for (String nombre : nombres) System.out.println(nombre);
System.out.println(nombres.get(2));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La lista queda Anita, Luis, Eva y get(2) devuelve Eva. set no agrega al final: necesita una posición existente. size es un método en List, distinto de length de un array. El orden de la lista corresponde a la secuencia de inserción y cambios.

## Cambiar una decisión y explorar un límite

set(3,"Omar") sobre una lista de tres falla porque reemplazar requiere posición existente; add agrega una nueva. add sobre List.of falla por modificación no admitida. Son dos causas diferentes, aunque ambas ocurran al intentar cambiar datos.

## Confusión que conviene evitar

Intentar agregar a List.of y no comprender UnsupportedOperationException.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_01.md) · [Clase siguiente](../07_Colecciones/CLASE_03.md)
