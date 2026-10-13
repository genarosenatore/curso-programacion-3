# Clase 02.06 · Flexbox

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_05.md) · [Clase siguiente](../02_CSS/CLASE_07.md)

## Distribuir hermanos en un eje

Hasta ahora ajustamos [cajas](CLASE_04.md) individualmente. Flexbox permite que un contenedor reparta espacio entre sus hijos directos. `display:flex` se aplica al padre: organiza a los hijos como **ítems flex**. No organiza automáticamente a sus nietos ni a los hermanos del padre.

El eje **principal** sigue flex-direction: row suele recorrer la fila y column la columna. El eje **transversal** es perpendicular. justify-content distribuye a lo largo del principal y align-items alinea en el transversal. Por eso center no significa siempre vertical: depende del eje y del espacio disponible.

## Repartir espacio paso a paso

Para empezar, creá `<div class="productos"><article class="producto">A</article><article class="producto">B</article><article class="producto">C</article></div>` dentro del documento base. Con display:flex, los tres comparten una fila. `gap:1rem` deja espacio entre ellos. `flex-wrap:wrap` permite formar más líneas si no caben; sin wrap, pueden encogerse o desbordar.

En `flex:1 1 14rem`, el primer 1 es grow: los elementos participan por igual del espacio libre. El segundo 1 es shrink: pueden reducirse cuando falta espacio. 14rem es basis, una base para calcular el reparto. No garantiza un ancho final de 14rem. Con tres bases de 224px y dos espacios de 16px en un contenedor de 800px, hay 96px libres: en un caso simple se reparten 32px por tarjeta.

Los ítems tienen límites de tamaño y su contenido puede impedir reducirse, por ejemplo una palabra muy larga. `min-width:0` permite encoger ciertos ítems y `overflow-wrap:anywhere` permite cortar texto cuando hace falta. No agregues ambas sin observar el problema. Flexbox conviene para barras, botones o tarjetas que se distribuyen por un eje; para columnas alineadas entre varias filas, Grid ofrece otro modelo.

## Ejemplo de la clase

```css
.productos { display: flex; flex-wrap: wrap; gap: 1rem; }
.producto { flex: 1 1 14rem; }
.barra { display: flex; justify-content: space-between; align-items: center; }
```

[Abrir el fragmento como archivo](fragmentos/clase_06.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Cada producto puede crecer y encoger desde 14rem. Cuando no caben, pasan a otra fila. La barra separa sus hijos a lo largo del eje principal y los centra en el transversal. Aplicá las clases a padres con hijos reales; poner display:flex en un hijo aislado no organiza a sus hermanos.

## Cambiar una decisión y explorar un límite

Cambiá flex-direction a column: justify-content pasa a distribuir verticalmente. Si no hay altura sobrante, centrar puede no producir un cambio visible. Quitá wrap y estrechá la ventana: ya no se forman nuevas líneas. El contenedor debe tener espacio real para que la alineación lo reparta.

## Confusión que conviene evitar

Esperar que justify-content:center centre verticalmente en cualquier flex-direction.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_05.md) · [Clase siguiente](../02_CSS/CLASE_07.md)
