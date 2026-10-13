# Clase 02.10 · Práctica: tarjetas de productos y página adaptable

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: tarjetas de productos y página adaptable**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Para integrar CSS, partí del HTML de la unidad anterior y agregá diseño por capas: tipografía, caja, distribución y adaptación. La práctica de tarjetas de productos permite revisar todas esas decisiones. Una hoja corta y coherente se entiende mejor que reglas repetidas para arreglar cada pantalla.

Prepará una revisión: tamaño de lectura, alineación, separación, enlaces reconocibles y foco visible al navegar con Tab. El efecto hover no debe ser la única señal de interacción porque existen teclado y pantallas táctiles.

## Ejemplo

```css
.catalogo { display:grid; grid-template-columns:repeat(auto-fit,minmax(min(100%,14rem),1fr)); gap:1rem; }
.tarjeta { padding:1rem; border:1px solid #cbd5e1; border-radius:.5rem; }
a:focus-visible, button:focus-visible { outline:3px solid #075985; outline-offset:3px; }
```

[Abrir el fragmento como archivo](fragmentos/clase_10.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

El catálogo se adapta sin que cada tarjeta tenga coordenadas. El borde delimita los componentes y el foco muestra qué control está activo con teclado. Las reglas se aplican a elementos creados en HTML; CSS no reemplaza labels o encabezados.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Estilizá tres tarjetas con título, precio y enlace. Probá pantalla estrecha, zoom y navegación con Tab.

Abrí [los ejercicios y las pistas](EJERCICIOS_10.md). Las [soluciones explicadas](SOLUCIONES_10.md) están preparadas para consultar después de intentarlo.

## Error común

Evaluar solo una captura de pantalla y no comprobar la adaptación o navegación.

## Resumen para repasar

Para integrar CSS, partí del HTML de la unidad anterior y agregá diseño por capas: tipografía, caja, distribución y adaptación. La práctica de tarjetas de productos permite revisar todas esas decisiones.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.10** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_01.md)
