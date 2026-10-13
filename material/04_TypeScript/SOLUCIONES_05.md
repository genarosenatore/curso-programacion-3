# Soluciones 04.05 · Genéricos básicos y diferencias entre any y unknown

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

function ultimo<T>(valores:T[]):T|undefined { return valores.length===0?undefined:valores[valores.length-1]; }. Con [1,2] devuelve 2 y con [] undefined.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

En primero de strings, T se infiere como string. Un array vacío devuelve undefined. esTexto comprueba durante la ejecución y comunica al compilador la reducción a string en el camino verdadero. La comprobación real debe ser correcta: el tipo de retorno declarado no la inventa.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar todos los tipos problemáticos a any y perder las comprobaciones que queríamos obtener.

Un genérico relaciona tipos entre la entrada y la salida. En una función que devuelve el primer elemento, T permite conservar su tipo concreto.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
