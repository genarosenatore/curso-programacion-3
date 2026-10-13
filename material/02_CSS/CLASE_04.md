# Clase 02.04 · Modelo de caja: contenido, padding, border y margin

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_03.md) · [Clase siguiente](../02_CSS/CLASE_05.md)

## Entender cuánto espacio ocupa una caja

El navegador organiza elementos mediante cajas. Desde adentro hacia afuera hay contenido, **padding** o relleno interno, **border** o borde y **margin** o separación externa. Si el texto está pegado al borde, aumentá padding; si dos tarjetas están pegadas entre sí, necesitás separación externa o el espacio del contenedor. Son problemas diferentes.

En el modelo content-box, width define el ancho del contenido. Una tarjeta de 200px con 10px de padding a cada lado y 1px de borde a cada lado ocupa 222px hasta el borde. Con margen horizontal de 8px por lado, su espacio horizontal total llega a 238px. El margen no cambia el fondo ni amplía el contenido.

## Hacer la cuenta con border-box

`box-sizing:border-box` cambia qué significa width: ahora incluye contenido, relleno y borde. Con los mismos 200px, se reservan 20px para padding y 2px para borde y quedan 178px de contenido. El margen sigue fuera. Esta elección evita que sumar padding haga superar un ancho asignado y resulta útil para diseños adaptables.

`padding:10px` aplica a los cuatro lados. Dos valores son vertical y horizontal; cuatro siguen arriba, derecha, abajo e izquierda. El mismo orden se usa en margin. `border:1px solid #333` reúne ancho, estilo y color. Un `border-radius` redondea esquinas sin cambiar la cuenta básica de ancho; una sombra se dibuja alrededor pero no reserva lugar en el flujo.

Usá un article class="tarjeta" con un párrafo dentro y aplicá el ejemplo en una hoja conectada. Inspeccioná la caja: el panel del navegador distingue sus zonas. Algunos márgenes verticales de bloques normales pueden **colapsar**, combinándose en lugar de sumarse; esto no significa que width haya cambiado. Para separación uniforme de filas de elementos aprenderemos gap en Flexbox y Grid.

## Ejemplo de la clase

```css
.tarjeta {
  box-sizing: border-box;
  width: 240px;
  padding: 16px;
  border: 2px solid #333;
  margin: 8px;
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.css) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La caja de borde mide 240px. El contenido disponible mide 240 - 32 - 4 = 204px. El margen queda por fuera. Si cambiamos a content-box, el borde exterior mide 276px. Observá estas zonas en el panel de caja del navegador.

## Cambiar una decisión y explorar un límite

Cambiá border-box por content-box en el ejemplo de 240px: su borde externo pasa a 276px. El cálculo suma 32px de padding y 4px de borde. Si el texto toca el borde, margin:30px no lo aleja porque actúa por fuera. padding sí modifica esa distancia.

## Confusión que conviene evitar

Cambiar margin cuando lo que se necesita es separar el texto del borde interior.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../02_CSS/CLASE_03.md) · [Clase siguiente](../02_CSS/CLASE_05.md)
