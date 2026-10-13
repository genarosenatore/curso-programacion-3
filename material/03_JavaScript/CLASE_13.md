# Clase 03.13 · Módulos y práctica integradora

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_12.md) · [Clase siguiente](../04_TypeScript/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **módulos y práctica integradora**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un módulo separa responsabilidades y puede exportar funciones para que otro las importe. Un script type="module" permite import/export en el navegador y se ejecuta con comportamiento de módulo. Los nombres y rutas deben coincidir; servir los archivos mediante HTTP evita restricciones al abrir módulos como file.

Para integrar, separá datos, cálculos y representación. Una función de cálculo no necesita tocar el DOM. La pantalla llama a esa función y muestra su resultado. Esto permite probar la lógica con entradas sencillas antes de investigar la interfaz.

## Ejemplo

```javascript
// calculos.js
export function subtotal(precio, cantidad) { return precio * cantidad; }

// app.js
import { subtotal } from "./calculos.js";
console.log(subtotal(800, 2));

// HTML: <script type="module" src="app.js"></script>
```

[Abrir el fragmento como archivo](fragmentos/clase_13.js) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los ejemplos de lógica pueden probarse en la consola. Los que usan document necesitan el HTML indicado y ejecutarse en el navegador, no en Node.js.

## Leamos el ejemplo paso a paso

calculos.js expone la función; app.js la importa mediante ruta relativa y muestra 1600. El HTML carga el archivo de entrada y el navegador resuelve sus imports. Mantener nombres distintos por responsabilidad ayuda a seguir qué archivo hace cada tarea.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Organizá un catálogo con datos, filtro por texto y render en módulos. Probá lista vacía y búsqueda sin coincidencias.

Abrí [los ejercicios y las pistas](EJERCICIOS_13.md). Las [soluciones explicadas](SOLUCIONES_13.md) están preparadas para consultar después de intentarlo.

## Error común

Acoplar el cálculo a un id de pantalla cuando puede ser una función pura.

## Resumen para repasar

Un módulo separa responsabilidades y puede exportar funciones para que otro las importe. Un script type="module" permite import/export en el navegador y se ejecuta con comportamiento de módulo.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **03.13** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../03_JavaScript/CLASE_12.md) · [Clase siguiente](../04_TypeScript/CLASE_01.md)
