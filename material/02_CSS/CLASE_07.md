# Clase 02.07 · Grid

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_08.md)

## Relacionar filas y columnas

Grid divide el contenedor en **pistas**, filas o columnas donde coloca los hijos. Es útil cuando queremos que varias tarjetas se alineen en una estructura de dos dimensiones. Flexbox reparte cada línea de manera más independiente; Grid comparte pistas entre filas. Podés usar Grid fuera y Flexbox dentro de una tarjeta.

Empezá con un padre.catalogo y cuatro article. `display:grid` crea el contexto y `grid-template-columns:1fr 1fr` dos columnas iguales. `fr` representa una fracción del espacio disponible después de otras medidas y separaciones. No son porcentajes de toda la pantalla. `gap:1rem` separa las pistas.

## De dos columnas a una regla adaptable

`repeat(2,1fr)` equivale a escribir 1fr dos veces. `minmax(14rem,1fr)` establece un mínimo y un máximo flexible. `repeat(auto-fit,...)` intenta colocar tantas columnas como caben y ajusta las disponibles. `min(100%,14rem)` elige el menor entre el ancho total del contenedor y 14rem; evita que una columna mínima exija más que una pantalla muy estrecha.

En el ejemplo inferior leé de adentro hacia afuera: el mínimo se limita al contenedor; cada columna puede crecer con 1fr; auto-fit decide cuántas entran; repeat crea esas pistas. No necesitás memorizar toda la expresión para empezar. Primero probá una columna, luego dos fijas y recién después la regla adaptable; ese recorrido muestra qué problema resuelve cada función.

El orden del HTML sigue siendo importante para lectura y teclado. Posicionar visualmente una tarjeta en otro lugar no reescribe el orden semántico. Tampoco una celda obliga al contenido a caber: una imagen demasiado grande requiere max-width o una regla de tamaño. La distribución debe acompañar la estructura, no esconder sus defectos.

## Ejemplo de la clase

```css
.catalogo {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(min(100%, 14rem), 1fr));
  gap: 1rem;
}
```

[Abrir el fragmento como archivo](fragmentos/clase_07.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Cada columna busca al menos 14rem, pero min(100%,14rem) evita exigir más que el contenedor. 1fr permite distribuir el espacio restante. Al reducir el ancho cambia la cantidad de columnas sin escribir una regla para cada dispositivo.

## Cambiar una decisión y explorar un límite

En un contenedor de 600px, dos columnas de 1fr con gap:20px reciben aproximadamente 290px cada una si no hay mínimos de contenido que alteren el reparto. Cambiar a 1fr 2fr reparte 580px en tres partes: una columna recibe un tercio y otra dos tercios. Un mínimo fijo de 400px no cabe dentro de 300px.

## Confusión que conviene evitar

Creer que definir filas o columnas cambia el orden semántico del HTML.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_08.md)
