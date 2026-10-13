# Clase 01.05 · Tablas para datos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_06.md)

## Qué vas a aprender

Vamos a trabajar **tablas para datos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una tabla representa datos relacionados por filas y columnas. table contiene la estructura; tr una fila; th una celda de encabezado y td una celda de datos. caption da un título a la tabla. thead y tbody separan cabecera y datos. scope permite indicar a qué celdas se aplica un encabezado.

Usamos tablas para datos tabulares, como una lista de precios. El diseño de una página se construirá con CSS. Un dato que falte debería representarse de forma comprensible en lugar de desplazar columnas.

## Ejemplo

```html
<table>
  <caption>Precios de útiles</caption>
  <thead><tr><th scope="col">Producto</th><th scope="col">Precio</th></tr></thead>
  <tbody>
    <tr><th scope="row">Cuaderno</th><td>2000</td></tr>
    <tr><th scope="row">Lapicera</th><td>800</td></tr>
  </tbody>
</table>
```

[Abrir el fragmento como archivo](fragmentos/clase_05.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos HTML van dentro del documento base de la primera clase, salvo que se muestre un documento completo. Tenés una página local de ejemplo en la guía de ejecución.

## Leamos el ejemplo paso a paso

La cabecera define el significado de cada columna. Cuaderno y Lapicera identifican sus filas con th. El navegador puede mostrar una tabla sin bordes; eso no significa que esté mal construida. Luego aprenderemos a estilizarla. Primero comprobá que cada precio esté asociado a su producto.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Construí una tabla con tres libros y columnas Título, Autor y Año.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Usar espacios para simular columnas: su alineación cambia al variar la pantalla.

## Resumen para repasar

Una tabla representa datos relacionados por filas y columnas. table contiene la estructura; tr una fila; th una celda de encabezado y td una celda de datos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **01.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_06.md)
