# Clase 11.01 · Persistencia, tablas, filas y columnas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_08.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_02.md)

## Conservar información y poder consultarla

Las colecciones Java desaparecen cuando termina el proceso si no guardamos sus datos. **Persistencia** significa conservarlos más allá de esa ejecución. Una base de datos agrega organización, consultas y reglas compartidas. Un **motor** como SQLite interpreta operaciones sobre ella; SQL es el lenguaje para declarar qué datos queremos, no un bucle que debemos escribir para visitar cada fila.

Una tabla agrupa registros de una misma clase. La fila de producto contiene su id, nombre y precio; las columnas definen qué representa cada posición. El **esquema** describe tablas, tipos y restricciones; los **datos** son las filas actuales. Crear otra fila no cambia el esquema. Una tabla de base no es necesariamente la tabla HTML que muestra una pantalla: la vista puede combinar varias fuentes.

## Leer las primeras sentencias

CREATE TABLE declara nombre y columnas dentro de paréntesis. INTEGER representa enteros y TEXT texto en SQLite. PRIMARY KEY define identidad; NOT NULL exige presencia; CHECK impone una condición. INSERT crea una fila y SELECT consulta columnas. El punto y coma termina una sentencia. SQL usa comillas simples para valores de texto: 'Cuaderno'; no son nombres de variables Java.

En el ejemplo, crear prepara una tabla vacía; insertar agrega el producto uno; consultar devuelve una fila con 1,Cuaderno,200000. El precio está en centavos: 200000 corresponde a 2000 unidades monetarias. No mezcles ese valor con el decimal de otros modelos.

## Ejecutar sin instalar un servidor de base

Usaremos SQLite incluido en Python para una práctica reproducible. El [lanzador SQL](../Ejemplos/sql/ejecutar.py) recibe un archivo SQL y crea una base en memoria, que desaparece al cerrar. Desde esa carpeta ejecutá `python ejecutar.py ../../11_Bases_de_datos/fragmentos/clase_01.sql`. Este caso crea su propia tabla: no cargues tienda.sql antes, porque ya tiene producto y CREATE fallaría.

Para consultas posteriores, el mismo lanzador puede cargar los datos de tienda con --tienda. El Python es una herramienta de ejecución, no un nuevo tema de la materia. SQLite tiene particularidades de tipos y sintaxis; no promete que cada sentencia se copie idéntica a H2 o PostgreSQL.

## Ejemplo de la clase

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

## Qué ocurre al seguirlo

CREATE define columnas y reglas; INSERT agrega una fila; SELECT la consulta. NOT NULL impide ausencia, pero no rechaza necesariamente una cadena vacía. CHECK exige precio no negativo. Estos nombres describen el modelo físico; JPA luego lo relacionará con clases Java.

## Cambiar una decisión y explorar un límite

Insertar nombre NULL falla por NOT NULL, pero  puede pasar porque es texto presente aunque vacío. CHECK precio>=0 rechaza negativos; acompañado de NOT NULL evita la ausencia. Crear dos veces la misma tabla falla; es un problema de estado inicial, no del significado de SELECT.

## Confusión que conviene evitar

Guardar varios valores separados por comas en una columna para simular una relación.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_01.md). Las [soluciones razonadas](SOLUCIONES_01.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_08.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_02.md)
