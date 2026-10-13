# Clase 02.07 · Grid

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_08.md)

## Qué vas a aprender

Vamos a trabajar **grid**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Grid organiza filas y columnas. El contenedor define pistas y los hijos ocupan celdas. fr reparte espacio disponible. repeat evita repetir definiciones y minmax expresa un mínimo y un máximo. auto-fit permite adaptar la cantidad de columnas al espacio.

Grid y flexbox pueden convivir: grid para el catálogo y flex para los botones de una tarjeta. No hay que elegir uno para toda la aplicación. El mínimo de una columna debe caber en la pantalla; de lo contrario puede causar desplazamiento horizontal.

## Ejemplo

```css
.catalogo {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(min(100%, 14rem), 1fr));
  gap: 1rem;
}
```

[Abrir el fragmento como archivo](fragmentos/clase_07.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

Cada columna busca al menos 14rem, pero min(100%,14rem) evita exigir más que el contenedor. 1fr permite distribuir el espacio restante. Al reducir el ancho cambia la cantidad de columnas sin escribir una regla para cada dispositivo.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Construí dos columnas iguales en una pantalla amplia y una columna en una estrecha.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Creer que definir filas o columnas cambia el orden semántico del HTML.

## Resumen para repasar

Grid organiza filas y columnas. El contenedor define pistas y los hijos ocupan celdas.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_06.md) · [Clase siguiente](../02_CSS/CLASE_08.md)
