# Clase 09.06 · Práctica de Reflection y relación con frameworks

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_01.md)

## Dos momentos distintos del sistema de tipos

Los genéricos expresan relaciones comprobadas principalmente al compilar. Reflection inspecciona estructura durante ejecución. Combinarlos no recupera automáticamente toda información genérica borrada ni hace que cualquier acceso dinámico sea seguro.

Un ejercicio pequeño ayuda a distinguirlos: Caja<Cliente> admite y devuelve un Cliente. Luego cliente.getClass() obtiene sus metadatos. La caja garantiza qué tipo recupera el código; el descriptor permite enumerar qué miembros declara esa clase. Un nombre de componente no es el dato almacenado en ese cliente.

## Observar un record

El ejemplo define Cliente como record con nombre y correo, como aprendimos en [08.05](../08_Lombok_DTO/CLASE_05.md). getRecordComponents entrega descriptores de sus componentes y el recorrido muestra nombre:String y correo:String. Estos componentes sí corresponden al orden declarado del record, pero no generalices ese orden a getDeclaredFields o métodos.

Poné el record y Caja de 09.01 fuera de main o como tipos anidados y el recorrido dentro. También podés ejecutar [U09Genericos.java](../Ejemplos/java/U09Genericos.java), que reúne las piezas. Si usás getRecordComponents sobre una clase ordinaria, puede devolver null; comprobá isRecord antes de asumir ese contexto.

Los frameworks pueden utilizar reflexión, procesadores, proxies y generación de código. Este ejercicio explica una herramienta posible, no todo el mecanismo de Spring o JPA. Una inspección que lista campos no implementa validación, persistencia ni autorización. Conservá esa frontera para interpretar las próximas unidades.

## Ejemplo de la clase

```java
record Cliente(String nombre, String correo) {}
for (var componente : Cliente.class.getRecordComponents()) {
    System.out.println(componente.getName() + ": " + componente.getType().getSimpleName());
}
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Muestra nombre:String y correo:String. Para records, getRecordComponents expresa sus componentes directamente. Para una clase común usaríamos campos o métodos según el objetivo. El código observa nombres y tipos; no conoce valores de un cliente concreto.

## Cambiar una decisión y explorar un límite

Usá una clase ordinaria en vez de record: getRecordComponents no representa sus campos comunes. Dos Caja con argumentos distintos pueden tener el mismo getClass por borrado. Ese resultado no anula las comprobaciones que el compilador sí realizó.

## Confusión que conviene evitar

Pretender usar Reflection para reemplazar toda comprobación de tipos en código ordinario.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../09_Genericos_Reflection/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_01.md)
