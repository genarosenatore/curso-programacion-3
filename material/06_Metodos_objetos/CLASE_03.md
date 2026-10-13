# Clase 06.03 · equals y su contrato

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_02.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **equals y su contrato**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El contrato de equals exige reflexividad, simetría, transitividad y consistencia mientras los datos relevantes no cambien. Un objeto no nulo debe devolver false al compararse con null. Una implementación por código estable necesita comprobar tipo y manejar su propia regla de nulos.

Usaremos una clase final para que no existan subclases con otra regla que rompan simetría. El código se valida no nulo en el constructor. Para clases con herencia, la decisión de tipos requiere más cuidado que copiar una receta.

## Ejemplo

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

Usá las clases definidas en esta lección o en la anterior. El programa completo de igualdad permite verificar los contratos.

## Leamos el ejemplo paso a paso

La primera condición reconoce la misma referencia. instanceof descarta null y otros tipos, y da una variable del tipo comprobado. La última línea aplica la regla del código. hashCode se implementa junto a equals porque deberán trabajar juntos en colecciones.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Probá reflexividad, simetría y diferencia con tres productos de códigos P01, P01 y P02.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Sobrecargar equals(Producto) en lugar de sobrescribir equals(Object).

## Resumen para repasar

El contrato de equals exige reflexividad, simetría, transitividad y consistencia mientras los datos relevantes no cambien. Un objeto no nulo debe devolver false al compararse con null.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **06.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_02.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_04.md)
