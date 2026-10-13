# Clase 04.09 · Práctica: API de Los Simpsons

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_08.md) · [Clase siguiente](../04_TypeScript/CLASE_10.md)

## Construir un flujo que no dependa primero de la red

La práctica de personajes necesita cargar, validar, filtrar y presentar. Para aprender cada paso, comenzá con un JSON local de forma conocida: dos objetos con id y nombre. Este contrato es propio del ejercicio; no se afirma que sea el formato de una API pública de Los Simpsons.

Usá la función de filtrado inferior para comprobar lógica sin DOM: recibe personajes y búsqueda, normaliza espacios y mayúsculas y retorna un array. La lista original conserva sus datos. Si una búsqueda no coincide, devuelve [] y eso significa «sin resultados», no un error de descarga.

## Pasar de datos a pantalla

En el proyecto de [Ejemplos](../EJEMPLOS.md), personajes.json está servido junto a los recursos. Iniciá su servidor, mostrá «Cargando», pedí el archivo con fetch, comprobá ok y parseá. Validá cada personaje con un predicado como [04.08](CLASE_08.md). Solo después guardá la colección válida y registrá el buscador tipado. El render debe limpiar y crear li con textContent.

Mantené una colección original y una selección filtrada. Si cada búsqueda filtra la selección anterior, borrar texto no puede recuperar los elementos ya descartados. Usar original como entrada en cada búsqueda conserva el comportamiento reversible.

Para conectar una API externa, consultá su documentación y una respuesta real: URL, campos, envoltorio de resultados y paginación. Un **adaptador** transforma el contrato recibido al modelo local validado. Si hay varias páginas, filtrar la primera no equivale a buscar todo el catálogo. No prometas cobertura ni disponibilidad del servicio remoto sin comprobarlas.

## Ejemplo de la clase

```typescript
interface Personaje { id: number; nombre: string; }
function filtrar(personajes: Personaje[], texto: string): Personaje[] {
  const busqueda = texto.trim().toLowerCase();
  return personajes.filter(p => p.nombre.toLowerCase().includes(busqueda));
}
console.log(filtrar([{id:1,nombre:"Lisa"},{id:2,nombre:"Bart"}],"li"));
```

[Abrir el fragmento como archivo](fragmentos/clase_09.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Devuelve Lisa. El cálculo no depende de la red ni del DOM, así que se comprueba fácilmente. El JSON local usa la forma conocida por el ejemplo, que no se afirma idéntica a la API pública. Para conectar el servicio, observá sus campos y construí un adaptador si tienen otros nombres.

## Cambiar una decisión y explorar un límite

Buscá li: aparece Lisa; buscá zzz: no hay coincidencias; borrá: vuelve la lista original. Renombrar nombre a name en JSON sin adaptar el modelo debe provocar error de contrato, no una lista de undefined.

## Confusión que conviene evitar

Copiar la URL de la consigna y asumir campos de otra API sin revisar la respuesta.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../04_TypeScript/CLASE_08.md) · [Clase siguiente](../04_TypeScript/CLASE_10.md)
