# Clase 01.05 · Tablas para datos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_06.md)

## Datos en dos dimensiones

Una lista expresa una secuencia. Una tabla permite relacionar un valor con una fila y una columna: el precio pertenece a cierto producto y a la columna Precio. Existe para representar datos que se entienden por esas dos coordenadas, como horarios, notas o importes. No la uses para ubicar el menú junto al contenido: esa es una tarea de CSS.

`table` delimita la tabla, `tr` una fila, `th` un encabezado y `td` una celda de datos. `thead` agrupa las filas de encabezado y `tbody` las de datos. `caption` proporciona un título. El atributo `scope="col"` indica que un encabezado se aplica a su columna y `scope="row"` a su fila. Esto ayuda a asociar datos al recorrer la tabla sin ver su posición.

## Seguir la construcción

Insertá el fragmento del ejemplo en body de [01.01](CLASE_01.md). Primero se crea la tabla y su título. La cabecera tiene dos celdas: Producto y Precio. Después cada fila de datos mantiene esa misma correspondencia. Cuaderno es el encabezado de su fila; 2000 el dato de precio. El navegador puede mostrarla sin bordes: la ausencia de líneas visuales no significa que las celdas no existan.

Para agregar otra fila, repetí tr con las celdas del mismo orden. Para agregar una columna, añadí el encabezado y una celda en cada fila. Si falta un dato, dejá una celda y expresá «Sin informar» cuando corresponda; eliminar la celda puede desplazar el significado de las siguientes. `colspan="2"` hace que una celda abarque dos columnas, pero no es necesario para esta tabla sencilla.

Una tabla demasiado amplia puede requerir un diseño adaptable, que estudiaremos en CSS. La estructura es útil cuando los datos son tabulares; para una ficha narrativa de un producto, encabezado y párrafos pueden enseñar mejor su contenido.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

La cabecera define el significado de cada columna. Cuaderno y Lapicera identifican sus filas con th. El navegador puede mostrar una tabla sin bordes; eso no significa que esté mal construida. Luego aprenderemos a estilizarla. Primero comprobá que cada precio esté asociado a su producto.

## Cambiar una decisión y explorar un límite

Agregá una columna Stock y un valor por fila. Si colocás el stock en una fila sin la celda de precio, queda debajo de Precio y se interpreta mal. Una celda vacía sigue ocupando su lugar; una celda eliminada no. No confundas la ubicación visual con el significado del dato.

## Confusión que conviene evitar

Usar espacios para simular columnas: su alineación cambia al variar la pantalla.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_04.md) · [Clase siguiente](../01_HTML/CLASE_06.md)
