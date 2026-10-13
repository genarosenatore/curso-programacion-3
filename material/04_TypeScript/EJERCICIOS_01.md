# Práctica 04.01 · JavaScript y TypeScript: compilación y tipos

[Clase](CLASE_01.md) · [Soluciones separadas](SOLUCIONES_01.md)

## 1. Actividad guiada

Explicá por qué una API puede devolver un precio inválido aunque el programa compile.

1. Distinguí el tipo esperado del JSON recibido.
2. Observá que la anotación desaparece del JS.
3. Escribí las comprobaciones reales que faltan antes de calcular.

Anotá el resultado previsto antes de comprobarlo. La explicación del recorrido está en la clase y la solución de esta actividad está separada para consultar después del intento.

## 2. Para resolver por tu cuenta

Declará una cantidad number con let y agregá una asignación incorrecta de texto. Leé el error y corregilo usando un valor numérico, sin any ni as.

## 3. Combinar lo aprendido

Compará `Number("20")` con una afirmación de tipo aplicada a un dato externo. Explicá qué cambia en el JavaScript y por qué multiplicar un precio recibido requiere validar su valor además del tipo esperado.

## Pistas graduales

Usá una pista por vez, después de intentar el ejercicio.

1. Separá error de const de error de tipo.
2. Mirá el .js generado.
3. Una anotación desaparece, una llamada a Number permanece.
