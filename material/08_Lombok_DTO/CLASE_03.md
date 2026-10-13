# Clase 08.03 · DTO: diferencia con entidad y modelo de pantalla

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_02.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_04.md)

## Diseñar los datos que cruzan un límite

Un **DTO**, objeto de transferencia de datos, define qué datos se entregan o reciben entre partes de una aplicación. No significa automáticamente «copia de toda la entidad». Un modelo de dominio contiene estado y reglas; una entidad de persistencia lo relacionará con almacenamiento; un modelo de pantalla adapta lo que una vista necesita. Sus responsabilidades pueden requerir campos distintos.

Para un catálogo, la salida necesita id, nombre y precio. Para solicitar una compra, la entrada necesita productoId y cantidad; el cliente no tiene autoridad para elegir el precio final. Diseñar dos DTO hace visible esa diferencia. El backend puede cambiar su almacenamiento manteniendo ese contrato.

## Leer la notación del ejemplo

`record ProductoDTO(long id,String nombre,int precioCentavos) {}` declara una clase compacta con esos componentes. Java genera un constructor que recibe los tres en orden y accesores id(), nombre() y precioCentavos(). Así `new ProductoDTO(1,"Cuaderno",200000)` crea el dato y `.nombre()` lo consulta. No lleva getters getNombre por defecto. En [08.05](CLASE_05.md) desarrollaremos sus restricciones y métodos generados; esta lectura mínima permite seguir la representación.

Los records van fuera de main o como tipos dentro de otra clase, nunca como una serie de operaciones mezcladas con llamadas. El DTO también puede ser una clase ordinaria con constructor y getters como en 08.01: el patrón no depende de record ni Lombok.

Una entrada tipada como int cantidad puede ser negativa. La validación de formato y reglas sigue siendo necesaria. Omitir una credencial de la respuesta evita exponerla por ese contrato, pero no implementa por sí solo autorización. Elegí los datos por la operación que necesita el cliente.

## Ejemplo de la clase

```java
record ProductoDTO(long id, String nombre, int precioCentavos) {}
record CrearPedidoDTO(long productoId, int cantidad) {}
// El request no incluye un total calculado por el usuario.
```

[Abrir el fragmento como archivo](fragmentos/clase_03.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

ProductoDTO presenta datos de catálogo. CrearPedidoDTO pide una operación y contiene solo lo necesario para solicitarla. Los records son una opción, no la definición de DTO: también puede ser una clase común. Validar el id y cantidad sigue siendo obligatorio al procesar la petición.

## Cambiar una decisión y explorar un límite

Agregar todos los campos internos al DTO devuelve exposición y acoplamiento que queríamos controlar. Si entrada incluye total, el servidor igual debe recalcularlo con reglas propias; confiar en un número enviado permite alterar el pedido.

## Confusión que conviene evitar

Copiar todos los campos de entidad a cualquier DTO sin pensar el contrato.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_02.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_04.md)
