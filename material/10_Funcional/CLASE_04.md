# Clase 10.04 · Streams: origen, operaciones intermedias y terminales

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_03.md) · [Clase siguiente](../10_Funcional/CLASE_05.md)

## Describir un recorrido de datos

Un stream no es una lista nueva ni un archivo descargado: es un recorrido de procesamiento. Tiene **fuente**, operaciones **intermedias** y una **terminal** que solicita resultado o realiza acción. List.stream crea la fuente; filter agrega selección; toList obtiene la salida.

Las operaciones intermedias son **perezosas**: construir la cadena no recorre por sí solo todos los elementos. La terminal activa el procesamiento requerido. Eso permite combinar operaciones sin colecciones intermedias, aunque algunas como sorted necesitan reunir datos para ordenar.

## Seguir el ejemplo elemento a elemento

La fuente Ana,Luis,Eva se conserva. Al solicitar toList, cada nombre pasa por el predicado length<=3. Ana true, Luis false, Eva true: la salida es [Ana,Eva]. La lista de Stream.toList no admite modificaciones estructurales; no prometas que sus elementos internos sean inmutables.

Las operaciones van dentro de main. var infiere el tipo de lista o resultado local, no elimina su tipo. Para un conteo usá count, que devuelve long; para buscar primero, findFirst devuelve un Optional que puede no contener dato, desarrollado en 10.07.

Un stream consumido no se vuelve a utilizar. Si querés otro resultado, obtené un stream nuevo de la lista. Evitá modificar la fuente o estado compartido desde la cadena: complica su lectura y puede romper el recorrido. Empezamos con secuencial; parallelStream requiere otras condiciones y no mejora automáticamente todo cálculo.

## Ejemplo de la clase

```java
var nombres = java.util.List.of("Ana", "Luis", "Eva");
var cortos = nombres.stream()
    .filter(nombre -> nombre.length() <= 3)
    .toList();
System.out.println(cortos);
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

stream crea el origen; filter es intermedia; toList es terminal y obtiene [Ana,Eva]. La lista original conserva los tres nombres. toList de Stream produce una lista no modificable; si necesitás editarla, elegí otra construcción explícita.

## Cambiar una decisión y explorar un límite

Quitá toList y conservá solo la construcción: no obtenés la selección como lista. Llamar dos terminales sobre el mismo Stream falla. Crear nombres.stream() otra vez produce un recorrido nuevo sobre la fuente que sigue existente.

## Confusión que conviene evitar

Guardar un Stream consumido y llamar a otra terminal sobre la misma instancia.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_03.md) · [Clase siguiente](../10_Funcional/CLASE_05.md)
