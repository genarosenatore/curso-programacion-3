# Clase 10.03 · Referencias a métodos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_02.md) · [Clase siguiente](../10_Funcional/CLASE_04.md)

## Una abreviatura con un contrato conocido

Una referencia a método representa una lambda que delega directamente a un método compatible. `String::length` equivale, en Function<String,Integer>, a s->s.length(). El primer argumento de la función identifica la instancia sobre la que llamar. `System.out::println` usa un receptor ya existente y equivale a texto->System.out.println(texto).

`Tipo::metodoStatic` referencia una operación estática; `Tipo::new` un constructor. Los dos puntos no ejecutan inmediatamente la operación: dan un comportamiento que el contrato invocará más adelante. La firma debe encajar en cantidad y tipos de argumentos y retorno.

## Seguir una transformación y una acción

En el ejemplo, mayusculas.apply("ana") invoca toUpperCase sobre ese String y obtiene ANA. Luego mostrar.accept imprime. Las declaraciones y llamadas van dentro de main, usando Function y Consumer de [10.02](CLASE_02.md). No hace falta definir otra clase de operación.

Cuando necesitás agregar un argumento, una lambda puede ser mejor: s->s.toUpperCase(java.util.Locale.ROOT) fija una política de idioma que la referencia simple no expresa. Tampoco varias instrucciones con validación se simplifican necesariamente a una referencia legible.

El tipo Integer de Function<String,Integer> admite el retorno int de length mediante boxing, como aprendimos en colecciones. length mide unidades UTF-16, no necesariamente caracteres percibidos para todos los símbolos; para nuestros nombres simples sirve, pero no generalices esa medida a cualquier texto internacional sin otra política.

## Ejemplo de la clase

```java
java.util.function.Function<String, String> mayusculas = String::toUpperCase;
java.util.function.Consumer<String> mostrar = System.out::println;
mostrar.accept(mayusculas.apply("ana"));
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra ANA. Function recibe un String y devuelve String, encajando con el método de instancia toUpperCase. Para resultados reproducibles de mayúsculas según idioma, podés usar una lambda s->s.toUpperCase(Locale.ROOT) cuando la regla lo requiera.

## Cambiar una decisión y explorar un límite

Reemplazá la referencia por su lambda equivalente: el resultado debería conservarse. Para un método que requiere un argumento extra, usar una referencia sin un contrato compatible deja de compilar. Más corto no significa más claro si oculta la operación.

## Confusión que conviene evitar

Usar referencias solo para acortar aunque vuelva menos evidente la intención.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_02.md) · [Clase siguiente](../10_Funcional/CLASE_04.md)
