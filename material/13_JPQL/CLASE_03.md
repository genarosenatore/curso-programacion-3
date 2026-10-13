# Clase 13.03 · Fechas, texto, IN, DISTINCT y ordenamiento

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_02.md) · [Clase siguiente](../13_JPQL/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **fechas, texto, in, distinct y ordenamiento**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

WHERE puede combinar condiciones y comparar fechas, texto o pertenencia. BETWEEN incluye extremos. LIKE usa % para cualquier secuencia y _ para un carácter. LOWER permite normalizar comparaciones. IN compara con una colección de valores compatibles.

DISTINCT elimina duplicados de lo seleccionado y ORDER BY define orden. IS NULL comprueba ausencia. Un intervalo por fechas con horas necesita pensar si el final incluye el día completo; un rango semiabierto puede expresar mejor inicio incluido y fin excluido.

## Ejemplo

```sql
select f from FacturaVenta f
where f.fechaEmision >= :desde and f.fechaEmision < :hastaExclusiva
and f.fechaAnulacion is null
order by f.fechaEmision, f.id
```

[Abrir el fragmento como archivo](fragmentos/clase_03.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Las consultas se ejecutan mediante JPA sobre entidades mapeadas. No son SQL directo. El nombre y tipo de cada atributo deben coincidir con tu modelo.

## Leamos el ejemplo paso a paso

La consulta incluye desde y excluye hastaExclusiva. Si querés todo octubre, el extremo superior puede ser el inicio de noviembre con una política de zona horaria apropiada. Los parámetros deben ser compatibles con Date o el tipo temporal elegido en la entidad.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Buscá clientes cuya denominación contenga ana sin importar mayúsculas.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Concatenar texto del usuario dentro de la consulta para construir el filtro.

## Resumen para repasar

WHERE puede combinar condiciones y comparar fechas, texto o pertenencia. BETWEEN incluye extremos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **13.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../13_JPQL/CLASE_02.md) · [Clase siguiente](../13_JPQL/CLASE_04.md)
