# Clase 15.04 · Recorrido del proyecto de facturación descomprimido

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_03.md) · [Clase siguiente](../15_Integracion/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **recorrido del proyecto de facturación descomprimido**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El ZIP de frontend del campus contiene AppNodeJS con public, src y dependencias. public aporta HTML y src código TypeScript. facturaVentaApi.ts centraliza fetch; facturaVentaDTO.ts define tipos; factura-form.ts y facturas.ts conectan pantallas. El backend contable tiene controllers, servicios y entidades.

No hace falta leer miles de archivos de node_modules para comprender la aplicación. Seguí un flujo concreto y la configuración declarada. No ejecutes a ciegas el proyecto contra una base desconocida: primero revisá conexiones y usá copias locales para practicar.

## Ejemplo

```text
public/index.html
  ↓
src/facturas.ts
  ↓
src/facturaVentaApi.ts: obtenerFacturas
  ↓ GET /api/facturas
FacturaVentaController.java
  ↓
FacturaVentaService.java
```

[Abrir el fragmento como archivo](fragmentos/clase_04.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

El archivo de API revisado utiliza localhost:8080/api/facturas. El controller expone operaciones sobre esa ruta. Que coincidan rutas no garantiza que todos los DTO sean idénticos a la consigna nueva: compará también los campos y si el identificador representa id o numeroFactura.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Buscá obtenerFacturas y getFacturasVenta en las copias originales y anotá filtros recibidos y usados.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Confundir número de factura de negocio con id técnico al actualizar o borrar.

## Resumen para repasar

El ZIP de frontend del campus contiene AppNodeJS con public, src y dependencias. public aporta HTML y src código TypeScript.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_03.md) · [Clase siguiente](../15_Integracion/CLASE_05.md)
