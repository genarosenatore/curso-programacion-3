# Clase 10.05 · filter, map y sorted

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_04.md) · [Clase siguiente](../10_Funcional/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **filter, map y sorted**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

filter selecciona manteniendo el tipo de elementos; map transforma y puede cambiarlo; sorted ordena mediante un criterio. El orden de operaciones define lo que llega a cada paso. Después de map a nombres, ya no tenemos productos para consultar su stock.

Antes de escribir la cadena, dibujá el tipo a la salida de cada operación. Esto vuelve claros muchos errores de compilación. Filtrar temprano puede reducir trabajo, pero solo si conserva el significado de la consulta.

## Ejemplo

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

Las interfaces y records se declaran a nivel de clase; las operaciones del stream se ejecutan dentro de main. Se entrega un programa completo de práctica.

## Leamos el ejemplo paso a paso

Hasta sorted, los elementos son Producto. Después de map son String. El resultado es [Cuaderno], porque Lapicera estaba agotada. La ordenación usa int del ejemplo didáctico; el criterio debe reflejar la unidad del precio.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Obtené nombres en mayúsculas de productos disponibles cuyo precio sea menor a 1500.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Llamar precio() después de transformar cada producto a String.

## Resumen para repasar

filter selecciona manteniendo el tipo de elementos; map transforma y puede cambiarlo; sorted ordena mediante un criterio. El orden de operaciones define lo que llega a cada paso.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **10.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_04.md) · [Clase siguiente](../10_Funcional/CLASE_06.md)
