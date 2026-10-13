# Clase 09.03 · Prácticas de genéricos del campus

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_02.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_04.md)

## Una capacidad genérica con ausencia explícita

Un contenedor que guarda y recupera el mismo tipo es una relación útil. `Contenedor<T>` declara guardar(T) y obtener() de T; ContenedorSimple<T> implementa ambos. La interfaz separa capacidad de implementación, como en [05.08](../05_Java/CLASE_08.md), y el genérico conserva información que Object borraría al usarlo.

El campo valor no tiene contenido asignado antes de guardar. Como es referencia, comienza null. Llamar obtener y luego length sin comprobar puede fallar, aunque el compilador sepa String. Los tipos Java ordinarios no prohíben automáticamente null.

## Definir qué significa reemplazar

La primera guardar("Ana") cambia null a Ana. Otra guardar("Luis") reemplaza el contenido. No crea una lista ni conserva historia. Si necesitás varias entradas, el contrato es otra estructura. Decidí también si guardar(null) se permite: si lo rechazás, validá antes de modificar para conservar el dato anterior.

Poné interfaz y clase fuera de main; construí Contenedor<String> c=new ContenedorSimple<>(), consultá antes, guardá y consultá después. El método implementado debe ser public por la interfaz. Para practicar ausencia explícita se podría devolver Optional<T>, un contenedor de resultado presente o ausente que desarrollaremos en [10.07](../10_Funcional/CLASE_07.md); no hace falta adelantar su API para esta versión nullable.

Estas prácticas son apoyo para las consignas genéricas del campus. El contenedor no implica base de datos, concurrencia ni persistencia al cerrar el programa. No agregues esas responsabilidades para demostrar un parámetro de tipo.

## Ejemplo de la clase

```java
interface Contenedor<T> { void guardar(T valor); T obtener(); }
class ContenedorSimple<T> implements Contenedor<T> {
    private T valor;
    public void guardar(T valor) { this.valor = valor; }
    public T obtener() { return valor; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Los métodos son públicos por el contrato de interface. Antes de guardar, obtener devuelve null porque valor es una referencia sin asignación inicial. Esa ausencia debe documentarse o modelarse con Optional. Después de guardar, recuperar mantiene el mismo tipo.

## Cambiar una decisión y explorar un límite

Guardá un Integer en Contenedor<String>: debe fallar al compilar. Guardá otro String: reemplaza. Si recibir null es válido, el mismo tipo de retorno no distingue nunca guardado de borrado por null; el contrato debe reconocer esa ambigüedad.

## Confusión que conviene evitar

Dar por existente el contenido antes de guardarlo y provocar null.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_02.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_04.md)
