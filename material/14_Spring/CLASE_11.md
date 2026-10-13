# Clase 14.11 · Spring Data JPA, H2 y transacciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_10.md) · [Clase siguiente](../14_Spring/CLASE_12.md)

## Repositorios sobre un contexto persistente

Spring Data JPA implementa interfaces de repositorio mediante infraestructura gestionada. `JpaRepository<Producto,Long>` declara tipo de entidad e identidad. findById devuelve Optional, findAll una lista y save decide persist o merge según su determinación de entidad nueva. No significa que cada objeto recibido se vuelva la referencia gestionada original.

Un método derivado como findByNombreContainingIgnoreCaseOrderByIdAsc expresa consulta a partir de atributos. @Query puede declarar JPQL explícito. El nombre debe corresponder a Producto.nombre e id, no a columnas inventadas. En el proyecto, listarConCategoria usa una consulta para obtener la asociación que el DTO necesita.

## Coordinar lectura y escritura en service

@Transactional en servicio delimita la operación completa y conserva seguimiento para actualizar una entidad obtenida. readOnly=true comunica intención de lectura y permite optimizaciones; no es una prohibición de seguridad universal que garantice rechazo de toda escritura en cualquier motor. El servicio de lectura prepara DTO antes de salir.

La invocación habitual pasa por proxy, como anticipamos en [12.08](../12_JPA/CLASE_08.md). Llamadas internas pueden no activar el interceptor. RuntimeException y Error provocan rollback por defecto; excepciones comprobadas necesitan política apropiada. Un método que captura y oculta puede dejar al gestor sin causa para revertir.

H2 en memoria permite reconstruir datos para pruebas, pero reiniciar elimina sus filas. El archivo properties declara ddl-auto y open-in-view=false. No ver un dato tras reiniciar no demuestra que el save anterior no haya funcionado: depende de durabilidad del entorno.

Ejecutá creación y actualización del [proyecto](../Ejemplos/spring/README.md), vuelve a consultar por GET y observa la respuesta. Revisá SQL solo cuando necesites explicar cargas o cambios. No hace falta escribir EntityManager manual en cada controller; comprender JPA te permite interpretar qué realiza esta abstracción.

## Ejemplo de la clase

```java
interface ProductoRepository extends org.springframework.data.jpa.repository.JpaRepository<Producto, Long> {
    java.util.List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
// En un servicio @Transactional: repositorio.save(producto);
```

[Abrir el fragmento como archivo](fragmentos/clase_11.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

El nombre del método describe un filtro que Spring Data interpreta sobre el atributo nombre. Si el atributo cambia, el método debe cambiar. Las consultas derivadas son convenientes para casos simples; para consultas avanzadas podemos usar @Query con JPQL y parámetros.

## Cambiar una decisión y explorar un límite

Modificar entidad gestionada dentro de la transacción puede guardar sin llamar save otra vez. Modificar un DTO de salida no es ese caso. Un campo de relación lazy leído después de cerrar puede fallar aunque findAll haya devuelto lista.

## Confusión que conviene evitar

Confiar en que el nombre de un método encontrará cualquier columna aunque no exista el atributo.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_11.md). Las [soluciones razonadas](SOLUCIONES_11.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_10.md) · [Clase siguiente](../14_Spring/CLASE_12.md)
