# Clase 11.01 · Persistencia, tablas, filas y columnas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_08.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_02.md)

## Qué vas a aprender

Vamos a trabajar **persistencia, tablas, filas y columnas**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Persistir es conservar datos más allá de la ejecución actual. Una base relacional organiza información en tablas; cada fila representa un registro y cada columna un atributo con dominio. El esquema define estructura y restricciones; las filas son los datos actuales.

Una tabla de productos puede tener código, nombre y precio. No confundas una tabla con la lista que aparece en la pantalla: la interfaz puede reunir datos de varias tablas. Para practicar usaremos SQLite mediante un ejemplo local reproducible; las ideas se trasladan a otros motores con diferencias de sintaxis.

## Ejemplo

```sql
CREATE TABLE producto (
  id INTEGER PRIMARY KEY,
  nombre TEXT NOT NULL,
  precio_centavos INTEGER NOT NULL CHECK (precio_centavos >= 0)
);
INSERT INTO producto VALUES (1, 'Cuaderno', 200000);
SELECT id, nombre, precio_centavos FROM producto;
```

[Abrir el fragmento como archivo](fragmentos/clase_01.sql) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

El archivo tienda.sql contiene un esquema con datos de prueba. Las sentencias CREATE ilustrativas se prueban en bases separadas para no redefinir tablas ya existentes.

## Leamos el ejemplo paso a paso

CREATE define columnas y reglas; INSERT agrega una fila; SELECT la consulta. NOT NULL impide ausencia, pero no rechaza necesariamente una cadena vacía. CHECK exige precio no negativo. Estos nombres describen el modelo físico; JPA luego lo relacionará con clases Java.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Definí qué columnas necesita una tabla categoria y cuáles son obligatorias.

Abrí [los ejercicios y las pistas](EJERCICIOS_01.md). Las [soluciones explicadas](SOLUCIONES_01.md) están preparadas para consultar después de intentarlo.

## Error común

Guardar varios valores separados por comas en una columna para simular una relación.

## Resumen para repasar

Persistir es conservar datos más allá de la ejecución actual. Una base relacional organiza información en tablas; cada fila representa un registro y cada columna un atributo con dominio.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **11.01** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_08.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_02.md)
