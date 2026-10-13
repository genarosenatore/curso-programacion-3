# Clase 02.03 · Colores, texto, unidades y medidas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_02.md) · [Clase siguiente](../02_CSS/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **colores, texto, unidades y medidas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

CSS admite distintas formas de expresar colores y tamaños. px es una unidad de referencia CSS; rem depende del tamaño de fuente raíz; em puede depender del tamaño de fuente del elemento o su contexto según la propiedad; % depende de la dimensión de referencia de cada propiedad. No significan lo mismo en todos los usos.

Una familia de fuentes incluye alternativas por si una no está disponible. line-height separa líneas y mejora lectura. Un valor sin unidad, como 1.5, se adapta al tamaño del texto. Probá el zoom del navegador para comprobar que el contenido siga siendo legible.

## Ejemplo

```css
body { font-family: Arial, sans-serif; font-size: 1rem; line-height: 1.5; }
h1 { font-size: 2rem; color: #075985; }
.contenido { width: 90%; max-width: 60rem; }
```

[Abrir el fragmento como archivo](fragmentos/clase_03.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

El título tiene el doble del tamaño raíz. contenido ocupa 90 % del espacio de referencia, pero no supera 60rem. max-width permite poner un límite sin fijar siempre el ancho. El navegador suele partir de 16px, aunque la persona puede cambiarlo; por eso conviene pensar en proporciones.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Elegí un tamaño para título, texto y ancho de lectura que sigan funcionando con zoom al 200 %.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Suponer que 100 % equivale siempre al ancho de toda la pantalla.

## Resumen para repasar

CSS admite distintas formas de expresar colores y tamaños. px es una unidad de referencia CSS; rem depende del tamaño de fuente raíz; em puede depender del tamaño de fuente del elemento o su contexto según la propiedad; % depende de la dimensión de referencia de cada propiedad.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_02.md) · [Clase siguiente](../02_CSS/CLASE_04.md)
