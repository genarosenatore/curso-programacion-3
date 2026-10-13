# Clase 02.02 · Cascada, herencia y especificidad

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_01.md) · [Clase siguiente](../02_CSS/CLASE_03.md)

## Resolver declaraciones que compiten

Si el mismo párrafo coincide con p y .aviso y ambos asignan color, CSS necesita una regla para elegir. La **cascada** es ese procedimiento. La **herencia** es otra cosa: transmite ciertas propiedades del padre cuando el hijo no obtiene un valor propio. Primero averiguá si hay competencia sobre el mismo elemento o una propiedad que viene de su padre.

Para estas prácticas usaremos un archivo de autor, sin capas, animaciones ni !important. En ese contexto compará la especificidad: cantidad de ids, luego clases/atributos/pseudoclases, luego etiquetas. Se compara por columnas, no sumando un puntaje ilimitado. `.tarjeta .aviso` tiene dos clases y vence a `.aviso`; `#mensaje` tiene un id y vence a ambas. Con empate, gana la declaración que aparece después.

## Seguir una propiedad desde el elemento

Con `<p class="aviso">Hola</p>`, buscá las reglas que realmente coinciden. En el ejemplo inferior coinciden p y las dos .aviso. Las de clase superan a p y la última .aviso gana el empate. El color de body no compite con ellas sobre ese párrafo: solo sería heredado si el párrafo no recibiera un color propio.

Un hijo puede heredar color y familia de fuente, pero margin y padding no se heredan normalmente. Si una tarjeta tiene margen, su párrafo no obtiene automáticamente el mismo margen. Abrí el inspector del navegador, elegí el párrafo y observá reglas tachadas y valor calculado; eso permite explicar la selección en vez de ensayar colores.

Fuera de este escenario también importan origen de la regla, importancia, capas y otros mecanismos de cascada. Por eso «el id siempre gana» no es una ley universal. `!important` modifica prioridad; no aumenta la especificidad. Para aprender, mantené reglas comparables y corregí la organización antes de añadir excepciones.

## Ejemplo de la clase

```css
body { color: #333; }
p { color: green; }
.aviso { color: blue; }
.aviso { color: red; }
```

[Abrir el fragmento como archivo](fragmentos/clase_02.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Un p con class="aviso" queda rojo: las dos reglas de clase superan a p y la última desempata. Un párrafo sin clase queda verde. Un elemento sin color definido puede heredar el del body. Cambiar el orden solo resuelve empates entre reglas comparables; no supera por sí solo una especificidad mayor.

## Cambiar una decisión y explorar un límite

Mové p después de .aviso: la clase sigue ganando. Invertí las dos .aviso: cambia el color porque empatan. Quitá todos los colores del párrafo: entonces puede heredar el de body. Cada cambio comprueba una parte distinta del procedimiento.

## Confusión que conviene evitar

Usar !important ante cualquier conflicto sin investigar qué regla está ganando.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_01.md) · [Clase siguiente](../02_CSS/CLASE_03.md)
