# Clase 15.02 · Alinear interfaces TypeScript y DTO Java

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_01.md) · [Clase siguiente](../15_Integracion/CLASE_03.md)

## Acordar nombres, tipos y unidades

La frontera HTTP transporta JSON, no interfaces TypeScript ni clases Java completas. Ambos lados deben acordar campos y su significado. nombre y denominacion no se renombran por escribir una interfaz; precio en unidades monetarias y precioCentavos tampoco son el mismo número.

Un adaptador recibe un contrato validado y construye el modelo de pantalla. `return {id:dto.id,nombre:dto.denominacion}` convierte explícitamente el nombre del campo. `as Producto` solo afirma tipo y no realiza esa transformación. Mantener adaptadores en un lugar evita conversiones contradictorias en cada componente.

## Tamaños y formatos que cruzan lenguajes

Java Long admite valores fuera del rango entero seguro de JavaScript, cuyo máximo exacto es Number.MAX_SAFE_INTEGER. Para ids grandes puede acordarse texto decimal en JSON. Una string de id no se multiplica ni incrementa; representa identidad. La precisión se decide antes de serializar y parsear, no después de perder dígitos.

Fechas deben acordar formato y zona. Una fecha de calendario sin hora no es lo mismo que un instante. Un String JSON ISO debe validarse y convertirse según ese significado, evitando suponer que el horario local de ambos equipos coincide. Para dinero, BigDecimal de Java puede serializar número en este ejemplo, mientras JavaScript utiliza flotante; el contrato educativo usa importes pequeños de dos decimales y el carrito centavos enteros.

En la API local, ProductoDTO incluye categoría como texto opcional además de id,nombre,precio,stock. La interfaz mínima inferior omite ese campo porque no lo utiliza, no porque el servidor lo elimine. El request excluye id generado. Compara el JSON real con el tipo y sus restricciones antes de integrar.

Ejecuta el cliente del proyecto y observa respuesta desde Red. Para practicar el adaptador sin servidor, escribe un .ts con literal y función y compilalo como en [04.01](../04_TypeScript/CLASE_01.md). No necesita DOM ni llamada remota.

## Ejemplo de la clase

```typescript
// Respuesta del proyecto de productos:
interface ProductoDTO { id: number; nombre: string; precio: number; stock: number; }
interface ProductoRequest { nombre: string; precio: number; stock: number; }
// Un request no necesita el id generado; una respuesta sí lo incluye.
```

[Abrir el fragmento como archivo](fragmentos/clase_02.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El modelo educativo usa ids pequeños y precios con dos decimales. El carrito local guarda centavos enteros y convierte al mostrar. La consigna contable usa otros DTO: compará sus nombres y tipos antes de reutilizar. Una propiedad descripcion no equivale automáticamente a nombre.

## Cambiar una decisión y explorar un límite

Recibir id textual y tiparlo number no lo convierte. Recibir precioCentavos200000 y mostrarlo como precio200000 unidades cobra cien veces el valor previsto. El nombre de campo ayuda a preservar unidad, pero igualmente debes validar el contrato.

## Confusión que conviene evitar

Afirmar que Java y TypeScript tienen tipos idénticos para cualquier tamaño o formato.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_01.md) · [Clase siguiente](../15_Integracion/CLASE_03.md)
