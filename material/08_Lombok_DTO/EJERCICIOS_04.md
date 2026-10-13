# Práctica 08.04 · Mapeo entre entidad y DTO

[Clase](CLASE_04.md) · [Soluciones separadas](SOLUCIONES_04.md)

## 1. Actividad guiada

Añadí stock al modelo y disponibilidad:boolean al DTO, calculada desde stock.

1. Añadí stock al modelo y disponible a la salida.
2. Calculá disponible desde stock>0.
3. Mapeá agotado y disponible sin modificar fuente.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Agregá stock y disponible al modelo y salida respectivamente. Probá cero y tres.

## 3. Combinar lo aprendido

Diseñá una vista de Libro con titulo y disponible, omitiendo un campo interno de costo. Explicá por qué mapear una lista mutable puede requerir una copia y por qué no guarda automáticamente.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La condición stock > 0 produce el booleano.
2. El constructor de salida elige solo campos públicos.
3. Copiar una referencia no duplica su colección.
