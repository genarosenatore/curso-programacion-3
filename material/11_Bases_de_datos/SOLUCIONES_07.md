# Soluciones 11.07 · Transacciones: confirmar o revertir cambios

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Se revierte el conjunto si no se cumple la operación completa. El código debe manejar el error y solicitar rollback o usar un gestor transaccional configurado. No confirmar la cabecera antes de comenzar los detalles.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Dentro de la transacción se observa el valor nuevo en esa conexión. Después de ROLLBACK vuelve al valor anterior. Para conservarlo usaríamos COMMIT. La guía de ejecución SQL entrega un ejemplo con base en memoria para experimentar sin afectar datos externos.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir una operación de múltiples sentencias con una transacción aunque no esté configurada.

Una transacción agrupa operaciones que deben confirmarse juntas. COMMIT conserva cambios; ROLLBACK los revierte.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
