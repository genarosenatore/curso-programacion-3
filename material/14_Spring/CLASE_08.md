# Clase 14.08 · DTO de entrada y salida; validación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_09.md)

## Aceptar solo los campos definidos por la operación

@RequestBody indica leer y convertir el cuerpo JSON al DTO de entrada. Esa conversión necesita formato correcto; una propiedad textual donde se espera número puede fallar antes de las restricciones. @Valid solicita evaluar las anotaciones Bean Validation presentes. Sin activación, declararlas no garantiza ese control en cualquier llamada directa.

@NotBlank rechaza null, texto vacío y blancos. @NotNull exige presencia. @PositiveOrZero permite número cero o positivo y, por sí sola, puede admitir null; por eso se combina con NotNull para precio. @Min(0) establece mínimo. @Digits puede limitar precisión admitida sin decidir una política de redondeo del negocio.

## Presencia de un número

Un int no representa null. En ciertas conversiones un campo omitido puede tomar cero, impidiendo distinguir «no vino stock» de «vino stock0». Si esa diferencia importa, `Integer stock` con @NotNull y @Min(0) expresa ambos requisitos. El proyecto de apoyo ya utiliza ese envoltorio para exigir presencia; el ejemplo mínimo inferior se ajusta al mismo contrato.

La salida incorpora id generado; la entrada no permite elegirlo. Un DTO bien elegido reduce campos que se pueden alterar, pero todavía debe resolverse qué usuario puede realizar la operación. Formato, rango, existencia y autorización son capas de significado diferentes.

Para probar, inicia [el proyecto](../Ejemplos/spring/README.md) y envía JSON válido, nombre vacío, precio negativo y JSON roto desde el formulario o cliente de peticiones. Observá400 y mensaje en los casos definidos. El fragmento es una declaración de record y una firma ilustrativa, no main autónomo.

Un id positivo puede no existir; una cantidad validada puede superar el stock vigente; Bean Validation no consulta esos datos automáticamente. El servicio busca y aplica reglas antes de guardar, usando una transacción adecuada para el conjunto.

## Ejemplo de la clase

```java
record ProductoRequest(
    @jakarta.validation.constraints.NotBlank String nombre,
    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.PositiveOrZero java.math.BigDecimal precio,
    @jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(0) Integer stock) {}

// En el controller: crear(@Valid @RequestBody ProductoRequest entrada)
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

NotBlank rechaza null y texto en blanco para nombre. NotNull y PositiveOrZero trabajan juntas para precio porque las restricciones numéricas pueden aceptar null por sí solas. Integer con NotNull permite distinguir campo ausente de cero; Min comprueba su rango cuando hay valor.

## Cambiar una decisión y explorar un límite

Quitá NotNull de precio: una restricción de signo sola puede no impedir ausencia. Si un int omitido termina en0, Min(0) pasa; usar Integer requerido distingue esa situación. No presentes todas las anotaciones como la misma validación.

## Confusión que conviene evitar

Creer que @Valid convierte toda operación de negocio en segura sin implementar sus reglas.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_07.md) · [Clase siguiente](../14_Spring/CLASE_09.md)
