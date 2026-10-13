# Soluciones 06.05 · Práctica: objetos repetidos y claves estables

[Clase](CLASE_05.md) · [Práctica](EJERCICIOS_05.md)

## 1. Razonamiento de la actividad guiada

catalogo.contains(new Producto("P01")) true y con P03 false. La tabla de contratos debe pasar y los dos P01 tener el mismo hash. El ejemplo de la unidad permite ejecutar estas comprobaciones.

## 2 y 3. Resolver y justificar las decisiones

Tamaño 2; contains P01 true y P03 false. Entre dos new P01, == false, equals true y hash igual. Para P02, equals false; su hash puede ser distinto o colisionar sin cambiar esa diferencia. HashSet no promete orden, así que la tabla de pertenencia y tamaño expresa el requisito. toString es una ayuda de lectura, no la definición de equivalencia.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
