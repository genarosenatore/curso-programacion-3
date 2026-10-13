# Clase 02.08 · Media queries y diseño adaptable

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_09.md)

## Qué vas a aprender

Vamos a trabajar **media queries y diseño adaptable**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un diseño adaptable cambia su disposición según el espacio disponible. Una media query aplica reglas cuando se cumple una condición. Un enfoque desde pantallas pequeñas comienza por la disposición simple y añade columnas o navegación más amplia con min-width.

Elegí los puntos de cambio por el contenido, no por una lista fija de modelos de teléfono. Las imágenes pueden limitar su ancho con max-width:100% y mantener proporción con height:auto. El viewport del documento HTML es parte de este trabajo.

## Ejemplo

```css
.pagina { display: grid; grid-template-columns: 1fr; gap: 1rem; }
img { max-width: 100%; height: auto; }
@media (min-width: 48rem) {
  .pagina { grid-template-columns: 16rem 1fr; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_08.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

En pantallas pequeñas, la barra lateral y el contenido se apilan. Desde 48rem, se separan en dos columnas. La consulta agrega reglas; no borra automáticamente las previas. Revisá también la altura de contenido, el zoom y etiquetas largas.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Elegí un punto de cambio para un catálogo y explicá por qué. Probá un ancho justo por encima y por debajo.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Ocultar información necesaria en móvil para que el diseño parezca más limpio.

## Resumen para repasar

Un diseño adaptable cambia su disposición según el espacio disponible. Una media query aplica reglas cuando se cumple una condición.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_07.md) · [Clase siguiente](../02_CSS/CLASE_09.md)
