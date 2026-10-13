# Clase 10.06 · reduce y collect

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_07.md)

## Acumular con una identidad

reduce combina valores en un resultado. Necesita una operación y, en la variante del ejemplo, una **identidad**, valor neutral: cero para suma porque 0+x=x y uno para multiplicación porque 1*x=x. No es un número inicial arbitrario.

Con [2,3,4], la suma recorre acumulados 0→2→5→9. El callback recibe acumulador y valor actual y devuelve el acumulador siguiente. Integer::sum es una referencia compatible con esa suma. En un array vacío se conserva cero; sin identidad, una reducción puede no tener resultado y retornar Optional.

## Obtener estructuras con collect

collect utiliza un **Collector** que describe cómo reunir datos, por ejemplo en una lista o mapa. `Collectors.toCollection(ArrayList::new)` construye una colección específica; Stream.toList es una terminal distinta que devuelve lista no modificable. Elegí según si la salida debe editarse.

mapToInt transforma Integer a un stream primitivo especializado con operaciones como sum. En el ejemplo, Integer::intValue realiza unboxing explícito y sum retorna 9. Ambos cálculos van dentro de main. Para totales grandes podés usar long, pero también tiene límites; el tipo debe corresponder al rango esperado.

Una operación de reducción debe ser asociativa para poder combinar grupos conservando resultado. La resta no lo es: (10−3)−2 no equivale a 10−(3−2). Las sumas de coma flotante pueden variar por redondeos y orden. No agregues paralelismo a una reducción cuyo contrato todavía no comprendés; empezá con resultados verificables.

## Ejemplo de la clase

```java
var cantidades = java.util.List.of(2, 3, 4);
int total = cantidades.stream().reduce(0, Integer::sum);
int otroTotal = cantidades.stream().mapToInt(Integer::intValue).sum();
System.out.println(total + " / " + otroTotal);
```

[Abrir el fragmento como archivo](fragmentos/clase_06.java) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Ambas sumas dan 9. Si la lista está vacía, ambas dan cero. mapToInt transforma los wrappers en valores int. La suma no cambia los elementos originales. Para totales grandes elegí un tipo que no desborde y para dinero aplicá una política de precisión adecuada.

## Cambiar una decisión y explorar un límite

Con identidad cero para multiplicación, todos los productos quedan cero. Con uno, 2*3*4 da 24 y vacío da 1. El significado matemático puede diferir de un requisito del negocio como «sin ventas»: elegí y documentá esa interpretación.

## Confusión que conviene evitar

Usar cero como inicio de una reducción de multiplicación.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_06.md). Las [soluciones razonadas](SOLUCIONES_06.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../10_Funcional/CLASE_05.md) · [Clase siguiente](../10_Funcional/CLASE_07.md)
