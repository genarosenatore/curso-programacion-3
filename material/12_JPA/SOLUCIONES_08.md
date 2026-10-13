# Soluciones 12.08 · Transacciones y consistencia

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

El servicio busca cliente y artículos, valida cantidades, calcula importes y construye cabecera/detalles manteniendo ambos lados. Guarda dentro de una transacción. Un detalle inválido produce rechazo y rollback de toda la operación, no una cabecera vacía confirmada.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Este método pertenece a un servicio gestionado y se llama desde otro componente. El EntityManager se inyecta apropiadamente. Al devolver normalmente puede confirmarse el cambio; ante un fallo que cumple las reglas de rollback se revierte. El nombre también debe validarse, omitido aquí para concentrarse en el límite transaccional.

## 3. Qué conviene corregir

La confusión a evitar es: Capturar todo error y retornar éxito aunque faltó guardar una parte.

Una transacción de negocio reúne lecturas y escrituras que deben ser coherentes. En Spring, @Transactional en un servicio puede establecer ese límite cuando el método se invoca mediante el proxy gestionado.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
