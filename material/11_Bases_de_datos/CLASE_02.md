# Clase 11.02 · Claves primarias, foráneas y restricciones

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_01.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_03.md)

## Qué vas a aprender

Vamos a trabajar **claves primarias, foráneas y restricciones**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Una clave primaria identifica una fila y no admite duplicados. Una clave foránea relaciona valores con otra tabla. Una restricción UNIQUE expresa unicidad y NOT NULL obliga presencia. Las restricciones protegen datos incluso si llegan de distintas aplicaciones.

El id técnico no siempre coincide con la clave del negocio: una persona puede tener id y otro código único. En SQLite hay que habilitar la comprobación de claves foráneas por conexión con PRAGMA foreign_keys=ON; el ejemplo lo hace al comenzar.

## Ejemplo

```sql
PRAGMA foreign_keys = ON;
CREATE TABLE categoria (id INTEGER PRIMARY KEY, nombre TEXT NOT NULL UNIQUE);
CREATE TABLE producto (
 id INTEGER PRIMARY KEY,
 nombre TEXT NOT NULL,
 categoria_id INTEGER REFERENCES categoria(id)
);
```

[Abrir el fragmento como archivo](fragmentos/clase_02.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

producto.categoria_id debe apuntar a una categoría existente cuando no es null. Si permitimos null, un producto puede no tener categoría. La base comprueba la integridad de la referencia, no que el nombre tenga sentido para nuestro negocio. Para hacer obligatoria la relación añadí NOT NULL.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Explicá por qué no se puede insertar categoria_id=99 si no existe esa categoría y la restricción está activa.

Abrí [los ejercicios y las pistas](EJERCICIOS_02.md). Las [soluciones explicadas](SOLUCIONES_02.md) están preparadas para consultar después de intentarlo.

## Error común

Desactivar restricciones para que una carga inválida "funcione".

## Resumen para repasar

Una clave primaria identifica una fila y no admite duplicados. Una clave foránea relaciona valores con otra tabla.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.02** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../11_Bases_de_datos/CLASE_01.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_03.md)
