# Soluciones 05.02 · Variables, tipos, operadores y consola

[Clase](CLASE_02.md) · [Práctica](EJERCICIOS_02.md)

## 1. Razonamiento de la actividad guiada

int a=5,b=6,c=8; double promedio=(a+b+c)/3.0; System.out.println(promedio);. Da aproximadamente 6.3333. El decimal no se recupera convirtiendo a double después de una división entera ya realizada.

## 2 y 3. Resolver y justificar las decisiones

`double promedio = (5 + 8) / 2.0;` produce 6.5. `int subtotal = 80000 * 3;` produce 240000; `double mostrado = subtotal / 100.0;` produce 2400.0. Con /100 entero se descartarían fracciones de una unidad si existieran. final conserva el valor asignado; int sigue teniendo un rango finito y operaciones grandes pueden desbordar. No uses double como garantía de exactitud monetaria.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
