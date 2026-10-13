# Clase 08.05 · Records y datos de transporte

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_04.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **records y datos de transporte**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un record es una clase orientada a datos que genera constructor canónico, accesores y métodos de valor como equals, hashCode y toString. Sus componentes no se reasignan, pero la inmutabilidad es superficial: si un componente referencia una lista mutable, esa lista puede cambiar.

Un constructor compacto permite validar o preparar componentes. Records pueden servir como DTO, pero las entidades JPA ordinarias tienen requisitos distintos y no se reemplazan sin analizar el proveedor y el modelo.

## Ejemplo

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

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

nombre() es el accesor generado, distinto del getNombre típico de un bean. La validación ocurre al construir. Dos records con los mismos componentes son iguales según la implementación generada. Eso sirve para valores, pero no necesariamente para identidad de entidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá un record ListaDTO(List<String> nombres) que no conserve una lista mutable ajena.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que final o un record inmoviliza recursivamente cualquier objeto referenciado.

## Resumen para repasar

Un record es una clase orientada a datos que genera constructor canónico, accesores y métodos de valor como equals, hashCode y toString. Sus componentes no se reasignan, pero la inmutabilidad es superficial: si un componente referencia una lista mutable, esa lista puede cambiar.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_04.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_06.md)
