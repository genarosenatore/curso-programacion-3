# Práctica 11.06 · JOIN, agregaciones y agrupamiento

[Clase](CLASE_06.md) · [Soluciones separadas](SOLUCIONES_06.md)

## 1. Actividad guiada

Obtené productos y nombres de categoría, incluyendo productos sin categoría.

1. Pon producto a la izquierda para conservarlo.
2. LEFT JOIN categoría por su clave.
3. Consulta cuarto producto y observa categoríaNULL.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Listá producto y categoría incluyendo productos sin categoría, ordenado por id del producto.

## 3. Combinar lo aprendido

Contá por categoría solo productos de precio mayor a100000 y conservá categorías con cero. Explicá por qué el filtro va en ON y no en WHERE para ese objetivo.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El origen izquierdo decide qué se conserva.
2. El criterio de coincidencia puede incluir el precio.
3. COUNT(id derecho) ignora la ausencia.
