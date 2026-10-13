# Clase 05.08 · Interfaces y polimorfismo

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_07.md) · [Clase siguiente](../05_Java/CLASE_09.md)

## Usar una capacidad sin conocer su clase concreta

Una interface Java declara un contrato de operaciones. La clase que usa implements promete implementarlas. `Envio envio` puede referenciar Retiro o Domicilio: el llamador utiliza costoCentavos y la implementación decide su resultado. Esa elección de comportamiento por el objeto concreto es **polimorfismo**.

Los métodos abstractos ordinarios de interfaz son públicos; la implementación no puede reducir su acceso. Una interfaz también puede incluir métodos default con cuerpo y métodos static, pero no necesitamos esas variantes para este contrato inicial. A diferencia de una interfaz TypeScript, aquí forma parte de los tipos Java en ejecución y las clases declaran explícitamente implements.

## Seguir una llamada

Colocá Envio, Retiro y Domicilio fuera de main en el archivo de consola. Dentro creá Envio envio=new Domicilio() y llamá costoCentavos. El compilador comprueba que Envio declare ese método; al ejecutar se utiliza el cuerpo de Domicilio y vuelve 50000. Si cambiás solo new Domicilio por new Retiro, vuelve cero sin cambiar la llamada.

Podés declarar `Envio[] opciones = {new Retiro(),new Domicilio()};` y recorrer las opciones con for(Envio opcion:opciones). Ambos objetos cumplen la misma operación aunque sean clases distintas. No se crea una instancia directa de Envio con new Envio() en esta definición.

El contrato debe aclarar unidades, entradas admitidas y resultado, como costo no negativo en centavos. Una implementación que devuelva pesos en el mismo int compilaría pero violaría el significado. Una interfaz conviene cuando queremos variar una capacidad y mantener al consumidor independiente; no hace falta crear una para cada clase sin motivo.

## Ejemplo de la clase

```java
interface Envio { int costoCentavos(); }
class Retiro implements Envio {
    public int costoCentavos() { return 0; }
}
class Domicilio implements Envio {
    public int costoCentavos() { return 50000; }
}
// En main: Envio envio = new Domicilio(); System.out.println(envio.costoCentavos());
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

La variable envio se usa mediante el contrato y devuelve 50000. Si se construye Retiro, devuelve cero sin cambiar la llamada. Los métodos de implementación deben ser public porque los de la interface lo son en este caso. No se puede hacer new Envio() directamente con esta definición.

## Cambiar una decisión y explorar un límite

Agregá Express por 100000 centavos: el recorrido existente puede invocarlo sin un if por su nombre. Si su método no es public, la implementación no cumple la visibilidad del contrato. Si retorna -1 como costo normal, puede compilar pero incumple la regla acordada.

## Confusión que conviene evitar

Escribir muchos if por nombre de clase cuando el contrato puede resolver la variación.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../05_Java/CLASE_07.md) · [Clase siguiente](../05_Java/CLASE_09.md)
