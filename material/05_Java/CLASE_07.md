# Clase 05.07 · Herencia, composición y clases abstractas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_06.md) · [Clase siguiente](../05_Java/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **herencia, composición y clases abstractas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La herencia expresa una relación de tipo: una clase especializada extiende otra. La composición expresa que un objeto contiene o utiliza otro. Conviene elegir por el modelo y no solo para reutilizar líneas. Una clase abstracta no se instancia directamente y puede definir operaciones que las subclases deben implementar.

Un método sobrescrito ofrece una implementación especializada. @Override pide al compilador comprobar que realmente se está sobrescribiendo. Una relación "tiene un" suele ser composición; "es un" puede sugerir herencia, siempre que la sustitución conserve el contrato.

## Ejemplo

```java
abstract class MedioPago {
    abstract String descripcion();
}
class Efectivo extends MedioPago {
    @Override String descripcion() { return "Pago en efectivo"; }
}
class Pedido {
    private final MedioPago medio;
    Pedido(MedioPago medio) { this.medio = medio; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

Efectivo es un MedioPago. Pedido tiene un MedioPago mediante composición. Podemos agregar otro medio sin convertir Pedido en una subclase de cada opción. El campo final fija su referencia después del constructor, no garantiza que el objeto referenciado sea inmutable.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Decidí si Cliente y Domicilio deberían relacionarse por herencia o composición y justificá.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Construir jerarquías solo porque dos clases comparten algunos atributos.

## Resumen para repasar

La herencia expresa una relación de tipo: una clase especializada extiende otra. La composición expresa que un objeto contiene o utiliza otro.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_06.md) · [Clase siguiente](../05_Java/CLASE_08.md)
