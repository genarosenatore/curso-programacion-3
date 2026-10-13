# Clase 09.01 · Clases y métodos genéricos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_06.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_02.md)

## Relacionar el tipo guardado con el recuperado

Una Caja que almacena Object acepta cualquier referencia, pero al recuperar exige convertir a lo que creemos haber guardado. Si nos equivocamos, la conversión falla al ejecutar. Un **genérico** permite escribir una sola Caja y conservar esa relación al comprobar el código: Caja<String> entrega String y no acepta Integer.

`class Caja<T>` declara T como parámetro de tipo. T es un nombre convencional y podría ser otro. No es un dato recibido en el constructor ni una clase concreta que se crea con new T(). `private final T contenido` usa ese tipo para el campo y `T obtener()` para la salida. El argumento se decide al usar Caja<String>.

## Seguir definición, creación y llamada

Poné Caja como clase de paquete fuera de la clase pública de consola. Dentro de main construí Caja<String> caja=new Caja<>("Hola") y mostrá caja.obtener(). <> permite inferir String desde el contexto. El método `static <T> T identidad(T valor)` declara su propio parámetro antes del retorno: va como hermano de main. Llamar identidad(7) conserva Integer mediante boxing.

Los argumentos genéricos son tipos de referencia: Integer envuelve int, como vimos en [07.01](../07_Colecciones/CLASE_01.md). Caja<int> no es válido. Tampoco usar Caja sin argumento, un **tipo crudo**, conserva las garantías buscadas: puede generar avisos y conversiones peligrosas.

Java utiliza **borrado de tipos**: muchas relaciones genéricas se comprueban en compilación y se representan con límites borrados en el bytecode. Caja<String> y Caja<Integer> no son dos clases independientes consultables como tales con getClass. El genérico no valida JSON ni crea una política de ausencia: si permitís contenido null, obtener puede dar null aunque su tipo sea String.

## Ejemplo de la clase

```java
class Caja<T> {
    private final T contenido;
    Caja(T contenido) { this.contenido = contenido; }
    T obtener() { return contenido; }
}
static <T> T identidad(T valor) { return valor; }
// Caja<String> caja = new Caja<>("Hola");
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

obtener devuelve String cuando la variable es Caja<String>, sin una conversión manual. <> permite inferir el tipo de la construcción. El método identidad relaciona el tipo recibido con el devuelto. No usar Caja sin parámetro ayuda a evitar tipos crudos y errores ocultos.

## Cambiar una decisión y explorar un límite

Intentá Caja<String> caja=new Caja<>(7): el tipo de entrada es incompatible. Con Caja<Object> se admite el entero, pero obtener devuelve Object y ya no promete texto. La flexibilidad tiene el costo de perder ese contrato específico.

## Confusión que conviene evitar

Usar Object y conversiones por todas partes cuando un genérico expresa la relación.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_06.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_02.md)
