# Clase 04.04 · Uniones, opcionales, null y narrowing

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_03.md) · [Clase siguiente](../04_TypeScript/CLASE_05.md)

## Qué vas a aprender

Vamos a trabajar **uniones, opcionales, null y narrowing**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una unión admite varias alternativas. Una propiedad opcional puede no existir y al leerla puede aparecer undefined. null suele expresar ausencia intencional. Con comprobación estricta hay que reducir esas posibilidades antes de usar el valor; ese proceso se llama narrowing.

Podemos reducir por typeof, por una condición de null o por un discriminador. ?? elige una alternativa solo para null o undefined, no para cualquier valor falso. Distinguir cero y ausencia evita perder datos válidos.

## Ejemplo

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

El código TypeScript necesita compilación. Los fragmentos de DOM requieren una página. El proyecto local enlazado incluye configuración y datos para practicar.

## Leamos el ejemplo paso a paso

Estado solo admite las dos cadenas definidas. nota puede faltar. La función usa un mensaje alternativo cuando falta, pero conserva una cadena vacía si existe. La comprobación de null permite acceder a length de un string en el otro camino.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Recibí precio:number|null y devolvé "Sin precio" si falta o el precio como texto si existe.

Abrí [los ejercicios y las pistas](EJERCICIOS_04.md). Las [soluciones explicadas](SOLUCIONES_04.md) están preparadas para consultar después de intentarlo.

## Error común

Usar ! para afirmar que un valor existe sin explicar por qué.

## Resumen para repasar

Una unión admite varias alternativas. Una propiedad opcional puede no existir y al leerla puede aparecer undefined.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **04.04** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_03.md) · [Clase siguiente](../04_TypeScript/CLASE_05.md)
