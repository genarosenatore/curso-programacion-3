# Práctica 05.06 · static, referencias y null

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Explicá la diferencia entre Contador b=a y Contador b=new Contador().

1. Probá b=a y contá construcciones.
2. Repetí con b=new Contador().
3. Modificá b y compará el valor observado por a.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Compará una asignación b=a con b=new Contador mediante dos programas pequeños. Anticipá valor y creados.

## 3. Combinar lo aprendido

Diseñá dos libros con ejemplares distintos y explicá por qué ejemplares no debe ser static. Agregá una referencia posiblemente null y una consulta segura. ¿final congela todos los atributos?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Contá llamadas al constructor, no variables.
2. Un campo static tiene un único estado de clase.
3. final restringe la asignación de referencia.
