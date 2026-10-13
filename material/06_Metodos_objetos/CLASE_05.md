# Clase 06.05 · Práctica: objetos repetidos y claves estables

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_01.md)

## Verificar identidad, igualdad y pertenencia juntos

Un catálogo con duplicados necesita una regla de equivalencia concreta. Usaremos código no nulo, estable y final de [06.03](CLASE_03.md). Antes de una estructura de datos, comprobá los contratos directamente: mismo objeto, dos objetos equivalentes, código diferente, otro tipo y null.

El ejemplo usa **Set**, un conjunto que conserva como máximo un representante de cada elemento igual. `HashSet` es una implementación que usa hash para ayudar a buscar. `Set<Producto>` indica el tipo de elementos admitidos; los signos angulares son parámetros de tipo, no comparaciones de números. `new HashSet<>()` crea el conjunto, `add` intenta incluir y `size` cuenta elementos. Desarrollaremos colecciones en la unidad 07; esta explicación permite leer el ejemplo sin adivinarlo.

## Seguir las tres inserciones

Primero se agrega P01, tamaño uno. El segundo new crea otra instancia P01; equals la considera equivalente y el hash coincide, así no agrega otro representante. P02 es diferente y aumenta a dos. `contains(new Producto("P01"))` consulta pertenencia usando un objeto equivalente nuevo: no necesita la misma referencia original.

Ejecutá [U06Igualdad.java](../Ejemplos/java/U06Igualdad.java), o poné la clase Producto anterior junto a main y copiá las operaciones del fragmento. No hay garantía de orden en HashSet: comparar su texto impreso en un orden exacto no comprueba el contrato relevante.

Esta estrategia se aplica al catálogo del ejercicio. Entidades JPA con id generado pueden empezar sin id y requieren otra política: dos objetos nuevos con null no deben asumirse equivalentes por copiar la regla. El modelo de igualdad tiene límites y se revisa al introducir persistencia.

## Ejemplo de la clase

```java
java.util.Set<Producto> catalogo = new java.util.HashSet<>();
catalogo.add(new Producto("P01"));
catalogo.add(new Producto("P01"));
catalogo.add(new Producto("P02"));
System.out.println(catalogo.size());
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El conjunto debe tener tamaño 2 con la clase de igualdad anterior. No garantiza un orden de impresión. Para comprobarlo, buscá por igualdad con otro new Producto("P01"). La relación entre Set y sus reglas se desarrolla en la siguiente unidad.

## Cambiar una decisión y explorar un límite

Sin equals propio, los dos P01 son referencias distintas y el conjunto puede conservar tres elementos. Solo toString no elimina duplicados. Cambiar el código usado como clave después de insertar puede hacer fallar contains; el precio mutable, excluido de la igualdad, no debe afectar esa pertenencia.

## Confusión que conviene evitar

Modificar la clave después de insertar y atribuir a la colección la búsqueda fallida.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../06_Metodos_objetos/CLASE_04.md) · [Clase siguiente](../07_Colecciones/CLASE_01.md)
