# Práctica 09.05 · Inspección de campos, métodos y anotaciones

[Clase](CLASE_05.md) · [Soluciones separadas](SOLUCIONES_05.md)

## 1. Actividad guiada

Definí una anotación Marca visible en ejecución y comprobá si una clase la tiene.

1. Declará Marca con Retention.RUNTIME y Target.TYPE.
2. Aplicá la anotación a Cliente.
3. Consultá isAnnotationPresent y compará sin retención.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Ejecutá la invocación de texto y comparala con saludo.texto().

## 3. Combinar lo aprendido

Definí Marca con retención runtime y objetivo de tipo, anotá Cliente y consultá presencia. Explicá por qué una llamada conocida suele preferir la forma directa.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. main necesita declarar o capturar la excepción comprobada.
2. Retention y Target están en java.lang.annotation.
3. La llamada directa permite comprobar nombre y argumentos al compilar.
