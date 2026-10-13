# Clase 09.04 · Class y metadatos de una clase

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_03.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_05.md)

## Observar la estructura de un tipo en ejecución

**Metadatos** describen el programa: nombre de clase, campos, métodos y tipos. El objeto Class representa esa información. `String.class` obtiene el descriptor conocido por nombre; `objeto.getClass()` obtiene el tipo concreto de la instancia. No es una instancia de String ni su valor textual.

Reflection es el conjunto de herramientas que permite inspeccionar y, bajo condiciones, utilizar esa estructura dinámicamente. Sirve para herramientas y frameworks que no conocen todos los tipos al compilar. Para una llamada conocida, el código directo sigue siendo más claro y verificable.

## Leer el descriptor

`Class<?>` indica un descriptor cuyo tipo específico no necesitamos fijar. getSimpleName entrega el nombre breve; getName incluye el paquete. getDeclaredMethods enumera los métodos declarados en ese tipo, incluso no públicos; getMethods enumera públicos, incluidos heredados. **Enumerar** no invoca: ver un método length no mide ninguna cadena.

El ejemplo inferior va dentro de main. La variable metodo es un descriptor java.lang.reflect.Method y getName consulta su nombre. El orden de enumeración no está garantizado; filtrar por nombre evita depender de una posición accidental. El mismo nombre puede tener varias sobrecargas y la firma incluye parámetros, no solo nombre.

Para campos, getDeclaredFields retorna descriptores Field. getType consulta su clase de dato. Eso informa que Cliente.nombre es String, no cuál es el nombre de un cliente particular. Leer valores requiere una instancia y acceso permitido, que no necesitamos en este primer ejercicio.

Reflection puede encontrar restricciones de acceso y módulos y añade errores que una llamada directa detectaría antes. Usala para una necesidad real de inspección, no para evitar definir un contrato tipado.

## Ejemplo de la clase

```java
Class<?> tipo = String.class;
System.out.println(tipo.getSimpleName());
for (java.lang.reflect.Method metodo : tipo.getDeclaredMethods()) {
    if (metodo.getName().equals("length")) System.out.println(metodo.getName());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra String y el método length. El orden de métodos no es un contrato estable. Class<?> indica que tenemos información de una clase cuyo tipo concreto no necesitamos fijar. No se ejecuta length por enumerarlo.

## Cambiar una decisión y explorar un límite

String.class y "Ana".getClass() describen el mismo tipo, pero ninguno es la cadena Ana. Una clase hija hereda métodos que pueden aparecer en getMethods y no en getDeclaredMethods. No afirmes que enumerar implica ejecutar.

## Confusión que conviene evitar

Confundir nombre de atributo con su valor en un objeto particular.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_03.md) · [Clase siguiente](../09_Genericos_Reflection/CLASE_05.md)
