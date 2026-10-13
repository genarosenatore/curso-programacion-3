# Clase 02.10 · Práctica: tarjetas de productos y página adaptable

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_01.md)

## Resolver una tarjeta por etapas

Una tarjeta de producto reúne datos y una acción. Primero escribí HTML semántico con título, descripción, precio y enlace. Después conectá una hoja y definí tipografía. Recién entonces ajustá caja y distribución. Este orden permite identificar si falta contenido, si una regla no coincide o si el ancho no alcanza.

Partí de un catálogo de tres article. Usá clase tarjeta para el borde y padding de [02.04](CLASE_04.md); colocá Grid de [02.07](CLASE_07.md) en el padre. Dentro podés usar Flexbox para distribuir acciones. No asignes coordenadas a cada tarjeta: la cantidad de texto puede cambiar y el flujo debe adaptarse.

## Estado visual y estado comprensible

Un enlace debe describir adónde lleva, por ejemplo «Ver detalle del cuaderno». Un botón requiere comportamiento que todavía no implementamos; no le atribuyas una compra real. `:hover` representa el puntero encima; `:focus-visible` permite mostrar el elemento activo con teclado. Una **línea de foco**, creada con outline, se dibuja sin ocupar espacio de caja; `outline-offset` la separa del borde.

`border-radius:.5rem` redondea esquinas; no crea un componente nuevo. Elegí colores legibles y evitá reducir tanto la opacidad de agotados que su información desaparezca. Agregá texto «Agotado» además del color, para comunicar la regla a quien no distingue ese color.

Probá la página en ancho estrecho, amplio y con zoom. Recorré todos los enlaces con Tab y activalos con Enter. Usá una tarjeta con una descripción mucho más larga para comprobar crecimiento. Revisá el inspector cuando falle una caja: una captura de un solo tamaño no verifica su comportamiento adaptable.

## Ejemplo de la clase

```css
.catalogo { display:grid; grid-template-columns:repeat(auto-fit,minmax(min(100%,14rem),1fr)); gap:1rem; }
.tarjeta { padding:1rem; border:1px solid #cbd5e1; border-radius:.5rem; }
a:focus-visible, button:focus-visible { outline:3px solid #075985; outline-offset:3px; }
```

[Abrir el fragmento como archivo](fragmentos/clase_10.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El catálogo se adapta sin que cada tarjeta tenga coordenadas. El borde delimita los componentes y el foco muestra qué control está activo con teclado. Las reglas se aplican a elementos creados en HTML; CSS no reemplaza labels o encabezados.

## Cambiar una decisión y explorar un límite

Añadí una cuarta tarjeta: el contenedor debe distribuirla sin nuevas coordenadas. Quitá un estilo de foco y recorré con Tab: podés perder la señal de dónde estás. No uses outline:none sin ofrecer una indicación equivalente.

## Confusión que conviene evitar

Evaluar solo una captura de pantalla y no comprobar la adaptación o navegación.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_10.md). Las [soluciones razonadas](SOLUCIONES_10.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_09.md) · [Clase siguiente](../03_JavaScript/CLASE_01.md)
