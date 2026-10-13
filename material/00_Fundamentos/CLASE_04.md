# Clase 00.04 · Leer errores y comprobar una solución

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_03.md) · [Clase siguiente](../00_Fundamentos/CLASE_05.md)

## Investigar sin adivinar

Una prueba compara un resultado observado con uno esperado. Necesitamos una regla independiente del programa: si confiamos en el cálculo escrito para definir el esperado, podemos repetir el mismo error. Con precio 200 y tres unidades, calculá a mano 600 antes de mirar la salida del ejemplo.

Un error de **sintaxis** impide interpretar una instrucción por su forma, como unas comillas que no cierran. Un error de **ejecución** ocurre al realizarla, como intentar usar un dato inexistente. Un error de **lógica** deja ejecutar, pero el resultado incumple la regla. Estas categorías orientan la búsqueda; una misma causa puede producir varios síntomas.

## Un procedimiento de depuración

Primero reproducí el problema con una entrada pequeña. Anotá archivo y acción, resultado esperado, resultado obtenido y mensaje completo. Segundo, verificá los datos de entrada: si el precio ya llega incorrecto, el cálculo no es el primer fallo. Tercero, seguí las operaciones en orden hasta la primera diferencia. Cuarto, cambiá solo esa causa y repetí el caso. Quinto, probá otro caso para comprobar que corregiste la regla.

Una línea señalada por un mensaje es donde la herramienta detectó el problema, no siempre donde empezó. Una comilla abierta en la línea anterior puede cambiar cómo interpreta la siguiente. Leer los alrededores es más útil que borrar la línea señalada. Un **ejemplo mínimo reproducible** conserva la parte necesaria para provocar el fallo y elimina distracciones; no elimina precisamente los datos que lo desencadenan.

Probá casos normales, extremos y límites: cantidad 1, cantidad 0 y cantidad negativa si debe rechazarse. Cada caso tiene un motivo. Un único ejemplo que funciona no demuestra todos los comportamientos; muchos ejemplos sin una regla tampoco prueban que la solución sea correcta.

## Ejemplo de la clase

```text
Caso A: precio = 200; cantidad = 3
Operación escrita: total = precio + cantidad
Resultado observado: 203
Resultado esperado: 600
```

[Abrir el fragmento como archivo](fragmentos/clase_04.txt) · [Cómo ejecutar los ejemplos completos](../EJEMPLOS.md)

## Qué ocurre al seguirlo

Los datos se recibieron correctamente y la suma es correcta, pero elegimos la operación equivocada. Corregir la lógica significa multiplicar. Luego probamos otra compra y una cantidad cero para comprobar la regla, no solo el ejemplo que falló.

## Cambiar una decisión y explorar un límite

Cambiar la suma por multiplicación corrige la compra, pero comprobá precio 50 y cantidad 2: debe dar 100. Si arreglás el ejemplo escribiendo directamente 600, el siguiente caso vuelve a fallar. Eso reemplaza una salida, no corrige el algoritmo.

## Confusión que conviene evitar

Aceptar cualquier resultado solo porque el programa no mostró un error.

## Practicar y comprobar comprensión

Seguí [la actividad guiada y los ejercicios](EJERCICIOS_04.md). Las [soluciones razonadas](SOLUCIONES_04.md) están en una pestaña separada. Antes de avanzar, intentá justificar el resultado del caso normal y del caso límite con los pasos de esta clase.

[Inicio](../INICIO.md) · [Unidad](GUIA.md) · [Clase anterior](../00_Fundamentos/CLASE_03.md) · [Clase siguiente](../00_Fundamentos/CLASE_05.md)
