# Clase 06.02 · toString y representación legible

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_01.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **tostring y representación legible**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

toString devuelve una representación textual de un objeto. Sirve al imprimir, depurar o construir mensajes. No es necesariamente un formato estable de intercambio: para comunicar datos usaremos DTO y JSON. Una representación útil incluye los campos que ayudan a reconocer el objeto.

No incluyas por defecto secretos ni relaciones completas recursivas. Si A imprime B y B imprime A, puede haber recursión infinita. @Override asegura la firma correcta: public String toString() sin parámetros.

## Ejemplo

```java
class Producto {
    private final String codigo;
    Producto(String codigo) { this.codigo = codigo; }
    @Override public String toString() {
        return "Producto{codigo='" + codigo + "'}";
    }
}
// En main: System.out.println(new Producto("P01"));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Usá las clases definidas en esta lección o en la anterior. El programa completo de igualdad permite verificar los contratos.

## Leamos el ejemplo paso a paso

println utiliza toString y muestra Producto{codigo='P01'}. El nombre de la clase y código hacen reconocible el objeto. Si agregamos precio, podemos decidir incluirlo; esa decisión no cambia su regla de igualdad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí toString para Cliente con código y nombre; justificá qué datos excluirías.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Esperar que toString produzca JSON correcto o sirva como base de datos.

## Resumen para repasar

toString devuelve una representación textual de un objeto. Sirve al imprimir, depurar o construir mensajes.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **06.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_01.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_03.md)
