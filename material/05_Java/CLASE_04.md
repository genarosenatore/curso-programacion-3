# Clase 05.04 · Clases, objetos, atributos y constructores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_03.md) · [Clase siguiente](../05_Java/CLASE_05.md)

## Un modelo y sus instancias

Una clase reúne estructura y comportamiento. Un **atributo** conserva estado de una instancia y un método opera sobre él. Producto declara qué datos tiene cada producto; `new Producto(...)` crea uno concreto. Dos new crean estados independientes aunque pertenezcan al mismo tipo.

El **constructor** recibe datos iniciales al crear. Lleva el nombre de la clase y no un tipo de retorno. `void Producto(...)` sería un método ordinario, no ese constructor. Si declarás un constructor con parámetros, Java no agrega automáticamente uno sin argumentos; tendrás que definirlo si hace falta.

## Asignar al objeto que se está creando

En `this.nombre = nombre`, this identifica la instancia actual. El lado derecho es el parámetro; el izquierdo su atributo. Sin this, `nombre = nombre` asignaría el parámetro a sí mismo y dejaría el atributo sin ese valor. Esa distinción no depende de la sangría.

Para ejecutar, poné la clase Producto del fragmento inferior como clase no pública después de la clase Hola de [05.01](CLASE_01.md), en el mismo Hola.java. Dentro de main creá `Producto a = new Producto("Cuaderno",200000);` y mostrá a.nombre. La variable a contiene una referencia, una forma de acceder al objeto creado, no la definición de su clase.

El ejemplo usa acceso de paquete para concentrarse en construcción. En la próxima clase haremos private para controlar cambios. El estado inicial debe tener reglas: nombre presente y precio permitido. Aunque Java acepte int negativo, el modelo de una venta puede rechazarlo. Creación correcta significa cumplir la forma y también el significado.

## Ejemplo de la clase

```java
class Producto {
    String nombre;
    int precioCentavos;
    Producto(String nombre, int precioCentavos) {
        this.nombre = nombre;
        this.precioCentavos = precioCentavos;
    }
}
// En main: Producto p = new Producto("Cuaderno", 200000);
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

p referencia una instancia de Producto. this.nombre recibe el parámetro nombre. Otro new construye otro objeto con su propio estado. Usamos centavos para que el importe del ejemplo sea entero; 200000 centavos representan 2000 unidades monetarias.

## Cambiar una decisión y explorar un límite

Creá otro producto con nombre Lapicera y modificá su precio: a conserva su propio estado. Cambiá this.nombre=nombre por nombre=nombre: el atributo queda null porque las referencias de instancia sin asignación explícita tienen ese valor inicial. No es un objeto String vacío.

## Confusión que conviene evitar

Agregar void al constructor y convertirlo accidentalmente en un método.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_03.md) · [Clase siguiente](../05_Java/CLASE_05.md)
