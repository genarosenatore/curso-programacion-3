# Clase 01.02 · Encabezados, párrafos, listas y caracteres especiales

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_01.md) · [Clase siguiente](../01_HTML/CLASE_03.md)

## Elegir una estructura por su significado

Ya sabemos crear [elementos HTML](CLASE_01.md). Ahora necesitamos distinguir una idea principal, un párrafo y una enumeración. Un encabezado anuncia el tema de lo que sigue. `h1` es el nivel principal; `h2` introduce sus secciones; `h3` una sección dentro de una de ellas. Los números representan jerarquía, no una escala de tamaño que convenga usar como decoración.

Un párrafo `p` reúne una idea de texto. Un salto de línea en el archivo no crea un párrafo nuevo: el navegador normalmente reúne los espacios consecutivos. Creá otro p cuando empieza otra idea. `br` marca un salto dentro de un texto, por ejemplo una dirección postal; repetirlo para separar secciones no describe su estructura.

## Listas y énfasis paso a paso

Si los elementos forman un conjunto sin orden, creá `ul`. Si el orden expresa pasos o una clasificación, creá `ol`. En ambos, cada elemento pertenece a un `li`; ul u ol contiene esos li. Escribir números manualmente en párrafos pierde la relación de lista. `strong` indica importancia y `em` énfasis; su presentación predeterminada puede cambiarse con CSS, pero su significado permanece.

Para mostrar un símbolo reservado tenemos **referencias de caracteres**. El texto `&lt;` representa `<` y `&amp;` representa `&`. Empiezan con `&`, incluyen un nombre reconocido y terminan con `;`. Si escribimos `<p>` como ejemplo sin escapar, el navegador puede interpretarlo como un elemento real. Esto explica por qué el código visible de la clase usa referencias al renderizar.

El bloque de abajo es un fragmento: reemplazá el contenido de body en el documento de 01.01. Abrí ese documento, compará encabezados y lista y mirá también el código fuente. La diferencia entre estructura y aspecto será la base para CSS.

## Ejemplo de la clase

```html
<h1>Catálogo</h1>
<h2>Útiles escolares</h2>
<p>Elegí los materiales que necesitás.</p>
<ul>
  <li>Cuaderno</li>
  <li>Lapicera</li>
</ul>
<p><strong>Importante:</strong> los precios incluyen IVA.</p>
<p>Ejemplo de etiqueta: &lt;p&gt;</p>
```

[Abrir el fragmento como archivo](fragmentos/clase_02.html) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Catálogo es el tema principal y Útiles escolares una sección. La lista agrupa elementos del mismo tipo. El texto con strong destaca una advertencia semánticamente. Las entidades hacen que la etiqueta de ejemplo aparezca como texto, sin crear un nuevo párrafo. Para una receta con pasos, ol expresa que el orden importa.

## Cambiar una decisión y explorar un límite

Reemplazá ul por ol manteniendo li: cambia la indicación de orden. Si «elegir producto» debe ocurrir antes de «confirmar», ol expresa la regla. Cambiar h2 a h5 para reducir el tamaño introduce una jerarquía falsa. Mostrá literalmente <h1> con &lt;h1&gt; para evitar que se interprete.

## Confusión que conviene evitar

Saltar de h1 a h5 solo para obtener letra pequeña.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../01_HTML/CLASE_01.md) · [Clase siguiente](../01_HTML/CLASE_03.md)
