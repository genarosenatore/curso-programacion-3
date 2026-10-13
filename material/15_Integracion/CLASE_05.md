# Clase 15.05 · Food Store: catálogo, filtros y detalle

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_04.md) · [Clase siguiente](../15_Integracion/CLASE_06.md)

## Combinar filtros sin perder la colección original

Un catálogo tiene datos de origen, filtros activos y una selección visible. Cambiar búsqueda o categoría calcula otra selección desde la colección original. Si filtras la selección anterior, borrar búsqueda no recupera productos descartados. Separar datos y vista preserva reversibilidad.

En el ejemplo, categoriaId:null significa todas. Una categoría numérica exige igualdad; la búsqueda normaliza espacios exteriores y minúsculas. El && exige coincidencia de nombre y categoría. Dentro, el || admite cualquiera si la categoría es null. Los paréntesis hacen explícito el agrupamiento.

## Orden y detalle

filter devuelve un array nuevo, así sort sobre esa selección no reorganiza la fuente. sort sí modifica el array sobre el que se aplica. Para precio ascendente usa diferencia de precios; estos centavos del ejemplo están dentro de rango seguro. Un desempate por nombre hace estable la presentación entre iguales; localeCompare devuelve comparación según reglas de idioma, no resta de caracteres.

El detalle busca por id, verifica existencia y muestra disponibilidad. Id mal formado, producto ausente y agotado son estados distintos: agotado sigue existiendo y puede mostrarse, aunque no se permita agregar. El enlace de vuelta conserva un camino comprensible; filtros pueden conservarse si así lo defines, sin convertirlo en obligación de toda consigna.

Primero prueba funciones con datos locales como en [04.10](../04_TypeScript/CLASE_10.md). Compila el fragmento TS según04.01 y añade datos/llamadas. Para pantalla, usa el [catálogo JavaScript](../Ejemplos/javascript/index.html) mediante su servidor: es apoyo de búsqueda y carrito, no todas las pantallas ni categorías de Food Store. Después integra contratos reales de backend.

## Ejemplo de la clase

```typescript
interface Producto { id:number; nombre:string; categoriaId:number; precioCentavos:number; stock:number; }
function seleccionar(productos:Producto[], texto:string, categoriaId:number|null) {
  const busqueda=texto.trim().toLowerCase();
  return productos.filter(p => p.nombre.toLowerCase().includes(busqueda)
    && (categoriaId===null || p.categoriaId===categoriaId));
}
```

[Abrir el fragmento como archivo](fragmentos/clase_05.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

null significa todas las categorías, no cero. La búsqueda vacía coincide con todos los nombres. La función devuelve otra lista sin modificar la original; después podemos copiar y ordenar. El stock se muestra y se vuelve a validar cuando se intenta comprar.

## Cambiar una decisión y explorar un límite

Búsqueda vacía incluye todos los nombres; categoría sin productos produce vacío normal. Cambiar stock a0 no elimina automáticamente producto del catálogo: la regla de visibilidad se decide aparte de comprar.

## Confusión que conviene evitar

Aplicar filtros a una lista ya filtrada y no poder recuperar resultados al borrar búsqueda.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_04.md) · [Clase siguiente](../15_Integracion/CLASE_06.md)
