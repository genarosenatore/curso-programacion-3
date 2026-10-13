# Soluciones 10.03 · Referencias a métodos

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

Function<String,Integer> longitud=String::length;. Recibe un string y devuelve su longitud mediante boxing de int a Integer. No está contando elementos de una lista.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra ANA. Function recibe un String y devuelve String, encajando con el método de instancia toUpperCase. Para resultados reproducibles de mayúsculas según idioma, podés usar una lambda s->s.toUpperCase(Locale.ROOT) cuando la regla lo requiera.

## 3. Qué conviene corregir

La confusión a evitar es: Usar referencias solo para acortar aunque vuelva menos evidente la intención.

Una referencia a método es una forma abreviada de una lambda que delega directamente en un método compatible. String::toUpperCase puede representar s -> s.toUpperCase(); System.out::println una acción de impresión.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
