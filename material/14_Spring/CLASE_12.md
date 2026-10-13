# Clase 14.12 · Práctica: CRUD de cursos y facturación

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_11.md) · [Clase siguiente](../15_Integracion/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: crud de cursos y facturación**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La práctica completa permite crear, listar, actualizar y borrar un producto, con validación, base en memoria y errores coherentes. Es una aplicación educativa que une capas y conceptos, no una solución completa de facturación o Food Store.

Para verificar, registrá petición, código, cuerpo y efecto en un GET posterior. Primero usá un dato válido; luego nombre vacío, precio negativo e id inexistente. Una API no está lista solo porque arranque: tiene que respetar sus reglas y devolver resultados comprensibles.

## Ejemplo

```text
Caso 1: POST válido → 201 y producto con id
Caso 2: GET del id → 200 y datos guardados
Caso 3: PUT del id → 200 y datos cambiados
Caso 4: DELETE del id → 204 sin cuerpo
Caso 5: GET del id borrado → 404
Caso 6: POST con nombre vacío → 400
```

[Abrir el fragmento como archivo](fragmentos/clase_12.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

Ejecutá el proyecto de apoyo siguiendo su README. Los comandos de prueba HTTP están en un archivo .http y también se describen en la guía. Cuando cierres y reinicies el proyecto, los datos de H2 se reconstruyen. Después trasladá estas ideas al CRUD de cursos y a la consigna de facturas.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá en qué capa ocurre cada paso del caso POST y dónde se calcula un importe de factura.

Abrí [los ejercicios y las pistas](EJERCICIOS_12.md). Las [soluciones explicadas](SOLUCIONES_12.md) están preparadas para consultar después de intentarlo.

## Error común

Tomar la confirmación visual de una pantalla como prueba suficiente de que el backend guardó los datos.

## Resumen para repasar

La práctica completa permite crear, listar, actualizar y borrar un producto, con validación, base en memoria y errores coherentes. Es una aplicación educativa que une capas y conceptos, no una solución completa de facturación o Food Store.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.12** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_11.md) · [Clase siguiente](../15_Integracion/CLASE_01.md)
