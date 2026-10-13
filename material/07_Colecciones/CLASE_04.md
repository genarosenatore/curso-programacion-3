# Clase 07.04 · HashMap: claves y valores

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_03.md) · [Clase siguiente](../07_Colecciones/CLASE_05.md)

## Encontrar un valor por una clave

Un mapa asocia claves con valores. `Map<String,Integer>` permite buscar un stock numérico por código textual. La clave identifica la asociación; el valor puede repetirse en códigos distintos. put devuelve el valor previo o null si no había y reemplaza una asociación de la misma clave. No crea dos claves iguales.

get devuelve el valor o null si no está. HashMap puede admitir valores null, por eso containsKey permite distinguir «clave ausente» de «clave presente con valor null». Para un stock, conviene no admitir null y definir su ausencia como código no registrado; no confundirlo siempre con stock cero.

## Contar con un mapa

Para A,B,A, empezá con un mapa vacío. Por cada código obtené el conteo previo con getOrDefault(codigo,0), sumá uno y guardá con put. El recorrido produce A=1, B=1 y A=2. Poner siempre uno no acumula: reemplaza.

entrySet entrega pares clave/valor para recorrer; getKey y getValue consultan cada parte. En el ejemplo inferior var infiere el tipo de la variable local por contexto; no elimina su tipo ni permite cambiarlo arbitrariamente. Si usás nombres cortos, importá Map y HashMap y colocá operaciones dentro de main.

HashMap no promete orden de inserción. Las claves propias requieren igualdad y hash estables; usar un objeto mutable cuya identidad dependa de campos cambiantes puede romper búsquedas. Para un índice de producto por código, String inmutable suele expresar una clave simple.

## Ejemplo de la clase

```java
java.util.Map<String, Integer> stock = new java.util.HashMap<>();
stock.put("P01", 5);
stock.put("P01", 3);
System.out.println(stock.get("P01"));
System.out.println(stock.getOrDefault("P02", 0));
for (var entrada : stock.entrySet()) {
    System.out.println(entrada.getKey() + "=" + entrada.getValue());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_04.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El valor de P01 queda 3. P02 no existe y obtiene cero mediante getOrDefault. var permite inferir el tipo de una variable local; no vuelve dinámico el lenguaje. entrySet evita buscar el valor nuevamente para cada clave.

## Cambiar una decisión y explorar un límite

Consultar P02 con get devuelve null; con getOrDefault(P02,0) devuelve cero. Eso es una política alternativa, no prueba de que P02 exista agotado. containsKey permite distinguir la inexistencia cuando esa información importe.

## Confusión que conviene evitar

Reemplazar siempre por 1 y perder el conteo acumulado.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_03.md) · [Clase siguiente](../07_Colecciones/CLASE_05.md)
