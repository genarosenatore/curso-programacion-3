# Clase 07.07 · Práctica: catálogo e índice de productos

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_06.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_01.md)

## Una estructura para cada consulta

Un catálogo puede necesitar mostrar una secuencia y buscar por código. List<Producto> expresa el orden visible y Map<String,Producto> permite acceso por clave. Set<String> puede controlar que no repitas códigos al ingresar. No todas deben almacenar copias independientes del mismo objeto: si list y map referencian la misma instancia, una mutación se ve desde ambos.

Primero decidí qué estructura es la fuente de verdad y cuáles son vistas o índices derivados. Si quitás solo de la lista pero dejás la asociación en el mapa, una búsqueda puede seguir devolviendo un producto ausente del catálogo visible. La sincronización se vuelve parte de la regla, no un detalle estético.

## Construir y comprobar un índice

Para empezar, usá una lista con dos productos de códigos distintos. Recorrela y hacé put(codigo,producto). Si el código ya estaba, decidí rechazo o reemplazo: el ejercicio puede elegir rechazar mediante containsKey antes de put. Ordenar la lista por nombre no cambia las claves del mapa, pero cambiar un código sí exige actualizar su índice.

Ejecutá [U07Colecciones.java](../Ejemplos/java/U07Colecciones.java) para observar lista, conjunto, conteos y eliminación. Sus operaciones están reunidas con main e imports. Los fragmentos de catálogo pueden depender de getters concretos de Producto: no agregues esa dependencia sin definir getCodigo y getNombre en tu propio modelo.

La práctica no necesita persistencia. Una consulta vacía, un código inexistente y un intento duplicado deben tener resultados claros. Para un catálogo muy grande o compartido entre usuarios, una colección local no reemplaza restricciones y consultas de base de datos; enseñaremos esa frontera en SQL.

## Ejemplo de la clase

```java
java.util.Map<String, Integer> precios = new java.util.LinkedHashMap<>();
precios.put("CUA", 200000);
precios.put("LAP", 80000);
Integer precio = precios.get("LAP");
if (precio != null) System.out.println(precio);
```

[Abrir el fragmento como archivo](fragmentos/clase_07.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

LinkedHashMap permite buscar por clave y conserva inserción para este caso. Integer puede ser null si falta la clave; no lo convertimos automáticamente a int antes de comprobar. Un precio cero sigue siendo un precio presente.

## Cambiar una decisión y explorar un límite

Insertar dos productos con P01 en un mapa conserva una clave y el último valor si no rechazás antes. Ordenar una lista no ordena automáticamente HashMap. Cambiar el objeto que ambas estructuras referencian actualiza el dato, pero no recalcula una clave textual ya guardada.

## Confusión que conviene evitar

Usar getOrDefault con cero y después confundir producto inexistente con producto gratuito.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_07.md). Las [soluciones razonadas](SOLUCIONES_07.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../07_Colecciones/CLASE_06.md) · [Clase siguiente](../08_Lombok_DTO/CLASE_01.md)
