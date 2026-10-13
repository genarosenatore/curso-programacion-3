# Soluciones 14.10 · Errores, excepciones y ControllerAdvice

[Clase](CLASE_10.md) · [Ejercicios](EJERCICIOS_10.md)

## 1. Una solución explicada

Nombre inválido: 400 con explicación de campo. Id inexistente: 404. Fallo inesperado: 500 con mensaje genérico y registro interno para diagnóstico. La clase del error debe guiar la traducción, no solo la palabra presente en su texto.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

NoEncontrado es una excepción definida por la aplicación. El advice convierte el fallo en una respuesta específica. Debe existir un manejador de validación adecuado y una política para errores inesperados; el proyecto de práctica incluye los casos comunes.

## 3. Qué conviene corregir

La confusión a evitar es: Exponer la traza completa de Java como mensaje visible de la API.

@RestControllerAdvice centraliza manejo de excepciones de controllers. @ExceptionHandler traduce un tipo de error a código y cuerpo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
