# Soluciones 08.05 · Records y datos de transporte

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

record ListaDTO(List<String> nombres){ListaDTO{nombres=List.copyOf(nombres);}}. Cambiar la lista original no cambia la colección del DTO. Si los elementos son mutables, la copia sigue siendo superficial; en este caso String es inmutable.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

nombre() es el accesor generado, distinto del getNombre típico de un bean. La validación ocurre al construir. Dos records con los mismos componentes son iguales según la implementación generada. Eso sirve para valores, pero no necesariamente para identidad de entidad.

## 3. Qué conviene corregir

La confusión a evitar es: Suponer que final o un record inmoviliza recursivamente cualquier objeto referenciado.

Un record es una clase orientada a datos que genera constructor canónico, accesores y métodos de valor como equals, hashCode y toString. Sus componentes no se reasignan, pero la inmutabilidad es superficial: si un componente referencia una lista mutable, esa lista puede cambiar.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
