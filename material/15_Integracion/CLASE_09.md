# Clase 15.09 · Verificación de requisitos y explicación del proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_08.md)

## Demostrar comportamiento a partir de requisitos

Una matriz de revisión conecta requisito, implementación, caso de prueba, esperado, observado y evidencia. Evita marcar «carrito» completo solo por tener carrito.ts. La pregunta es qué comportamiento pide y cómo se demuestra.

Para agregar al carrito, el requisito incluye combinar repetidos y conservar estado al rechazar exceso. La prueba usa stock3: agregar2, intentar otras2, comprobar que conserva2. Recargar comprueba almacenamiento bajo su contrato, no stock del servidor. El resultado esperado proviene de la regla, no de lo que el código casualmente mostró.

## Revisar normal, vacío y fallo

Catálogo: carga normal, [], red fallida. Detalle: existente, ausente y agotado. Carrito: repetir, exceder, quitar último y JSON roto. Pedido: referencias válidas e inválidas, cálculo confirmado y error sin escritura parcial. HTTP:201 con identidad,204 sin JSON y400/404 con mensaje. Elige casos por riesgos reales y no una lista de cien pruebas que repiten lo mismo.

El README debe indicar herramientas, carpetas desde donde ejecutar, comandos, URLs, datos iniciales y límites. Una defensa del proyecto puede seguir una petición completa y justificar tipo, unidad, relación, validación y transacción. Preguntas de comprensión piden explicar un cambio o un caso límite; recordar el nombre de una anotación no demuestra ese recorrido.

Utiliza los ejemplos de [EJEMPLOS.md](../EJEMPLOS.md) y realiza prácticas en tus archivos; consulta en el chat con clase, código y esperado/obtenido. Los cuestionarios de unidad comprueban conceptos enseñados y su corrección explica alternativas, pero no califican tu programa automáticamente ni reemplazan evaluación oficial.

Compara la matriz final con la consigna completa del campus antes de una entrega. El laboratorio de apoyo enseña mecanismos y tiene límites explícitos; no afirma ser Food Store o FacturaArca completos. Si una clase o un proyecto todavía requiere adivinar un paso, regístralo como pendiente y vuelve al fundamento que lo explica.

## Ejemplo de la clase

```text
Requisito: agregar al carrito
Implementación: función de carrito + evento del botón
Prueba: mismo producto dos veces, stock insuficiente y persistencia tras recargar
Resultado esperado: cantidades coherentes y error visible sin perder el carrito
```

[Abrir el fragmento como archivo](fragmentos/clase_09.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La prueba se diseña a partir del requisito y no de lo que casualmente hizo el código. El inventario de clase y los ejercicios permiten completar un registro de avance. Los ejemplos de apoyo comprueban conceptos; la matriz final se compara con toda la consigna Food Store o facturación, no solo con sus capturas.

## Cambiar una decisión y explorar un límite

Una captura de carrito con total correcto no prueba exceso ni recuperación. Un archivo de test que espera lo que el programa devuelve sin justificar la regla repite el error. Cada evidencia necesita un resultado previsto independiente.

## Confusión que conviene evitar

Declarar completado un requisito solo porque existe un archivo o un botón con ese nombre.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_08.md)
