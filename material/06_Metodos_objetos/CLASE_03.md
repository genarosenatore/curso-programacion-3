# Clase 06.03 · equals y su contrato

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_02.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_04.md)

## Una igualdad que se pueda usar con confianza

equals debe cumplir **reflexividad** (a es igual a a), **simetría** (a igual a b implica b igual a a), **transitividad** (si a=b y b=c, a=c) y **consistencia** mientras no cambien los datos relevantes. Un objeto no nulo no es igual a null. Estas reglas permiten que búsquedas y deduplicación no cambien según el sentido de la llamada.

Usaremos una clase final: no puede extenderse y agregar otra definición de igualdad incompatible. El atributo codigo final mantiene su referencia; requireNonNull rechaza null al construir. Para String, su contenido es inmutable, así que esa clave es estable. Una clase que hereda estado necesita evaluar otra política, no copiar ciegamente este patrón.

## Leer cada salida anticipada

La firma debe recibir Object, el contrato heredado, para sobrescribirlo. `if(this == otro)` reconoce identidad y retorna true sin más trabajo. `instanceof Producto producto` verifica el tipo y crea una variable del tipo comprobado; null no cumple, así que vuelve false. Solo después compara los códigos con String.equals.

Poné la clase del ejemplo fuera de main. Dentro creá a, b y c con P01, P01 y P02 y mostrá las comparaciones. Usá @Override para detectar escribir equals(Producto) por accidente: eso sobrecarga otro método y no redefine la operación utilizada por el contrato de Object.

hashCode aparece implementado junto a equals porque igualdad y distribución de búsquedas tienen un contrato conjunto; lo explicaremos en 06.04. No hace falta entender una tabla hash para comprobar hoy cada comparación. Comparar precio además de código cambiaría qué significa «mismo producto»: decidilo antes de escribir.

## Ejemplo de la clase

```java
final class Producto {
    private final String codigo;
    Producto(String codigo) { this.codigo = java.util.Objects.requireNonNull(codigo); }
    @Override public boolean equals(Object otro) {
        if (this == otro) return true;
        if (!(otro instanceof Producto producto)) return false;
        return codigo.equals(producto.codigo);
    }
    @Override public int hashCode() { return codigo.hashCode(); }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La primera condición reconoce la misma referencia. instanceof descarta null y otros tipos, y da una variable del tipo comprobado. La última línea aplica la regla del código. hashCode se implementa junto a equals porque deberán trabajar juntos en colecciones.

## Cambiar una decisión y explorar un límite

Compará con un String "P01": debe dar false aunque el texto coincida con código, porque no es un Producto. Implementar igualdad por rangos «precios a distancia menor de diez» puede romper transitividad: 0 cercano a 8, 8 cercano a 16, pero 0 no cercano a 16.

## Confusión que conviene evitar

Sobrecargar equals(Producto) en lugar de sobrescribir equals(Object).

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_02.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_04.md)
