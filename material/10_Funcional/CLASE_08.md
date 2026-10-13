# Clase 10.08 · Práctica: consultas sobre productos y facturas

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_07.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_01.md)

## Separar seleccionar elementos de seleccionar grupos

La pregunta «categorías con ventas totales mayores a 40000» necesita dos etapas. Primero agrupar ventas por categoría y sumar; después filtrar esos totales. Filtrar cada venta individual por >40000 descartaría aportes pequeños que, juntos, superan el umbral.

El ejemplo usa Venta como record con categoría e importe en centavos. groupingBy obtiene la clave y summingInt el importe de cada elemento. Para Útiles hay 10000+20000=30000 y para Libros 50000. El mapa devuelve resumen por categoría, no los detalles originales.

## Seguir el resultado entre estructuras

Para filtrar el mapa, entrySet ofrece sus pares; stream recorre entradas; e.getValue()>40000 selecciona totales y map de getKey obtiene nombres de categorías. El tipo cambia de Venta a mapa resumido, luego a entradas y finalmente a String. Dibujá ese recorrido antes de escribir la cadena.

Ejecutá [U10Funcional.java](../Ejemplos/java/U10Funcional.java), que reúne ejemplos con main e imports. Para extender el fragmento, poné Venta fuera de main y datos/cadena dentro. Probá una categoría repetida, una venta que no cambie el resultado y lista vacía. En vacío el mapa queda vacío, no contiene automáticamente categorías sin ventas.

Un stream trabaja sobre objetos ya cargados en la JVM. No evita cargar toda una base si antes obtuviste todos sus datos. SQL y JPQL enseñarán cómo trasladar selección y agregación al sistema de almacenamiento. Esa similitud de intención no hace idénticas sus reglas de nulos, joins o ejecución.

## Ejemplo de la clase

```java
record Venta(String categoria, int importeCentavos) {}
var ventas = java.util.List.of(new Venta("Útiles",10000),new Venta("Útiles",20000),new Venta("Libros",50000));
var totales = ventas.stream().collect(java.util.stream.Collectors.groupingBy(
    Venta::categoria, java.util.stream.Collectors.summingInt(Venta::importeCentavos)));
```

[Abrir el fragmento como archivo](fragmentos/clase_08.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Útiles acumula 30000 y Libros 50000. groupingBy define grupos y summingInt reduce importes dentro de cada uno. Para muchas ventas usarías summingLong u otra representación para evitar desborde. El resultado es un resumen, no la lista completa de cada categoría.

## Cambiar una decisión y explorar un límite

Añadí Útiles por 20000: total 50000 y ahora esa categoría supera el umbral aunque ninguna de sus ventas individuales lo haga. Usar >= incluiría también exactamente 40000; > lo excluye. Elegí según la pregunta real.

## Confusión que conviene evitar

Filtrar ventas individuales por importe cuando la pregunta pide filtrar el total por categoría.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_08.md). Las [soluciones razonadas](SOLUCIONES_08.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_07.md) · [Clase siguiente](../11_Bases_de_datos/CLASE_01.md)
