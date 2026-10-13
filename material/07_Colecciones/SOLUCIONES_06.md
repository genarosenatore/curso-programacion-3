# Soluciones 07.06 · Comparable y Comparator

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()). Con Ana, Eva y Luis queda Luis, Ana, Eva. Si aplicás reversed después de todos los criterios, también invertís el desempate.

## 2 y 3. Resolver y justificar las decisiones

Ascendente: `Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())`. Descendente con desempate ascendente: `Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder())`. Usá ese criterio en la copia editable. La fuente conserva inserción. La resta puede desbordar y cambiar el signo, contradiciendo el orden; comparar con Integer.compare expresa la comparación sin ese cálculo inseguro.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
