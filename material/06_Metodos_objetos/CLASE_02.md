# Clase 06.02 · toString y representación legible

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_01.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_03.md)

## Convertir un objeto en una explicación legible

Imprimir una referencia no revela necesariamente sus datos. Object.toString produce una representación predeterminada con nombre de clase y una forma del hash; no es una dirección de memoria que debas usar como identidad. Sobrescribir toString permite mostrar datos útiles para reconocer una instancia durante depuración.

La firma debe ser `public String toString()` sin parámetros. @Override comprueba que coincida con la operación heredada. El método **retorna** texto: no debería imprimir dentro, guardar datos ni modificar estado. Cuando println recibe el objeto, utiliza su representación textual para la salida.

## Construir el mensaje por partes

En el ejemplo inferior el literal "Producto{codigo='" inicia la etiqueta, + agrega el código y el último literal cierra el mensaje. Las comillas dobles delimitan texto Java; las simples dentro son caracteres de la representación. No son sintaxis JSON. Colocá Producto como clase de paquete fuera de main y en main imprimí new Producto("P01").

Elegí campos relevantes: un código y nombre suelen ayudar; una contraseña no. Si un cliente tiene pedidos y cada pedido referencia al cliente, imprimir todos los relacionados desde ambos lados puede repetir llamadas indefinidamente. Representá una relación con un identificador o resumen limitado en lugar de todo su grafo.

toString es útil para personas que investigan un programa, pero su formato puede cambiar. No lo uses como archivo persistente ni como contrato de API: para transportar datos enseñaremos DTO y JSON. Cambiar su representación tampoco cambia equals ni hashCode, que tienen otro propósito.

## Ejemplo de la clase

```java
class Producto {
    private final String codigo;
    Producto(String codigo) { this.codigo = codigo; }
    @Override public String toString() {
        return "Producto{codigo='" + codigo + "'}";
    }
}
// En main: System.out.println(new Producto("P01"));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

println utiliza toString y muestra Producto{codigo='P01'}. El nombre de la clase y código hacen reconocible el objeto. Si agregamos precio, podemos decidir incluirlo; esa decisión no cambia su regla de igualdad.

## Cambiar una decisión y explorar un límite

Agregá precio al mensaje: mejora cierto diagnóstico pero no cambia la igualdad por código. Una representación recursiva cliente→pedido→cliente puede desbordar la pila de llamadas. No soluciona ese ciclo imprimir más campos.

## Confusión que conviene evitar

Esperar que toString produzca JSON correcto o sirva como base de datos.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_01.md) · [Clase siguiente](../06_Metodos_objetos/CLASE_03.md)
