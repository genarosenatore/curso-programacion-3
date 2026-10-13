# Clase 12.05 · EntityManager y ciclo de vida

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_04.md) · [Clase siguiente](../12_JPA/CLASE_06.md)

## Un contexto que conoce los objetos que administra

EntityManager es el punto de acceso JPA para gestionar entidades en un **contexto de persistencia**. Ese contexto conserva identidad y seguimiento: dentro del mismo, recuperar dos veces el mismo tipo e id normalmente devuelve la misma instancia gestionada. No es una conexión permanente adherida a cualquier objeto que lleve ese número.

Una entidad **nueva** todavía no es gestionada ni guardada. **Gestionada** pertenece al contexto y sus cambios se siguen. **Separada** o detached conservó datos pero ya no está asociada a ese contexto. **Eliminada** está marcada para borrado al sincronizar. Tener id no permite distinguir gestionada de separada: em.contains informa pertenencia de una instancia.

## Seguir una modificación

find(Producto.class,id) recupera por clave y devuelve null si no existe. Cuando devuelve entidad gestionada, modificar nombre permite al proveedor detectar el cambio, llamado seguimiento de cambios o dirty checking. flush sincroniza operaciones pendientes con la base y puede ejecutar UPDATE; commit confirma la transacción. Flush no es confirmación y un rollback posterior puede deshacer ese SQL.

En [el laboratorio](../Ejemplos/persistencia/README.md), main crea EntityManager, comienza transacción, realiza operaciones, confirma y cierra. El fragmento inferior usa em e id ya definidos y un setter existente en el modelo. No se puede pegar en una consola Java sin preparar ese entorno.

Al cerrar o clear del contexto, la entidad queda separada. Cambiarla después no actualiza automáticamente la base. Para una actualización de entrada externa, recuperar la gestionada dentro de una nueva transacción y aplicar campos aceptados suele ser más claro que copiar un objeto incompleto entero.

EntityManagerFactory crea contextos y es más costosa; se conserva durante la aplicación y se cierra al terminar. Un EntityManager no es para compartir libremente entre hilos. La vida del contexto explica también por qué una relación lazy puede fallar al acceder después.

## Ejemplo de la clase

```java
// Dentro de un método transaccional que dispone de EntityManager em:
Producto producto = em.find(Producto.class, id);
if (producto == null) throw new IllegalArgumentException("Producto inexistente");
producto.setNombre("Cuaderno grande");
em.flush();
```

[Abrir el fragmento como archivo](fragmentos/clase_05.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

find obtiene una entidad gestionada. Cambiarla se detecta en el contexto y flush puede emitir SQL. Si la transacción se revierte, ese SQL no queda confirmado. El setter debe existir en la clase del proyecto; el fragmento no es un programa de consola independiente.

## Cambiar una decisión y explorar un límite

Recuperá dos veces un producto en un contexto y compará referencias: el contexto conserva identidad. Cerrá y recuperá en otro: es otro objeto con la misma identidad persistente. La igualdad de dominio y la pertenencia a contexto son preguntas distintas.

## Confusión que conviene evitar

Confundir id presente con entidad actualmente gestionada.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_05.md). Las [soluciones razonadas](SOLUCIONES_05.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_04.md) · [Clase siguiente](../12_JPA/CLASE_06.md)
