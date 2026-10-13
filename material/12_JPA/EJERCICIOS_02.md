# Práctica 12.02 · Entity, Table, Id, GeneratedValue y Column

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Añadí precio como BigDecimal no nulo con precisión y escala razonables.

1. Declara BigDecimal con precisión 12 y escala 2.
2. Construye desde texto y valida no negativo.
3. Compara restricción de columna con regla de entrada.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Localizá id, nombre y precio en Producto del laboratorio y explicá cada anotación.

## 3. Combinar lo aprendido

Agregá precio no nulo, de escala2 y no negativo a tu copia. Probá2000.00 y -1.00. ¿Qué regla comprueba la aplicación y cuál debe sostener la base?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. BigDecimal desde texto evita una conversión flotante previa.
2. compareTo permite comprobar negativo.
3. Restricción de presencia y regla de signo son distintas.
