# Clase 14.08 · DTO de entrada y salida; validación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **dto de entrada y salida; validación**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un DTO de entrada define qué aceptamos. Bean Validation permite restricciones como @NotBlank, @PositiveOrZero y @NotNull. @Valid activa validación del request en el controller; tener la anotación en el campo sin activación no garantiza el control en todo camino.

Las reglas de existencia y negocio necesitan el servicio: un id válido numéricamente puede no existir y un stock podría cambiar. El DTO de salida puede añadir id y omitir datos internos. Mantenerlos separados evita permitir al cliente asignar ids generados o campos de auditoría.

## Ejemplo

```java
record ProductoRequest(
    @jakarta.validation.constraints.NotBlank String nombre,
    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.PositiveOrZero java.math.BigDecimal precio,
    @jakarta.validation.constraints.Min(0) int stock) {}

// En el controller: crear(@Valid @RequestBody ProductoRequest entrada)
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

NotBlank rechaza null y texto en blanco para nombre. NotNull y PositiveOrZero trabajan juntas para precio porque las restricciones numéricas pueden aceptar null por sí solas. int no admite null; según el contrato, un Integer con NotNull permite distinguir campo ausente de cero.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué reglas del request no cubren que un producto exista o tenga stock suficiente al vender.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que @Valid convierte toda operación de negocio en segura sin implementar sus reglas.

## Resumen para repasar

Un DTO de entrada define qué aceptamos. Bean Validation permite restricciones como @NotBlank, @PositiveOrZero y @NotNull.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_09.md)
