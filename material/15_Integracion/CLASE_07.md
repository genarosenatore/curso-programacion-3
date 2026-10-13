# Clase 15.07 · Pedidos y administración

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_06.md) · [Clase siguiente](../15_Integracion/CLASE_08.md)

## Una operación confirmada tiene estado e histórico

Un pedido aceptado contiene cabecera, detalles y estado. Los detalles conservan precio de la operación; el catálogo actual puede cambiar. Administración no consiste solo en ofrecer un botón: decide quién puede consultar o cambiar y qué transiciones son válidas.

El ejemplo usa una política didáctica: pending puede ir a processing o cancelled; processing a completed o cancelled; los dos últimos no tienen salida. No se presenta como regla oficial de Food Store. Debes contrastar los estados requeridos por la consigna y acordar las transiciones del proyecto.

## Leer la tabla de transiciones

`Record<EstadoPedido,EstadoPedido[]>` es un tipo utilitario TypeScript para un objeto con una propiedad por cada estado y arrays de destinos permitidos. No es record Java: comparte palabra, pero otro lenguaje y función. `permitidos[actual].includes(nuevo)` consulta destinos del estado actual y verifica pertenencia.

Primero valida que actual y nuevo sean estados admitidos si vienen de JSON unknown. Después consulta la tabla. Si está permitido, el servicio aplica el cambio bajo sus reglas; si no, conserva anterior e informa rechazo. Una tabla en el frontend puede mostrar opciones, pero una petición manual exige la misma decisión en servidor.

Puedes compilar y ejecutar la política como .ts de consola con tipos, datos y una función de prueba. La creación real de pedido requiere backend con referencias, cantidades, total e histórico, explicado en [12.08](../12_JPA/CLASE_08.md) y [14.12](../14_Spring/CLASE_12.md). El ejemplo local de carrito no confirma pedidos ni realiza pagos.

Mantén listado vacío, pedido inexistente y transición rechazada distinguibles en la UI. Un administrador con pantalla abierta puede operar sobre estado antiguo; servidor debe comprobar estado vigente, no solo el que la pantalla recuerde.

## Ejemplo de la clase

```typescript
type EstadoPedido = "pending" | "processing" | "completed" | "cancelled";
const permitidos:Record<EstadoPedido,EstadoPedido[]> = {
  pending:["processing","cancelled"],
  processing:["completed","cancelled"],
  completed:[],
  cancelled:[]
};
```

[Abrir el fragmento como archivo](fragmentos/clase_07.ts) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La tabla es una política didáctica explícita, no un dato automáticamente deducido de la consigna. El backend debe confirmar la política acordada y los permisos. La pantalla puede usarla para presentar opciones, pero un usuario puede enviar una petición manual y debe rechazarse si viola la regla.

## Cambiar una decisión y explorar un límite

completed→pending se rechaza bajo esta tabla y conserva completed. Cambiar la propiedad del storage no cambia el pedido del servidor. Una tabla sin una clave requerida puede detectarse al compilar, pero un JSON inesperado requiere validar en ejecución.

## Confusión que conviene evitar

Confundir quitar un botón en la interfaz con impedir la operación en el backend.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../15_Integracion/CLASE_06.md) · [Clase siguiente](../15_Integracion/CLASE_08.md)
