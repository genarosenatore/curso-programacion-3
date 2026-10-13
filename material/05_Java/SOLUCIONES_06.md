# Soluciones 05.06 · static, referencias y null

[Clase](CLASE_06.md) · [Práctica](EJERCICIOS_06.md)

## 1. Razonamiento de la actividad guiada

En la asignación, dos referencias apuntan a una misma instancia. Con new, se crea otra instancia independiente y se ejecuta nuevamente el constructor. Cambiar b.valor en el primer caso afecta lo observado mediante a; en el segundo, no.

## 2 y 3. Resolver y justificar las decisiones

Con alias hay una construcción y se comparte valor; con dos new hay dos construcciones y valores distintos. ejemplares static haría que modificar un libro cambie la existencia de todos porque sería un dato único. Una consulta puede ser `if (libro != null) System.out.println(libro.getEjemplares()); else System.out.println("Sin libro");`. final no vuelve profundamente inmutable el objeto.

## Cómo comparar tu respuesta

Una solución alternativa es válida si cumple las reglas de la consigna, explica su recorrido y conserva el resultado en los casos límite. Si falla, ubicá el primer paso donde tu resultado se separa del esperado; ese punto permite corregir la causa.
