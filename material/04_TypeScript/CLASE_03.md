# Clase 04.03 · Interfaces y tipos para objetos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_02.md) · [Clase siguiente](../04_TypeScript/CLASE_04.md)

## Nombrar la forma de un dato

Repetir `{id:number; nombre:string; precio:number}` en cada función puede generar diferencias accidentales. Una **interfaz** da nombre a ese contrato de propiedades. `interface Producto` no construye una instancia: describe qué espera el código. Un objeto literal compatible puede usarse sin new ni una clase Producto.

TypeScript compara estructuras: si un valor tiene las propiedades requeridas con tipos compatibles, puede cumplir la interfaz. Una variable con propiedades adicionales puede seguir siendo compatible; los literales nuevos reciben comprobaciones específicas de propiedades sobrantes para detectar errores. Esto no implica que la interfaz elimine campos del objeto al ejecutar.

## Acceso y restricciones

En el ejemplo inferior id es readonly: a través de producto tipado como Producto, escribir producto.id=2 se rechaza al comprobar. precio puede cambiar porque no está marcado. readonly no congela el objeto en ejecución ni garantiza que otro alias no lo modifique. Igual que const, es importante identificar qué escritura restringe.

`type` permite un alias: `type Identificador = number;` nombra un tipo sin crear una clase ni diferenciar por sí solo números con otras funciones. Para formas sencillas de objetos, type e interface pueden expresar contratos similares; type también permite uniones, que veremos en 04.04. Elegí consistencia, no una regla de «uno siempre mejor».

Compilá el fragmento como en [04.01](CLASE_01.md) y observá que la interfaz no aparece como código JavaScript. Si una API usa costo y tu interfaz espera precio, la anotación no renombra el campo. Necesitás un adaptador que lea costo y construya un objeto con precio, después de validar el dato recibido.

## Ejemplo de la clase

```typescript
interface Producto {
  readonly id: number;
  nombre: string;
  precio: number;
}
const producto: Producto = { id: 1, nombre: "Cuaderno", precio: 2000 };
console.log(producto.nombre);
```

[Abrir el fragmento como archivo](fragmentos/clase_03.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El objeto debe incluir id, nombre y precio con tipos compatibles. readonly impide escribir producto.id=2 desde esta referencia. Cambiar precio sigue permitido. Al conectar la API, los nombres deben coincidir con el JSON; llamar costo a precio en la interface no renombra automáticamente la respuesta.

## Cambiar una decisión y explorar un límite

Quitá nombre del literal asignado a Producto: falta una propiedad requerida. Agregá readonly a precio y probá su asignación: limita ese uso estático, pero no cambia los datos del JSON remoto ni crea una copia independiente.

## Confusión que conviene evitar

Creer que una interface genera un constructor o valida automáticamente un JSON.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_02.md) · [Clase siguiente](../04_TypeScript/CLASE_04.md)
