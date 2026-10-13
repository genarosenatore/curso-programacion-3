# Soluciones 05.08 · Interfaces y polimorfismo

[Clase](CLASE_08.md) · [Práctica](EJERCICIOS_08.md)

## 1. Razonamiento de la actividad guiada

class Express implements Envio { public int costoCentavos(){return 100000;} }. Un array de Envio puede contener Retiro, Domicilio y Express y recorrerlos invocando costoCentavos.

## 2 y 3. Resolver y justificar las decisiones

`class Express implements Envio { public int costoCentavos(){return 100000;} }`. El array Envio[] admite las tres implementaciones y el recorrido obtiene 0, 50000 y 100000. Envio es el tipo que permite conocer las operaciones disponibles al compilar; Retiro, Domicilio y Express determinan qué cuerpo se ejecuta. Un if por nombre exige actualizar el consumidor cada vez que aparece una implementación, aunque la interfaz ya expresa esa variación.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
