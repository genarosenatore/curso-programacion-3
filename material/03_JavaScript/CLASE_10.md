# Clase 03.10 · JSON, localStorage y sessionStorage

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_11.md)

## Qué vas a aprender

Vamos a trabajar **json, localstorage y sessionstorage**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

JSON es una representación textual de datos con objetos, arrays y valores simples. JSON.stringify convierte datos a texto y JSON.parse interpreta ese texto. No conserva funciones ni todos los tipos especiales de JavaScript.

localStorage guarda pares clave/texto para un origen y puede conservarlos entre sesiones. sessionStorage está asociado al origen y sesión de pestaña. Leer una clave inexistente devuelve null. Ambos almacenan texto, por eso serializamos arrays. Guardar en el navegador no equivale a guardar en una base de datos del servidor.

## Ejemplo

```javascript
const carrito = [{ id: 1, cantidad: 2 }];
localStorage.setItem("carrito", JSON.stringify(carrito));
const texto = localStorage.getItem("carrito");
const recuperado = texto ? JSON.parse(texto) : [];
console.log(recuperado);
```

[Abrir el fragmento como archivo](fragmentos/clase_10.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

El texto almacenado representa el array. Al recuperarlo, parse reconstruye datos, no instancias ni métodos originales. Un texto alterado puede fallar al parsear: en una aplicación real se usa try/catch y se valida la forma de los datos. Estas APIs se usan desde una página del mismo origen; trabajar desde un servidor local evita limitaciones del protocolo file.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Guardá una preferencia de tema y recuperala usando claro cuando no exista.

Abrí [los ejercicios y las pistas](EJERCICIOS_10.md). Las [soluciones explicadas](SOLUCIONES_10.md) están preparadas para consultar después de intentarlo.

## Error común

Confiar en localStorage como prueba de permisos o como almacenamiento seguro de contraseñas.

## Resumen para repasar

JSON es una representación textual de datos con objetos, arrays y valores simples. JSON.stringify convierte datos a texto y JSON.parse interpreta ese texto.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.10** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_11.md)
