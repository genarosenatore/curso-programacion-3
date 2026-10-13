# Clase 07.01 · List, Set y Map: qué problema resuelve cada uno

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_02.md)

## Elegir según lo que necesitás conservar

Un array Java tiene tamaño fijo. Una **colección** ofrece operaciones para organizar datos y, según su implementación, crecer o eliminar. List conserva una secuencia con posiciones y repetidos. Set expresa pertenencia sin duplicados. Map asocia una clave con un valor: es otra familia, no un subtipo de Collection.

Elegí por preguntas concretas: «¿cuál es el tercer paso?» requiere secuencia; «¿ya está inscripto?» requiere pertenencia; «¿qué precio tiene P01?» requiere clave y valor. Una misma aplicación puede utilizar las tres para responsabilidades diferentes.

## Contrato e implementación

`List<String>` es el contrato con elementos String. Los signos < > indican argumentos de tipo; explican qué admite la colección y qué devuelve al consultar. ArrayList es una implementación concreta para crear. `List<String> nombres = new ArrayList<>();` separa la capacidad usada de su realización, como las [interfaces](../05_Java/CLASE_08.md). El diamante <> permite inferir el argumento del constructor.

Los genéricos admiten referencias, no primitivos: usá Integer en lugar de int para una lista de números. Java convierte automáticamente int a su objeto envoltorio Integer, **boxing**, y puede convertirlo de vuelta, **unboxing**. Un Integer null no puede convertirse a int sin error.

El fragmento inferior va dentro de main, con nombres completos java.util o imports al comienzo del archivo. List agrega dos A; Set creado desde ella conserva una; Map almacena A→800. No toda implementación conserva el mismo orden: HashSet y HashMap no lo garantizan; LinkedHashSet y LinkedHashMap conservan inserción; TreeSet utiliza orden por comparación. Queue expresa turnos y Deque acceso por ambos extremos; los mencionamos para ubicar su función, sin pedirlos en esta práctica.

## Ejemplo de la clase

```java
java.util.List<String> lista = new java.util.ArrayList<>();
lista.add("A"); lista.add("A");
java.util.Set<String> conjunto = new java.util.HashSet<>(lista);
java.util.Map<String, Integer> precios = new java.util.HashMap<>();
precios.put("A", 800);
System.out.println(lista.size() + " / " + conjunto.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra 2 / 1. La lista conserva ambos; el conjunto usa igualdad de String para deduplicar. El mapa conserva el precio bajo la clave A. Una nueva llamada put con A reemplaza su valor anterior en lugar de crear otra clave.

## Cambiar una decisión y explorar un límite

Cambiar una lista por Set elimina repetidos y también deja de ofrecer get(indice). Cambiar un Map por List exigiría buscar manualmente la clave. Una estructura conveniente preserva las operaciones que necesita el problema, no solo sus datos iniciales.

## Confusión que conviene evitar

Suponer que toda colección tiene posiciones numéricas como una lista.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_05.md) · [Clase siguiente](../07_Colecciones/CLASE_02.md)
