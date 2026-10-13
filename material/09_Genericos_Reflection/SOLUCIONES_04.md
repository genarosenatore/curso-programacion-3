# Soluciones 09.04 · Class y metadatos de una clase

[Clase](CLASE_04.md) · [Ejercicios](EJERCICIOS_04.md)

## 1. Una solución explicada

for(Field campo:Cliente.class.getDeclaredFields()){System.out.println(campo.getName()+": "+campo.getType().getSimpleName());}. Debés importar java.lang.reflect.Field o usar nombre cualificado. La enumeración no devuelve valores de una instancia.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra String y el método length. El orden de métodos no es un contrato estable. Class<?> indica que tenemos información de una clase cuyo tipo concreto no necesitamos fijar. No se ejecuta length por enumerarlo.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir nombre de atributo con su valor en un objeto particular.

Class representa información sobre una clase en ejecución. Producto.class obtiene su descriptor; objeto.getClass() el de su clase real.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
