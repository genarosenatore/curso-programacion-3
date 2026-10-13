# Soluciones 03.13 · Módulos y práctica integradora

[Clase](CLASE_13.md) · [Ejercicios](EJERCICIOS_13.md)

## 1. Una solución explicada

datos.js exporta productos; filtros.js exporta filtrar(productos,texto) usando trim, toLowerCase y filter; app.js importa ambos, escucha input y renderiza la selección con textContent. Cuando la selección está vacía, muestra Sin resultados. Consultá el ejemplo ejecutable de la unidad.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

calculos.js expone la función; app.js la importa mediante ruta relativa y muestra 1600. El HTML carga el archivo de entrada y el navegador resuelve sus imports. Mantener nombres distintos por responsabilidad ayuda a seguir qué archivo hace cada tarea.

## 3. Qué conviene corregir

La confusión a evitar es: Acoplar el cálculo a un id de pantalla cuando puede ser una función pura.

Un módulo separa responsabilidades y puede exportar funciones para que otro las importe. Un script type="module" permite import/export en el navegador y se ejecuta con comportamiento de módulo.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
