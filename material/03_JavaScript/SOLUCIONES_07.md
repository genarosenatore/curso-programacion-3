# Soluciones 03.07 · Objetos y nociones de clases

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

const productos=[{nombre:"Cuaderno",precio:2000},{nombre:"Lapicera",precio:800}]; const elegido=productos.find(p=>p.nombre==="Lapicera");. elegido.precio es 800 si hubo coincidencia; si no, elegido es undefined y hay que comprobarlo antes de acceder.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Muestra 3/5 y Lapicera. La copia cambia una propiedad simple sin cambiar producto. this apunta al objeto creado en el constructor. const impide reasignar producto, pero permite producto.stock=2. Para datos anidados necesitaríamos estudiar una copia más profunda si queremos independencia.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir una variable que referencia al mismo objeto con una copia independiente.

Un objeto reúne propiedades con nombre. Podemos representar un producto con nombre, precio y stock.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
