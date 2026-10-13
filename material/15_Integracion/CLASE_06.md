# Clase 15.06 · Carrito, cantidades y localStorage

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_05.md) · [Clase siguiente](../15_Integracion/CLASE_07.md)

## Actualizar cantidades como una transición de estado

El carrito representa productoId y cantidad, con una fila por producto en este ejercicio. Agregar el mismo id suma a su cantidad existente. La regla se evalúa sobre la cantidad combinada, no solo la recién pedida. Antes de mutar, comprueba entero positivo y que no supere stock vigente local.

La transición tiene estado anterior, solicitud y estado posterior. Con stock3 y cantidad actual2, agregar2 pide4 y se rechaza conservando2. Quitar1 deja1. Si quitar llega a0, la política puede retirar el ítem; aquí cantidad0 no se conserva como una compra. Un total se recalcula a partir de los datos válidos después de cambiar.

## Guardar mínimo y recuperar con comprobación

localStorage guarda texto JSON por origen, como vimos en [03.10](../03_JavaScript/CLASE_10.md). Serializa ids/cantidades y al recuperar comprueba array, elementos, ids conocidos y cantidades válidas. El catálogo puede cambiar entre sesiones: un id ausente o stock reducido necesita un mensaje y política de corrección, no uso ciego de los datos viejos.

Usa [el ejemplo JavaScript](../Ejemplos/javascript/index.html) servido por el [servidor local](../EJEMPLOS.md). Cuaderno tiene3 unidades; Mochila empieza agotada. Haz altas repetidas, elimina y recarga. No edites su stock suponiendo que modificaste una base real: es un catálogo local de práctica.

El backend debe volver a consultar precios y disponibilidad antes de aceptar pedido, porque storage es editable y el estado puede quedar antiguo. El total mostrado ayuda a la experiencia; el aceptado debe surgir de reglas del servidor. Los centavos enteros reducen errores de cálculos simples dentro de un rango seguro.

## Ejemplo de la clase

```typescript
interface Item { productoId:number; cantidad:number; }
function cantidadValida(cantidad:number,stock:number) {
  return Number.isInteger(cantidad) && cantidad>0 && cantidad<=stock;
}
// Al agregar un producto ya presente, validá cantidadActual + cantidadNueva.
```

[Abrir el fragmento como archivo](fragmentos/clase_06.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Si hay 2 unidades en carrito y se agregan 2 sobre stock 3, la cantidad combinada 4 se rechaza. Validar solo la nueva cantidad 2 sería insuficiente. Quitar el último ítem deja un carrito vacío con total cero y un mensaje visible.

## Cambiar una decisión y explorar un límite

Corromper JSON debe producir recuperación o mensaje controlado, no romper toda la página. Una cantidad1.5 no se vuelve válida por tener typeof number. Si desaparece un producto, conserva explicación de la corrección en lugar de mostrar undefined.

## Confusión que conviene evitar

Validar stock solo al abrir la pantalla y no al modificar la cantidad.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_05.md) · [Clase siguiente](../15_Integracion/CLASE_07.md)
