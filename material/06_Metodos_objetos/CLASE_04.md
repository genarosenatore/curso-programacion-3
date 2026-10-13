# Clase 06.04 · hashCode y relación con equals

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_03.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_05.md)

## Usar un resumen para ubicar búsquedas

Un hash es un número calculado a partir de datos para ayudar a distribuirlos en grupos de búsqueda. hashCode devuelve int; no es una clave universal única. Si dos objetos son iguales por equals, deben devolver el mismo hash. La inversa no es obligatoria: dos objetos distintos pueden compartirlo, una **colisión**.

Pensá un archivador donde el hash elige un cajón. Dos fichas de la misma persona deben ir al mismo cajón para que se comparen. En el mismo cajón puede haber fichas distintas y hay que verificar igualdad para distinguirlas. Ese modelo explica por qué el hash ayuda sin reemplazar equals.

## Mantener juntos los dos contratos

Si equals usa codigo y hashCode usa precio, dos P01 con precios distintos pueden ser iguales y quedar distribuidos de manera incompatible. Usar codigo.hashCode para ambos P01 conserva la regla. Para varios campos, Objects.hash puede combinarlos, siempre que sean los mismos datos relevantes definidos por equals.

El fragmento inferior usa Producto de [06.03](CLASE_03.md), colocado fuera de main. Cada println comprueba una cosa: equivalencia y consecuencia del hash. No anticipes un valor hash como identificador de negocio: lo que importa es la relación de resultados, no su número particular.

Si modificás la clave después de insertar en una colección hash, la búsqueda puede calcular otra ubicación y dejar de encontrar el elemento. No es que haya desaparecido físicamente: cambió el criterio usado para localizarlo. Usá claves estables, o retiralo y volvé a insertarlo siguiendo la política de la colección cuando el modelo permita cambios.

## Ejemplo de la clase

```java
// Usando Producto final de la clase anterior:
Producto a = new Producto("P01");
Producto b = new Producto("P01");
System.out.println(a.equals(b));
System.out.println(a.hashCode() == b.hashCode());
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Ambas líneas muestran true. La segunda es una consecuencia de la regla correcta, pero el mismo hash por sí solo no demuestra que sean iguales. La colección decide igualdad usando equals, además de su organización por hash.

## Cambiar una decisión y explorar un límite

Una implementación que siempre retorne 1 respeta igual→igual hash, pero concentra todo y puede volver ineficientes búsquedas. Una que dé distinto hash a objetos iguales incumple el contrato. Son limitaciones distintas: rendimiento y corrección.

## Confusión que conviene evitar

Creer que hashes distintos son el único caso importante y que no pueden existir colisiones.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_03.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_05.md)
