# Soluciones 03.02 · Operadores, conversiones y comparaciones

[Clase](CLASE_02.md) · [Ejercicios](EJERCICIOS_02.md)

## 1. Una solución explicada

Number("1200")*Number("2") da 2400. "1200"+"2" da "12002". Para datos recibidos, comprobá texto.trim() !== "" y Number.isFinite(valor) antes de usarlos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra "32", 5, false y true. El primer + concatena porque hay una cadena. Number produce un valor numérico para el segundo cálculo. La comparación estricta conserva la diferencia entre número y texto. El rango exige cumplir sus dos extremos.

## 3. Qué conviene corregir

La confusión a evitar es: Usar == sin comprender sus conversiones o asumir que Number de cualquier texto será válido.

Los operadores combinan valores: + suma o concatena texto; -, * y / hacen operaciones numéricas. === compara valor y tipo; !== expresa diferencia.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
