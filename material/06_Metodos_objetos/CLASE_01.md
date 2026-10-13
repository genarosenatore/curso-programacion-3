# Clase 06.01 · Identidad de referencias y significado de igualdad

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_11.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_02.md)

## Dos preguntas distintas sobre dos objetos

En [05.06](../05_Java/CLASE_06.md) vimos referencias: dos variables pueden alcanzar una instancia o dos instancias diferentes. **Identidad** pregunta si alcanzan la misma; `==` sobre referencias responde esa pregunta. **Igualdad** pregunta si, para el modelo, representan lo mismo. Una clase define esa regla mediante equals.

Todas las clases ordinarias heredan de Object directa o indirectamente. Object ofrece equals, hashCode y toString. Su equals por defecto compara identidad; una clase propia no compara automáticamente sus atributos. String sí sobrescribe equals para comparar su texto. Por eso dos new String("Cuaderno") dan false con == y true con equals.

## Definir la regla antes del método

Para un catálogo, dos registros con código P01 podrían representar el mismo producto aunque el precio cambie. Dos personas llamadas Ana no necesariamente son el mismo cliente. Elegir nombre como clave mezcla parecido con identidad del dominio. Definí qué campos identifican de forma estable y documentá si una versión o estado forma parte de la igualdad.

Ejecutá el fragmento inferior dentro de main de [05.01](../05_Java/CLASE_01.md), o usá [U06Igualdad.java](../Ejemplos/java/U06Igualdad.java). Seguimiento: primer new crea A; segundo new crea B; referencias distintas; contenido equivalente. Las cadenas literales pueden reutilizarse internamente y hacer que == parezca funcionar, pero no expresan la comparación de contenido buscada.

Si a puede ser null, llamar a.equals(b) falla. `java.util.Objects.equals(a,b)` acepta ausencia: dos null son iguales para ese auxiliar; uno null y otro presente son distintos. No convierte un modelo mal elegido en uno correcto. Una regla de igualdad consistente será necesaria para detectar duplicados en colecciones.

## Ejemplo de la clase

```java
String a = new String("Cuaderno");
String b = new String("Cuaderno");
System.out.println(a == b);
System.out.println(a.equals(b));
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra false y true: los dos new crean objetos diferentes con contenido igual. No generalices el equals de String a cualquier clase propia. Una clase de producto que todavía no lo implemente seguirá usando identidad.

## Cambiar una decisión y explorar un límite

Cambiá b por a: ahora == y equals dan true porque comparten la instancia. Cambiá el texto de b a Libro: ambos dan false. Una clase Producto sin equals propio conserva identidad, aunque sus códigos coincidan.

## Confusión que conviene evitar

Usar == para comparar el contenido de objetos o strings.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_11.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_02.md)
