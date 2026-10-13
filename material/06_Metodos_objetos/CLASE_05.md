# Clase 06.05 · Práctica: objetos repetidos y claves estables

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: objetos repetidos y claves estables**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Vamos a comprobar representación, igualdad y hash como un conjunto. Un catálogo puede recibir el mismo producto varias veces y necesita decidir si es duplicado. Las pruebas deben cubrir el mismo objeto, dos objetos equivalentes, códigos distintos y null.

Para esta práctica usamos identidad por código no nulo e inmutable, sin persistencia. Las entidades con ids generados plantean casos adicionales antes de guardar; no trasladamos automáticamente esta estrategia a JPA.

## Ejemplo

```java
java.util.Set<Producto> catalogo = new java.util.HashSet<>();
catalogo.add(new Producto("P01"));
catalogo.add(new Producto("P01"));
catalogo.add(new Producto("P02"));
System.out.println(catalogo.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Usá las clases definidas en esta lección o en la anterior. El programa completo de igualdad permite verificar los contratos.

## Leamos el ejemplo paso a paso

El conjunto debe tener tamaño 2 con la clase de igualdad anterior. No garantiza un orden de impresión. Para comprobarlo, buscá por igualdad con otro new Producto("P01"). La relación entre Set y sus reglas se desarrolla en la siguiente unidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Añadí una tabla de resultados para todas las comparaciones y comprobá contains para P01 y P03.

Abrí [los ejercicios y las pistas](EJERCICIOS_05.md). Las [soluciones explicadas](SOLUCIONES_05.md) están preparadas para consultar después de intentarlo.

## Error común

Modificar la clave después de insertar y atribuir a la colección la búsqueda fallida.

## Resumen para repasar

Vamos a comprobar representación, igualdad y hash como un conjunto. Un catálogo puede recibir el mismo producto varias veces y necesita decidir si es duplicado.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **06.05** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_01.md)
