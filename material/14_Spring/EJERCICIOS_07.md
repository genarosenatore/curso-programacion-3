# Práctica 14.07 · Endpoints GET y parámetros

[Clase](CLASE_07.md) · [Soluciones separadas](SOLUCIONES_07.md)

## 1. Actividad guiada

Definí respuesta para listado vacío, id ausente e id con texto no numérico.

1. Prueba filtro sin resultados,id 999 e idabc.
2. Anota 200[],404 y 400.
3. Localiza conversión frente a búsqueda de existencia.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Probá listado sin coincidencias, id inexistente e id no numérico y anotá estados y cuerpos.

## 3. Combinar lo aprendido

Explicá el recorrido de /abc frente a /999 y agregá un filtro de nombre con espacio correctamente codificado. ¿Se ejecuta la misma validación en ambos fallos?

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. La conversión ocurre antes del método cuando falla la entrada.
2. La existencia se decide después de convertir.
3. URLSearchParams codifica el valor de consulta.
