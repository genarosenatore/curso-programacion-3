# Práctica 10.03 · Referencias a métodos

[Clase](CLASE_03.md) · [Soluciones separadas](SOLUCIONES_03.md)

## 1. Actividad guiada

Reescribí s -> s.length() como referencia y explicá qué recibe.

1. Reescribe s->s.length() como String::length.
2. Usa el contrato Function<String,Integer>.
3. Invocá apply y distinguí declaración de ejecución.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Definí Function<String,Integer> longitud usando String::length y probá Ana y texto vacío.

## 3. Combinar lo aprendido

Reescribí mayúsculas como lambda con Locale.ROOT y explicá por qué esa variante no es idéntica a cualquier configuración regional. ¿Una referencia ejecuta al declararse?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. El contrato define entrada y retorno.
2. La referencia se utiliza al invocar apply.
3. Una lambda puede fijar argumentos adicionales.
