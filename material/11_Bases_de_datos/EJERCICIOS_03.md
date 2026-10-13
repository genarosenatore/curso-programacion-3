# Práctica 11.03 · Relaciones uno a uno, uno a muchos y muchos a muchos

[Clase](CLASE_03.md) · [Soluciones separadas](SOLUCIONES_03.md)

## 1. Actividad guiada

Dibujá relación entre autor y libro cuando un libro puede tener varios autores.

1. Dibuja autor y libro con cardinalidad mutua múltiple.
2. Agrega autor_libro con dos referencias.
3. Define par único para evitar duplicar asociación.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Dibujá autor, libro y autor_libro para muchos a muchos e identificá las claves.

## 3. Combinar lo aprendido

Diseñá cliente→factura→detalle y justificá dónde va cada referencia. ¿Guardar detalles separados permite cambiar el precio actual sin alterar el histórico?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La referencia suele estar del lado muchos.
2. Una asociación muchos a muchos necesita una fila por par.
3. El precio histórico pertenece al detalle.
