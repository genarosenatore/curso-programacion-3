# Clase 05.08 · Interfaces y polimorfismo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_07.md) · [Clase siguiente](../05_Java/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **interfaces y polimorfismo**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una interface define un contrato de operaciones. Una clase puede implementarlo; una variable del tipo de la interface puede referenciar distintas implementaciones. Polimorfismo significa utilizar ese contrato mientras la implementación concreta define el comportamiento.

Un contrato incluye el significado, no solo la firma. Si una operación promete calcular envío, todas las implementaciones deben respetar las unidades y reglas acordadas. Separar el contrato de su implementación facilita reemplazar un cálculo de prueba por otro sin cambiar quien lo usa.

## Ejemplo

```java
interface Envio { int costoCentavos(); }
class Retiro implements Envio {
    public int costoCentavos() { return 0; }
}
class Domicilio implements Envio {
    public int costoCentavos() { return 50000; }
}
// En main: Envio envio = new Domicilio(); System.out.println(envio.costoCentavos());
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las declaraciones de clases y métodos van dentro o fuera de main según indica la explicación. Los fragmentos no son todos archivos autónomos; el ejemplo completo de la unidad muestra la estructura ejecutable.

## Leamos el ejemplo paso a paso

La variable envio se usa mediante el contrato y devuelve 50000. Si se construye Retiro, devuelve cero sin cambiar la llamada. Los métodos de implementación deben ser public porque los de la interface lo son en este caso. No se puede hacer new Envio() directamente con esta definición.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Agregá una implementación de envío express que devuelva 100000 centavos.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir muchos if por nombre de clase cuando el contrato puede resolver la variación.

## Resumen para repasar

Una interface define un contrato de operaciones. Una clase puede implementarlo; una variable del tipo de la interface puede referenciar distintas implementaciones.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **05.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_07.md) · [Clase siguiente](../05_Java/CLASE_09.md)
