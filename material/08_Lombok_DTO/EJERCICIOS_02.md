# Práctica 08.02 · Lombok: getters, setters, constructores y builder

[Clase](CLASE_02.md) · [Soluciones separadas](SOLUCIONES_02.md)

## 1. Actividad guiada

Explicá qué diferencia hay entre @Getter y @Data para una entidad bidireccional.

1. Enumera miembros generados por Getter y Data.
2. Relacioná equals y toString con campos de entidad.
3. Justificá evitar generación indiscriminada en relaciones.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Construí ProductoVista con builder y leé nombre y precio con getters, o implementá el equivalente manual si no tenés Lombok.

## 3. Combinar lo aprendido

Compará @Getter con @Data para un modelo con código estable y precio cambiante. Explicá qué contratos revisarías y qué pasa al omitir un campo obligatorio en builder.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Diferenciá construcción y consulta.
2. Data incluye más que accesores.
3. El builder no valida toda regla del dominio.
