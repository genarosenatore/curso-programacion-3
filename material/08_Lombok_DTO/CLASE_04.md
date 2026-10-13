# Clase 08.04 · Mapeo entre entidad y DTO

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_03.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_05.md)

## Transformar una representación en otra

**Mapear** es construir un dato de salida a partir de uno de entrada. No es el Map de colecciones: aquí el verbo expresa una transformación. El método aDTO recibe un Producto y crea un ProductoDTO con campos escogidos. Los objetos son distintos aunque contengan referencias o valores copiados.

En el ejemplo ambos tipos son records, cuya sintaxis y accesores se introdujeron en [08.03](CLASE_03.md). Producto.codigo() consulta el componente; new ProductoDTO(...) ordena los argumentos según su constructor. El nombre parecido de los campos no realiza la copia automáticamente: cada argumento explicita la correspondencia.

## Probar el mapeo sin infraestructura

Poné ambos records dentro de la clase de consola, fuera de main, y aDTO como método static junto a main. En main creá Producto y llamá System.out.println(aDTO(producto)). Compilá y ejecutá como [Java 05.01](../05_Java/CLASE_01.md). Es Java puro: no necesita tabla ni framework para entender la transformación.

Para disponibilidad, añadí stock al modelo y un boolean disponible al DTO; el mapeo obtiene stock > 0. No modifica stock. Para una relación, la salida puede incluir un código o resumen en lugar de copiar todo el objeto relacionado. Evitá mapear cliente→pedidos→cliente indefinidamente.

El camino de entrada tiene otro trabajo: recibir categoriaId no prueba que esa categoría exista. Más adelante el servicio buscará la relación y validará antes de guardar. Mapeo, validación y persistencia son operaciones distintas que pueden coordinarse, pero ninguna se obtiene automáticamente por ejecutar las otras.

## Ejemplo de la clase

```java
record Producto(String codigo, String nombre, int precioCentavos) {}
record ProductoDTO(String codigo, String nombre, int precioCentavos) {}
static ProductoDTO aDTO(Producto producto) {
    return new ProductoDTO(producto.codigo(), producto.nombre(), producto.precioCentavos());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El método toma un objeto y construye otro. En este ejemplo ambos son records para concentrarnos en el mapeo. Si la entidad tuviera datos internos, simplemente no se incluirían en la salida. Los valores del dominio no cambian porque se prepare una representación.

## Cambiar una decisión y explorar un límite

Cambiá solo el nombre mostrado en DTO, por ejemplo a mayúsculas: el dominio conserva su texto original. Agregar un DTO no cambia un precio inválido en válido. Si falta Producto y aDTO lo recibe null, decidí rechazo o ausencia antes de acceder; el ejemplo supone producto presente.

## Confusión que conviene evitar

Confundir mapear con validar o guardar automáticamente.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_03.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_05.md)
