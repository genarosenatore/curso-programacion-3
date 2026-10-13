# Práctica 07.07 · Práctica: catálogo e índice de productos

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Diseñá un catálogo que rechace alta de un código repetido y permita consultar un código inexistente sin fallar.

1. Comprobá containsKey antes de alta.
2. Inserta solo si no existe código.
3. Consultá un id ausente sin unboxing de null.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Construí List<String> con P01,P02 y un mapa código→nombre para los dos productos; consultá un código existente y otro ausente.

## 3. Combinar lo aprendido

Agregá una operación de alta que rechace código repetido antes de modificar las estructuras. Probá duplicado y verificá tamaño anterior y posterior. ¿Qué riesgo aparece al mantener lista e índice por separado?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La validación ocurre antes de ambas inserciones.
2. containsKey permite comprobar duplicados.
3. Todas las modificaciones deben conservar la relación entre estructuras.
