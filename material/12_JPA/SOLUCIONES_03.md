# Soluciones 12.03 · Relaciones, JoinColumn y lado propietario

[Clase](CLASE_03.md) · [Ejercicios](EJERCICIOS_03.md)

## 1. Una solución explicada

void agregarProducto(Producto p){productos.add(p);p.setCategoria(this);}. Si quitás uno, definí una política equivalente y considerá si la relación permite null. Evitá listas no inicializadas.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Producto tiene la columna categoria_id y es propietario en este modelo. Categoria.productos describe el otro lado usando mappedBy="categoria". Si añadís un producto solo a la lista pero no asignás su categoria, podrías no persistir la relación como esperás.

## 3. Qué conviene corregir

La confusión a evitar es: Escribir mappedBy="categoria_id" cuando el atributo de Producto se llama categoria.

Las relaciones se mapean desde objetos. @ManyToOne en Producto.categoria indica muchos productos para una categoría; @JoinColumn define la clave foránea.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
