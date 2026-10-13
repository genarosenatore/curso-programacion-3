# Clase 02.02 · Cascada, herencia y especificidad

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_01.md) · [Clase siguiente](../02_CSS/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **cascada, herencia y especificidad**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

La cascada decide qué declaración se aplica cuando varias compiten. Para reglas normales de la misma procedencia y capa, importa la especificidad y, si empatan, el orden. Un selector de id es más específico que uno de clase y este más que una etiqueta. También existen origen, importancia y capas; aquí trabajamos con un único archivo sin capas.

La herencia transmite algunas propiedades, como color, del padre al hijo cuando el hijo no tiene otra definición. Propiedades como margin no se heredan automáticamente. Las herramientas de desarrollo permiten ver qué reglas están activas o tachadas.

## Ejemplo

```css
body { color: #333; }
p { color: green; }
.aviso { color: blue; }
.aviso { color: red; }
```

[Abrir el fragmento como archivo](fragmentos/clase_02.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

Un p con class="aviso" queda rojo: las dos reglas de clase superan a p y la última desempata. Un párrafo sin clase queda verde. Un elemento sin color definido puede heredar el del body. Cambiar el orden solo resuelve empates entre reglas comparables; no supera por sí solo una especificidad mayor.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Predecí el color de <p id="mensaje" class="aviso">Hola</p> si añadís #mensaje { color: purple; }.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Usar !important ante cualquier conflicto sin investigar qué regla está ganando.

## Resumen para repasar

La cascada decide qué declaración se aplica cuando varias compiten. Para reglas normales de la misma procedencia y capa, importa la especificidad y, si empatan, el orden.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_01.md) · [Clase siguiente](../02_CSS/CLASE_03.md)
