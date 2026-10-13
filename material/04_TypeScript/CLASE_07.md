# Clase 04.07 · Vite, módulos y estructura de proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_06.md) · [Clase siguiente](../04_TypeScript/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **vite, módulos y estructura de proyecto**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Vite ofrece un servidor de desarrollo y una construcción para el navegador. Un proyecto tiene un punto de entrada HTML y módulos TypeScript que la herramienta procesa. npm run dev inicia el servidor; npm run build genera archivos para distribución; no son la misma operación.

tsconfig describe cómo comprobar TypeScript: strict aumenta comprobaciones, target se relaciona con la salida y lib con APIs conocidas por el compilador. Vite transforma TypeScript pero no garantiza por sí solo comprobar todos los tipos: agregamos tsc --noEmit al proceso de verificación.

## Ejemplo

```bash
npm create vite@latest mi-tienda -- --template vanilla-ts
cd mi-tienda
npm install
npm run dev
# En otra terminal, dentro del proyecto:
npx tsc --noEmit
```

[Abrir el fragmento como archivo](fragmentos/clase_07.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

El creador prepara una estructura vanilla-ts sin framework de interfaz. Entrá en la carpeta antes de instalar o ejecutar. Abrí la dirección local indicada por la terminal; el puerto puede variar si está ocupado. Conservá la consola del servidor mientras trabajás y detenelo con Ctrl+C cuando termines.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Identificá index.html, src y package.json. Explicá dónde se escribe el código y dónde se define dev.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Tratar la carpeta dist como el lugar principal para editar código.

## Resumen para repasar

Vite ofrece un servidor de desarrollo y una construcción para el navegador. Un proyecto tiene un punto de entrada HTML y módulos TypeScript que la herramienta procesa.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_06.md) · [Clase siguiente](../04_TypeScript/CLASE_08.md)
