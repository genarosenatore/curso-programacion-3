# Soluciones 13.07 · CASE y consultas avanzadas

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

9999: BAJO; 10000: MEDIO; 50000: MEDIO; 50001: ALTO. Si el negocio cambia los límites, modificá condiciones y casos de prueba juntos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La salida añade una etiqueta calculada. No requiere un atributo categoria en FacturaVenta. El rango medio llega a 50000 porque el primer WHEN solo toma mayores. Los importes están en las unidades del atributo del campus; no conviertas a centavos sin cambiar el modelo y parámetros.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que una columna calculada de consulta queda guardada como propiedad persistente.

CASE calcula una expresión según condiciones. Debe conservar alternativas de tipos compatibles.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
