# Clase 11.07 · Transacciones: confirmar o revertir cambios

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_06.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **transacciones: confirmar o revertir cambios**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una transacción agrupa operaciones que deben confirmarse juntas. COMMIT conserva cambios; ROLLBACK los revierte. Atomicidad significa que no queda aplicada solo una parte de ese grupo. Por ejemplo, registrar cabecera y detalles de una factura debe conservar coherencia.

La transacción no convierte automáticamente una regla incorrecta en correcta. Hay que validar operaciones, restricciones y manejo de errores. El aislamiento y la concurrencia importan cuando otras operaciones actúan al mismo tiempo; empezaremos con una única conexión de prueba.

## Ejemplo

```sql
BEGIN;
UPDATE producto SET precio_centavos=210000 WHERE id=1;
SELECT precio_centavos FROM producto WHERE id=1;
ROLLBACK;
SELECT precio_centavos FROM producto WHERE id=1;
```

[Abrir el fragmento como archivo](fragmentos/clase_07.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

Dentro de la transacción se observa el valor nuevo en esa conexión. Después de ROLLBACK vuelve al valor anterior. Para conservarlo usaríamos COMMIT. La guía de ejecución SQL entrega un ejemplo con base en memoria para experimentar sin afectar datos externos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué debería pasar si se guarda una factura pero falla uno de sus detalles.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir una operación de múltiples sentencias con una transacción aunque no esté configurada.

## Resumen para repasar

Una transacción agrupa operaciones que deben confirmarse juntas. COMMIT conserva cambios; ROLLBACK los revierte.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_06.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_08.md)
