# Clase 07.07 · Práctica: catálogo e índice de productos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_06.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_01.md)

## Qué vas a aprender

Vamos a trabajar **práctica: catálogo e índice de productos**. Al terminar deberías poder explicar el ejemplo, modificarlo según la práctica y detectar el error común indicado al final.

## Antes de empezar

Leé las clases anteriores en orden. Si una palabra o una operación todavía cuesta, podés volver usando «Clase anterior». El ejemplo de esta clase se concentra en una idea; no necesitás entender las unidades posteriores para seguirla.

## Explicación desde cero

Un catálogo puede usar List para mostrar una secuencia, Map para buscar por código y Set para comprobar códigos repetidos. Mantener estructuras redundantes requiere sincronizarlas; para un ejercicio pequeño, elegí una fuente principal y derivá lo necesario.

La práctica debe justificar la estructura: qué consulta es frecuente, si se permiten duplicados y qué orden necesita la pantalla. No agregamos una colección porque su nombre parezca más avanzado. Cuando cambian requisitos, revisamos la elección.

## Ejemplo

```java
java.util.Map<String, Integer> precios = new java.util.LinkedHashMap<>();
precios.put("CUA", 200000);
precios.put("LAP", 80000);
Integer precio = precios.get("LAP");
if (precio != null) System.out.println(precio);
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

Los fragmentos de operaciones van dentro de main. Usá imports java.util o los nombres completos que se muestran.

## Leamos el ejemplo paso a paso

LinkedHashMap permite buscar por clave y conserva inserción para este caso. Integer puede ser null si falta la clave; no lo convertimos automáticamente a int antes de comprobar. Un precio cero sigue siendo un precio presente.

Antes de continuar, explicá con tus palabras la función de las instrucciones principales. Compará la salida o comportamiento descrito con lo que observás al probarlo. Si no coincide, revisá entrada, contexto de ejecución y resultado antes de cambiar el código.

## Práctica

Diseñá un catálogo que rechace alta de un código repetido y permita consultar un código inexistente sin fallar.

Abrí [los ejercicios y las pistas](EJERCICIOS_07.md). Las [soluciones explicadas](SOLUCIONES_07.md) están preparadas para consultar después de intentarlo.

## Error común

Usar getOrDefault con cero y después confundir producto inexistente con producto gratuito.

## Resumen para repasar

Un catálogo puede usar List para mostrar una secuencia, Map para buscar por código y Set para comprobar códigos repetidos. Mantener estructuras redundantes requiere sincronizarlas; para un ejercicio pequeño, elegí una fuente principal y derivá lo necesario.

Revisá qué parte del ejemplo realiza la tarea, qué entrada acepta y qué ocurre en el caso que pide la práctica. El error común sirve como comprobación de una distinción que conviene conservar al seguir.

## Comprobación antes de seguir

- Puedo explicar la idea y el ejemplo sin leerlos palabra por palabra.
- Puedo resolver o describir la práctica y comparar con su solución.
- Puedo explicar por qué el error común produce un problema.

Podés seguir a tu ritmo y volver a repasar. Si me consultás, indicá el código **07.07** y la parte que te genera dudas.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_06.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_01.md)
