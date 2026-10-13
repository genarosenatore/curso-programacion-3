# Soluciones 05.04 · Clases, objetos, atributos y constructores

[Clase](CLASE_04.md) · [Práctica](EJERCICIOS_04.md)

## 1. Razonamiento de la actividad guiada

Producto a=new Producto("Cuaderno",200000); Producto b=new Producto("Lapicera",80000);. Comparten atributos definidos por la clase y tienen valores distintos. a.nombre y b.nombre leen estados diferentes.

## 2 y 3. Resolver y justificar las decisiones

Comparten el tipo y sus operaciones; cada new tiene valores propios. Libro puede tener `String titulo; int ejemplares; Libro(String titulo,int ejemplares){this.titulo=titulo;this.ejemplares=ejemplares;}` como clase de paquete. Cambiar a.ejemplares no cambia b si fueron dos new. Con void se declara un método y la llamada new con esos argumentos ya no encuentra ese constructor.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
