# Clase 05.10 · Paquetes, dependencias y estructura de proyecto

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_11.md)

## Organizar nombres y código reutilizado

Un paquete da un nombre compuesto a clases relacionadas. `package tienda.modelo;` declara el espacio al que pertenece Producto; las carpetas habituales lo reflejan bajo la raíz de código. `import tienda.modelo.Producto;` permite usar su nombre corto. No descarga bibliotecas ni ejecuta la clase importada.

La **ruta de clases** o classpath indica dónde encontrar clases al compilar y ejecutar. En un proyecto simple, src contiene fuente y out puede guardar bytecode. En Maven, src/main/java es la raíz de fuente; tienda/modelo comienza después de ella. No escribas package src.main.java.tienda.modelo.

## Un proyecto de dos archivos

Creá src/tienda/Producto.java con el ejemplo inferior y src/Inicio.java sin package, con main que importe tienda.Producto, cree new Producto y muestre nombre(). Desde la raíz ejecutá `javac -encoding UTF-8 -d out src/tienda/Producto.java src/Inicio.java`, después `java -cp out Inicio`. -d fija salida; -cp señala dónde buscar el bytecode.

Si Inicio también declara package tienda, va en src/tienda/Inicio.java y se ejecuta `java -cp out tienda.Inicio`. public permite acceder a tipos y métodos desde otro paquete. Un acceso de paquete funciona dentro del mismo paquete pero no fuera: no todos los fallos de import son una dependencia ausente.

Una **dependencia** es código externo requerido. Maven usa pom.xml para describirlo y resolver versiones, compile para compilar y package para generar distribución. Gradle tiene otra configuración. Un wrapper provee una forma de ejecutar la herramienta del proyecto; no aporta automáticamente Java. Compartir solo un .java que importa Lombok o Spring no incluye esas bibliotecas. Usá siempre la configuración del proyecto completo al avanzar.

## Ejemplo de la clase

```java
// Archivo: src/tienda/Producto.java
package tienda;
public class Producto {
    public String nombre() { return "Cuaderno"; }
}
// En otra clase: import tienda.Producto;
```

[Abrir el fragmento como archivo](fragmentos/clase_10.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La clase pública coincide con Producto.java. Si otra clase está en otro paquete, debe poder acceder al tipo y métodos necesarios. En proyectos Maven, la raíz de código suele ser src/main/java; dentro se ubica tienda/Producto.java. El prefijo de carpeta no forma parte del nombre del paquete.

## Cambiar una decisión y explorar un límite

Compilar a out y ejecutar sin -cp puede hacer que la clase no se encuentre aunque el archivo exista. Cambiar el paquete sin cambiar cómo llamás su nombre produce otro desacuerdo. No edites un .class: regeneralo desde su .java.

## Confusión que conviene evitar

Editar .class en lugar de .java o confundir una carpeta de compilados con código fuente.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_10.md). Las [soluciones razonadas](SOLUCIONES_10.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_09.md) · [Clase siguiente](../05_Java/CLASE_11.md)
