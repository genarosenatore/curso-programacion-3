# Soluciones 03.09 · Eventos y formularios

[Clase](CLASE_09.md) · [Ejercicios](EJERCICIOS_09.md)

## 1. Una solución explicada

Antes de calcular: if(!Number.isInteger(cantidad)||cantidad<1){resultado.textContent="Ingresá una cantidad entera mayor a cero";return;}. Si es válida, mostrás el total. Probá 2, 0 y 1.5.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El ejemplo asume que el HTML indicado contiene campo y resultado. El navegador realiza su validación nativa antes de submit normal. Aun así, añadiremos validación propia para cantidades enteras y finitas. El signo ?. evita agregar un listener si no existe formulario. Los textos entre backticks permiten insertar valores con ${...}.

## 3. Qué conviene corregir

La confusión a evitar es: Agregar un listener dentro de otro render y duplicar la respuesta al mismo evento.

Un evento indica que ocurrió una acción, como click, input o submit. addEventListener asocia una función que se ejecutará cuando ocurra.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
