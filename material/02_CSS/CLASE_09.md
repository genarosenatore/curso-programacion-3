# Clase 02.09 · BEM y organización de estilos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_08.md) · [Clase siguiente](../02_CSS/CLASE_10.md)

## Nombrar componentes para poder cambiarlos

Cuando una hoja crece, selectores como `main section div article p` dependen de demasiados detalles. Mover un párrafo puede romper estilos que pretendían expresar «descripción de tarjeta». BEM ofrece una convención: **bloque** independiente, **elemento** que pertenece al bloque y **modificador** que representa una variante.

`tarjeta` nombra el bloque; `tarjeta__titulo` su elemento y `tarjeta--agotada` una variante. Los guiones y guiones bajos son parte del nombre de clase, sin significado especial para CSS. BEM no se instala ni valida reglas del negocio. El navegador sigue usando selectores de clase comunes como en [02.01](CLASE_01.md).

## Componer una variante

Poné class="tarjeta tarjeta--agotada" en el article: conserva el estilo base y añade el de agotada. Si escribís solo tarjeta--agotada, podés perder borde o relleno de la base. En su h2 usá tarjeta__titulo. Una clase de elemento no requiere ser hija directa; su nombre comunica pertenencia, pero CSS no impone esa relación.

Para no repetir colores, existen **propiedades personalizadas**: `:root { --color-acento:#075985; }` define un valor y `color:var(--color-acento)` lo utiliza. Los dos guiones forman parte de su sintaxis. :root selecciona la raíz del documento. Estas propiedades se heredan y se resuelven por cascada; no son variables de JavaScript. Podés cambiar el valor en un bloque para una variante.

Organizá la hoja por base, componentes y variantes, con comentarios breves que expliquen decisiones. BEM conviene si el proyecto necesita consistencia; para una página minúscula una convención simple también puede bastar. No agregues modificadores que nunca se usan ni clases llamadas azul si mañana su color puede cambiar.

## Ejemplo de la clase

```css
.tarjeta { border: 1px solid #ccc; padding: 1rem; }
.tarjeta__titulo { margin-top: 0; }
.tarjeta--agotada { opacity: .6; }
/* HTML: <article class="tarjeta tarjeta--agotada">...</article> */
```

[Abrir el fragmento como archivo](fragmentos/clase_09.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

tarjeta mantiene el estilo común. tarjeta--agotada cambia una variante. El título puede moverse dentro de la tarjeta sin requerir un selector profundo como main section article div h3. Usá nombres que describan función en lugar del color actual.

## Cambiar una decisión y explorar un límite

Cambiá el acento en :root: todos los usos de var se actualizan sin reemplazar valores uno por uno. Si una propiedad no existe, `var(--acento, blue)` ofrece blue como alternativa. Quitar la clase base de una variante demuestra que el nombre BEM no genera automáticamente el estilo común.

## Confusión que conviene evitar

Confundir BEM con una librería que hay que instalar.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_08.md) · [Clase siguiente](../02_CSS/CLASE_10.md)
