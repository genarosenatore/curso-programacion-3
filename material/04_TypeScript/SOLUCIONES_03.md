# Soluciones 04.03 · Interfaces y tipos para objetos

[Clase](CLASE_03.md) · [Práctica](EJERCICIOS_03.md)

## 1. Razonamiento de la actividad guiada

interface Cliente { id:number; nombre:string; correo:string; }. const cliente:Cliente={id:1,nombre:"Ana",correo:"ana@example.com"};. Validar la forma real del correo sigue siendo otra responsabilidad.

## 2 y 3. Resolver y justificar las decisiones

`interface Libro { id:number; titulo:string; ejemplares:number; }` y un literal con esas tres propiedades. `function disponible(libro:Libro):boolean { return libro.ejemplares > 0; }` devuelve false para cero y true para dos. Un -1 también es number: la interfaz no asegura la regla de stock no negativo. Esa regla debe comprobarse al aceptar o modificar datos.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
