# Cómo ejecutar los ejemplos

[Inicio](INICIO.md)

Si todavía no tenés herramientas o no sabés desde dónde escribir un comando, comenzá por [preparar el entorno](ENTORNO.md). Solo necesitás las herramientas del ejemplo que estés estudiando.

Los archivos fragmentos de cada clase son piezas explicadas en contexto. No todos son programas autónomos. Estos ejemplos completos reúnen estructura y datos necesarios para practicar. Trabajá en una copia si querés conservar la versión original.

## HTML y CSS

Abrí [web-basica/index.html](Ejemplos/web-basica/index.html) con un navegador. Incluye una imagen local, navegación, tabla y formulario de validación que no registra cuentas. Editá HTML y CSS y recargá. No necesita dependencias.

## JavaScript y TypeScript en el navegador

Necesitás Node.js para el servidor local. Desde la carpeta Ejemplos, ejecutá:

```text
node servidor.mjs
```

Abrí http://127.0.0.1:3000. Elegí JavaScript o TypeScript. El servidor solo sirve archivos locales de esa carpeta y se cierra con Ctrl+C. Si el puerto está ocupado, elegí otro con la variable CURSO_PUERTO; por ejemplo, en PowerShell: $env:CURSO_PUERTO='3001' antes del comando.

### JavaScript

[Ver sus archivos](Ejemplos/javascript/index.html). Usa módulos y productos.json local. Podés buscar, agregar unidades, quitar y vaciar un carrito. Se conserva en localStorage bajo una clave propia del curso. Mochila empieza agotada. El cuarto clic para agregar Cuaderno debe mostrar stock insuficiente, porque hay tres unidades.

El módulo [calculos.js](Ejemplos/javascript/calculos.js) separa filtros y operaciones numéricas. El archivo [app.js](Ejemplos/javascript/app.js) concentra los eventos y el DOM. El total usa centavos enteros y se convierte solo para mostrar. No hace pedidos ni pagos reales.

### TypeScript

[Ver el código](Ejemplos/typescript/src/main.ts). El ejemplo viene con JavaScript compilado para poder abrirlo sin instalar paquetes. Si modificás el TypeScript, desde Ejemplos/typescript ejecutá:

```text
npm install
npm run check
npm run build
```

La primera operación necesita conexión y descarga el compilador declarado. check comprueba sin generar; build genera dist/main.js. El servidor se inicia desde Ejemplos como antes. Este proyecto usa tsc directamente; la clase de Vite muestra por separado cómo crear un proyecto con esa herramienta. Los personajes son datos locales de práctica y no afirman reproducir el contrato de la API pública.

## Java de consola

Necesitás un JDK compatible con Java 21. Comprobá java -version y javac -version. Si el comando global apunta a otra versión, seleccioná el JDK en tu IDE o utilizá su ruta completa.

Desde Ejemplos/java, compilá y ejecutá cada archivo por separado:

```text
javac -encoding UTF-8 U05Java.java
java U05Java
```

| Archivo | Qué muestra |
|---|---|
| [U05Java.java](Ejemplos/java/U05Java.java) | Stock 3, subtotal 400000 y rechazo sin cambiar el stock |
| [U06Igualdad.java](Ejemplos/java/U06Igualdad.java) | Identidad falsa, igualdad verdadera y dos códigos únicos |
| [U07Colecciones.java](Ejemplos/java/U07Colecciones.java) | Secuencia, deduplicación, conteos, orden y eliminación |
| [U08DTO.java](Ejemplos/java/U08DTO.java) | Mapeo a un DTO con disponibilidad |
| [U09Genericos.java](Ejemplos/java/U09Genericos.java) | Contenedor tipado y componentes de un record |
| [U10Funcional.java](Ejemplos/java/U10Funcional.java) | Totales por categoría, filtro del resumen y suma vacía |

Los .class se generan al compilar. Podés compilar con -d carpeta_salida para mantenerlos fuera del código fuente. Estos ejemplos no requieren Lombok ni Spring. Los fragmentos que sí usan Lombok necesitan su dependencia; el proyecto de Spring incluye la configuración.

## SQL

El esquema y datos están en [tienda.sql](Ejemplos/sql/tienda.sql). Podés usar SQLite o ejecutar la práctica con Python 3, que incluye SQLite:

```text
python practicar.py
```

El comando se ejecuta desde Ejemplos/sql y crea una base en memoria; no modifica bases existentes. El archivo Python es solo un lanzador: el contenido a estudiar es SQL. Muestra categorías con conteo cero, factura total de 480000 centavos y una transacción revertida. Probá consultas SELECT del curso sobre ese esquema.

Para ejecutar un archivo SQL propio se agrega [ejecutar.py](Ejemplos/sql/ejecutar.py). Desde Ejemplos/sql:

```text
python ejecutar.py ../../11_Bases_de_datos/fragmentos/clase_01.sql
python ejecutar.py ../../11_Bases_de_datos/fragmentos/clase_04.sql --tienda
```

El primer caso crea su tabla en una base nueva. `--tienda` carga y confirma el esquema de tienda antes de tus sentencias, para consultas y cambios sobre esos datos. No uses esa opción al repetir un CREATE de una tabla ya definida. La clase 03 es un fragmento de detalle y requiere preparar factura y producto antes. Los resultados de SELECT se imprimen; errores de restricciones conservan su causa para investigarla.

## JPA y JPQL sin Spring

El [laboratorio de persistencia](Ejemplos/persistencia/README.md) incluye entidades, configuración, datos y un main de consola. Permite guardar y recuperar, seguir contextos, ejecutar rollback y consultar parámetros, proyecciones, joins, grupos, subconsultas y CASE. Requiere Java 21, Maven y sus dependencias; no necesita iniciar un servidor HTTP ni disponer del proyecto contable completo. Su README indica comandos, resultados previstos y qué parte del modelo del campus queda fuera.

## Spring, JPA y cliente HTTP

El [proyecto API de productos](Ejemplos/spring/README.md) incluye configuración, entidad, repositorio, servicio, DTO, errores y controlador, además de una pantalla local para usar la API. Su README contiene requisitos y peticiones de prueba.

Necesita Java 21, Maven y descargar dependencias en el primer arranque. Los fragmentos que usan FacturaVenta se apoyan en el modelo descrito y las consignas del campus o en el laboratorio independiente cuando así se indica. No se ejecutan sobre la entidad Producto de este CRUD. Los dos proyectos tienen clases propias y no son contratos intercambiables; la copia original contable requiere completar sus mapeos JPA antes de ejecutar consultas persistentes.

## Si un ejemplo no funciona

1. Comprobá la carpeta desde donde ejecutás el comando.
2. Leé el mensaje de error y anotá qué resultado esperabas.
3. Revisá si el ejemplo es un fragmento o un proyecto completo.
4. Consultame con la clase, archivo y mensaje. El resto de las clases sigue disponible mientras resolvemos esa duda.
