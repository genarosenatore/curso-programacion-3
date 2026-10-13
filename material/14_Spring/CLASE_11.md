# Clase 14.11 · Spring Data JPA, H2 y transacciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_10.md) · [Clase siguiente](../14_Spring/CLASE_12.md)

## Qué vas a aprender

Vamos a trabajar **spring data jpa, h2 y transacciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Spring Data JPA puede generar un repositorio desde una interface. JpaRepository<Producto,Long> aporta operaciones sobre esa entidad y tipo de id. El servicio marca transacciones y convierte datos; el controller sigue sin conocer detalles de persistencia.

H2 en memoria facilita probar. Cambiar a otra base no elimina la necesidad de revisar tipos, dialecto y migraciones. save puede persistir o combinar estado según las reglas de entidad; no hace válido cualquier objeto ni reemplaza comprobar referencias.

## Ejemplo

```java
interface ProductoRepository extends org.springframework.data.jpa.repository.JpaRepository<Producto, Long> {
    java.util.List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
// En un servicio @Transactional: repositorio.save(producto);
```

[Abrir el fragmento como archivo](fragmentos/clase_11.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los métodos y clases forman parte del proyecto Spring de apoyo, salvo que se indique el modelo FacturaVenta del campus. Los fragmentos no reemplazan pom.xml ni configuración.

## Leamos el ejemplo paso a paso

El nombre del método describe un filtro que Spring Data interpreta sobre el atributo nombre. Si el atributo cambia, el método debe cambiar. Las consultas derivadas son convenientes para casos simples; para consultas avanzadas podemos usar @Query con JPQL y parámetros.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí findByStockGreaterThan(int stock) y explicá qué devuelve con parámetro cero.

Abrí [los ejercicios y las pistas](EJERCICIOS_11.md). Las [soluciones explicadas](SOLUCIONES_11.md) están preparadas para consultar después de intentarlo.

## Error común

Confiar en que el nombre de un método encontrará cualquier columna aunque no exista el atributo.

## Resumen para repasar

Spring Data JPA puede generar un repositorio desde una interface. JpaRepository<Producto,Long> aporta operaciones sobre esa entidad y tipo de id.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **14.11** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../14_Spring/CLASE_10.md) · [Clase siguiente](../14_Spring/CLASE_12.md)
