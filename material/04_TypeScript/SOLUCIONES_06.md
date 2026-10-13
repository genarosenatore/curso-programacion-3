# Soluciones 04.06 · Node.js, npm, package.json y scripts

[Clase](CLASE_06.md) · [Ejercicios](EJERCICIOS_06.md)

## 1. Una solución explicada

Compartí código fuente, package.json y package-lock.json. node_modules contiene los paquetes instalados y normalmente no se agrega al repositorio; npm ci puede recrearlos usando el bloqueo. Una dependencia del servidor que se usa al ejecutar es distinta de una herramienta de compilación.

Compará el significado y los resultados, no solo los nombres de variables. Una variante es válida si cumple las mismas reglas y explica sus decisiones. Cuando la práctica es de diseño, la respuesta propuesta señala un criterio; contrastalo con el requisito concreto.

## 2. Cómo leer el ejemplo

init -y crea package.json aceptando valores iniciales. install registra TypeScript como herramienta de desarrollo y crea o actualiza el archivo de bloqueo. npx ejecuta el compilador disponible en el proyecto. Estos comandos corresponden a tu carpeta de práctica, no a las dependencias copiadas del campus.

## 3. Qué conviene corregir

La confusión a evitar es: Esperar que document.querySelector funcione en Node como si hubiera una página abierta.

Node.js ejecuta JavaScript fuera del navegador. No proporciona document ni el DOM de una página.

Usá esa distinción y las condiciones del ejemplo para explicar tu corrección. Si tu resultado difiere, pasame la práctica y tu razonamiento; podés consultar sin haber terminado la unidad.
