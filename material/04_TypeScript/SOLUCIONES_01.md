# Soluciones 04.01 · JavaScript y TypeScript: compilación y tipos

[Clase](CLASE_01.md) · [Ejercicios](EJERCICIOS_01.md)

## 1. Una solución explicada

Los tipos se comprueban sobre el código, no cambian automáticamente el JSON recibido. Si viene {precio:"gratis"}, hay que validar los datos al recibirlos. La compilación puede detectar que el código espera un número, pero no garantiza que un servicio externo lo cumpla.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Las anotaciones :number y :string indican tipos. El JavaScript generado conserva los valores y el console.log, pero elimina las anotaciones. Un error del compilador describe una incompatibilidad; corregirlo debería mejorar el modelo y no silenciarlo con cualquier conversión.

## 3. Qué conviene corregir

La confusión a evitar es: Usar una anotación o as para afirmar que los datos externos ya fueron comprobados.

TypeScript extiende JavaScript con información de tipos que se comprueba antes de ejecutar. El compilador produce JavaScript; las anotaciones de tipo no validan por sí solas los datos recibidos en tiempo de ejecución.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
