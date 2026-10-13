# Clase 02.01 · Conectar CSS y usar selectores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **conectar css y usar selectores**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una regla CSS tiene un selector y declaraciones. El selector elige elementos; cada declaración asigna un valor a una propiedad. El archivo externo se conecta desde head mediante link. Un selector de etiqueta afecta todas sus coincidencias; una clase permite agrupar elementos sin depender de su etiqueta.

Una misma página puede usar varias clases en un elemento. El punto pertenece al selector CSS, no al valor del atributo class. Los comentarios de CSS usan /* ... */. Es más fácil mantener reglas agrupadas por componente que repetir estilos dentro de cada etiqueta.

## Ejemplo

```css
/* estilos.css */
p { color: #333; }
.destacado { color: #075985; font-weight: bold; }

/* En HTML: <link rel="stylesheet" href="estilos.css"> */
/* En HTML: <p class="destacado">Oferta</p> */
```

[Abrir el fragmento como archivo](fragmentos/clase_01.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

La regla p selecciona párrafos. .destacado selecciona la clase destacado. El link busca estilos.css junto al HTML. Al recargar, Oferta aparece con color azul y texto en negrita. Si no cambia, revisá primero la ruta del archivo y después el selector con las herramientas del navegador.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Aplicá una clase aviso a dos párrafos con fondo amarillo y texto oscuro.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Escribir class=".aviso": el punto solo va en el selector CSS.

## Resumen para repasar

Una regla CSS tiene un selector y declaraciones. El selector elige elementos; cada declaración asigna un valor a una propiedad.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_02.md)
