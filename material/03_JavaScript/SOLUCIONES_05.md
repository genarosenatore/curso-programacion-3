# Soluciones 03.05 · Funciones, parámetros, retorno y alcance

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

function calcularDescuento(importe,porcentaje){return importe*(1-porcentaje/100);}. Con (1000,10) devuelve 900; con (1000,0), 1000. La variante flecha es const calcularDescuento=(importe,porcentaje)=>importe*(1-porcentaje/100);.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

precio y cantidad son parámetros; 800 y 3 argumentos. El cálculo local produce 2400 y return lo entrega a resultado. Otra llamada tiene sus propios parámetros y variables locales. El cuerpo no se ejecuta al definirlo, sino al llamar la función.

## 3. Qué conviene corregir

La confusión a evitar es: Escribir console.log(total) dentro y creer que la función devuelve ese número.

Una función reúne pasos que podemos reutilizar. Los parámetros son los nombres de entradas en su definición; los argumentos son los valores de una llamada.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
