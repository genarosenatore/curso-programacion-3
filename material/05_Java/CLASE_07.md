# Clase 05.07 · Herencia, composición y clases abstractas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_06.md) · [Clase siguiente](../05_Java/CLASE_08.md)

## Modelar relaciones, no solo ahorrar código

**Herencia** permite que una clase sea una especialización de otra mediante extends. **Composición** permite que una clase contenga o use otra mediante un atributo. Efectivo es un MedioPago; Pedido tiene un MedioPago. Si Pedido extendiera MedioPago, estaríamos diciendo que un pedido es un medio de pago, algo distinto del problema.

Una clase abstract no puede instanciarse directamente. Puede conservar estado común, tener métodos implementados y declarar métodos abstractos sin cuerpo. Una subclase concreta debe implementar los pendientes. `super(...)` invoca el constructor de la base y `super.metodo()` puede utilizar una implementación heredada. Java permite extender una sola clase directamente.

## Sobrescribir y sustituir

**Sobrescribir** proporciona una implementación de un método heredado con una firma compatible. @Override pide al compilador comprobar esa intención: si escribís mal el nombre, detecta que no hay tal método. Sobrecargar es diferente: declarar otro método con parámetros distintos. Una subclase debe respetar el significado del contrato, no solo compilar.

En el ejemplo inferior, Efectivo devuelve su descripción. Pedido guarda un MedioPago con composición, permitiendo otro medio sin crear otra clase Pedido. El campo final mantiene esa referencia; no demuestra que el objeto MedioPago sea inmutable.

Para ejecutar, colocá las tres clases fuera de main, como clases no públicas junto a Hola. Dentro escribí `MedioPago medio = new Efectivo(); System.out.println(medio.descripcion());`. Muestra Pago en efectivo. `new MedioPago()` es incorrecto porque el tipo abstracto no tiene una implementación completa concreta.

Conviene herencia cuando un objeto especializado puede utilizarse donde se espera la base sin romper su contrato. Si solo comparten nombre o algunas líneas, composición o un auxiliar puede ser mejor. Una jerarquía profunda agrega dependencia; no es requisito de un buen modelo.

## Ejemplo de la clase

```java
abstract class MedioPago {
    abstract String descripcion();
}
class Efectivo extends MedioPago {
    @Override String descripcion() { return "Pago en efectivo"; }
}
class Pedido {
    private final MedioPago medio;
    Pedido(MedioPago medio) { this.medio = medio; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Efectivo es un MedioPago. Pedido tiene un MedioPago mediante composición. Podemos agregar otro medio sin convertir Pedido en una subclase de cada opción. El campo final fija su referencia después del constructor, no garantiza que el objeto referenciado sea inmutable.

## Cambiar una decisión y explorar un límite

Agregá Transferencia con otra descripción: la variable MedioPago puede utilizarla con la misma llamada. Hacer Cliente extends Domicilio no expresa que tenga una dirección; confunde las funciones. Usá un atributo Domicilio cuando esa es la relación real.

## Confusión que conviene evitar

Construir jerarquías solo porque dos clases comparten algunos atributos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_06.md) · [Clase siguiente](../05_Java/CLASE_08.md)
