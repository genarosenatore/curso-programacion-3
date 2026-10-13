# Práctica 12.03 · Relaciones, JoinColumn y lado propietario

[Clase](CLASE_03.md) · [Soluciones separadas](SOLUCIONES_03.md)

## 1. Actividad guiada

Definí un método agregarProducto que actualice ambos lados.

1. Identifica Producto.categoria como propietario.
2. Añade producto a colección y asigna su categoría.
3. Recupera en otro contexto para comprobar la referencia.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Escribí un helper de alta que actualice lista y referencia de propietario. Explicá qué guarda cada lado.

## 3. Combinar lo aprendido

Diseñá una operación de traslado entre categorías y enumerá sus cambios de memoria y base. ¿Por qué agregar al lado inverso no basta?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Identificá el atributo con la clave foránea.
2. Retirá de la colección anterior si se permite mover.
3. La asignación del propietario determina la escritura.
