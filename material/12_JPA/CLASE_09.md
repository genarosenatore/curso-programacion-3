# Clase 12.09 · Prácticas de JPA y modelo FacturaArca

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_08.md) · [Clase siguiente](../13_JPQL/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **prácticas de jpa y modelo facturaarca**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

FacturaArca amplía el modelo con cliente, condición de IVA, punto de venta, moneda, artículos y detalles. Vamos a trasladar el diagrama y las reglas a entidades antes de realizar consultas avanzadas. El objetivo es justificar cada relación, no agregar anotaciones hasta que desaparezcan errores.

La práctica requiere datos de prueba pequeños y una comprobación después de recuperar desde otro contexto. Ver el objeto en memoria no demuestra que se haya persistido correctamente. Usá una base local reconstruible y revisá el SQL generado.

## Ejemplo

```text
// Recorrido de creación:
// 1. Buscar relaciones obligatorias por id.
// 2. Construir Factura y sus Detalle.
// 3. Asignar factura en cada detalle.
// 4. Persistir y confirmar.
// 5. Consultar desde un contexto posterior y comparar.
```

[Abrir el fragmento como archivo](fragmentos/clase_09.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Estos fragmentos requieren un proyecto JPA configurado y las entidades mencionadas. El proyecto de apoyo está enlazado en la guía de ejecución; para FacturaVenta usá el modelo del campus mapeado según su consigna.

## Leamos el ejemplo paso a paso

El fragmento expresa una estrategia y no un modelo completo. Las entidades del campus están en el proyecto contable descomprimido. Consultá sus atributos para adaptar nombres. Primero practicá con Producto/Categoria del proyecto ejecutable de apoyo y después ampliá a la consigna.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Armá una tabla de relaciones de FacturaArca con cardinalidad, propietario, columna y regla de borrado.

Abrí [los ejercicios y las pistas](EJERCICIOS_09.md). Las [soluciones explicadas](SOLUCIONES_09.md) están preparadas para consultar después de intentarlo.

## Error común

Dar por terminado el mapeo sin guardar, recuperar y comparar las relaciones.

## Resumen para repasar

FacturaArca amplía el modelo con cliente, condición de IVA, punto de venta, moneda, artículos y detalles. Vamos a trasladar el diagrama y las reglas a entidades antes de realizar consultas avanzadas.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **12.09** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_08.md) · [Clase siguiente](../13_JPQL/CLASE_01.md)
