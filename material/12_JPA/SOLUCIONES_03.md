# Soluciones 12.03 · Relaciones, JoinColumn y lado propietario

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

void agregarProducto(Producto p){productos.add(p);p.setCategoria(this);}. Este código es un esquema con un setter que debes definir; en el laboratorio completo la operación equivalente es Categoria.agregar(Producto) y utiliza Producto.asignar(Categoria) para el lado propietario. Si quitás uno, definí una política equivalente y considerá si la relación permite null. Evitá listas no inicializadas.

## 2 y 3. Resolver y justificar las decisiones

Para alta simple: productos.add(p) y p.setCategoria(this), con método de asignación definido y controles de duplicado. Traslado requiere quitar de anterior.productos, asignar la nueva categoria en Producto y añadir a nueva.productos. El laboratorio limita este traslado deliberadamente para evitar un estado incoherente en una operación incompleta. El lado inverso describe navegación; mappedBy delega la escritura al atributo propietario.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
