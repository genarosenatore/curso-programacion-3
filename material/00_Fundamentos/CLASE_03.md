# Clase 00.03 · Algoritmos: entradas, pasos, decisiones y resultados

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_02.md) · [Clase siguiente](../00_Fundamentos/CLASE_04.md)

## Traducir una regla a pasos

La [entrada, el proceso y la salida](CLASE_01.md) describen un problema; el algoritmo indica cómo pasar de uno a otro. Una **secuencia** realiza los pasos en orden. Una **condición** es una pregunta con resultado verdadero o falso. Una **decisión** utiliza ese resultado para elegir un camino. Una **repetición** vuelve a realizar pasos mientras corresponde: por ejemplo sumar el precio de cada producto de una lista.

Un nombre como `importe` permite referirse al dato sin repetir su número. Por ahora es una etiqueta en una prueba de escritorio; aprenderemos su escritura en un lenguaje al estudiar variables. `>=` se lee «mayor o igual». `>` excluye la igualdad; `<` significa menor; `=` en nuestras anotaciones de pseudocódigo indica el valor que guardamos, no una pregunta.

## Desarrollar el descuento

La regla es «si el importe llega a 10000, descontar el 10 %». Diez por ciento significa diez de cada cien: 10 / 100 = 0,10. Conservar el 90 % equivale a multiplicar por 0,90. Primero leemos el importe. Después evaluamos la condición una sola vez. Si da verdadero calculamos el descuento; si da falso conservamos el importe. Ambos caminos deben dejar un total definido antes de mostrarlo.

La tabla de seguimiento puede tener columnas entrada, condición, camino y salida. Con 10000, la condición es verdadera y la salida es 9000. Esa fila es decisiva: demuestra que incluiste la igualdad. Con 9999 el descuento no se aplica. No inventes una regla para entradas negativas: señalá que el algoritmo supone un importe válido y decidí su validación aparte.

El pseudocódigo permite descubrir reglas ambiguas antes de aprender sintaxis. Es útil para conversar y simular, pero no se pega en JavaScript: cada lenguaje tiene sus propias palabras y símbolos. También hay varias soluciones equivalentes; importa que todas las entradas admitidas reciban un resultado coherente.

## Ejemplo de la clase

```text
LEER importe
SI importe >= 10000
    CALCULAR total COMO importe POR 0.90
SI NO
    ASIGNAR importe A total
MOSTRAR total
```

[Abrir el fragmento como archivo](fragmentos/clase_03.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Para 12.000 la condición se cumple y total es 10.800. Para 8.000 no se cumple y total sigue siendo 8.000. Multiplicar por 0,90 conserva el 90 % del precio, es decir, descuenta 10 %. La comparación incluye exactamente 10.000. Nuestro ejemplo asume un importe válido; validar el dato es una regla adicional.

## Cambiar una decisión y explorar un límite

Si la regla cambia a «más de 10000», usá > y el caso 10000 ya no recibe descuento. Si solo asignás total en el camino verdadero, el caso 8000 no tiene resultado definido. Completá ambos caminos antes de mostrar la salida.

## Confusión que conviene evitar

Confundir >= con >: cambia el tratamiento del valor exacto del límite.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_03.md). Las [soluciones razonadas](SOLUCIONES_03.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_02.md) · [Clase siguiente](../00_Fundamentos/CLASE_04.md)
