# Clase 05.10 · Paquetes, dependencias y estructura de proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_11.md)

## Qué vas a aprender

Vamos a trabajar **paquetes, dependencias y estructura de proyecto**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un paquete organiza clases y evita conflictos de nombres. La declaración package corresponde a su ubicación de código dentro del proyecto. import permite usar un tipo por su nombre corto. Una dependencia es código externo que el proyecto necesita.

Maven y Gradle describen dependencias y tareas de construcción. El archivo de configuración y el wrapper del proyecto ayudan a usar un entorno reproducible. Un IDE reconoce esa estructura; copiar solo una clase no copia sus dependencias. Para los ejemplos iniciales usamos Java sin librerías externas.

## Ejemplo

```java
// Archivo: src/tienda/Producto.java
package tienda;
public class Producto {
    public String nombre() { return "Cuaderno"; }
}
// En otra clase: import tienda.Producto;
```

[Abrir el fragmento como archivo](fragmentos/clase_10.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

La clase pública coincide con Producto.java. Si otra clase está en otro paquete, debe poder acceder al tipo y métodos necesarios. En proyectos Maven, la raíz de código suele ser src/main/java; dentro se ubica tienda/Producto.java. El prefijo de carpeta no forma parte del nombre del paquete.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Separá modelos Producto y Cliente en un paquete tienda.modelo y una clase de inicio en tienda.

Abrí [los ejercicios y las pistas](EJERCICIOS_10.md). Las [soluciones explicadas](SOLUCIONES_10.md) están preparadas para consultar después de intentarlo.

## Error común

Editar .class en lugar de .java o confundir una carpeta de compilados con código fuente.

## Resumen para repasar

Un paquete organiza clases y evita conflictos de nombres. La declaración package corresponde a su ubicación de código dentro del proyecto.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.10** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_11.md)
