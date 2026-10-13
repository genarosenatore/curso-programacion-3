# Clase 12.02 · Entity, Table, Id, GeneratedValue y Column

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_01.md) · [Clase siguiente](../12_JPA/CLASE_03.md)

## Identidad y correspondencia de columnas

@Entity utiliza por defecto el nombre de clase como nombre de entidad para JPQL. @Table puede elegir el nombre físico de tabla. @Id marca identidad y @GeneratedValue delega su generación según estrategia. En IDENTITY el motor genera al insertar; otras estrategias utilizan secuencias o mecanismos diferentes según motor y proveedor. No elijas una sin revisar compatibilidad.

El Long id empieza null en una entidad nueva, lo que distingue todavía no asignado de un valor conocido. Dos entidades nuevas con null no son automáticamente «el mismo producto». Copiar el equals por id sin tratar esa situación puede deduplicarlas incorrectamente.

Una entidad ordinaria de este recorrido tiene una clase concreta que el proveedor puede instanciar, constructor sin argumentos public o protected y no se declara final; sus miembros persistentes tampoco se declaran final. Puede existir una entidad abstracta dentro de una jerarquía apropiada, pero no necesitamos ese caso para Producto. Un record final con campos finales no es sustituto automático de esta entidad. Separa esas restricciones del contrato de un DTO, donde record sí resulta útil.

## Acceso por campo y propiedad

La colocación de @Id en el campo del ejemplo determina acceso por campos en esa jerarquía, salvo configuración explícita. El proveedor puede leerlos sin getters públicos. Si se coloca en getter, se utiliza acceso por propiedades. Mezclar anotaciones sin elegir una estrategia puede omitir mapeos; @Access permite expresarlo deliberadamente, pero no es necesario para nuestro modelo simple.

@Column(nullable=false) describe no nulidad de la columna; name la renombra. precision y scale describen dígitos totales y decimales para un dato decimal. El **BigDecimal** de java.math representa decimales mediante un entero y escala. Construí `new BigDecimal("2000.00")` desde texto para no incorporar la aproximación de un double. `precio.compareTo(BigDecimal.ZERO) < 0` comprueba signo; métodos add y multiply retornan otros valores, no mutan el original. Dividir sin una escala o política de redondeo puede fallar con un decimal no finito.

Usá Producto del [laboratorio](../Ejemplos/persistencia/README.md), donde tabla, precio y constructor están definidos. El fragmento inferior concentra id y nombre y no sustituye esa clase completa. En la práctica agregá precio en tu copia con `@Column(nullable=false,precision=12,scale=2)`. Doce dígitos totales con dos decimales dejan diez enteros; no es «doce enteros más dos decimales».

Las restricciones del esquema y la validación de entrada trabajan juntas. Una anotación no cambia un esquema existente automáticamente en todos los entornos: revisá la estrategia de generación o migración configurada.

## Ejemplo de la clase

```java
@jakarta.persistence.Entity
@jakarta.persistence.Table(name="producto")
class Producto {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @jakarta.persistence.Column(nullable=false)
    private String nombre;
    protected Producto() {}
    Producto(String nombre) { this.nombre=nombre; }
}
```

[Abrir el fragmento como archivo](fragmentos/clase_02.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El id comienza null y el proveedor lo asigna al persistir según IDENTITY. La columna nombre no debería aceptar null en el esquema generado. Con acceso por campo no necesitamos getters para que el proveedor lea, aunque pueden ser útiles para el resto del código. No supongas que dos entidades nuevas con id null son iguales.

## Cambiar una decisión y explorar un límite

Cambiar @Table(name="producto") no cambia el nombre JPQL Producto salvo que cambies @Entity(name=...). Construir BigDecimal con0.1 double incorpora su aproximación; con "0.1" conserva ese decimal. nullable=false no rechaza texto vacío por sí solo.

## Confusión que conviene evitar

Usar el id generado no asignado como única regla de equals para todas las entidades nuevas.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_02.md). Las [soluciones razonadas](SOLUCIONES_02.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../12_JPA/CLASE_01.md) · [Clase siguiente](../12_JPA/CLASE_03.md)
