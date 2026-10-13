# Soluciones 05.05 · Encapsulamiento, getters y setters

[Clase](CLASE_05.md) · [Ejercicios](EJERCICIOS_05.md)

## 1. Una solución explicada

void descontarStock(int cantidad){if(cantidad<=0||cantidad>stock)throw new IllegalArgumentException("Cantidad inválida");stock-=cantidad;}. Con stock 5 y cantidad 2 queda 3; con 6 se rechaza y conserva 5.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

El constructor reutiliza la validación. Intentar un valor negativo lanza una excepción y no actualiza el atributo. La firma permite saber qué se puede consultar o cambiar. El nivel de acceso de los métodos de este ejemplo es de paquete; si se usan desde otro paquete, se decide si deben ser public.

## 3. Qué conviene corregir

La confusión a evitar es: Cambiar el atributo primero y comprobar la regla después, dejando un estado inválido al fallar.

Encapsular significa controlar cómo se accede al estado y preservar sus reglas. private limita acceso directo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
