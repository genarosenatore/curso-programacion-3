# Clase 11.03 · Relaciones uno a uno, uno a muchos y muchos a muchos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_02.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_04.md)

## Qué vas a aprender

Vamos a trabajar **relaciones uno a uno, uno a muchos y muchos a muchos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una relación uno a muchos permite que una fila tenga varias relacionadas: categoría y productos. Se representa normalmente con la clave foránea en el lado muchos. Uno a uno necesita además unicidad de la referencia. Muchos a muchos usa una tabla intermedia con dos claves foráneas.

El diagrama debe expresar cardinalidad y opcionalidad. Una factura tiene detalles; cada detalle pertenece a una factura y puede referirse a un producto. Guardar todos los detalles como texto dentro de factura dificulta consultar y validar individualmente.

## Ejemplo

```sql
CREATE TABLE detalle (
 id INTEGER PRIMARY KEY,
 factura_id INTEGER NOT NULL REFERENCES factura(id),
 producto_id INTEGER NOT NULL REFERENCES producto(id),
 cantidad INTEGER NOT NULL CHECK(cantidad > 0)
);
```

[Abrir el fragmento como archivo](fragmentos/clase_03.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

Cada detalle referencia una factura y un producto. Varias filas pueden compartir factura_id, representando varios renglones de una factura. Las tablas factura y producto deben existir; este fragmento complementa el esquema de la unidad. No hay una columna lista_de_detalles en factura.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Dibujá relación entre autor y libro cuando un libro puede tener varios autores.

Abrí [los ejercicios y las pistas](EJERCICIOS_03.md). Las [soluciones explicadas](SOLUCIONES_03.md) están preparadas para consultar después de intentarlo.

## Error común

Poner una clave foránea de libro en autor y perder la posibilidad de varios libros.

## Resumen para repasar

Una relación uno a muchos permite que una fila tenga varias relacionadas: categoría y productos. Se representa normalmente con la clave foránea en el lado muchos.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.03** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_02.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_04.md)
