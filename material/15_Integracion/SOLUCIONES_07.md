# Soluciones 15.07 · Pedidos y administración

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Las dos primeras se aceptan; la última se rechaza. Para validar: permitidos[actual].includes(nuevo). Conservá el estado anterior si falla y mostrá un mensaje. Contrastá con las reglas concretas que decidas aplicar al proyecto de la consigna.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La tabla es una política didáctica explícita, no un dato automáticamente deducido de la consigna. El backend debe confirmar la política acordada y los permisos. La pantalla puede usarla para presentar opciones, pero un usuario puede enviar una petición manual y debe rechazarse si viola la regla.

## 3. Qué conviene corregir

La confusión a evitar es: Confundir quitar un botón en la interfaz con impedir la operación en el backend.

Un pedido registra una operación aceptada con cabecera, detalles y estado. Administración puede listar y actualizar recursos de acuerdo con reglas.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
