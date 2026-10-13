# Clase 08.05 · Records y datos de transporte

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_04.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_06.md)

## Datos de valor con menos repetición

Un record es una clase Java orientada a transportar un conjunto declarado de componentes. Genera constructor canónico, accesores, equals, hashCode y toString basados en ellos. Dos ProductoDTO con iguales componentes representan el mismo valor para su igualdad generada; eso no implica que toda entidad con estado cambiante deba ser un record.

Sus campos de componente son finales. No hay setter generado y `.nombre()` consulta. No puede extender otra clase ordinaria ni ser extendido como una jerarquía abierta, pero puede implementar interfaces. La estructura facilita expresar datos; no representa automáticamente una entidad persistente con todos los requisitos de JPA.

## Validar con constructor compacto

En `ProductoDTO { ... }` no se repiten parámetros: es el **constructor compacto**. El bloque verifica los componentes antes de su asignación implícita. nombre==null se prueba antes de nombre.isBlank usando cortocircuito; si falta o es vacío, lanza. precioCentavos<0 también rechaza. Después, el record conserva los componentes válidos.

Declará el record fuera de main y creá dos instancias válidas para imprimir y comparar. Probá una inválida dentro del try/catch aprendido en [05.09](../05_Java/CLASE_09.md). No todos los errores deben ocultarse: la práctica explica el mensaje y conserva la causa.

**Inmutabilidad superficial** significa que no podés reemplazar una referencia componente, pero su objeto puede cambiar. Una List mutable dentro de un record sigue admitiendo cambios desde otra referencia. `List.copyOf` crea una lista no modificable separada de la estructura original y rechaza null; si contiene objetos mutables, esos objetos siguen compartidos. Con String inmutable, ese caso simple es suficiente.

## Ejemplo de la clase

```java
record ProductoDTO(String nombre, int precioCentavos) {
    ProductoDTO {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        if (precioCentavos < 0) throw new IllegalArgumentException("Precio negativo");
    }
}
// new ProductoDTO("Cuaderno", 200000).nombre();
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

nombre() es el accesor generado, distinto del getNombre típico de un bean. La validación ocurre al construir. Dos records con los mismos componentes son iguales según la implementación generada. Eso sirve para valores, pero no necesariamente para identidad de entidad.

## Cambiar una decisión y explorar un límite

Creá un record con lista y agregá a la lista original: sin copia se observa el cambio desde el record. Con List.copyOf se conserva la colección inicial. Copiar la lista no vuelve inmutables los productos que pudiera contener.

## Confusión que conviene evitar

Suponer que final o un record inmoviliza recursivamente cualquier objeto referenciado.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_04.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_06.md)
