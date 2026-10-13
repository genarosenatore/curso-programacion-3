# Clase 05.11 · Práctica: productos y clientes

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_10.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_01.md)

## Diseñar un modelo pequeño que conserve sus reglas

Un producto debe conocer nombre, precio y stock. Una **responsabilidad** es la tarea que ese objeto puede cumplir coherentemente: consultar disponibilidad, calcular un subtotal o descontar una cantidad válida. No necesita conocer HTML, un botón ni una base para resolver esas operaciones. Cliente puede guardar su identidad y nombre sin heredar de Producto.

Reuní [construcción](CLASE_04.md), [encapsulamiento](CLASE_05.md) y [excepciones](CLASE_09.md). Definí invariantes antes de métodos: nombre presente y no vacío, precio no negativo y stock no negativo. Una compra solicita una cantidad positiva y no mayor al stock. Si falla, no modifica el estado.

## Ejecutar el ejemplo que tiene todas sus piezas

El fragmento inferior depende de Producto con constructor de tres argumentos, descontarStock, getStock y subtotalCentavos. La definición de 05.04 tiene solo dos argumentos y no es intercambiable. Usá [U05Java.java](../Ejemplos/java/U05Java.java), donde esas piezas están reunidas; desde su carpeta ejecutá `javac -encoding UTF-8 U05Java.java` y `java U05Java` con Java 21.

Con Cuaderno de 200000 centavos y stock 5, descontar dos deja tres y el subtotal es 400000. Después intentar seis falla y conserva tres, porque el caso ocurre sobre el estado ya modificado. Si reiniciás otro producto con stock cinco, el mismo rechazo conserva cinco: el estado inicial de cada prueba importa.

`Math.multiplyExact` realiza la multiplicación de int y lanza si desborda. No cambia las reglas de cantidad ni la unidad del dinero; protege el rango numérico. Para importes decimales más generales aprenderemos BigDecimal en consultas e integración. Un test útil verifica datos y transición: antes, operación, después. La salida visible sola puede esconder que un campo quedó incorrecto.

## Ejemplo de la clase

```java
// Idea de uso dentro de main, con las clases del ejemplo de la unidad:
Producto producto = new Producto("Cuaderno", 200000, 5);
producto.descontarStock(2);
System.out.println(producto.getStock());
System.out.println(producto.subtotalCentavos(2));
```

[Abrir el fragmento como archivo](fragmentos/clase_11.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El resultado esperado es stock 3 y subtotal 400000 centavos. La clase de ejemplo completa incluye constructor y métodos. Cada regla se aplica antes de modificar. Una clase pequeña puede evolucionar después a DTO y entidad, pero no hacemos esa mezcla en la primera práctica.

## Cambiar una decisión y explorar un límite

Probá cantidad cero: rechazada. Probá comprar exactamente el stock disponible: queda cero y debe ser válida. Intentar otra unidad falla sin llevar a -1. Subtotal no debería descontar stock por sí mismo: consultar un cálculo y realizar una compra tienen efectos distintos.

## Confusión que conviene evitar

Confundir un objeto de dominio con una fila de base de datos antes de estudiar persistencia.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_11.md). Las [soluciones razonadas](SOLUCIONES_11.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_10.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_01.md)
