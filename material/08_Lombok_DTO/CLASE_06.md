# Clase 08.06 · Práctica: DTO de producto y factura

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_05.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_01.md)

## Decidir un contrato según el uso

Una tarjeta necesita nombre, precio y disponibilidad; un informe de factura necesita identidad, fecha y totales, quizás detalles. No existe un DTO único obligatorio por entidad. La operación determina qué campos se requieren y quién los calcula. Empezá por un producto para practicar la transformación sin agregar base o HTTP.

El ejemplo inferior omite precio conscientemente en ProductoVista, porque solo presenta nombre y disponibilidad. Para la práctica de tarjeta, otro DTO sí lo incluye. El método presentar no reduce stock ni confirma una venta: consulta el estado actual y construye una representación. La disponibilidad podría cambiar después.

## Una factura pequeña sin relaciones circulares

Podés modelar un detalle de reporte con nombreProducto, cantidad y subtotalCentavos. Una lista de detalles dentro de FacturaVista se copia para evitar que otra lista la altere. La salida no necesita devolver toda la clase Cliente con todas sus facturas: un clienteNombre o clienteId basta según el reporte. Esta decisión evita ciclos y datos innecesarios.

Ejecutá [U08DTO.java](../Ejemplos/java/U08DTO.java), que incluye main y mapeo de disponibilidad. Para tus tipos de práctica usá records de [08.05](CLASE_05.md) dentro de una clase y funciones static fuera de main. No necesita Lombok para comprenderse; automatizar se considera después de mantener reglas manuales.

Revisá entradas válidas y límite: stock cero, lista de detalles vacía y nombre no permitido. Un DTO evita exponer campos que omitiste; no controla qué usuario está autorizado a pedirlo. Esa autorización se decide en servidor y se tratará en integración.

## Ejemplo de la clase

```java
record Producto(String codigo, String nombre, int precioCentavos, int stock) {}
record ProductoVista(String codigo, String nombre, boolean disponible) {}
static ProductoVista presentar(Producto p) {
    return new ProductoVista(p.codigo(), p.nombre(), p.stock() > 0);
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La salida omite precio en este contrato de ejemplo y transforma stock en una condición. Otro DTO del catálogo podría requerir precio; no existe un único DTO obligatorio para cada entidad. Usar nombres distintos hace visible la diferencia de responsabilidad.

## Cambiar una decisión y explorar un límite

Cambiar el DTO de tarjeta no debería obligar a agregar un campo a la tabla si ese dato se deriva del stock. Copiar una entidad entera a salida puede revelar campos internos y abrir ciclos. El contrato debe elegir, no simplemente duplicar.

## Confusión que conviene evitar

Afirmar que usar un DTO impide todo problema de permisos sin revisar qué datos expone.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_05.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_01.md)
