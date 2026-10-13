# Soluciones 03.06 · Strings, arrays y métodos de recorrido

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

const seleccion=precios.filter(p=>p>150); const dobles=seleccion.map(p=>p*2);. Resultados [200,300] y [400,600]. Comprobá que precios todavía sea [100,200,300].

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

map transforma cada nombre y construye otro array. filter conserva los que contienen "la": lapicera y mochila. nombres permanece con su texto original. La flecha recibe cada elemento y devuelve el valor usado por el método. Con un array vacío, map y filter producen arrays vacíos.

## 3. Qué conviene corregir

La confusión a evitar es: Acceder a array[length] para obtener el último elemento: el último índice es length-1.

Un array guarda una secuencia de valores. Sus posiciones comienzan en cero y length cuenta elementos.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
