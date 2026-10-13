# Clase 02.04 · Modelo de caja: contenido, padding, border y margin

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_03.md) · [Clase siguiente](../02_CSS/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **modelo de caja: contenido, padding, border y margin**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Cada elemento tiene una caja: contenido, padding, border y margin. Padding crea espacio interior; margin separación exterior. Con box-sizing: content-box, width mide el contenido y el padding y borde se suman. Con border-box, width incluye contenido, padding y borde, pero no margin.

Comprender esa cuenta permite explicar por qué una tarjeta ocupa más que su width. Algunos márgenes verticales de bloques pueden colapsar entre sí; no siempre se suman. Para separar componentes en flex o grid, gap suele expresar mejor la intención.

## Ejemplo

```css
.tarjeta {
  box-sizing: border-box;
  width: 240px;
  padding: 16px;
  border: 2px solid #333;
  margin: 8px;
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

La caja de borde mide 240px. El contenido disponible mide 240 - 32 - 4 = 204px. El margen queda por fuera. Si cambiamos a content-box, el borde exterior mide 276px. Observá estas zonas en el panel de caja del navegador.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Calculá el ancho exterior con content-box para width 200px, padding 10px por lado y border 1px por lado. Luego explicá border-box.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Cambiar margin cuando lo que se necesita es separar el texto del borde interior.

## Resumen para repasar

Cada elemento tiene una caja: contenido, padding, border y margin. Padding crea espacio interior; margin separación exterior.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_03.md) · [Clase siguiente](../02_CSS/CLASE_05.md)
