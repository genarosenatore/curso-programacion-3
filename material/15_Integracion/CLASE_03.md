# Clase 15.03 · Estados de carga, error, resultado y CORS

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_02.md) · [Clase siguiente](../15_Integracion/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **estados de carga, error, resultado y cors**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La pantalla necesita estados reconocibles: cargando, resultado, vacío y error. Un botón puede quedar deshabilitado durante una escritura para evitar dobles clics accidentales; al terminar debe volver a su estado mediante finally. Eso no sustituye una política del backend para duplicados.

CORS controla qué orígenes puede leer el navegador mediante peticiones cruzadas. Origen combina esquema, host y puerto: localhost:5173 y localhost:8080 son distintos. CORS no es autenticación. Servir el frontend desde el mismo proyecto de práctica evita esa diferencia inicial.

## Ejemplo

```javascript
async function cargar() {
  estado.textContent = "Cargando...";
  try {
    const respuesta = await fetch("/api/productos");
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);
    const datos = await respuesta.json();
    render(datos);
    estado.textContent = datos.length ? "" : "Sin productos";
  } catch {
    estado.textContent = "No se pudo cargar. Intentá nuevamente.";
  }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_03.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos muestran piezas de integración. La guía de ejecución enlaza la tienda local y la API de productos de apoyo; las clases distinguen esos proyectos del sistema completo del campus.

## Leamos el ejemplo paso a paso

estado y render se definen en la página completa. La URL relativa apunta al mismo origen. Si movés el frontend a Vite, definí un proxy o configuración de CORS coherente y restringida al origen de práctica. Un 404 por ruta mal escrita no se corrige concediendo todos los orígenes.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá cómo restaurar un botón después de POST tanto si funciona como si falla.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Desactivar permanentemente un botón al olvidar manejar el caso de error.

## Resumen para repasar

La pantalla necesita estados reconocibles: cargando, resultado, vacío y error. Un botón puede quedar deshabilitado durante una escritura para evitar dobles clics accidentales; al terminar debe volver a su estado mediante finally.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **15.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_02.md) · [Clase siguiente](../15_Integracion/CLASE_04.md)
