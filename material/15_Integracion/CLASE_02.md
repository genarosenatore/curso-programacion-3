# Clase 15.02 · Alinear interfaces TypeScript y DTO Java

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_01.md) · [Clase siguiente](../15_Integracion/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **alinear interfaces typescript y dto java**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El contrato entre frontend y backend debe coincidir en campos, tipos y significado. Un Long Java suele serializarse como número JSON, pero valores mayores que el entero seguro de JavaScript necesitan una política, como usar strings. Fechas requieren formato y zona acordados; decimal monetario necesita reglas de representación.

Una interface TypeScript documenta lo que esperamos. El backend no la lee automáticamente. Un adaptador transforma un contrato real a un modelo de pantalla si los nombres difieren. Separar esa transformación evita conversiones escondidas por toda la interfaz.

## Ejemplo

```typescript
// Respuesta del proyecto de productos:
interface ProductoDTO { id: number; nombre: string; precio: number; stock: number; }
interface ProductoRequest { nombre: string; precio: number; stock: number; }
// Un request no necesita el id generado; una respuesta sí lo incluye.
```

[Abrir el fragmento como archivo](fragmentos/clase_02.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

El modelo educativo usa ids pequeños y precios con dos decimales. El carrito local guarda centavos enteros y convierte al mostrar. La consigna contable usa otros DTO: compará sus nombres y tipos antes de reutilizar. Una propiedad descripcion no equivale automáticamente a nombre.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Compará un JSON con denominacion y una interface que usa nombre. Proponé una adaptación explícita.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Afirmar que Java y TypeScript tienen tipos idénticos para cualquier tamaño o formato.

## Resumen para repasar

El contrato entre frontend y backend debe coincidir en campos, tipos y significado. Un Long Java suele serializarse como número JSON, pero valores mayores que el entero seguro de JavaScript necesitan una política, como usar strings.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_01.md) · [Clase siguiente](../15_Integracion/CLASE_03.md)
