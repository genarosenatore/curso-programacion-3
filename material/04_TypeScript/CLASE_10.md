# Clase 04.10 · Preparación del frontend de Food Store

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_01.md)

## Diseñar datos y reglas antes de las pantallas

Food Store combina catálogo, cantidades, carrito y pedidos. Primero definí los datos: un producto tiene identidad, nombre, precio y stock; un ítem relaciona un producto con una cantidad. El subtotal se calcula con precio por cantidad; almacenar un total editable independiente permitiría que deje de coincidir.

Las interfaces del ejemplo inferior expresan forma, no reglas. cantidad:number puede ser negativa o fraccionaria. Antes de insertar un ítem, comprobá entero positivo y cantidad total no mayor al stock. Al agregar el mismo producto dos veces, decidir si aumentar la misma cantidad o crear otra fila afecta la comprobación: este ejercicio elige una fila por id.

## De un recorrido a reduce

Ya sabemos sumar con for...of. `reduce(callback,inicial)` conserva un acumulador entre elementos. En el ejemplo, suma empieza en 0 y cada callback devuelve suma más el subtotal actual. Ese retorno será suma en la siguiente vuelta. Para carrito vacío, vuelve el inicial 0. Si omitís el inicial, un array vacío no puede aportar el primer valor y falla.

Probá antes una versión con bucle para comprender la equivalencia; luego reduce es una escritura alternativa, no otra regla de total. Para centavos, nombrá precioCentavos y subtotalCentavos de manera consistente; no mezcles precios en pesos con cantidades expresadas en otra unidad.

La preparación TS es local. El backend se enseña después con Java y Spring y debe confirmar precio y disponibilidad al crear un pedido: los datos del navegador se pueden alterar y quedar antiguos. Por ahora construí funciones que reciban valores y entreguen resultados, sin inventar un servicio ya implementado ni pagos reales.

## Ejemplo de la clase

```typescript
interface Producto { id: number; nombre: string; precio: number; stock: number; }
interface ItemCarrito { producto: Producto; cantidad: number; }
function total(items: ItemCarrito[]): number {
  return items.reduce((suma, item) => suma + item.producto.precio * item.cantidad, 0);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_10.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

reduce comienza en cero y acumula cada subtotal. Un carrito vacío da cero porque hay un valor inicial. Las cantidades y los precios de este ejemplo deben validarse antes de entrar a la función. Para dinero real usaremos centavos enteros en los ejemplos integrados y BigDecimal en Java para evitar errores de precisión.

## Cambiar una decisión y explorar un límite

Agregá dos ítems de 800 × 2 y 2000 × 1: el acumulador pasa 0 → 1600 → 3600. Con [] queda 0. Cambiá el retorno del callback por solo el subtotal: perderías la suma previa. El tipo correcto no detecta necesariamente ese error lógico.

## Confusión que conviene evitar

Confiar en precios y stock enviados por el frontend como si no pudieran cambiar.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_10.md). Las [soluciones razonadas](SOLUCIONES_10.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_01.md)
