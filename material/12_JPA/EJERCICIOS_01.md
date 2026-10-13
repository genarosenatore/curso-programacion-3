# Práctica 12.01 · ORM, JPA y proveedor de persistencia

[Clase](CLASE_01.md) · [Soluciones separadas](SOLUCIONES_01.md)

## 1. Actividad guiada

Distinguí qué hace JPA, qué hace Hibernate y qué aporta Spring Data JPA.

1. Identifica API JPA,proveedor Hibernate y motorH2.
2. Ubica configuración y clases del laboratorio.
3. Ejecuta el main y sigue persist hasta commit.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Ejecutá el laboratorio e identificá quién define contrato, quién implementa y qué motor guarda los datos.

## 3. Combinar lo aprendido

Explicá el recorrido de new Producto hasta una fila consultable y enumerá las piezas que faltarían si solo copiaras el fragmento @Entity. ¿ORM vuelve innecesario entender SQL?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Una declaración y una conexión son acciones diferentes.
2. El proveedor necesita motor y driver.
3. El mapeo define qué escribe y lee.
