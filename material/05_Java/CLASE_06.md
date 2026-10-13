# Clase 05.06 · static, referencias y null

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_05.md) · [Clase siguiente](../05_Java/CLASE_07.md)

## Compartir una referencia no duplica un estado

Una variable de objeto contiene una referencia. `Contador b = a;` copia esa referencia, así a y b permiten acceder al mismo objeto. Un segundo `new Contador()` crea otra instancia y ejecuta otra vez su constructor. Un cambio de atributo mediante b se observa mediante a solo si comparten la instancia.

`null` significa que no hay objeto referenciado. No representa una instancia con campos vacíos. Llamar un método sobre null produce NullPointerException. Una comprobación `if (a != null)` permite decidir qué hacer antes del acceso; también podés definir un contrato que rechace null al construir en lugar de arrastrar esa ausencia.

## Un dato de clase y uno de cada objeto

static significa que el miembro pertenece a la clase, compartido por sus instancias. En el ejemplo, creados cuenta construcciones; valor es de cada contador. Tras new, creados pasa a 1. Asignar b=a no construye y permanece 1. Al cambiar b.valor a 7, a.valor muestra 7. Con otro new, creados pasa a 2 y el nuevo valor empieza en cero.

Para ejecutar, ubicá la definición de Contador fuera de main y las operaciones dentro de main de [05.01](CLASE_01.md). Consultá `Contador.creados` por el nombre de clase para comunicar que no pertenece a un contador particular. Un método static no recibe automáticamente this y no puede acceder a un campo de instancia sin indicar qué objeto utiliza.

final sobre una referencia impide sustituirla pero permite mutar el objeto si sus operaciones lo permiten, como const sobre objetos JavaScript. No hagas todos los atributos static para que sean accesibles desde main: convertirías estados individuales en un dato compartido por todos los productos.

## Ejemplo de la clase

```java
class Contador {
    static int creados = 0;
    int valor = 0;
    Contador() { creados++; }
}
// En main:
Contador a = new Contador();
Contador b = a;
b.valor = 7;
System.out.println(a.valor);
System.out.println(Contador.creados);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra 7 y 1. b apunta al mismo objeto que a; no hubo un segundo constructor. creados se consulta por el nombre de la clase porque es compartido. Si creamos otro new Contador, hay otro valor de instancia y creados aumenta a 2.

## Cambiar una decisión y explorar un límite

Creá a y b con dos new: cambiar b.valor no afecta a.valor y creados vale 2. Luego asigná b=null: el objeto de a no se borra por eso. Leer b.valor falla porque esa referencia ya no lo alcanza.

## Confusión que conviene evitar

Usar null como si fuera un objeto vacío con valores por defecto.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_05.md) · [Clase siguiente](../05_Java/CLASE_07.md)
