# Clase 02.06 · Flexbox

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_05.md) · [Clase siguiente](../02_CSS/CLASE_07.md)

## Qué vas a aprender

Vamos a trabajar **flexbox**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Flexbox distribuye elementos principalmente en un eje. El padre es el contenedor flex y sus hijos directos son ítems. flex-direction define el eje principal. justify-content alinea en ese eje y align-items en el transversal. gap separa ítems sin márgenes individuales.

flex-wrap permite pasar a otra línea cuando falta espacio. flex-grow reparte espacio libre; flex-shrink reduce tamaños; flex-basis propone una base. No memorizamos izquierda/derecha: si cambiás la dirección, cambian los ejes.

## Ejemplo

```css
.productos { display: flex; flex-wrap: wrap; gap: 1rem; }
.producto { flex: 1 1 14rem; }
.barra { display: flex; justify-content: space-between; align-items: center; }
```

[Abrir el fragmento como archivo](fragmentos/clase_06.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las reglas CSS se aplican a los elementos y clases HTML indicados. Tenés un ejemplo completo en la guía de ejecución.

## Leamos el ejemplo paso a paso

Cada producto puede crecer y encoger desde 14rem. Cuando no caben, pasan a otra fila. La barra separa sus hijos a lo largo del eje principal y los centra en el transversal. Aplicá las clases a padres con hijos reales; poner display:flex en un hijo aislado no organiza a sus hermanos.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Creá una fila de tres tarjetas que pueda envolver al reducir la ventana.

Abrí [los ejercicios y las pistas](EJERCICIOS_06.md). Las [soluciones explicadas](SOLUCIONES_06.md) están preparadas para consultar después de intentarlo.

## Error común

Esperar que justify-content:center centre verticalmente en cualquier flex-direction.

## Resumen para repasar

Flexbox distribuye elementos principalmente en un eje. El padre es el contenedor flex y sus hijos directos son ítems.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **02.06** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_05.md) · [Clase siguiente](../02_CSS/CLASE_07.md)
