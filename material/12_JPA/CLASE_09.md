# Clase 12.09 · Prácticas de JPA y modelo FacturaArca

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_08.md) · [Clase siguiente](../13_JPQL/CLASE_01.md)

## Pasar de diagrama a entidades verificables

FacturaArca agrega cliente, punto de venta, condición de IVA, moneda, artículos, listas de precio y detalles. Empezá por la función de cada objeto y su cardinalidad, no por copiar anotaciones. El detalle conecta factura con un artículo de lista de precio y conserva los valores de venta; no necesariamente tiene un atributo directo articulo.

El proyecto contable inspeccionado declara FacturaVenta.numero, cliente, detalles y valores de cabecera, y FacturaVentaDetalle.factura y listaPrecioArticulo. Varias clases originales no traen @Entity y asociaciones JPA completas: forman parte del trabajo de mapeo. No alcanza ejecutar JPQL sobre esos POJO, objetos Java ordinarios, sin completar el modelo persistente.

## Un laboratorio más pequeño para aprender el mecanismo

El [laboratorio JPA](../Ejemplos/persistencia/README.md) entrega un modelo propio reducido, con clientes, marcas, artículos, listaPrecioArticulo, factura y detalle, además de Producto/Categoria. Su README describe campos, datos y límites. Conserva nombres reales útiles como numero y el camino del detalle, pero no reproduce toda consigna fiscal ni su arquitectura.

Para cada relación anotá origen, destino, cardinalidad, propietario, columna y política de borrado. Primero guardá un caso mínimo, confirma, cierra contexto y recupera desde otro. Solo entonces agregá más relaciones. Ver una lista con hijos antes de guardar no demuestra que se conservaron.

La auditoría necesita mecanismo de asignación, la moneda una política de cálculo y la anulación puede requerir conservar histórico. No inventes tasas ni requisitos del curso. Usa el documento del campus para las reglas completas y este laboratorio para entender la herramienta paso a paso.

El bloque inferior es una estrategia en pseudocódigo: no se ejecuta. El proyecto independiente sí tiene programa completo. Distinguirlos te permite saber qué practicar sin tener que adivinar todas las piezas del sistema original.

## Ejemplo de la clase

```text
// Recorrido de creación:
// 1. Buscar relaciones obligatorias por id.
// 2. Construir Factura y sus Detalle.
// 3. Asignar factura en cada detalle.
// 4. Persistir y confirmar.
// 5. Consultar desde un contexto posterior y comparar.
```

[Abrir el fragmento como archivo](fragmentos/clase_09.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El fragmento expresa una estrategia y no un modelo completo. Las entidades del campus están en el proyecto contable descomprimido. Consultá sus atributos para adaptar nombres. Primero practicá con Producto/Categoria del proyecto ejecutable de apoyo y después ampliá a la consigna.

## Cambiar una decisión y explorar un límite

Si el propietario detalle.factura queda null, una lista en factura no compensa esa ausencia. Si recuperás sin cerrar o limpiar, el contexto puede devolver objetos ya conocidos y ocultar un problema de recuperación. Verificá una lectura nueva.

## Confusión que conviene evitar

Dar por terminado el mapeo sin guardar, recuperar y comparar las relaciones.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_09.md). Las [soluciones razonadas](SOLUCIONES_09.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_08.md) · [Clase siguiente](../13_JPQL/CLASE_01.md)
