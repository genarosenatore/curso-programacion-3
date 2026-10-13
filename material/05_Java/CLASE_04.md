# Clase 05.04 · Clases, objetos, atributos y constructores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_03.md) · [Clase siguiente](../05_Java/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **clases, objetos, atributos y constructores**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una clase define atributos y comportamiento; un objeto es una instancia concreta. El constructor inicializa una instancia y tiene el mismo nombre de la clase sin tipo de retorno. new crea el objeto. this permite distinguir el atributo del parámetro cuando comparten nombre.

Cada objeto tiene su estado. Dos productos pueden compartir la clase pero tener precios distintos. Un atributo de instancia pertenece a cada objeto; veremos static por separado porque pertenece a la clase. El constructor es una oportunidad para establecer reglas iniciales válidas.

## Ejemplo

```java
class Producto {
    String nombre;
    int precioCentavos;
    Producto(String nombre, int precioCentavos) {
        this.nombre = nombre;
        this.precioCentavos = precioCentavos;
    }
}
// En main: Producto p = new Producto("Cuaderno", 200000);
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

p referencia una instancia de Producto. this.nombre recibe el parámetro nombre. Otro new construye otro objeto con su propio estado. Usamos centavos para que el importe del ejemplo sea entero; 200000 centavos representan 2000 unidades monetarias.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá dos productos y explicá qué comparten y qué puede ser diferente.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Agregar void al constructor y convertirlo accidentalmente en un método.

## Resumen para repasar

Una clase define atributos y comportamiento; un objeto es una instancia concreta. El constructor inicializa una instancia y tiene el mismo nombre de la clase sin tipo de retorno.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_03.md) · [Clase siguiente](../05_Java/CLASE_05.md)
