# Clase 04.05 · Genéricos básicos y diferencias entre any y unknown

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_04.md) · [Clase siguiente](../04_TypeScript/CLASE_06.md)

## Reutilizar una relación entre tipos

Una función primero podría servir para nombres y precios. Usar any para ambos borra qué tipo vuelve. Un **genérico** introduce un parámetro de tipo T para relacionar entrada y salida. `<T>` lo declara, `T[]` es un array de ese tipo y `T | undefined` dice que su primer valor puede faltar.

Al llamar primero(["Ana","Luis"]), T se infiere como string. Al llamar primero([10,20]), se infiere como number. No se crea una validación distinta por cada tipo: la información se usa durante comprobación y se elimina de la salida JavaScript. Por eso el cuerpo no puede llamar un método string sobre cualquier T.

## Reconocer lo desconocido

`any` permite operar sin comprobaciones, incluso llamar algo que no existe. `unknown` admite recibir un dato de cualquier forma, pero exige reducirlo antes de utilizar operaciones específicas. Para JSON externo, unknown representa honestamente lo que todavía no sabemos.

`function esTexto(valor:unknown): valor is string` declara un **predicado de tipo**. El cuerpo comprueba typeof; si da true, el compilador permite tratar ese valor como string. El predicado es una promesa hecha por quien escribe la función: si siempre devuelve true, el compilador puede confiar en una mentira. El chequeo real debe justificarla.

Ejecutá el ejemplo con el compilador de [04.01](CLASE_01.md). Al obtener un nombre posiblemente undefined, comprobá que exista antes de acceder a length. Un genérico sirve para conservar relaciones; no convierte automáticamente datos ni prueba que una colección tenga elementos.

## Ejemplo de la clase

```typescript
function primero<T>(valores: T[]): T | undefined {
  return valores[0];
}
const nombre = primero(["Ana", "Luis"]);
function esTexto(valor: unknown): valor is string {
  return typeof valor === "string";
}
```

[Abrir el fragmento como archivo](fragmentos/clase_05.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

En primero de strings, T se infiere como string. Un array vacío devuelve undefined. esTexto comprueba durante la ejecución y comunica al compilador la reducción a string en el camino verdadero. La comprobación real debe ser correcta: el tipo de retorno declarado no la inventa.

## Cambiar una decisión y explorar un límite

Hacé primero<number>([]): devuelve undefined. Cambiar el retorno declarado a T y afirmar el acceso no crea un elemento. Reemplazar unknown por any evita el error estático pero permite que falle un dato numérico al intentar toLowerCase.

## Confusión que conviene evitar

Cambiar todos los tipos problemáticos a any y perder las comprobaciones que queríamos obtener.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_04.md) · [Clase siguiente](../04_TypeScript/CLASE_06.md)
