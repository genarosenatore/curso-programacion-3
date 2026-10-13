# Clase 12.01 · ORM, JPA y proveedor de persistencia

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_08.md) · [Clase siguiente](../12_JPA/CLASE_02.md)

## Relacionar dos representaciones del mismo dominio

En Java representamos objetos con referencias; en [SQL](../11_Bases_de_datos/CLASE_01.md), filas con claves. Un **ORM**, mapeo de objetos a datos relacionales, describe la correspondencia: Producto.nombre se conserva en una columna y Producto.categoria en una referencia entre filas. Evita escribir manualmente cada conversión, pero no elimina las tablas ni la necesidad de comprender sus relaciones.

**Jakarta Persistence**, conocido como JPA, define contratos y anotaciones. **Hibernate** es un proveedor que los implementa y realiza seguimiento y SQL. **Spring Data JPA** agrega abstracciones de repositorio encima de esa base. Podés utilizar JPA con Hibernate sin Spring; no son tres nombres del mismo producto.

## Qué hace falta además de @Entity

@Entity declara que una clase participa como entidad; @Id identifica su clave. Una entidad ordinaria requiere constructor sin argumentos public o protected y una forma de clase compatible con la especificación. El constructor permite que el proveedor cree instancias al recuperar; tus constructores de dominio pueden seguir validando creaciones de la aplicación.

Anotar una clase no inicia una conexión. Se necesita biblioteca API, proveedor, **driver** que comunica con el motor, configuración y un contexto que coordine operaciones. En [el laboratorio JPA](../Ejemplos/persistencia/README.md) esas piezas están reunidas: Java21, Maven, Hibernate y H2 en memoria, sin un servidor Spring. persistence.xml declara las entidades y propiedades; el main abre el entorno, guarda datos, consulta y lo cierra.

Primero seguí ese README y ejecutá la demostración sin modificarla. Después identificá Producto, su tabla y el resultado de una consulta. Los fragmentos de esta clase son declaraciones ilustrativas, no programas ejecutables sueltos. El ejemplo con id asignado manualmente necesita un valor antes de persistir; 12.02 agrega generación automática.

No mezcles imports javax.persistence antiguos con jakarta.persistence de este recorrido. Son generaciones de API y dependencias que deben mantenerse compatibles. El laboratorio propio permite estudiar sin asumir que las clases contables del campus ya están mapeadas: en la copia inspeccionada varias todavía no llevan anotaciones JPA.

## Ejemplo de la clase

```java
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
class Producto {
    @Id private Long id;
    protected Producto() {}
}
```

[Abrir el fragmento como archivo](fragmentos/clase_01.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Entity marca una clase persistente y Id identifica su clave. El constructor sin argumentos es requerido para entidades ordinarias y puede ser protected. Una anotación no crea por sí sola la conexión: hacen falta proveedor y configuración, incluidos en el proyecto de práctica.

## Cambiar una decisión y explorar un límite

Una clase normal en una List no se conserva en base solo por tener id. Agregar @Entity sin declararla o detectarla en el entorno puede dejarla fuera del modelo. Hibernate traduce según el mapeo real, no según que su nombre se parezca a una tabla.

## Confusión que conviene evitar

Tratar JPA, Hibernate y Spring Data como tres nombres idénticos para la misma capa.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_08.md) · [Clase siguiente](../12_JPA/CLASE_02.md)
