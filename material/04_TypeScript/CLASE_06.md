# Clase 04.06 · Node.js, npm, package.json y scripts

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_05.md) · [Clase siguiente](../04_TypeScript/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **node.js, npm, package.json y scripts**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Node.js ejecuta JavaScript fuera del navegador. No proporciona document ni el DOM de una página. npm gestiona paquetes y scripts. package.json describe el proyecto y package-lock.json registra resoluciones de dependencias para reproducir instalaciones.

Una dependencia de desarrollo sirve para construir o comprobar, como TypeScript. Los comandos se ejecutan desde la carpeta del proyecto. Antes de instalar, comprobá la versión de Node y los requisitos de la herramienta elegida. La guía actual de Vite pide Node 20.19+ o 22.12+; el "14 o superior" de la consigna antigua no alcanza para Vite actual.

## Ejemplo

```bash
node --version
npm --version
npm init -y
npm install --save-dev typescript
npx tsc --version
```

[Abrir el fragmento como archivo](fragmentos/clase_06.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

init -y crea package.json aceptando valores iniciales. install registra TypeScript como herramienta de desarrollo y crea o actualiza el archivo de bloqueo. npx ejecuta el compilador disponible en el proyecto. Estos comandos corresponden a tu carpeta de práctica, no a las dependencias copiadas del campus.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué archivos del proyecto compartirías y por qué node_modules puede reconstruirse.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Esperar que document.querySelector funcione en Node como si hubiera una página abierta.

## Resumen para repasar

Node.js ejecuta JavaScript fuera del navegador. No proporciona document ni el DOM de una página.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_05.md) · [Clase siguiente](../04_TypeScript/CLASE_07.md)
