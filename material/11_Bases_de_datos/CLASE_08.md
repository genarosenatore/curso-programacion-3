# Clase 11.08 · Práctica: productos, clientes, facturas y detalles

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: productos, clientes, facturas y detalles**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

El modelo de facturación reúne clientes, productos, facturas y detalles. Un cliente puede tener varias facturas; una factura varios renglones. Cada renglón conserva la cantidad y el precio de esa operación, porque el precio actual del producto podría cambiar.

Construiremos consultas sencillas antes de mapear entidades. La práctica puede guardar importes en centavos y calcular subtotales. Las reglas de IVA, bonificación y anulación de la consigna se incorporarán por etapas; el esquema pequeño no pretende sustituir todo FacturaArca.

## Ejemplo

```sql
SELECT f.id AS factura, SUM(d.cantidad*d.precio_centavos) AS total_centavos
FROM factura f
JOIN detalle d ON d.factura_id=f.id
GROUP BY f.id
ORDER BY f.id;
```

[Abrir el fragmento como archivo](fragmentos/clase_08.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

La suma calcula sobre el precio guardado en cada detalle, no sobre el precio actual de producto. El esquema ejecutable de tienda.sql define esa columna y datos de prueba. Una factura sin renglones no aparece con INNER JOIN; decidí si debe rechazarse al crearla o representarse con otro resultado.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá qué relación y qué dato permiten conservar el total histórico al cambiar precios.

Abrí [los ejercicios y las pistas](EJERCICIOS_08.md). Las [soluciones explicadas](SOLUCIONES_08.md) están preparadas para consultar después de intentarlo.

## Error común

Calcular una factura antigua con los precios actuales del catálogo.

## Resumen para repasar

El modelo de facturación reúne clientes, productos, facturas y detalles. Un cliente puede tener varias facturas; una factura varios renglones.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.08** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_07.md) · [Clase siguiente](../12_JPA/CLASE_01.md)
