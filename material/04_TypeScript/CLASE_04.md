# Clase 04.04 · Uniones, opcionales, null y narrowing

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_03.md) · [Clase siguiente](../04_TypeScript/CLASE_05.md)

## Representar alternativas y ausencia

Un dato no siempre existe y no siempre tiene una única forma. Una **unión** combina posibilidades con `|`: string | null admite texto o ausencia intencional. `type Estado = "pendiente" | "entregado"` usa tipos literales: solo esas cadenas. No equivale a cualquier string.

Una propiedad `nota?:string` puede faltar; leerla puede dar undefined. Con strictNullChecks, incluido en strict, no se accede a length de un valor que puede ser null o undefined sin comprobar antes. **Narrowing** es reducir esas posibilidades mediante una condición que el compilador puede seguir.

## Seguir cada camino

En longitud del ejemplo, primero se pregunta valor === null. Si es null se retorna 0. En el otro camino solo queda string y se puede leer length. La comprobación tiene efecto real durante ejecución y también informa al sistema de tipos. `typeof valor === "string"` sirve para distinguir una unión de texto y números.

El operador `??` entrega una alternativa si el dato es null o undefined. Conserva cero y texto vacío. `||` los considera falsos y puede reemplazarlos, lo que perdería un precio de cero válido. El `!` pospuesto, como campo!, afirma existencia al compilador sin comprobarla en ejecución; no lo confundas con la negación booleana antepuesta.

Para alternativas con datos diferentes, podés usar un **discriminador**: una propiedad común con valores literales, por ejemplo `{estado:"ok", valor:number}` frente a `{estado:"error", mensaje:string}`. Al comprobar estado, el código conoce qué propiedades acompañan ese camino. Esto evita objetos con combinaciones ambiguas de campos opcionales.

Ejecutá funciones de texto sin DOM como en [04.01](CLASE_01.md). Probá explícitamente null, cero y cadena vacía: son casos que revelan si la ausencia está bien representada, más allá de que compile.

## Ejemplo de la clase

```typescript
type Estado = "pendiente" | "entregado";
interface Pedido { estado: Estado; nota?: string; }
function mostrarNota(pedido: Pedido): string {
  return pedido.nota ?? "Sin nota";
}
function longitud(valor: string | null): number {
  return valor === null ? 0 : valor.length;
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Estado solo admite las dos cadenas definidas. nota puede faltar. La función usa un mensaje alternativo cuando falta, pero conserva una cadena vacía si existe. La comprobación de null permite acceder a length de un string en el otro camino.

## Cambiar una decisión y explorar un límite

En mostrarPrecio, reemplazá precio===null por !precio: cero se convertiría erróneamente en «Sin precio». En una nota opcional, ?? conserva "" mientras || coloca el valor alternativo. Decidí si vacío debe tratarse como ausencia según la consigna.

## Confusión que conviene evitar

Usar ! para afirmar que un valor existe sin explicar por qué.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_03.md) · [Clase siguiente](../04_TypeScript/CLASE_05.md)
