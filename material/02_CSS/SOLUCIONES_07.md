# Soluciones 02.07 · Grid

[Clase](CLASE_07.md) · [Ejercicios](EJERCICIOS_07.md)

## 1. Una solución explicada

Base: grid-template-columns:1fr. Dentro de @media (min-width:40rem): grid-template-columns:repeat(2,1fr). gap:1rem separa celdas. No necesitás cambiar el HTML.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

Cada columna busca al menos 14rem, pero min(100%,14rem) evita exigir más que el contenedor. 1fr permite distribuir el espacio restante. Al reducir el ancho cambia la cantidad de columnas sin escribir una regla para cada dispositivo.

## 3. Qué conviene corregir

La confusión a evitar es: Creer que definir filas o columnas cambia el orden semántico del HTML.

Grid organiza filas y columnas. El contenedor define pistas y los hijos ocupan celdas.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
