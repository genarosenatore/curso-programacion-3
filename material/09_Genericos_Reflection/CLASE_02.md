# Clase 09.02 · Límites de tipos y wildcards

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_01.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_03.md)

## Leer subtipos sin permitir escrituras incompatibles

Integer es un Number, pero List<Integer> no es List<Number>. Si lo fuera, una función que acepta List<Number> podría insertar Double y romper la lista de enteros. Esa falta de sustitución automática se llama **invariancia** de esos argumentos genéricos.

Una **wildcard** `?` expresa un tipo que no fijamos. `? extends Number` significa algún subtipo de Number; permite leer sus elementos como Number. No sabemos si concretamente son Integer o Double y no podemos agregar arbitrariamente ninguno. `? super Integer` significa algún supertipo de Integer; permite agregar Integer, pero al leer solo podemos asumir Object.

## Usar límites que habilitan operaciones

`<T extends Number>` restringe el parámetro declarado y permite llamar métodos de Number como doubleValue. No es lo mismo que cualquier T: sin límite, el compilador no puede asumir ese método. La regla «productor extends, consumidor super» resume qué operaciones necesitamos, pero siempre comprobá quién produce y quién recibe valores.

El método sumar inferior recibe una lista productora. Colocalo fuera de main y llamalo con java.util.List.of(1,2) y List.of(1.5,2.5). Se recorren Number y se convierten a double; vuelve 3.0 y 4.0. Es una suma didáctica, no precisión monetaria exacta. En [] devuelve 0.0; el contrato supone valores no nulos.

Si una función solo imprime Object, puede no necesitar genéricos. Si copia desde un origen de subtipos a un destino compatible, los límites expresan esa relación. No uses casts para convertir una lista de Integer en lista de Number: el problema es qué escrituras permitiría, no su nombre de variable.

## Ejemplo de la clase

```java
static double sumar(java.util.List<? extends Number> valores) {
    double total = 0;
    for (Number valor : valores) total += valor.doubleValue();
    return total;
}
// sumar(List.of(1,2)); sumar(List.of(1.5,2.5));
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Los dos arrays de lista se aceptan como productores de Number. Dentro no sabemos si la lista concreta admite Integer o Double, por eso no añadimos cualquiera de esos tipos. doubleValue expresa una conversión numérica para este cálculo didáctico, no una política de precisión monetaria.

## Cambiar una decisión y explorar un límite

La vista ? extends Number puede leer un Integer como Number, pero agregar 2.5 no es seguro porque podría ser una List<Integer>. En ? super Integer podés agregar 2, pero no leer directamente como Integer: el destino podría contener otros Object.

## Confusión que conviene evitar

Interpretar extends como permiso para agregar cualquier subclase del límite.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_01.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_03.md)
