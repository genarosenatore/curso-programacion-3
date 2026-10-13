# Soluciones 13.07 · CASE y consultas avanzadas

[Clase](CLASE_07.md) · [Práctica](EJERCICIOS_07.md)

## 1. Razonamiento de la actividad guiada

9999: BAJO; 10000: MEDIO; 50000: MEDIO; 50001: ALTO. Si el negocio cambia los límites, modificá condiciones y casos de prueba juntos.

## 2 y 3. Resolver y justificar las decisiones

Los resultados son BAJO,MEDIO,MEDIO,ALTO. Añadí `order by f.importeTotal desc,f.numero`. Si otro campo permite null, el primer WHEN puede ser `precio is null then 'SIN INFORMAR'` y luego rangos válidos; esa rama expresa ausencia sin confundirla con cero. El modelo de Producto del laboratorio no permite precio null, así que ese caso es un diseño alternativo ilustrativo, no un dato de prueba admitido allí.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
