# Soluciones 12.07 · Cascadas, orphanRemoval y carga de relaciones

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Borrar una factura no debería borrar al cliente y todas sus relaciones. Conservá la referencia sin cascada remove salvo un caso de propiedad exclusivo deliberado. Para la salida de API, un DTO evita recorrer toda la red de relaciones.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

ALL puede tener sentido en detalles con vida ligada a factura, pero no se copia a cliente compartido. Para quitar un detalle, actualizá coherentemente ambos lados y su política. El mapeo del JoinColumn se define en el propietario. Comprender qué se borra evita perder datos compartidos.

## 3. Qué conviene corregir

La confusión a evitar es: Aplicar CascadeType.ALL a todas las relaciones para resolver errores sin analizar sus efectos.

Una cascada propaga operaciones como persist o remove a objetos relacionados. No equivale a todas las reglas de clave foránea del motor.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
