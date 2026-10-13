# Clase 08.02 · Lombok: getters, setters, constructores y builder

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_01.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_03.md)

## Saber qué miembros aparecerán

@Getter genera consultas de campos; @Setter escrituras. @NoArgsConstructor genera construcción sin argumentos, @AllArgsConstructor con campos y @RequiredArgsConstructor para campos requeridos según final y la política de @NonNull. No son intercambiables: un constructor vacío puede dejar sin datos un objeto que tu modelo necesita completo.

@Builder genera una construcción paso a paso. `ProductoVista.builder()` inicia el ayudante, `.nombre(...)` registra un valor, `.precioCentavos(...)` otro y `.build()` crea el resultado. Esas llamadas no son setters del objeto final ya creado. No completar un campo puede conservar null o el valor inicial del tipo; builder no equivale a «todos los campos obligatorios comprobados».

## Ejecutar con una dependencia real

El fragmento necesita Lombok. Podés poner una clase de práctica en el paquete curso del [proyecto Maven de apoyo](../Ejemplos/spring/README.md), que declara dependencia y procesador. Agregá un main dentro de ProductoVista que construya con builder y muestre getNombre. Desde la raíz del proyecto, `mvn compile` genera clases; el main de esa clase puede ejecutarse con `java -cp target/classes curso.ProductoVista`. El fragmento debe declarar package curso si lo ubicás allí.

Para comprender sin instalar Lombok, primero escribí constructor y getters manuales como en [08.01](CLASE_01.md); son una alternativa completa. El proyecto Maven necesita Java y descarga de dependencias. No afirmes que javac aislado reconocerá Lombok sin classpath y procesador.

@Data agrupa getters, setters de campos elegibles, constructor requerido, toString, equals y hashCode. Eso puede elegir igualdad por campos o imprimir relaciones que no convienen. En JPA una relación circular puede provocar recursión o carga inesperada; preferí generar explícitamente lo necesario y revisar los contratos. Menos líneas no garantiza reglas correctas.

## Ejemplo de la clase

```java
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class ProductoVista {
    private String nombre;
    private int precioCentavos;
}
// ProductoVista.builder().nombre("Cuaderno").precioCentavos(200000).build();
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El builder encadena métodos del ayudante de construcción generado y build crea el objeto. @Getter permite leer después. Esto requiere Lombok configurado; no es Java estándar sin librerías. Si se omite nombre, el builder no garantiza un nombre válido. El diseño debe decidir cómo validar.

## Cambiar una decisión y explorar un límite

Construí sin nombre: el builder puede producir un objeto con nombre null. Agregar @Getter no lo valida. Usar @Data en un producto con precio mutable puede involucrar ese campo en igualdad si no definís otra política, afectando estructuras hash.

## Confusión que conviene evitar

Confiar en defaults de un builder como si fueran validaciones de datos obligatorios.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../08_Lombok_DTO/CLASE_01.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_03.md)
