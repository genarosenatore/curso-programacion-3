# Soluciones 06.03 · equals y su contrato

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

a.equals(a) true; a.equals(b) y b.equals(a) true; a.equals(c) false; a.equals(null) false. Para transitividad agregá otro P01 y comprobá las tres comparaciones. No modifiques el campo de identidad entre pruebas.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La primera condición reconoce la misma referencia. instanceof descarta null y otros tipos, y da una variable del tipo comprobado. La última línea aplica la regla del código. hashCode se implementa junto a equals porque deberán trabajar juntos en colecciones.

## 3. Qué conviene corregir

La confusión a evitar es: Sobrecargar equals(Producto) en lugar de sobrescribir equals(Object).

El contrato de equals exige reflexividad, simetría, transitividad y consistencia mientras los datos relevantes no cambien. Un objeto no nulo debe devolver false al compararse con null.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
