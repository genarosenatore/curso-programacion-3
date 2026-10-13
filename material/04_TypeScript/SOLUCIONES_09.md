# Soluciones 04.09 · Práctica: API de Los Simpsons

[Clase](CLASE_09.md) · [Ejercicios](EJERCICIOS_09.md)

## 1. Una solución explicada

Al cargar, validá el array local; escuchá input del buscador; renderizá filtrar(personajes,campo.value) con textContent. Si el array queda vacío, mostrás Sin resultados. Una búsqueda vacía debe conservar ambos. Antes de cambiar al servicio, revisá el contrato y sus límites de paginación.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Devuelve Lisa. El cálculo no depende de la red ni del DOM, así que se comprueba fácilmente. El JSON local usa la forma conocida por el ejemplo, que no se afirma idéntica a la API pública. Para conectar el servicio, observá sus campos y construí un adaptador si tienen otros nombres.

## 3. Qué conviene corregir

La confusión a evitar es: Copiar la URL de la consigna y asumir campos de otra API sin revisar la respuesta.

La práctica del campus pide consumir personajes de Los Simpsons y explicar configuración y scripts. Un servicio externo puede cambiar; primero implementaremos el flujo con un archivo local que imite una respuesta sencilla.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
