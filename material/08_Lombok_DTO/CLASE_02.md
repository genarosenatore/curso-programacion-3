# Clase 08.02 · Lombok: getters, setters, constructores y builder

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_01.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **lombok: getters, setters, constructores y builder**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

@Getter y @Setter generan accesores; @NoArgsConstructor un constructor sin argumentos; @AllArgsConstructor uno con campos; @RequiredArgsConstructor los requeridos según su definición. @Builder ofrece una forma de construcción mediante métodos encadenados.

@Data combina varias operaciones, entre ellas equals, hashCode y toString. En entidades con relaciones, esa combinación puede producir reglas de igualdad inadecuadas, recursión o cargas no buscadas. Preferiremos anotaciones explícitas y revisaremos qué código se genera. Un builder no obliga a llenar todos los campos por sí solo.

## Ejemplo

```java
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class ProductoVista {
    private String nombre;
    private int precioCentavos;
}
// ProductoVista.builder().nombre("Cuaderno").precioCentavos(200000).build();
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los records y clases son declaraciones; las llamadas se hacen dentro de main. Los fragmentos con Lombok requieren su dependencia y procesamiento de anotaciones.

## Leamos el ejemplo paso a paso

El builder encadena setters del constructor generado y build crea el objeto. @Getter permite leer después. Esto requiere Lombok configurado; no es Java estándar sin librerías. Si se omite nombre, el builder no garantiza un nombre válido. El diseño debe decidir cómo validar.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué diferencia hay entre @Getter y @Data para una entidad bidireccional.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Confiar en defaults de un builder como si fueran validaciones de datos obligatorios.

## Resumen para repasar

@Getter y @Setter generan accesores; @NoArgsConstructor un constructor sin argumentos; @AllArgsConstructor uno con campos; @RequiredArgsConstructor los requeridos según su definición. @Builder ofrece una forma de construcción mediante métodos encadenados.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **08.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_01.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_03.md)
