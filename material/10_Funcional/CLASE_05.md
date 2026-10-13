# Clase 10.05 · filter, map y sorted

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_04.md) · [Clase siguiente](../10_Funcional/CLASE_06.md)

## Saber qué valor pasa a la siguiente etapa

filter deja pasar elementos que cumplen un predicado y mantiene su tipo. map transforma cada uno y puede cambiar el tipo. sorted reorganiza según un comparador. Dibujar el tipo entre etapas ayuda a saber qué propiedades siguen disponibles.

El ejemplo define Producto como record, enseñado en [08.05](../08_Lombok_DTO/CLASE_05.md). stock(), precio() y nombre() son accesores generados. Poné el record fuera de main y las operaciones dentro, con nombres completos de List y Comparator o imports.

## Leer la cadena según el problema

Primero llegan Producto. filter verifica stock>0 y excluye Lapicera agotada. sorted ordena productos por precio. map transforma cada producto en su String nombre. toList termina y produce [Cuaderno]. Después de map, una operación precio() ya no tiene receptor Producto: el tipo cambió.

Si el problema pide nombres de disponibles menores a 1500, ambos filtros de producto deben preceder a map de nombre. Ordenar por precio antes de transformar conserva la información que se necesita. Ordenar los nombres después responde otra pregunta, alfabética, no por precio.

Las cadenas convienen cuando describen con claridad una consulta. Un bucle puede ser más directo si hay decisiones con estados complejos; no se evalúa profundidad por cantidad de métodos encadenados. Una función de callback que muta productos compartidos puede cambiar la fuente aunque map cree una salida distinta: el método no convierte automáticamente el comportamiento en puro.

## Ejemplo de la clase

```java
record Producto(String nombre, int precio, int stock) {}
var productos = java.util.List.of(new Producto("Cuaderno",2000,3), new Producto("Lapicera",800,0));
var nombres = productos.stream()
    .filter(p -> p.stock() > 0)
    .sorted(java.util.Comparator.comparingInt(Producto::precio))
    .map(Producto::nombre)
    .toList();
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Hasta sorted, los elementos son Producto. Después de map son String. El resultado es [Cuaderno], porque Lapicera estaba agotada. La ordenación usa int del ejemplo didáctico; el criterio debe reflejar la unidad del precio.

## Cambiar una decisión y explorar un límite

Agregá un disponible barato: aparece en la selección. Cambiá map antes del filtro de stock: ya tendrías Strings y no podrías llamar stock(). Si la selección queda vacía, la terminal devuelve [], un resultado válido.

## Confusión que conviene evitar

Llamar precio() después de transformar cada producto a String.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_04.md) · [Clase siguiente](../10_Funcional/CLASE_06.md)
