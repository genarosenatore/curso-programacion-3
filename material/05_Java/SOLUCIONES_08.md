# Soluciones 05.08 · Interfaces y polimorfismo

[Clase](CLASE_08.md) · [Ejercicios](EJERCICIOS_08.md)

## 1. Una solución explicada

class Express implements Envio { public int costoCentavos(){return 100000;} }. Un array de Envio puede contener Retiro, Domicilio y Express y recorrerlos invocando costoCentavos.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

La variable envio se usa mediante el contrato y devuelve 50000. Si se construye Retiro, devuelve cero sin cambiar la llamada. Los métodos de implementación deben ser public porque los de la interface lo son en este caso. No se puede hacer new Envio() directamente con esta definición.

## 3. Qué conviene corregir

La confusión a evitar es: Escribir muchos if por nombre de clase cuando el contrato puede resolver la variación.

Una interface define un contrato de operaciones. Una clase puede implementarlo; una variable del tipo de la interface puede referenciar distintas implementaciones.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
