# Práctica 11.02 · Claves primarias, foráneas y restricciones

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Explicá por qué no se puede insertar categoria_id=99 si no existe esa categoría y la restricción está activa.

1. Activa claves foráneas por conexión.
2. Crea categoría existente antes de producto.
3. Prueba referencia 99 y explica rechazo.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Creá categoría 1 y dos productos que la referencien; probá otro con categoria_id=99.

## 3. Combinar lo aprendido

Hacé obligatoria la relación y probá NULL. Explicá qué pasa al borrar categoría 1 mientras tiene productos y qué política elegirías para un catálogo.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Primero existe la fila referenciada.
2. NOT NULL cambia opcionalidad.
3. Borrar requiere respetar productos relacionados.
